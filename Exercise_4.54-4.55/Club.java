import java.util.ArrayList;
import java.util.Iterator;

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

    public int joinedInMonth(int month) {
        int count = 0;
        if(month > 0 && month <=12) {
            for(Membership member : members) {
                if(member.getMonth() == month) {
                    count++;
                }
            }
        } else {
            System.out.println("Not a valid month");
        }
        return count;
    }

    public ArrayList<Membership> purge(int month, int year) {
        ArrayList<Membership> purgedMembers = new ArrayList<Membership>();
        if(month > 0 && month <=12) {
            Iterator<Membership> memberIt = members.iterator();
            while(memberIt.hasNext()) {
                Membership member = memberIt.next();
                if(member.getMonth() == month && member.getYear() == year) {
                    purgedMembers.add(member);
                    memberIt.remove();
                }
            }
        } else {
            System.out.println("Not a valid month");
        }
        return purgedMembers;
    }











}
