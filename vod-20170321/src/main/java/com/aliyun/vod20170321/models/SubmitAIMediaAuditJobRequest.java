// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIMediaAuditJobRequest extends TeaModel {
    /**
     * <p>The configuration information about the review job.</p>
     * <br>
     * <p>*   Other configuration items of the review job. Only the ResourceType field is supported. This field is used to specify the type of media files. You can adjust review standards and rules based on the type of media files.</p>
     * <p>*   If you want to modify the review standard and rules based on ResourceType, [submit a request on Yida](https://yida.alibaba-inc.com/o/ticketapply) to reach technical support.</p>
     * <p>*   The value of ResourceType can contain only letters, digits, and underscores (\_).</p>
     */
    @NameInMap("MediaAuditConfiguration")
    public String mediaAuditConfiguration;

    /**
     * <p>The ID of the video file. To obtain the file ID, log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com) and choose **Review Management** > **Content Moderation** in the left-side navigation pane.</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The type of the media file. Only **video** is supported.</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>The ID of the AI template. You can use one of the following methods to obtain the ID of the AI template:</p>
     * <br>
     * <p>*   Obtain the ID of the AI template from the response to the [AddAITemplate](~~102930~~) operation. The value of TemplateId is the ID of the AI template.</p>
     * <p>*   Obtain the ID of the AI template from the response to the [ListAITemplate](~~102936~~) operation. The value of TemplateId is the ID of the AI template.</p>
     * <br>
     * <p>>  If you do not specify an ID, the ID of the default AI template is used.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The custom settings. The value must be a JSON string. You can configure settings such as message callbacks. For more information, see [UserData](~~86952~~).</p>
     * <br>
     * <p>>  To use the callback configurations specified by this parameter, you must configure an HTTP callback URL and specify the types of the callback events in the ApsaraVideo VOD console. Otherwise, the callback configurations do not take effect. For more information about how to configure HTTP callback settings in the ApsaraVideo VOD console, see [Configure callback settings](~~86071~~).</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitAIMediaAuditJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIMediaAuditJobRequest self = new SubmitAIMediaAuditJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAIMediaAuditJobRequest setMediaAuditConfiguration(String mediaAuditConfiguration) {
        this.mediaAuditConfiguration = mediaAuditConfiguration;
        return this;
    }
    public String getMediaAuditConfiguration() {
        return this.mediaAuditConfiguration;
    }

    public SubmitAIMediaAuditJobRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SubmitAIMediaAuditJobRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public SubmitAIMediaAuditJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitAIMediaAuditJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
