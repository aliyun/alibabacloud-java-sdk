// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIMediaAuditJobRequest extends TeaModel {
    // The configuration information about the review task.
    // 
    // *   Other configuration items of the review task. Only the ResourceType field is supported. This field is used to specify the type of media files. You can adjust review standards and rules based on the type of media files.
    // *   If you want to adjust review standards and rules based on ResourceType, submit a ticket to request technical support.
    // *   The value of ResourceType can contain only letters, digits, and underscores (\_).
    @NameInMap("MediaAuditConfiguration")
    public String mediaAuditConfiguration;

    // The ID of the media file.
    // 
    // You can obtain the ID of the media file on the Content Moderation page in the ApsaraVideo VOD console.
    @NameInMap("MediaId")
    public String mediaId;

    // The type of the media file. Only **video** is supported.
    @NameInMap("MediaType")
    public String mediaType;

    // The ID of the AI template. If you do not specify this parameter, the ID of the default AI template for automated review is used.
    @NameInMap("TemplateId")
    public String templateId;

    // The custom settings. The value is a JSON string. You can configure settings such as message callbacks. For more information, see [Request parameters](~~86952~~).
    // 
    // >  The callback configurations take effect only if you specify the HTTP callback URL and select the specific callback events in the ApsaraVideo VOD console.
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
