// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class StartJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10086</p>
     */
    @NameInMap("CallingNumber")
    public java.util.List<String> callingNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>da37319b-6c83-4268-9f19-814aed62e401</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>4f21446e-324e-46f2-bf62-7f341fb004ea</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobJson")
    public String jobJson;

    /**
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("ScenarioId")
    public String scenarioId;

    /**
     * <strong>example:</strong>
     * <p>b9ff4e88-65f9-4eb3-987c-11ba51f3f24d</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static StartJobRequest build(java.util.Map<String, ?> map) throws Exception {
        StartJobRequest self = new StartJobRequest();
        return TeaModel.build(map, self);
    }

    public StartJobRequest setCallingNumber(java.util.List<String> callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public java.util.List<String> getCallingNumber() {
        return this.callingNumber;
    }

    public StartJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartJobRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public StartJobRequest setJobJson(String jobJson) {
        this.jobJson = jobJson;
        return this;
    }
    public String getJobJson() {
        return this.jobJson;
    }

    public StartJobRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

    public StartJobRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
