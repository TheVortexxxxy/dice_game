package dicegame;

/**
 * Abstrakcyjna klasa bazowa dla klas graczy.
 * 
 * Definiuje abstrakcyjną metodę guess().
 */

public abstract class Player {

    /**
     * Pole nazwy (imienia) gracza.
     * 
     * Pole jest prywatne, więc dostarczamy setter i getter.
     */
    private String name = "anonymous";
	
	public Player() {}
	
	public Player(String name) {
		setName(name);
	}
    
    public final void setName(String name) {
		if (name != null && name.matches("^[a-zA-Z0-9_]{3,}$")) {				//"".equals(name)
			this.name = name;
		} else {
			throw new IllegalArgumentException("Imie nie moze byc puste");
		}
    }
    
    public String getName() {
        return name;
    }
        
    /**
     * Metoda zwraca odgadniętą liczbę (strzał).
     * 
     * @return odgadnięta liczba 
     */
    public abstract int guess();
    
}
