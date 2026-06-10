// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateScriptWaveformRequest extends TeaModel {
    /**
     * <p>The ID of the recording file.</p>
     * <blockquote>
     * <p>Obtain this ID from the Folder parameter of the GetJobDataUploadParams operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6f91885fa24b4c408d8f4eb392fd8ae6</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The name of the recording file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>faaf8508-9542-4ac4-84a2-0ddcbb5f79a6 (2).json</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2bfa5ae4-7185-4227-a3b8-328f26f11be1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The text of the script.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>您好，您昨晚在李佳琦直播间下单的娜薇诗椰子水二代精华2支装还未付款，超时未支付会自动关闭订单，活动错过不再有奥。</p>
     */
    @NameInMap("ScriptContent")
    public String scriptContent;

    /**
     * <p>Scenario ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c5c5d8c0-c0f1-48a7-be2b-dc46006d888a</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static CreateScriptWaveformRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScriptWaveformRequest self = new CreateScriptWaveformRequest();
        return TeaModel.build(map, self);
    }

    public CreateScriptWaveformRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CreateScriptWaveformRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateScriptWaveformRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateScriptWaveformRequest setScriptContent(String scriptContent) {
        this.scriptContent = scriptContent;
        return this;
    }
    public String getScriptContent() {
        return this.scriptContent;
    }

    public CreateScriptWaveformRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
