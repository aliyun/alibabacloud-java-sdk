// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetScriptRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8a503680-815d-473e-a9b0-e010f47a64d2</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>ac6db76a-bbe7-4a2c-b7cc-7f62da7bb4c6</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static GetScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScriptRequest self = new GetScriptRequest();
        return TeaModel.build(map, self);
    }

    public GetScriptRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetScriptRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
