// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteScriptRecordingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1eefcb81-cd58-4143-8180-6a962d79d708</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dcc42f0d-cfd8-4866-9bbf-002042503745</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <strong>example:</strong>
     * <p>[
     *       &quot;d17d5bfa-4972-4389-9718-f9602edabe48&quot;
     * ]</p>
     */
    @NameInMap("UuidsJson")
    public String uuidsJson;

    public static DeleteScriptRecordingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScriptRecordingRequest self = new DeleteScriptRecordingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScriptRecordingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteScriptRecordingRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public DeleteScriptRecordingRequest setUuidsJson(String uuidsJson) {
        this.uuidsJson = uuidsJson;
        return this;
    }
    public String getUuidsJson() {
        return this.uuidsJson;
    }

}
