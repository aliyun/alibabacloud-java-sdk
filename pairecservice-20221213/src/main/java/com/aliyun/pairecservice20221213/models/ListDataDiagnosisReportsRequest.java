// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListDataDiagnosisReportsRequest extends TeaModel {
    /**
     * <p>The end date.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-01</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The feature name.</p>
     * 
     * <strong>example:</strong>
     * <p>feature1</p>
     */
    @NameInMap("FeatureName")
    public String featureName;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The retention rate report type.</p>
     * <ul>
     * <li>Period: A report for the specified time period.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Period</p>
     */
    @NameInMap("RemainRateType")
    public String remainRateType;

    /**
     * <p>The start date.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-01</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The number of top results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TopN")
    public Long topN;

    public static ListDataDiagnosisReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataDiagnosisReportsRequest self = new ListDataDiagnosisReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataDiagnosisReportsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ListDataDiagnosisReportsRequest setFeatureName(String featureName) {
        this.featureName = featureName;
        return this;
    }
    public String getFeatureName() {
        return this.featureName;
    }

    public ListDataDiagnosisReportsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDataDiagnosisReportsRequest setRemainRateType(String remainRateType) {
        this.remainRateType = remainRateType;
        return this;
    }
    public String getRemainRateType() {
        return this.remainRateType;
    }

    public ListDataDiagnosisReportsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public ListDataDiagnosisReportsRequest setTopN(Long topN) {
        this.topN = topN;
        return this;
    }
    public Long getTopN() {
        return this.topN;
    }

}
