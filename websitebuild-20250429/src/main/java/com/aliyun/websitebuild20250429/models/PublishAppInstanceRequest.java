// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class PublishAppInstanceRequest extends TeaModel {
    @NameInMap("ArtifactDigest")
    public String artifactDigest;

    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250821161210000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CandidateId")
    public String candidateId;

    /**
     * <p>The deployment channel.</p>
     * 
     * <strong>example:</strong>
     * <p>PC</p>
     */
    @NameInMap("DeployChannel")
    public String deployChannel;

    /**
     * <p>The publish description.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATE_BY_NLB.nlb-jcvs5sm9l8um84zbfa</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Ext")
    public String ext;

    @NameInMap("IdempotencyKey")
    public String idempotencyKey;

    /**
     * <p>The logical version number.</p>
     * 
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("LogicalNumber")
    public Integer logicalNumber;

    @NameInMap("PlatformAppid")
    public String platformAppid;

    @NameInMap("PluginDeclarationHash")
    public String pluginDeclarationHash;

    @NameInMap("PrivacyDraftId")
    public String privacyDraftId;

    @NameInMap("PrivacyRevision")
    public String privacyRevision;

    /**
     * <p>The publish number.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("PublishNumber")
    public String publishNumber;

    @NameInMap("PublishOrderId")
    public Long publishOrderId;

    @NameInMap("UploadSequence")
    public Long uploadSequence;

    /**
     * <p>The action.</p>
     * 
     * <strong>example:</strong>
     * <p>BUILD</p>
     */
    @NameInMap("WeappAction")
    public String weappAction;

    public static PublishAppInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishAppInstanceRequest self = new PublishAppInstanceRequest();
        return TeaModel.build(map, self);
    }

    public PublishAppInstanceRequest setArtifactDigest(String artifactDigest) {
        this.artifactDigest = artifactDigest;
        return this;
    }
    public String getArtifactDigest() {
        return this.artifactDigest;
    }

    public PublishAppInstanceRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public PublishAppInstanceRequest setCandidateId(String candidateId) {
        this.candidateId = candidateId;
        return this;
    }
    public String getCandidateId() {
        return this.candidateId;
    }

    public PublishAppInstanceRequest setDeployChannel(String deployChannel) {
        this.deployChannel = deployChannel;
        return this;
    }
    public String getDeployChannel() {
        return this.deployChannel;
    }

    public PublishAppInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PublishAppInstanceRequest setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

    public PublishAppInstanceRequest setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
        return this;
    }
    public String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    public PublishAppInstanceRequest setLogicalNumber(Integer logicalNumber) {
        this.logicalNumber = logicalNumber;
        return this;
    }
    public Integer getLogicalNumber() {
        return this.logicalNumber;
    }

    public PublishAppInstanceRequest setPlatformAppid(String platformAppid) {
        this.platformAppid = platformAppid;
        return this;
    }
    public String getPlatformAppid() {
        return this.platformAppid;
    }

    public PublishAppInstanceRequest setPluginDeclarationHash(String pluginDeclarationHash) {
        this.pluginDeclarationHash = pluginDeclarationHash;
        return this;
    }
    public String getPluginDeclarationHash() {
        return this.pluginDeclarationHash;
    }

    public PublishAppInstanceRequest setPrivacyDraftId(String privacyDraftId) {
        this.privacyDraftId = privacyDraftId;
        return this;
    }
    public String getPrivacyDraftId() {
        return this.privacyDraftId;
    }

    public PublishAppInstanceRequest setPrivacyRevision(String privacyRevision) {
        this.privacyRevision = privacyRevision;
        return this;
    }
    public String getPrivacyRevision() {
        return this.privacyRevision;
    }

    public PublishAppInstanceRequest setPublishNumber(String publishNumber) {
        this.publishNumber = publishNumber;
        return this;
    }
    public String getPublishNumber() {
        return this.publishNumber;
    }

    public PublishAppInstanceRequest setPublishOrderId(Long publishOrderId) {
        this.publishOrderId = publishOrderId;
        return this;
    }
    public Long getPublishOrderId() {
        return this.publishOrderId;
    }

    public PublishAppInstanceRequest setUploadSequence(Long uploadSequence) {
        this.uploadSequence = uploadSequence;
        return this;
    }
    public Long getUploadSequence() {
        return this.uploadSequence;
    }

    public PublishAppInstanceRequest setWeappAction(String weappAction) {
        this.weappAction = weappAction;
        return this;
    }
    public String getWeappAction() {
        return this.weappAction;
    }

}
