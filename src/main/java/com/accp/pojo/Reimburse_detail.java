package com.accp.pojo;

public class Reimburse_detail {
    private Integer id;

    private Integer mainId;

    private Float subtotal;

    private String rdesc;

    private String pictrueName;

    private String pictruePath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMainId() {
        return mainId;
    }

    public void setMainId(Integer mainId) {
        this.mainId = mainId;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public String getRdesc() {
        return rdesc;
    }

    public void setRdesc(String rdesc) {
        this.rdesc = rdesc == null ? null : rdesc.trim();
    }

    public String getPictrueName() {
        return pictrueName;
    }

    public void setPictrueName(String pictrueName) {
        this.pictrueName = pictrueName == null ? null : pictrueName.trim();
    }

    public String getPictruePath() {
        return pictruePath;
    }

    public void setPictruePath(String pictruePath) {
        this.pictruePath = pictruePath == null ? null : pictruePath.trim();
    }

	public Reimburse_detail(Integer id, Integer mainId, Float subtotal, String rdesc, String pictrueName,
			String pictruePath) {
		super();
		this.id = id;
		this.mainId = mainId;
		this.subtotal = subtotal;
		this.rdesc = rdesc;
		this.pictrueName = pictrueName;
		this.pictruePath = pictruePath;
	}

	public Reimburse_detail() {
		super();
	}
    
}