// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronAppVersionDetail extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>升级订单功能</p>
     */
    @NameInMap("appDesc")
    public String appDesc;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>order</p>
     */
    @NameInMap("appName")
    public String appName;

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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://wwww.ali.com">http://wwww.ali.com</a></p>
     */
    @NameInMap("iconUrl")
    public String iconUrl;

    @NameInMap("imageUrls")
    public java.util.List<String> imageUrls;

    @NameInMap("instructionUrl")
    public String instructionUrl;

    @NameInMap("manageType")
    public String manageType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("mobiId")
    public Long mobiId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>多端商城</p>
     */
    @NameInMap("owner")
    public String owner;

    @NameInMap("pbcs")
    public java.util.List<Long> pbcs;

    @NameInMap("pluginList")
    public java.util.List<AppPluginInfo> pluginList;

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

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("versionId")
    public Long versionId;

    public static NeuronAppVersionDetail build(java.util.Map<String, ?> map) throws Exception {
        NeuronAppVersionDetail self = new NeuronAppVersionDetail();
        return TeaModel.build(map, self);
    }

    public NeuronAppVersionDetail setAppDesc(String appDesc) {
        this.appDesc = appDesc;
        return this;
    }
    public String getAppDesc() {
        return this.appDesc;
    }

    public NeuronAppVersionDetail setAppEntry(String appEntry) {
        this.appEntry = appEntry;
        return this;
    }
    public String getAppEntry() {
        return this.appEntry;
    }

    public NeuronAppVersionDetail setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public NeuronAppVersionDetail setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public NeuronAppVersionDetail setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public NeuronAppVersionDetail setEnvs(java.util.List<String> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.List<String> getEnvs() {
        return this.envs;
    }

    public NeuronAppVersionDetail setFeatureDesc(java.util.List<NeuronAppInfoContent> featureDesc) {
        this.featureDesc = featureDesc;
        return this;
    }
    public java.util.List<NeuronAppInfoContent> getFeatureDesc() {
        return this.featureDesc;
    }

    public NeuronAppVersionDetail setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }
    public String getIconUrl() {
        return this.iconUrl;
    }

    public NeuronAppVersionDetail setImageUrls(java.util.List<String> imageUrls) {
        this.imageUrls = imageUrls;
        return this;
    }
    public java.util.List<String> getImageUrls() {
        return this.imageUrls;
    }

    public NeuronAppVersionDetail setInstructionUrl(String instructionUrl) {
        this.instructionUrl = instructionUrl;
        return this;
    }
    public String getInstructionUrl() {
        return this.instructionUrl;
    }

    public NeuronAppVersionDetail setManageType(String manageType) {
        this.manageType = manageType;
        return this;
    }
    public String getManageType() {
        return this.manageType;
    }

    public NeuronAppVersionDetail setMobiId(Long mobiId) {
        this.mobiId = mobiId;
        return this;
    }
    public Long getMobiId() {
        return this.mobiId;
    }

    public NeuronAppVersionDetail setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public NeuronAppVersionDetail setPbcs(java.util.List<Long> pbcs) {
        this.pbcs = pbcs;
        return this;
    }
    public java.util.List<Long> getPbcs() {
        return this.pbcs;
    }

    public NeuronAppVersionDetail setPluginList(java.util.List<AppPluginInfo> pluginList) {
        this.pluginList = pluginList;
        return this;
    }
    public java.util.List<AppPluginInfo> getPluginList() {
        return this.pluginList;
    }

    public NeuronAppVersionDetail setPrivateInfo(java.util.List<String> privateInfo) {
        this.privateInfo = privateInfo;
        return this;
    }
    public java.util.List<String> getPrivateInfo() {
        return this.privateInfo;
    }

    public NeuronAppVersionDetail setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public NeuronAppVersionDetail setScopes(java.util.List<String> scopes) {
        this.scopes = scopes;
        return this;
    }
    public java.util.List<String> getScopes() {
        return this.scopes;
    }

    public NeuronAppVersionDetail setSidebar(String sidebar) {
        this.sidebar = sidebar;
        return this;
    }
    public String getSidebar() {
        return this.sidebar;
    }

    public NeuronAppVersionDetail setUnbindEffect(String unbindEffect) {
        this.unbindEffect = unbindEffect;
        return this;
    }
    public String getUnbindEffect() {
        return this.unbindEffect;
    }

    public NeuronAppVersionDetail setUnbindReasons(java.util.List<String> unbindReasons) {
        this.unbindReasons = unbindReasons;
        return this;
    }
    public java.util.List<String> getUnbindReasons() {
        return this.unbindReasons;
    }

    public NeuronAppVersionDetail setUpdatedFeature(java.util.List<NeuronAppInfoContent> updatedFeature) {
        this.updatedFeature = updatedFeature;
        return this;
    }
    public java.util.List<NeuronAppInfoContent> getUpdatedFeature() {
        return this.updatedFeature;
    }

    public NeuronAppVersionDetail setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public NeuronAppVersionDetail setVersionId(Long versionId) {
        this.versionId = versionId;
        return this;
    }
    public Long getVersionId() {
        return this.versionId;
    }

}
