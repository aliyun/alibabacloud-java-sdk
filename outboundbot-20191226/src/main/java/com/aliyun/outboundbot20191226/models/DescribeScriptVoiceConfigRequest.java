// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeScriptVoiceConfigRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ScriptId")
    public String scriptId;

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
