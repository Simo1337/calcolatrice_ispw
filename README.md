# calcolatrice_ispw

Calcolatrice con interfaccia grafica in **JavaFX**, realizzata per il corso di
**Ingegneria del Software e Progettazione Web (ISPW)** — Università degli Studi di Roma Tor Vergata.

## Requisiti

- Java 21
- Maven
- JavaFX 21 (scaricato automaticamente da Maven)

## Avvio

Da IntelliJ: esegui la classe `Launcher`.

Da terminale:

```bash
mvn clean javafx:run
```

> `Launcher` esiste perché, senza `module-info.java`, avviare direttamente una classe
> che estende `Application` dà l'errore *"JavaFX runtime components are missing"*.

## Struttura

Il progetto segue il pattern **BCE (Boundary – Control – Entity)**:

```
src/main/
├── java/
│   ├── Boundaries/
│   │   └── CalcBoundary      # controller grafico dell'FXML: gestisce i click e aggiorna la view
│   ├── Controllers/
│   │   └── CalcController    # logica applicativa
│   ├── DAO/
│   │   └── BtnDAO            # accesso/creazione delle entità
│   ├── Entities/
│   │   ├── Button            # astrazione di un tasto
│   │   ├── NumBTN            # tasto numerico
│   │   └── OneOverX          # operazione 1/x
│   ├── Launcher              # punto d'ingresso
│   └── Main                  # Application JavaFX: carica la view
└── resources/
    └── main-view.fxml        # interfaccia (Scene Builder)
```

Flusso di un'operazione:

```
click → CalcBoundary → CalcController → BtnDAO / Entities → risultato → CalcBoundary aggiorna il display
```

La Boundary non contiene logica di calcolo e le Entity non dipendono da JavaFX.
