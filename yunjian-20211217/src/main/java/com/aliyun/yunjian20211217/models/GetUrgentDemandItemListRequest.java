// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class GetUrgentDemandItemListRequest extends TeaModel {
    @NameInMap("commodityCode")
    public String commodityCode;

    /**
     * <strong>example:</strong>
     * <p>ecs/yundisk</p>
     */
    @NameInMap("commodityTypeCode")
    public String commodityTypeCode;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public Long current;

    @NameInMap("planId")
    public Long planId;

    @NameInMap("region")
    public String region;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Long size;

    @NameInMap("zone")
    public String zone;

    public static GetUrgentDemandItemListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUrgentDemandItemListRequest self = new GetUrgentDemandItemListRequest();
        return TeaModel.build(map, self);
    }

    public GetUrgentDemandItemListRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public GetUrgentDemandItemListRequest setCommodityTypeCode(String commodityTypeCode) {
        this.commodityTypeCode = commodityTypeCode;
        return this;
    }
    public String getCommodityTypeCode() {
        return this.commodityTypeCode;
    }

    public GetUrgentDemandItemListRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public GetUrgentDemandItemListRequest setPlanId(Long planId) {
        this.planId = planId;
        return this;
    }
    public Long getPlanId() {
        return this.planId;
    }

    public GetUrgentDemandItemListRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetUrgentDemandItemListRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public GetUrgentDemandItemListRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
