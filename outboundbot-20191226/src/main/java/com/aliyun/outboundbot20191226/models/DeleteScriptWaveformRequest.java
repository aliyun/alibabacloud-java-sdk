// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteScriptWaveformRequest extends TeaModel {
    /**
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e5035654-1745-484a-8c5b-165f7c7bcd79</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Scenario ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b9ff4e88-65f9-4eb3-987c-11ba51f3f24d</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>Deleted recording ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>df8216aa-d8f6-4501-864f-f8334d946561</p>
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
