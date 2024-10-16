// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHealthPercentageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1808078950770264</p>
     */
    @NameInMap("cluster")
    public String cluster;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1725797727754</p>
     */
    @NameInMap("start")
    public Float start;

    public static GetHealthPercentageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHealthPercentageRequest self = new GetHealthPercentageRequest();
        return TeaModel.build(map, self);
    }

    public GetHealthPercentageRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public GetHealthPercentageRequest setEnd(Float end) {
        this.end = end;
        return this;
    }
    public Float getEnd() {
        return this.end;
    }

    public GetHealthPercentageRequest setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

    public GetHealthPercentageRequest setStart(Float start) {
        this.start = start;
        return this;
    }
    public Float getStart() {
        return this.start;
    }

}
