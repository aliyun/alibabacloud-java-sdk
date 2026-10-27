// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class UpdateInstructionRequest extends TeaModel {
    /**
     * <p>The unique code for the instruction.</p>
     * 
     * <strong>example:</strong>
     * <p>Transfer00</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The configuration for the instruction, specified as a JSON string.</p>
     * <blockquote>
     * <ul>
     * <li><p><code>providerId</code>: The ID of the live agent service provider. Call the <code>ListCallCenterProviders</code> operation to obtain this ID.</p>
     * </li>
     * <li><p><code>transferMethod</code>: The method used for the transfer. Valid values: <code>BYE</code>, <code>BRIDGE</code>, and <code>REFER</code>.</p>
     * </li>
     * <li><p><code>transferType</code>: The transfer destination type. Valid values: <code>External</code> (external number), <code>Agent</code> (agent), and <code>SkillGroup</code> (skill group).</p>
     * </li>
     * <li><p><code>transferTarget</code>: The destination of the transfer, such as a phone number, an agent ID, or a skill group ID. The value of this parameter depends on the <code>transferType</code>.</p>
     * </li>
     * <li><p><code>transferor</code>: The caller ID to display for the transfer. If this parameter is not specified, the caller\&quot;s original phone number is used.</p>
     * </li>
     * <li><p><code>timeoutSeconds</code>: The timeout in seconds for transferring a call to an agent. Default: 30.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;providerId&quot;: &quot;xxxxxxxxx&quot;,
     *     &quot;transferMethod&quot;: &quot;BYE&quot;,
     *     &quot;transferType&quot;: &quot;External&quot;,
     *     &quot;transferTarget&quot;: &quot;152******&quot;,
     *     &quot;transferor&quot;: &quot;01*****&quot;,
     *     &quot;timeoutSeconds&quot;: &quot;10&quot;
     * }</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>36e9a4cd-a821-4f78-86fa-a9a4aefeea2e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the instruction.</p>
     * 
     * <strong>example:</strong>
     * <p>转人工指令一</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The type of the instruction.</p>
     * 
     * <strong>example:</strong>
     * <p>TRANSFER</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateInstructionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstructionRequest self = new UpdateInstructionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstructionRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateInstructionRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateInstructionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstructionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateInstructionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
