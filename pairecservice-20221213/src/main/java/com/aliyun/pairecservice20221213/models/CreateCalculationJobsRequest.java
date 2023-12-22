// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateCalculationJobsRequest extends TeaModel {
    @NameInMap("ABMetricIds")
    public String ABMetricIds;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("StartDate")
    public String startDate;

    public static CreateCalculationJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCalculationJobsRequest self = new CreateCalculationJobsRequest();
        return TeaModel.build(map, self);
    }

    public CreateCalculationJobsRequest setABMetricIds(String ABMetricIds) {
        this.ABMetricIds = ABMetricIds;
        return this;
    }
    public String getABMetricIds() {
        return this.ABMetricIds;
    }

    public CreateCalculationJobsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public CreateCalculationJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCalculationJobsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
