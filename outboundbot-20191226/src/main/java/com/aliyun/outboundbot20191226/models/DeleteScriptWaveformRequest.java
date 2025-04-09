// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteScriptWaveformRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScriptWaveformId")
    public String scriptWaveformId;

    public static DeleteScriptWaveformRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScriptWaveformRequest self = new DeleteScriptWaveformRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScriptWaveformRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteScriptWaveformRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public DeleteScriptWaveformRequest setScriptWaveformId(String scriptWaveformId) {
        this.scriptWaveformId = scriptWaveformId;
        return this;
    }
    public String getScriptWaveformId() {
        return this.scriptWaveformId;
    }

}
