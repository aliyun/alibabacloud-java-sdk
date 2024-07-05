// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIImageAuditJobRequest extends TeaModel {
    /**
     * <p>The configuration information about the review job.</p>
     * <ul>
     * <li>Other configuration items of the review job. Only the ResourceType field is supported. This field is used to specify the type of media files. You can adjust review standards and rules based on the type of media files.</li>
     * <li>The value of ResourceType can contain only letters, digits, and underscores (_).</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You can specify a value for the ResourceType field based on the preceding limits. After you specify a value for the ResourceType field, you must <a href="https://yida.alibaba-inc.com/o/ticketapply">submit a ticket</a>. The value takes effect after Alibaba Cloud processes your ticket.</li>
     * <li>If you want to change moderation policies and rules based on ResourceType, <a href="https://yida.alibaba-inc.com/o/ticketapply">submit a ticket</a> to contact technical support.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ResourceType&quot;:&quot;****_short_video&quot;}</p>
     */
    @NameInMap("MediaAuditConfiguration")
    public String mediaAuditConfiguration;

    /**
     * <p>The ID of the image.</p>
     * <p>The unique ID of the image is returned after the image is uploaded to ApsaraVideo VOD.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1aa3024aee64*****6dc8ca20dbc320</p>
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
     * <p>If you want to use an AI template, you can call the following operations:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/102936.html">ListAITemplate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/102930.html">AddAITemplate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/102933.html">GetAITemplate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/102937.html">SetDefaultAITemplate</a></li>
     * </ul>
     * <p>If you do not specify this parameter, the ID of the default AI template for automated review is used.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VOD-0003-00****</p>
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
