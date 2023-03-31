## Design pattern
un metodo teorico per ricsolvere un problema

## MVC
M -> Model
V -> View
C -> Controller

View -> si occuperà di ritornare una risposta HTML
Model -> si occuperà di interfacciarsi con il DB
Controller -> si occuperà di gestire la logica delle richieste e dialogherà con il model e restituirà una View


## Factory con Prototype -> chiedo semplicemente un oggetto di un determinato tipo
## Factory con Singleton


Jeeg può attaccare con vari componenti



## Enum
enumerator -> una classe che ha un set di valori predefiniti

## Singleton
Diciamo che voglio creare più si un Jeeg
Jeeg 1
- LanciaMissiliDX
- LaserSx
- Legs

Jeeg2
- LanciaMissiliDX
- LanciaMissiliSX
- Legs

Entrambi i Jeeg hanno degli attributi in comune -> LanciaMissiliDx e Legs
Ha senso creare due oggetti di LanciaMissiliDx e due oggetti di Legs per creare due Jeeg ?
Se si -> allora utilizzo la factory prototype
se no -> devo applicare il Design Pattern Singleton
-> devo controllare se in memoria è presente già un oggetto di classe LanciaMissiliDX e Legs. Se ci sono , non ne creo di nuovi per non occupare troppa memoria
