// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetAuditCountDistributionRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DbId")
    public Integer dbId;

    @NameInMap("BeginDate")
    public String beginDate;

    @NameInMap("EndDate")
    public String endDate;

    public static GetAuditCountDistributionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuditCountDistributionRequest self = new GetAuditCountDistributionRequest();
        return TeaModel.build(map, self);
    }

    public GetAuditCountDistributionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAuditCountDistributionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAuditCountDistributionRequest setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public GetAuditCountDistributionRequest setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public String getBeginDate() {
        return this.beginDate;
    }

    public GetAuditCountDistributionRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

}
