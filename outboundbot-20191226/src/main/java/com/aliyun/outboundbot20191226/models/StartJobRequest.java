// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class StartJobRequest extends TeaModel {
    /**
     * <p>List of caller numbers</p>
     * 
     * <strong>example:</strong>
     * <p>10086</p>
     */
    @NameInMap("CallingNumber")
    public java.util.List<String> callingNumber;

    /**
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>da37319b-6c83-4268-9f19-814aed62e401</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Task group ID</p>
     * 
     * <strong>example:</strong>
     * <p>4f21446e-324e-46f2-bf62-7f341fb004ea</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    /**
     * <p>Job data, which includes the following fields:</p>
     * <p>extras // Optional extra information</p>
     * <ul>
     * <li><p>key // Key for a custom variable</p>
     * </li>
     * <li><p>value // Value for a custom variable</p>
     * </li>
     * </ul>
     * <p>contacts // Required contact information for the callee</p>
     * <ul>
     * <li><p>phoneNumber // Required phone number of the callee</p>
     * </li>
     * <li><p>referenceId // Required contact ID (user-defined) to avoid duplicate names</p>
     * </li>
     * <li><p>role // Optional role of this contact in the outbound call scenario. If omitted, no role distinction is made</p>
     * </li>
     * <li><p>honorific // Optional honorific for the contact</p>
     * </li>
     * <li><p>name // Optional name of the contact</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;extras&quot;: [{
     *         &quot;value&quot;: &quot;测试&quot;,
     *         &quot;key&quot;: &quot;测试&quot;
     *     }, {
     *         &quot;key&quot;: &quot;ServiceId&quot;,
     *         &quot;value&quot;: null
     *     }, {
     *         &quot;key&quot;: &quot;TenantId&quot;,
     *         &quot;value&quot;: null
     *     }],
     *     &quot;contacts&quot;: [{
     *         &quot;phonenumber&quot;: &quot;198********&quot;,
     *         &quot;name&quot;: &quot;张三&quot;,
     *         &quot;priority&quot;: 5,
     *         &quot;referenceId&quot;: &quot;C01&quot;
     *     }]
     * }</p>
     */
    @NameInMap("JobJson")
    public String jobJson;

    /**
     * <p>Scenario ID. This field supports backward compatibility with legacy outbound calling features. You can omit it.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("ScenarioId")
    public String scenarioId;

    /**
     * <p>Scenario ID (required)</p>
     * 
     * <strong>example:</strong>
     * <p>1eeae263-54ca-4a52-ae14-62da58f3c473</p>
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
