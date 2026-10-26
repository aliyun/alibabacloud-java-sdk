// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetFeatureConsistencyCheckJobResponseBody extends TeaModel {
    /**
     * <p>The configuration information.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The ID of the feature consistency check configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("FeatureConsistencyCheckJobConfigId")
    public String featureConsistencyCheckJobConfigId;

    /**
     * <p>The name of the feature consistency check task configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>feature_consistency_check_1</p>
     */
    @NameInMap("FeatureConsistencyCheckJobConfigName")
    public String featureConsistencyCheckJobConfigName;

    /**
     * <p>The end time. The time is in ISO 8601 format and includes a time zone offset.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtEndTime")
    public String gmtEndTime;

    /**
     * <p>The start time. The time is in ISO 8601 format and includes a time zone offset.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtStartTime")
    public String gmtStartTime;

    /**
     * <p>The log information.</p>
     */
    @NameInMap("Logs")
    public java.util.List<String> logs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A04CB8C0-E74A-5E83-BC61-64D153574EC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li>ToRun: Pending.</li>
     * <li>Running: Running.</li>
     * <li>Success: Succeeded.</li>
     * <li>Failure: Failed.</li>
     * <li>Terminated: Stopped or canceled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetFeatureConsistencyCheckJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFeatureConsistencyCheckJobResponseBody self = new GetFeatureConsistencyCheckJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFeatureConsistencyCheckJobResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public GetFeatureConsistencyCheckJobResponseBody setFeatureConsistencyCheckJobConfigId(String featureConsistencyCheckJobConfigId) {
        this.featureConsistencyCheckJobConfigId = featureConsistencyCheckJobConfigId;
        return this;
    }
    public String getFeatureConsistencyCheckJobConfigId() {
        return this.featureConsistencyCheckJobConfigId;
    }

    public GetFeatureConsistencyCheckJobResponseBody setFeatureConsistencyCheckJobConfigName(String featureConsistencyCheckJobConfigName) {
        this.featureConsistencyCheckJobConfigName = featureConsistencyCheckJobConfigName;
        return this;
    }
    public String getFeatureConsistencyCheckJobConfigName() {
        return this.featureConsistencyCheckJobConfigName;
    }

    public GetFeatureConsistencyCheckJobResponseBody setGmtEndTime(String gmtEndTime) {
        this.gmtEndTime = gmtEndTime;
        return this;
    }
    public String getGmtEndTime() {
        return this.gmtEndTime;
    }

    public GetFeatureConsistencyCheckJobResponseBody setGmtStartTime(String gmtStartTime) {
        this.gmtStartTime = gmtStartTime;
        return this;
    }
    public String getGmtStartTime() {
        return this.gmtStartTime;
    }

    public GetFeatureConsistencyCheckJobResponseBody setLogs(java.util.List<String> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<String> getLogs() {
        return this.logs;
    }

    public GetFeatureConsistencyCheckJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFeatureConsistencyCheckJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
