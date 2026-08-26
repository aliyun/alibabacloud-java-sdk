// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIImageAuditJobRequest extends TeaModel {
    @NameInMap("CensorProvider")
    public String censorProvider;

    @NameInMap("ImageService")
    public String imageService;

    /**
     * <p>The review node configuration.</p>
     * <ul>
     * <li>Other configuration items of the review node. Currently, only the ResourceType field is supported, which is used to specify the media file type. You can adjust the review standards and rules for the specified type.</li>
     * <li>Usage notes for ResourceType: Only letters, digits, and underscores (_) are allowed.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You can customize the ResourceType field based on the usage notes. After customization, <a href="https://yida.alibaba-inc.com/o/ticketapply">submit a Yida form</a> to commit to Alibaba Cloud for spooling before the configuration takes effect.</li>
     * <li>To adjust the review standards and rules for a specific ResourceType, <a href="https://yida.alibaba-inc.com/o/ticketapply">submit a Yida form</a> to request technical support.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ResourceType&quot;:&quot;****_short_video&quot;}</p>
     */
    @NameInMap("MediaAuditConfiguration")
    public String mediaAuditConfiguration;

    /**
     * <p>The image ID.</p>
     * <p>The unique identifier of the image returned after the image is uploaded to ApsaraVideo VOD.</p>
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

    @NameInMap("ServiceParameters")
    public String serviceParameters;

    /**
     * <p>The AI template ID. You can obtain the ID by using one of the following methods:</p>
     * <ul>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/102930.html">Add AI template</a> operation to add an AI template. The AI template ID is the value of TemplateId in the response.</li>
     * <li>After the AI template is added, call the <a href="https://help.aliyun.com/document_detail/102936.html">Query AI template list</a> operation to query the AI template ID, which is the value of TemplateId in the response.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a07a7f7d7d10eb9fd999e56ecc****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static SubmitAIImageAuditJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIImageAuditJobRequest self = new SubmitAIImageAuditJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAIImageAuditJobRequest setCensorProvider(String censorProvider) {
        this.censorProvider = censorProvider;
        return this;
    }
    public String getCensorProvider() {
        return this.censorProvider;
    }

    public SubmitAIImageAuditJobRequest setImageService(String imageService) {
        this.imageService = imageService;
        return this;
    }
    public String getImageService() {
        return this.imageService;
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

    public SubmitAIImageAuditJobRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

    public SubmitAIImageAuditJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
