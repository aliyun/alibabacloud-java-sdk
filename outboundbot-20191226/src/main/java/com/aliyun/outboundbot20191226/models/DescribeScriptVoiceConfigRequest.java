// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeScriptVoiceConfigRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8fa1953f-4a84-46d8-b80c-8ce9cf684fb3</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the script.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0fe7f71c-8771-42ef-9bb1-19aa16ae7120</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The ID of the script voice configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2a07b634-e15d-445f-bbcb-fc4ea2df7b87</p>
     */
    @NameInMap("ScriptVoiceConfigId")
    public String scriptVoiceConfigId;

    public static DescribeScriptVoiceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScriptVoiceConfigRequest self = new DescribeScriptVoiceConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScriptVoiceConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeScriptVoiceConfigRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public DescribeScriptVoiceConfigRequest setScriptVoiceConfigId(String scriptVoiceConfigId) {
        this.scriptVoiceConfigId = scriptVoiceConfigId;
        return this;
    }
    public String getScriptVoiceConfigId() {
        return this.scriptVoiceConfigId;
    }

}
