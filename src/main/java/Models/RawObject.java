package Models;

import java.io.Serializable;
import java.util.List;

public class RawObject implements Serializable{
	int count;
	String msg;
	Results res;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Results getRes() {
		return res;
	}
	public void setRes(Results res) {
		this.res = res;
	}

}
