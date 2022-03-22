package Model;

public class MailAddress
{

    String streetAddress;
    String city;
    String state;
    int zipcode;

    public MailAddress(String inf_streetAddress, String inf_city, String inf_state, int inf_zipcode)
    {
        streetAddress = inf_streetAddress;
        city = inf_city;
        state = inf_state;
        zipcode = inf_zipcode;
    }

    @Override
    public String toString()
    {
        return streetAddress + "," + city + "," + state + "," + zipcode;
    }

}
