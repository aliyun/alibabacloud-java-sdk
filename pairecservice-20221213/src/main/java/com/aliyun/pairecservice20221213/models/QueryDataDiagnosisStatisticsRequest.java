// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class QueryDataDiagnosisStatisticsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2023-08-08</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <strong>example:</strong>
     * <p>learn-pairec-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>Period</p>
     */
    @NameInMap("RemainRateType")
    public String remainRateType;

    /**
     * <strong>example:</strong>
     * <p>2023-08-01</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static QueryDataDiagnosisStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataDiagnosisStatisticsRequest self = new QueryDataDiagnosisStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataDiagnosisStatisticsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryDataDiagnosisStatisticsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryDataDiagnosisStatisticsRequest setRemainRateType(String remainRateType) {
        this.remainRateType = remainRateType;
        return this;
    }
    public String getRemainRateType() {
        return this.remainRateType;
    }

    public QueryDataDiagnosisStatisticsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
