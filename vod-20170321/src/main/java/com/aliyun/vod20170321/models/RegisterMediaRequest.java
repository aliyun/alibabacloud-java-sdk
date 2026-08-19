// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RegisterMediaRequest extends TeaModel {
    @NameInMap("EnableFirstFrameCover")
    public Boolean enableFirstFrameCover;

    @NameInMap("GenerateThumbnail")
    public Boolean generateThumbnail;

    /**
     * <p>The metadata of the media assets to register. The value is a JSON string. You can specify metadata for up to 10 media assets at a time. For more information about the parameter structure, see the <strong>RegisterMetadata</strong> table below.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;FileURL&quot;:&quot;https://****.oss-cn-shanghai.aliyuncs.com/video/test/video123.m3u8&quot;,&quot;Title&quot;:&quot;VideoName&quot;}]</p>
     */
    @NameInMap("RegisterMetadatas")
    public String registerMetadatas;

    /**
     * <p>The transcoding template group ID. You can obtain the ID by using one of the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Processing</strong> &gt; <strong>Transcoding Template Groups</strong> to view the transcoding template group ID.</li>
     * <li>Obtain the value of TranscodeTemplateGroupId from the response when you call the <a href="https://help.aliyun.com/document_detail/102665.html">CreateTranscodeTemplateGroup</a> operation.</li>
     * <li>Obtain the value of TranscodeTemplateGroupId from the response when you call the <a href="https://help.aliyun.com/document_detail/102669.html">ListTranscodeTemplateGroup</a> operation.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If transcoding is not required, set this parameter to VOD_NO_TRANSCODE (the no-transcoding template group). Otherwise, the video status is <strong>UploadSucc</strong> and the video cannot be played by using the playback service. If transcoding is required, specify the corresponding transcoding template group ID.</li>
     * <li>If both WorkflowId and TemplateGroupId are specified, WorkflowId takes precedence. For more information, see <a href="https://help.aliyun.com/document_detail/115347.html">Workflows</a>.</li>
     * <li>This parameter triggers an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous task</a>. After submission, the task enters a background queue for asynchronous execution.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ca3a8f6e49c87b65806709586****</p>
     */
    @NameInMap("TemplateGroupId")
    public String templateGroupId;

    /**
     * <p>The custom settings. The value is a JSON string that supports settings such as message callbacks. For more information, see <a href="~~86952#section_6fg_qll_v3w~~">UserData</a>.</p>
     * <blockquote>
     * <p>This operation does not support callbacks. Even if you configure a message callback in this parameter, no callback message is generated after media asset registration is complete. When you subsequently initiate media processing such as transcoding or snapshotting on the registered media asset, if you specify a message callback in UserData at that time, that callback URL takes precedence. Otherwise, the callback URL specified in UserData during media asset registration is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Extend&quot;:{&quot;localId&quot;:&quot;****&quot;,&quot;test&quot;:&quot;www&quot;}}</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The workflow ID. Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Processing</strong> &gt; <strong>Workflow Management</strong> to view the workflow ID.</p>
     * <blockquote>
     * <ul>
     * <li>If both WorkflowId and TemplateGroupId are specified, WorkflowId takes precedence. For more information, see <a href="https://help.aliyun.com/document_detail/115347.html">Workflows</a>.</li>
     * <li>This parameter triggers an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous task</a>. After submission, the task enters a background queue for asynchronous execution.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>637adc2b7ba51a83d841606f8****</p>
     */
    @NameInMap("WorkflowId")
    public String workflowId;

    public static RegisterMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterMediaRequest self = new RegisterMediaRequest();
        return TeaModel.build(map, self);
    }

    public RegisterMediaRequest setEnableFirstFrameCover(Boolean enableFirstFrameCover) {
        this.enableFirstFrameCover = enableFirstFrameCover;
        return this;
    }
    public Boolean getEnableFirstFrameCover() {
        return this.enableFirstFrameCover;
    }

    public RegisterMediaRequest setGenerateThumbnail(Boolean generateThumbnail) {
        this.generateThumbnail = generateThumbnail;
        return this;
    }
    public Boolean getGenerateThumbnail() {
        return this.generateThumbnail;
    }

    public RegisterMediaRequest setRegisterMetadatas(String registerMetadatas) {
        this.registerMetadatas = registerMetadatas;
        return this;
    }
    public String getRegisterMetadatas() {
        return this.registerMetadatas;
    }

    public RegisterMediaRequest setTemplateGroupId(String templateGroupId) {
        this.templateGroupId = templateGroupId;
        return this;
    }
    public String getTemplateGroupId() {
        return this.templateGroupId;
    }

    public RegisterMediaRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public RegisterMediaRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
