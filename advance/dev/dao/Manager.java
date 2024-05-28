package advance.dev.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import advance.dev.model.CanBo;
import advance.dev.model.IManager;

public class Manager implements IManager{
	private List<CanBo> canBoList = new ArrayList<>();

	@Override
	public void print() {
		for (CanBo cb : canBoList) {
            System.out.println(cb);
        }
	}

	@Override
	public void sortByName(int order) {
		Collections.sort(canBoList, new Comparator<CanBo>() {

			@Override
			public int compare(CanBo o1, CanBo o2) {
				if (order == 1) {
                    return o1.getTen().compareTo(o2.getTen());
                } else {
                    return	o2.getTen().compareTo(o1.getTen());
                }
            }
        });
		}

	@Override
	public void add(CanBo cb) {
		canBoList.add(cb);
	}
}

    