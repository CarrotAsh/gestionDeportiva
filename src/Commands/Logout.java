package Commands;

import Classes.OptionsMenu;

public class Logout extends Command{
    public Logout() {
        super("logout");
    }

    @Override
    public void execute(String[] arguments) {
        assert arguments.length==1;
        OptionsMenu.loggedUser = null;
    }
}
