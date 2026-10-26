// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ReportABMetricGroupRequest extends TeaModel {
    /**
     * <p>The ID of the baseline experiment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("BaseExperimentId")
    public String baseExperimentId;

    /**
     * <p>The dimension fields.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;gender&quot;:&quot;man&quot;}</p>
     */
    @NameInMap("DimensionFields")
    public String dimensionFields;

    /**
     * <p>The end date. Format: YYYY-MM-DD.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-01</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The ID of the experiment group. You can call the <a href="https://help.aliyun.com/document_detail/2402573.html">ListExperimentGroups</a> operation to obtain the ID. This parameter is required for offline and real-time reports.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ExperimentGroupId")
    public String experimentGroupId;

    /**
     * <p>The list of experiment IDs. You can call the <a href="https://help.aliyun.com/document_detail/2402582.html">ListExperiments</a> operation to obtain the IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3,4,5</p>
     */
    @NameInMap("ExperimentIds")
    public String experimentIds;

    /**
     * <p>Instance ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a> operation to obtain instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The report type. Valid values:</p>
     * <ul>
     * <li>Realtime: real-time report</li>
     * <li>Offline: offline report</li>
     * <li>Market: dashboard report</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Offline</p>
     */
    @NameInMap("ReportType")
    public String reportType;

    /**
     * <p>The ID of the scene. You can call the <a href="https://help.aliyun.com/document_detail/2402581.html">ListScenes</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <p>The start date. Format: YYYY-MM-DD.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-01</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The statistical time type. This parameter is required for real-time reports. Valid values:</p>
     * <ul>
     * <li>Hour: hourly statistics</li>
     * <li>Day: cumulative statistics starting from 00:00 on the current day</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Hour</p>
     */
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
