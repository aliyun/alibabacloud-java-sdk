// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListInstanceHealthRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1808078950770264</p>
     */
    @NameInMap("cluster")
    public String cluster;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public Integer current;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1725801327754</p>
     */
    @NameInMap("end")
    public Float end;

    /**
     * <strong>example:</strong>
     * <p>i-wz9d00ut2ska3mlyhn6j</p>
     */
    @NameInMap("instance")
    public String instance;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1725797727754</p>
     */
    @NameInMap("start")
    public Float start;

    public static ListInstanceHealthRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceHealthRequest self = new ListInstanceHealthRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceHealthRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public ListInstanceHealthRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListInstanceHealthRequest setEnd(Float end) {
        this.end = end;
        return this;
    }
    public Float getEnd() {
        return this.end;
    }

    public ListInstanceHealthRequest setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

    public ListInstanceHealthRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstanceHealthRequest setStart(Float start) {
        this.start = start;
        return this;
    }
    public Float getStart() {
        return this.start;
    }

}
