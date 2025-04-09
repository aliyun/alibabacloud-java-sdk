// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class UploadScriptRecordingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cab_script_recording/upload/88a56c18-3dc8-4338-9116-911deb169780/hello.wav</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hello.wav</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c209abb3-6804-4a75-b2c7-dd55c8c61b6a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d004cfd2-6a81-491c-83c6-cbe186620c95</p>
     */
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
