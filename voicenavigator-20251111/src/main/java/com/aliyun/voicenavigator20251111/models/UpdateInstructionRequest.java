// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class UpdateInstructionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Transfer00</p>
     */
    @NameInMap("Code")
    public String code;

    /**
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
     * <strong>example:</strong>
     * <p>36e9a4cd-a821-4f78-86fa-a9a4aefeea2e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    /**
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
