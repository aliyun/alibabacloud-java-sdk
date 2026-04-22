// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetRealtimeScriptStatsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cd6fc91bc13445c2af7f2e3e31418520</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>64241e64-190c-45d1-af66-06f51c07b090</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static GetRealtimeScriptStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeScriptStatsRequest self = new GetRealtimeScriptStatsRequest();
        return TeaModel.build(map, self);
    }

    public GetRealtimeScriptStatsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRealtimeScriptStatsRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
