// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronAppVersionCreateCmd extends TeaModel {
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

    @NameInMap("envs")
    public java.util.List<String> envs;

    @NameInMap("featureDesc")
    public java.util.List<NeuronAppInfoContent> featureDesc;

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

    @NameInMap("pbcs")
    public java.util.List<Long> pbcs;

    @NameInMap("pluginList")
    public java.util.List<AppPluginInfo> pluginList;

    @NameInMap("privateInfo")
    public java.util.List<String> privateInfo;

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

    public static NeuronAppVersionCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        NeuronAppVersionCreateCmd self = new NeuronAppVersionCreateCmd();
        return TeaModel.build(map, self);
    }

    public NeuronAppVersionCreateCmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public NeuronAppVersionCreateCmd setAppEntry(String appEntry) {
        this.appEntry = appEntry;
        return this;
    }
    public String getAppEntry() {
        return this.appEntry;
    }

    public NeuronAppVersionCreateCmd setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public NeuronAppVersionCreateCmd setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public NeuronAppVersionCreateCmd setEnvs(java.util.List<String> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.List<String> getEnvs() {
        return this.envs;
    }

    public NeuronAppVersionCreateCmd setFeatureDesc(java.util.List<NeuronAppInfoContent> featureDesc) {
        this.featureDesc = featureDesc;
        return this;
    }
    public java.util.List<NeuronAppInfoContent> getFeatureDesc() {
        return this.featureDesc;
    }

    public NeuronAppVersionCreateCmd setImageUrls(java.util.List<String> imageUrls) {
        this.imageUrls = imageUrls;
        return this;
    }
    public java.util.List<String> getImageUrls() {
        return this.imageUrls;
    }

    public NeuronAppVersionCreateCmd setInstructionUrl(String instructionUrl) {
        this.instructionUrl = instructionUrl;
        return this;
    }
    public String getInstructionUrl() {
        return this.instructionUrl;
    }

    public NeuronAppVersionCreateCmd setManageType(String manageType) {
        this.manageType = manageType;
        return this;
    }
    public String getManageType() {
        return this.manageType;
    }

    public NeuronAppVersionCreateCmd setMobiId(Long mobiId) {
        this.mobiId = mobiId;
        return this;
    }
    public Long getMobiId() {
        return this.mobiId;
    }

    public NeuronAppVersionCreateCmd setPbcs(java.util.List<Long> pbcs) {
        this.pbcs = pbcs;
        return this;
    }
    public java.util.List<Long> getPbcs() {
        return this.pbcs;
    }

    public NeuronAppVersionCreateCmd setPluginList(java.util.List<AppPluginInfo> pluginList) {
        this.pluginList = pluginList;
        return this;
    }
    public java.util.List<AppPluginInfo> getPluginList() {
        return this.pluginList;
    }

    public NeuronAppVersionCreateCmd setPrivateInfo(java.util.List<String> privateInfo) {
        this.privateInfo = privateInfo;
        return this;
    }
    public java.util.List<String> getPrivateInfo() {
        return this.privateInfo;
    }

    public NeuronAppVersionCreateCmd setScopes(java.util.List<String> scopes) {
        this.scopes = scopes;
        return this;
    }
    public java.util.List<String> getScopes() {
        return this.scopes;
    }

    public NeuronAppVersionCreateCmd setSidebar(String sidebar) {
        this.sidebar = sidebar;
        return this;
    }
    public String getSidebar() {
        return this.sidebar;
    }

    public NeuronAppVersionCreateCmd setUnbindEffect(String unbindEffect) {
        this.unbindEffect = unbindEffect;
        return this;
    }
    public String getUnbindEffect() {
        return this.unbindEffect;
    }

    public NeuronAppVersionCreateCmd setUnbindReasons(java.util.List<String> unbindReasons) {
        this.unbindReasons = unbindReasons;
        return this;
    }
    public java.util.List<String> getUnbindReasons() {
        return this.unbindReasons;
    }

    public NeuronAppVersionCreateCmd setUpdatedFeature(java.util.List<NeuronAppInfoContent> updatedFeature) {
        this.updatedFeature = updatedFeature;
        return this;
    }
    public java.util.List<NeuronAppInfoContent> getUpdatedFeature() {
        return this.updatedFeature;
    }

    public NeuronAppVersionCreateCmd setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
