// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogQueryConditionRequest extends TeaModel {
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

    @NameInMap("IsRisk")
    public String isRisk;

    @NameInMap("IsSuccess")
    public String isSuccess;

    public static GetLogQueryConditionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogQueryConditionRequest self = new GetLogQueryConditionRequest();
        return TeaModel.build(map, self);
    }

    public GetLogQueryConditionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetLogQueryConditionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetLogQueryConditionRequest setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public GetLogQueryConditionRequest setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public String getBeginDate() {
        return this.beginDate;
    }

    public GetLogQueryConditionRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetLogQueryConditionRequest setIsRisk(String isRisk) {
        this.isRisk = isRisk;
        return this;
    }
    public String getIsRisk() {
        return this.isRisk;
    }

    public GetLogQueryConditionRequest setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public String getIsSuccess() {
        return this.isSuccess;
    }

}
