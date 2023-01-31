// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class UploadScriptRecordingRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("FileId")
    public String fileId;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ScriptId")
    public String scriptId;

    public static UploadScriptRecordingRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadScriptRecordingRequest self = new UploadScriptRecordingRequest();
        return TeaModel.build(map, self);
    }

    public UploadScriptRecordingRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UploadScriptRecordingRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UploadScriptRecordingRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadScriptRecordingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UploadScriptRecordingRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
