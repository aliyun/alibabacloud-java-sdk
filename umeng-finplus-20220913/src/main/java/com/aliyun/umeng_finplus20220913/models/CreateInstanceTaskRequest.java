// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class CreateInstanceTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("CalbackUrl")
    public String calbackUrl;

    @NameInMap("ClientId")
    public Long clientId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetIds")
    public String datasetIds;

    @NameInMap("MonitorType")
    public String monitorType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OutputConfig")
    public String outputConfig;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScoreStrategyConfig")
    public String scoreStrategyConfig;

    public static CreateInstanceTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceTaskRequest self = new CreateInstanceTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceTaskRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public CreateInstanceTaskRequest setCalbackUrl(String calbackUrl) {
        this.calbackUrl = calbackUrl;
        return this;
    }
    public String getCalbackUrl() {
        return this.calbackUrl;
    }

    public CreateInstanceTaskRequest setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public CreateInstanceTaskRequest setDatasetIds(String datasetIds) {
        this.datasetIds = datasetIds;
        return this;
    }
    public String getDatasetIds() {
        return this.datasetIds;
    }

    public CreateInstanceTaskRequest setMonitorType(String monitorType) {
        this.monitorType = monitorType;
        return this;
    }
    public String getMonitorType() {
        return this.monitorType;
    }

    public CreateInstanceTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateInstanceTaskRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public CreateInstanceTaskRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInstanceTaskRequest setScoreStrategyConfig(String scoreStrategyConfig) {
        this.scoreStrategyConfig = scoreStrategyConfig;
        return this;
    }
    public String getScoreStrategyConfig() {
        return this.scoreStrategyConfig;
    }

}
