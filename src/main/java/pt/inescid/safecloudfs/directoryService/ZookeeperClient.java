package pt.inescid.safecloudfs.directoryService;

import java.util.ArrayList;

public class ZookeeperClient implements DirectoryService {

	public void mv(String originPath, String destinationPath) {
		// TODO Auto-generated method stub

	}

	public void cp(String originPath, String destinationPath) {
		// TODO Auto-generated method stub

	}

	public void rm(String path) {
		// TODO Auto-generated method stub

	}

	public void create(String path) {
		// TODO Auto-generated method stub

	}

	public long getNLink(String path) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Number getMode(String path) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setMode(String path, Number mode) {
		// TODO Auto-generated method stub

	}

	public boolean exists(String path) {
		// TODO Auto-generated method stub
		return false;
	}

	public int getMacro(String path) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setMacro(String path, int macro) {
		// TODO Auto-generated method stub

	}

	@Override
	public void rmdir(String path) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isDir(String path) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getParent(String path) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public void mkdir(String path, long uid, long gid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mkfile(String path, long uid, long gid) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<String> readDir(String path) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCachedFileValid(long nLink, byte[] hash) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int chown(String path, long uid, long gid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getUid(String path) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getGid(String path) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void init(long uid, long gid) {
		// TODO Auto-generated method stub

	}

	@Override
	public long getBirthtime(String path) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setBirthtime(String path) {
		// TODO Auto-generated method stub

	}

	@Override
	public long getAtim(String path) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAtim(String path) {
		// TODO Auto-generated method stub

	}

	@Override
	public long getCtim(String path) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCtim(String path) {
		// TODO Auto-generated method stub

	}

	@Override
	public long getMtim(String path) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setMtim(String path) {
		// TODO Auto-generated method stub

	}

	@Override
	public long getSize(String path) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSize(String path, long size) {
		// TODO Auto-generated method stub

	}

}
