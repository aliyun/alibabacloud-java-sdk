// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetRiskStatisticsRequest extends TeaModel {
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

    @NameInMap("ByDbId")
    public Integer byDbId;

    @NameInMap("ByRiskLevel")
    public Integer byRiskLevel;

    @NameInMap("ByRuleType")
    public Integer byRuleType;

    @NameInMap("ByRuleId")
    public Integer byRuleId;

    public static GetRiskStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRiskStatisticsRequest self = new GetRiskStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetRiskStatisticsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetRiskStatisticsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRiskStatisticsRequest setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public GetRiskStatisticsRequest setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public String getBeginDate() {
        return this.beginDate;
    }

    public GetRiskStatisticsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetRiskStatisticsRequest setByDbId(Integer byDbId) {
        this.byDbId = byDbId;
        return this;
    }
    public Integer getByDbId() {
        return this.byDbId;
    }

    public GetRiskStatisticsRequest setByRiskLevel(Integer byRiskLevel) {
        this.byRiskLevel = byRiskLevel;
        return this;
    }
    public Integer getByRiskLevel() {
        return this.byRiskLevel;
    }

    public GetRiskStatisticsRequest setByRuleType(Integer byRuleType) {
        this.byRuleType = byRuleType;
        return this;
    }
    public Integer getByRuleType() {
        return this.byRuleType;
    }

    public GetRiskStatisticsRequest setByRuleId(Integer byRuleId) {
        this.byRuleId = byRuleId;
        return this;
    }
    public Integer getByRuleId() {
        return this.byRuleId;
    }

}
