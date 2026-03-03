// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronAppVersionUpdateCmd extends TeaModel {
    @NameInMap("appEntry")
    public String appEntry;

    /**
     * <strong>example:</strong>
     * <p>升级订单功能</p>
     */
    @NameInMap("desc")
    public String desc;

    @NameInMap("envs")
    public java.util.List<String> envs;

    @NameInMap("featureDesc")
    public java.util.List<NeuronAppInfoContent> featureDesc;

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
     * <p>NEURON</p>
     */
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
     * <p>DRAFT</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>1.相关代码删除</p>
     */
    @NameInMap("unbindEffect")
    public String unbindEffect;

    @NameInMap("unbindReasons")
    public java.util.List<String> unbindReasons;

    @NameInMap("updatedFeature")
    public java.util.List<NeuronAppInfoContent> updatedFeature;

    public static NeuronAppVersionUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        NeuronAppVersionUpdateCmd self = new NeuronAppVersionUpdateCmd();
        return TeaModel.build(map, self);
    }

    public NeuronAppVersionUpdateCmd setAppEntry(String appEntry) {
        this.appEntry = appEntry;
        return this;
    }
    public String getAppEntry() {
        return this.appEntry;
    }

    public NeuronAppVersionUpdateCmd setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public NeuronAppVersionUpdateCmd setEnvs(java.util.List<String> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.List<String> getEnvs() {
        return this.envs;
    }

    public NeuronAppVersionUpdateCmd setFeatureDesc(java.util.List<NeuronAppInfoContent> featureDesc) {
        this.featureDesc = featureDesc;
        return this;
    }
    public java.util.List<NeuronAppInfoContent> getFeatureDesc() {
        return this.featureDesc;
    }

    public NeuronAppVersionUpdateCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public NeuronAppVersionUpdateCmd setImageUrls(java.util.List<String> imageUrls) {
        this.imageUrls = imageUrls;
        return this;
    }
    public java.util.List<String> getImageUrls() {
        return this.imageUrls;
    }

    public NeuronAppVersionUpdateCmd setInstructionUrl(String instructionUrl) {
        this.instructionUrl = instructionUrl;
        return this;
    }
    public String getInstructionUrl() {
        return this.instructionUrl;
    }

    public NeuronAppVersionUpdateCmd setManageType(String manageType) {
        this.manageType = manageType;
        return this;
    }
    public String getManageType() {
        return this.manageType;
    }

    public NeuronAppVersionUpdateCmd setMobiId(Long mobiId) {
        this.mobiId = mobiId;
        return this;
    }
    public Long getMobiId() {
        return this.mobiId;
    }

    public NeuronAppVersionUpdateCmd setPbcs(java.util.List<Long> pbcs) {
        this.pbcs = pbcs;
        return this;
    }
    public java.util.List<Long> getPbcs() {
        return this.pbcs;
    }

    public NeuronAppVersionUpdateCmd setPrivateInfo(java.util.List<String> privateInfo) {
        this.privateInfo = privateInfo;
        return this;
    }
    public java.util.List<String> getPrivateInfo() {
        return this.privateInfo;
    }

    public NeuronAppVersionUpdateCmd setScopes(java.util.List<String> scopes) {
        this.scopes = scopes;
        return this;
    }
    public java.util.List<String> getScopes() {
        return this.scopes;
    }

    public NeuronAppVersionUpdateCmd setSidebar(String sidebar) {
        this.sidebar = sidebar;
        return this;
    }
    public String getSidebar() {
        return this.sidebar;
    }

    public NeuronAppVersionUpdateCmd setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public NeuronAppVersionUpdateCmd setUnbindEffect(String unbindEffect) {
        this.unbindEffect = unbindEffect;
        return this;
    }
    public String getUnbindEffect() {
        return this.unbindEffect;
    }

    public NeuronAppVersionUpdateCmd setUnbindReasons(java.util.List<String> unbindReasons) {
        this.unbindReasons = unbindReasons;
        return this;
    }
    public java.util.List<String> getUnbindReasons() {
        return this.unbindReasons;
    }

    public NeuronAppVersionUpdateCmd setUpdatedFeature(java.util.List<NeuronAppInfoContent> updatedFeature) {
        this.updatedFeature = updatedFeature;
        return this;
    }
    public java.util.List<NeuronAppInfoContent> getUpdatedFeature() {
        return this.updatedFeature;
    }

}
