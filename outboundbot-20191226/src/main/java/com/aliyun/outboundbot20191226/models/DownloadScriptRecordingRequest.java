// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DownloadScriptRecordingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b3865dc3-40fa-4afd-9fe4-dc7cda305a24</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aa279896-64a6-4182-864c-4f2b04ec8d17</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5feaab8a-97fd-4720-8108-79e017f2d3ac</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DownloadScriptRecordingRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadScriptRecordingRequest self = new DownloadScriptRecordingRequest();
        return TeaModel.build(map, self);
    }

    public DownloadScriptRecordingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DownloadScriptRecordingRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public DownloadScriptRecordingRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
