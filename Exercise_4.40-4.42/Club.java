import java.util.ArrayList;

/**
 * Store details of club memberships.
 * 
 * @author Richard Shepard
 * @version 2.1.2015
 */
public class Club
{
    ArrayList<Membership> members;
    
    /**
     * Constructor for objects of class Club
     */
    public Club() {
        members = new ArrayList<Membership>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member) {
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers() {
        int numMembers = members.size();
        return numMembers;
    }
}
