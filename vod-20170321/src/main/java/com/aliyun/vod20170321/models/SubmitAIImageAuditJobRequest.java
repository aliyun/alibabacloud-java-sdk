// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIImageAuditJobRequest extends TeaModel {
    /**
     * <p>The configuration information about the review task.</p>
     * <br>
     * <p>*   Other configuration items of the review task. Only the ResourceType field is supported. This field is used to specify the type of media files. You can adjust review standards and rules based on the type of media files.</p>
     * <p>*   If you want to adjust moderation policies and rules based on ResourceType, submit a ticket to request technical support.</p>
     * <p>*   The value of ResourceType can contain only letters, digits, and underscores (\_).</p>
     * <br>
     * <p>>  You can specify a value for the ResourceType field based on the preceding limits. After you specify a value for the ResourceType field, you must submit a ticket. The value takes effect after Alibaba Cloud processes your ticket.</p>
     */
    @NameInMap("MediaAuditConfiguration")
    public String mediaAuditConfiguration;

    /**
     * <p>The ID of the image.</p>
     * <br>
     * <p>The unique ID of the image is returned after the image is uploaded to ApsaraVideo VOD.</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    /**
     * <p>The ID of the review template.</p>
     * <br>
     * <p>If you want to use an AI template, you can call the following operations:</p>
     * <br>
     * <p>*   [ListAITemplate](~~102936~~)</p>
     * <p>*   [AddAITemplate](~~102930~~)</p>
     * <p>*   [GetAITemplate](~~102933~~)</p>
     * <p>*   [SetDefaultAITemplate](~~102937~~)</p>
     * <br>
     * <p>If you do not specify this parameter, the ID of the default AI template for automated review is used.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static SubmitAIImageAuditJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIImageAuditJobRequest self = new SubmitAIImageAuditJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAIImageAuditJobRequest setMediaAuditConfiguration(String mediaAuditConfiguration) {
        this.mediaAuditConfiguration = mediaAuditConfiguration;
        return this;
    }
    public String getMediaAuditConfiguration() {
        return this.mediaAuditConfiguration;
    }

    public SubmitAIImageAuditJobRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SubmitAIImageAuditJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitAIImageAuditJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SubmitAIImageAuditJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitAIImageAuditJobRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitAIImageAuditJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
