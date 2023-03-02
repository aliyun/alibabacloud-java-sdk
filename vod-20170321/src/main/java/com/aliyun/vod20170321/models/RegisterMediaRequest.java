// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RegisterMediaRequest extends TeaModel {
    /**
     * <p>The metadata of the media file that you want to register. The value is a JSON string. You can specify the metadata for a maximum of 10 media files at a time. For more information about the metadata of media files, see the **RegisterMetadata** section of this topic.</p>
     */
    @NameInMap("RegisterMetadatas")
    public String registerMetadatas;

    /**
     * <p>The ID of the transcoding template group. You can use one of the following methods to obtain the ID of the transcoding template group:</p>
     * <p>*   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Processing** > **Transcoding Template Groups**. On the Transcoding Template Groups page, you can view the ID of the transcoding template group.</p>
     * <p>*   View the value of the TranscodeTemplateGroupId parameter returned by the [AddTranscodeTemplateGroup](~~102665~~) operation that you called to create a transcoding template group.</p>
     * <p>*   View the value of the TranscodeTemplateGroupId parameter returned by the [ListTranscodeTemplateGroup](~~102669~~) operation that you called to query a transcoding template group.</p>
     * <p>> *   If you do not need to transcode the media file, set the TemplateGroupId parameter to VOD_NO_TRANSCODE. Otherwise, an exception occurs during video playback. If you need to transcode the media file, specify the ID of the transcoding template group.</p>
     * <p>> *   If both the WorkflowId and TemplateGroupId parameters are set, the value of the WorkflowId parameter takes effect. For more information, see [Workflows](~~115347~~).</p>
     */
    @NameInMap("TemplateGroupId")
    public String templateGroupId;

    /**
     * <p>The custom configurations such as callback configurations. The value is a JSON string. For more information, see the "UserData: specifies the custom configurations for media upload" section of the [Request parameters](~~86952#section\_6fg_qll_v3w~~) topic.</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the workflow. To view the ID of the workflow, log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Processing** > **Workflows**.</p>
     * <p>> If both the WorkflowId and TemplateGroupId parameters are set, the value of the WorkflowId parameter takes effect. For more information, see [Workflows](~~115347~~).</p>
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
