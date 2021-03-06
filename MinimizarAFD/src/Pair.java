import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Clase que define pares de estados del automata.
 * @author adrian
 *
 */
public class Pair {
	
								//Atributos
	//-----------------------------------------------------------
	public int P, Q;
	//-----------------------------------------------------------	
	
	public Pair(int thep, int theq){
		this.P = thep;
		this.Q = theq;
	}
	
	
	@Override
    public int hashCode() {
        return new HashCodeBuilder(17, 31). // two randomly chosen prime numbers
            append(P).
            append(Q).
            toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
       if (!(obj instanceof Pair))
            return false;
        if (obj == this)
            return true;

        Pair rhs = (Pair) obj;
        return new EqualsBuilder().
            append(P, rhs.P).
            append(Q, rhs.Q).
            isEquals();
    }

}
