// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronAppVersion extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1343424</p>
     */
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("appEntry")
    public String appEntry;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("appId")
    public Long appId;

    /**
     * <strong>example:</strong>
     * <p>升级订单功能</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("enterpriseId")
    public Long enterpriseId;

    @NameInMap("envs")
    public java.util.List<String> envs;

    @NameInMap("featureDesc")
    public java.util.List<NeuronAppInfoContent> featureDesc;

    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    @NameInMap("imageUrls")
    public java.util.List<String> imageUrls;

    @NameInMap("instructionUrl")
    public String instructionUrl;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("isLatest")
    public Integer isLatest;

    @NameInMap("manageType")
    public String manageType;

    /**
     * <strong>example:</strong>
     * <p>commit_pckesd7d_20230227215101</p>
     */
    @NameInMap("mobiCommitId")
    public String mobiCommitId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("mobiId")
    public Long mobiId;

    /**
     * <strong>example:</strong>
     * <p>module_tvtpydeq</p>
     */
    @NameInMap("mobiModuleId")
    public String mobiModuleId;

    /**
     * <strong>example:</strong>
     * <p>sda</p>
     */
    @NameInMap("mobiUrl")
    public String mobiUrl;

    @NameInMap("pbcs")
    public java.util.List<Long> pbcs;

    @NameInMap("privateInfo")
    public java.util.List<String> privateInfo;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("productId")
    public Long productId;

    @NameInMap("scopes")
    public java.util.List<String> scopes;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("sidebar")
    public String sidebar;

    /**
     * <strong>example:</strong>
     * <p>DRAFT</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>sda</p>
     */
    @NameInMap("unbindEffect")
    public String unbindEffect;

    @NameInMap("unbindReasons")
    public java.util.List<String> unbindReasons;

    @NameInMap("updatedFeature")
    public java.util.List<NeuronAppInfoContent> updatedFeature;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0.0</p>
     */
    @NameInMap("version")
    public String version;

    public static NeuronAppVersion build(java.util.Map<String, ?> map) throws Exception {
        NeuronAppVersion self = new NeuronAppVersion();
        return TeaModel.build(map, self);
    }

    public NeuronAppVersion setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public NeuronAppVersion setAppEntry(String appEntry) {
        this.appEntry = appEntry;
        return this;
    }
    public String getAppEntry() {
        return this.appEntry;
    }

    public NeuronAppVersion setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public NeuronAppVersion setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public NeuronAppVersion setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public NeuronAppVersion setEnvs(java.util.List<String> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.List<String> getEnvs() {
        return this.envs;
    }

    public NeuronAppVersion setFeatureDesc(java.util.List<NeuronAppInfoContent> featureDesc) {
        this.featureDesc = featureDesc;
        return this;
    }
    public java.util.List<NeuronAppInfoContent> getFeatureDesc() {
        return this.featureDesc;
    }

    public NeuronAppVersion setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public NeuronAppVersion setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public NeuronAppVersion setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public NeuronAppVersion setImageUrls(java.util.List<String> imageUrls) {
        this.imageUrls = imageUrls;
        return this;
    }
    public java.util.List<String> getImageUrls() {
        return this.imageUrls;
    }

    public NeuronAppVersion setInstructionUrl(String instructionUrl) {
        this.instructionUrl = instructionUrl;
        return this;
    }
    public String getInstructionUrl() {
        return this.instructionUrl;
    }

    public NeuronAppVersion setIsLatest(Integer isLatest) {
        this.isLatest = isLatest;
        return this;
    }
    public Integer getIsLatest() {
        return this.isLatest;
    }

    public NeuronAppVersion setManageType(String manageType) {
        this.manageType = manageType;
        return this;
    }
    public String getManageType() {
        return this.manageType;
    }

    public NeuronAppVersion setMobiCommitId(String mobiCommitId) {
        this.mobiCommitId = mobiCommitId;
        return this;
    }
    public String getMobiCommitId() {
        return this.mobiCommitId;
    }

    public NeuronAppVersion setMobiId(Long mobiId) {
        this.mobiId = mobiId;
        return this;
    }
    public Long getMobiId() {
        return this.mobiId;
    }

    public NeuronAppVersion setMobiModuleId(String mobiModuleId) {
        this.mobiModuleId = mobiModuleId;
        return this;
    }
    public String getMobiModuleId() {
        return this.mobiModuleId;
    }

    public NeuronAppVersion setMobiUrl(String mobiUrl) {
        this.mobiUrl = mobiUrl;
        return this;
    }
    public String getMobiUrl() {
        return this.mobiUrl;
    }

    public NeuronAppVersion setPbcs(java.util.List<Long> pbcs) {
        this.pbcs = pbcs;
        return this;
    }
    public java.util.List<Long> getPbcs() {
        return this.pbcs;
    }

    public NeuronAppVersion setPrivateInfo(java.util.List<String> privateInfo) {
        this.privateInfo = privateInfo;
        return this;
    }
    public java.util.List<String> getPrivateInfo() {
        return this.privateInfo;
    }

    public NeuronAppVersion setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public NeuronAppVersion setScopes(java.util.List<String> scopes) {
        this.scopes = scopes;
        return this;
    }
    public java.util.List<String> getScopes() {
        return this.scopes;
    }

    public NeuronAppVersion setSidebar(String sidebar) {
        this.sidebar = sidebar;
        return this;
    }
    public String getSidebar() {
        return this.sidebar;
    }

    public NeuronAppVersion setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public NeuronAppVersion setUnbindEffect(String unbindEffect) {
        this.unbindEffect = unbindEffect;
        return this;
    }
    public String getUnbindEffect() {
        return this.unbindEffect;
    }

    public NeuronAppVersion setUnbindReasons(java.util.List<String> unbindReasons) {
        this.unbindReasons = unbindReasons;
        return this;
    }
    public java.util.List<String> getUnbindReasons() {
        return this.unbindReasons;
    }

    public NeuronAppVersion setUpdatedFeature(java.util.List<NeuronAppInfoContent> updatedFeature) {
        this.updatedFeature = updatedFeature;
        return this;
    }
    public java.util.List<NeuronAppInfoContent> getUpdatedFeature() {
        return this.updatedFeature;
    }

    public NeuronAppVersion setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
