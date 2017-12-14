package xggl.lsqgzx.vo;
import java.math.BigDecimal;

import com.davidstudio.gbp.core.vo.BaseEntity;

public class TestDemo extends BaseEntity {

	private BigDecimal tId;
	
	private String name;
	
	private String description;
	
	public BigDecimal gettId() {
		return tId;
	}

	public void settId(BigDecimal tId) {
		this.tId = tId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}
}