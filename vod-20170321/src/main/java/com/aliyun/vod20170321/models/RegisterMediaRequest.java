// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RegisterMediaRequest extends TeaModel {
    /**
     * <p>The metadata of the media files. The value must be a JSON string. You can specify the metadata for up to 10 media files at a time. For more information about the metadata of media files, see the <strong>RegisterMetadata</strong> section of this topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;FileURL&quot;:&quot;https://****.oss-cn-shanghai.aliyuncs.com/video/test/video123.m3u8&quot;,&quot;Title&quot;:&quot;VideoName&quot;}]</p>
     */
    @NameInMap("RegisterMetadatas")
    public String registerMetadatas;

    /**
     * <p>The ID of the transcoding template group. You can use one of the following methods to obtain the ID:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Processing</strong> &gt; <strong>Transcoding Template Groups</strong>. On the Transcoding Template Groups page, you can view the ID of the transcoding template group.</li>
     * <li>Obtain the value of the TranscodeTemplateGroupId parameter from the response to the <a href="https://help.aliyun.com/document_detail/102665.html">AddTranscodeTemplateGroup</a> operation that you called to create a transcoding template group.</li>
     * <li>Obtain the value of the TranscodeTemplateGroupId parameter from the response to the <a href="https://help.aliyun.com/document_detail/102669.html">ListTranscodeTemplateGroup</a> operation that you called to query transcoding template groups.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you do not need to transcode media files, set the TemplateGroupId parameter to VOD_NO_TRANSCODE. If you do not specify this configuration, errors occur on your files. If you need to transcode media files, specify the ID of the transcoding template group.</p>
     * </li>
     * <li><p>If you specify both WorkflowId and TemplateGroupId, the value of the WorkflowId parameter takes effect. For more information, see <a href="https://help.aliyun.com/document_detail/115347.html">Workflows</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ca3a8f6e49c87b65806709586****</p>
     */
    @NameInMap("TemplateGroupId")
    public String templateGroupId;

    /**
     * <p>The custom settings. The value must be a JSON string. You can configure settings such as message callbacks. For more information, see <a href="~~86952#section_6fg_qll_v3w~~">UserData</a>.</p>
     * <blockquote>
     * <p> You cannot configure callbacks for this operation. No callback message is returned after the media files are registered even if you configure callback settings for this parameter. If you configure callback settings for the UserData parameter when you create media processing jobs such as transcoding and snapshot capture jobs for the media file, the callback URL that you specified is used. If you do not configure callback settings when you create media processing jobs, the callback URL that you specified for the UserData parameter when you register the media file is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Extend&quot;:{&quot;localId&quot;:&quot;****&quot;,&quot;test&quot;:&quot;www&quot;}}</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the workflow. To view the workflow ID, perform the following steps: Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Processing</strong> &gt; <strong>Workflows</strong>.</p>
     * <blockquote>
     * <p> If you specify both WorkflowId and TemplateGroupId, the value of WorkflowId parameter takes effect. For more information, see <a href="https://help.aliyun.com/document_detail/115347.html">Workflows</a>.</p>
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
