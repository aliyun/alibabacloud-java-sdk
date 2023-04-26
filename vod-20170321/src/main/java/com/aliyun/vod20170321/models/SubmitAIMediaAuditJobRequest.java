// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIMediaAuditJobRequest extends TeaModel {
    /**
     * <p>Submits an automated review task. After a task is submitted, the task is processed in an asynchronous manner. The operation may return a response before the task is complete.</p>
     */
    @NameInMap("MediaAuditConfiguration")
    public String mediaAuditConfiguration;

    /**
     * <p>The type of the media file. Only **video** is supported.</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The configuration information about the review task.</p>
     * <br>
     * <p>*   Other configuration items of the review task. Only the ResourceType field is supported. This field is used to specify the type of media files. You can adjust review standards and rules based on the type of media files.</p>
     * <p>*   If you want to adjust review standards and rules based on ResourceType, submit a ticket to request technical support.</p>
     * <p>*   The value of ResourceType can contain only letters, digits, and underscores (\_).</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The operation that you want to perform. Set the value to **SubmitAIMediaAuditJob**.</p>
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
