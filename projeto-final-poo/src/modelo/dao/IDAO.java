package modelo.dao;

import java.util.List;

public interface IDAO <T extends Object> {
	public void create(T o);
	public T getLogin(String e, String s);
        public boolean checkLogin(String e, String s);
	public void update(T o);
	public void delete(int o);
}
