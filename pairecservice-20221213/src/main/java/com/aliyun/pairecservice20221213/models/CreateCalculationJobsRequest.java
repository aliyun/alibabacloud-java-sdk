// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateCalculationJobsRequest extends TeaModel {
    /**
     * <p>A comma-separated list of A/B metric IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2,3,4</p>
     */
    @NameInMap("ABMetricIds")
    public String ABMetricIds;

    /**
     * <p>The end date.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-03</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The instance ID. Call the <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a> operation to get this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The start date.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01</p>
     */
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
