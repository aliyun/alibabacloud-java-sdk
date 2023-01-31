// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteScriptRecordingRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ScriptId")
    public String scriptId;

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
