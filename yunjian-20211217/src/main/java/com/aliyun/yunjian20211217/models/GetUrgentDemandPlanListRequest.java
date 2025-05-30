// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class GetUrgentDemandPlanListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public Long current;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FY2022</p>
     */
    @NameInMap("period")
    public String period;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("planType")
    public Long planType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Long size;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111222</p>
     */
    @NameInMap("userId")
    public String userId;

    public static GetUrgentDemandPlanListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUrgentDemandPlanListRequest self = new GetUrgentDemandPlanListRequest();
        return TeaModel.build(map, self);
    }

    public GetUrgentDemandPlanListRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public GetUrgentDemandPlanListRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public GetUrgentDemandPlanListRequest setPlanType(Long planType) {
        this.planType = planType;
        return this;
    }
    public Long getPlanType() {
        return this.planType;
    }

    public GetUrgentDemandPlanListRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public GetUrgentDemandPlanListRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
