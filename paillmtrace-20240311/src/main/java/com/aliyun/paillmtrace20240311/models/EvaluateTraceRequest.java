// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class EvaluateTraceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my-llm-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EvaluationConfig")
    public EvaluationConfig evaluationConfig;

    /**
     * <strong>example:</strong>
     * <p>44aea0ee00000000be5be24b2abb8f98</p>
     */
    @NameInMap("EvaluationId")
    public String evaluationId;

    /**
     * <strong>example:</strong>
     * <p>2025-04-05 13:24:25
     * 2025-04-05</p>
     */
    @NameInMap("MaxTime")
    public String maxTime;

    /**
     * <strong>example:</strong>
     * <p>2025-04-05 13:24:25
     * 2025-04-05</p>
     */
    @NameInMap("MinTime")
    public String minTime;

    @NameInMap("ModelConfig")
    public ModelConfig modelConfig;

    public static EvaluateTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        EvaluateTraceRequest self = new EvaluateTraceRequest();
        return TeaModel.build(map, self);
    }

    public EvaluateTraceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EvaluateTraceRequest setEvaluationConfig(EvaluationConfig evaluationConfig) {
        this.evaluationConfig = evaluationConfig;
        return this;
    }
    public EvaluationConfig getEvaluationConfig() {
        return this.evaluationConfig;
    }

    public EvaluateTraceRequest setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
        return this;
    }
    public String getEvaluationId() {
        return this.evaluationId;
    }

    public EvaluateTraceRequest setMaxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }
    public String getMaxTime() {
        return this.maxTime;
    }

    public EvaluateTraceRequest setMinTime(String minTime) {
        this.minTime = minTime;
        return this;
    }
    public String getMinTime() {
        return this.minTime;
    }

    public EvaluateTraceRequest setModelConfig(ModelConfig modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }
    public ModelConfig getModelConfig() {
        return this.modelConfig;
    }

}
