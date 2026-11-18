// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RegisterMediaRequest extends TeaModel {
    /**
     * <p>Specifies whether to use the first frame of the video as the thumbnail.</p>
     */
    @NameInMap("EnableFirstFrameCover")
    public Boolean enableFirstFrameCover;

    /**
     * <p>Specifies whether to generate a thumbnail for the video.</p>
     */
    @NameInMap("GenerateThumbnail")
    public Boolean generateThumbnail;

    /**
     * <p>The metadata of the media assets to be registered. The value is a JSON string. You can specify the metadata for up to 10 media assets at a time. For more information about the parameter structure, see the <strong>RegisterMetadata</strong> table below.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;FileURL&quot;:&quot;https://****.oss-cn-shanghai.aliyuncs.com/video/test/video123.m3u8&quot;,&quot;Title&quot;:&quot;VideoName&quot;}]</p>
     */
    @NameInMap("RegisterMetadatas")
    public String registerMetadatas;

    /**
     * <p>The ID of the transcoding template group. You can obtain the ID by using one of the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Processing Configuration</strong> &gt; <strong>Transcoding Template Groups</strong> to view the ID of the transcoding template group.</li>
     * <li>When you create a transcoding template group by calling the <a href="https://help.aliyun.com/document_detail/102665.html">Create a transcoding template group</a> operation, the ID of the transcoding template group is the value of the TranscodeTemplateGroupId response parameter.</li>
     * <li>When you query transcoding template groups by calling the <a href="https://help.aliyun.com/document_detail/102669.html">Query transcoding configurations</a> operation, the ID of the transcoding template group is the value of the TranscodeTemplateGroupId response parameter.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If transcoding is not required, set this parameter to VOD_NO_TRANSCODE, which specifies the no-transcoding template group. Otherwise, the video status is <strong>Upload Completed</strong>, and you cannot use the playback service to play the audio or video. If transcoding is required, specify the ID of the corresponding transcoding template group.</li>
     * <li>If both WorkflowId and TemplateGroupId are specified, WorkflowId takes precedence. For more information, see <a href="https://help.aliyun.com/document_detail/115347.html">Media workflows</a>.</li>
     * <li>The task for this parameter is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous task</a>. After the task is submitted, it is not immediately completed but queued for asynchronous execution in the background.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ca3a8f6e49c87b65806709586****</p>
     */
    @NameInMap("TemplateGroupId")
    public String templateGroupId;

    /**
     * <p>The custom settings. The value is a JSON string. You can configure settings such as message callbacks. For more information about the parameter, see <a href="~~86952#section_6fg_qll_v3w~~">UserData</a>.</p>
     * <blockquote>
     * <p>This operation does not support callbacks. Even if a message callback is configured in this parameter, no callback message is generated after the media asset registration is completed. When you subsequently initiate media processing such as transcoding and snapshot generation for the registered media assets, if you separately configure a message callback in UserData when initiating the transcoding or snapshot generation, that callback URL takes precedence. If no callback is separately configured, the callback URL configured in UserData during the media asset registration is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Extend&quot;:{&quot;localId&quot;:&quot;****&quot;,&quot;test&quot;:&quot;www&quot;}}</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the media workflow. You can log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Processing Configuration</strong> &gt; <strong>Workflow Management</strong> to view the workflow ID.</p>
     * <blockquote>
     * <ul>
     * <li>If both WorkflowId and TemplateGroupId are specified, WorkflowId takes precedence. For more information, see <a href="https://help.aliyun.com/document_detail/115347.html">Media workflows</a>.</li>
     * <li>The task for this parameter is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous task</a>. After the task is submitted, it is not immediately completed but queued for asynchronous execution in the background.</li>
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
