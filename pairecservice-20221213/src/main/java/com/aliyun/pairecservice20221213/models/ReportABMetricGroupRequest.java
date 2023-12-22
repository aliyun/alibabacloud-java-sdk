// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ReportABMetricGroupRequest extends TeaModel {
    @NameInMap("BaseExperimentId")
    public String baseExperimentId;

    @NameInMap("DimensionFields")
    public String dimensionFields;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("ExperimentGroupId")
    public String experimentGroupId;

    @NameInMap("ExperimentIds")
    public String experimentIds;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ReportType")
    public String reportType;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("TimeStatisticsMethod")
    public String timeStatisticsMethod;

    public static ReportABMetricGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportABMetricGroupRequest self = new ReportABMetricGroupRequest();
        return TeaModel.build(map, self);
    }

    public ReportABMetricGroupRequest setBaseExperimentId(String baseExperimentId) {
        this.baseExperimentId = baseExperimentId;
        return this;
    }
    public String getBaseExperimentId() {
        return this.baseExperimentId;
    }

    public ReportABMetricGroupRequest setDimensionFields(String dimensionFields) {
        this.dimensionFields = dimensionFields;
        return this;
    }
    public String getDimensionFields() {
        return this.dimensionFields;
    }

    public ReportABMetricGroupRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ReportABMetricGroupRequest setExperimentGroupId(String experimentGroupId) {
        this.experimentGroupId = experimentGroupId;
        return this;
    }
    public String getExperimentGroupId() {
        return this.experimentGroupId;
    }

    public ReportABMetricGroupRequest setExperimentIds(String experimentIds) {
        this.experimentIds = experimentIds;
        return this;
    }
    public String getExperimentIds() {
        return this.experimentIds;
    }

    public ReportABMetricGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReportABMetricGroupRequest setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

    public ReportABMetricGroupRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public ReportABMetricGroupRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public ReportABMetricGroupRequest setTimeStatisticsMethod(String timeStatisticsMethod) {
        this.timeStatisticsMethod = timeStatisticsMethod;
        return this;
    }
    public String getTimeStatisticsMethod() {
        return this.timeStatisticsMethod;
    }

}
