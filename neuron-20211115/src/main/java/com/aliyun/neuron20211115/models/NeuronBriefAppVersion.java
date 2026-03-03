// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronBriefAppVersion extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1343424</p>
     */
    @NameInMap("accountId")
    public String accountId;

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
     * <p>1</p>
     */
    @NameInMap("enterpriseId")
    public Long enterpriseId;

    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

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

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("productId")
    public Long productId;

    /**
     * <strong>example:</strong>
     * <p>DRAFT</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0.0</p>
     */
    @NameInMap("version")
    public String version;

    public static NeuronBriefAppVersion build(java.util.Map<String, ?> map) throws Exception {
        NeuronBriefAppVersion self = new NeuronBriefAppVersion();
        return TeaModel.build(map, self);
    }

    public NeuronBriefAppVersion setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public NeuronBriefAppVersion setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public NeuronBriefAppVersion setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public NeuronBriefAppVersion setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public NeuronBriefAppVersion setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public NeuronBriefAppVersion setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public NeuronBriefAppVersion setManageType(String manageType) {
        this.manageType = manageType;
        return this;
    }
    public String getManageType() {
        return this.manageType;
    }

    public NeuronBriefAppVersion setMobiCommitId(String mobiCommitId) {
        this.mobiCommitId = mobiCommitId;
        return this;
    }
    public String getMobiCommitId() {
        return this.mobiCommitId;
    }

    public NeuronBriefAppVersion setMobiId(Long mobiId) {
        this.mobiId = mobiId;
        return this;
    }
    public Long getMobiId() {
        return this.mobiId;
    }

    public NeuronBriefAppVersion setMobiModuleId(String mobiModuleId) {
        this.mobiModuleId = mobiModuleId;
        return this;
    }
    public String getMobiModuleId() {
        return this.mobiModuleId;
    }

    public NeuronBriefAppVersion setMobiUrl(String mobiUrl) {
        this.mobiUrl = mobiUrl;
        return this;
    }
    public String getMobiUrl() {
        return this.mobiUrl;
    }

    public NeuronBriefAppVersion setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public NeuronBriefAppVersion setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public NeuronBriefAppVersion setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
