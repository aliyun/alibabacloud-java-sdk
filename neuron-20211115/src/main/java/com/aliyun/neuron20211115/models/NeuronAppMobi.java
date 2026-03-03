// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronAppMobi extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("appId")
    public Long appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sda</p>
     */
    @NameInMap("artifactUrl")
    public String artifactUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sda</p>
     */
    @NameInMap("commitId")
    public String commitId;

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

    /**
     * <strong>example:</strong>
     * <p>1343424</p>
     */
    @NameInMap("mobiUserId")
    public String mobiUserId;

    /**
     * <strong>example:</strong>
     * <p>sda</p>
     */
    @NameInMap("moduleId")
    public String moduleId;

    /**
     * <strong>example:</strong>
     * <p>sda</p>
     */
    @NameInMap("moduleName")
    public String moduleName;

    /**
     * <strong>example:</strong>
     * <p>sda</p>
     */
    @NameInMap("schemaVersion")
    public String schemaVersion;

    /**
     * <strong>example:</strong>
     * <p>NEW</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>sda</p>
     */
    @NameInMap("storeUrl")
    public String storeUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sdasdaddsad</p>
     */
    @NameInMap("token")
    public String token;

    /**
     * <strong>example:</strong>
     * <p>1.0.0.0</p>
     */
    @NameInMap("version")
    public String version;

    public static NeuronAppMobi build(java.util.Map<String, ?> map) throws Exception {
        NeuronAppMobi self = new NeuronAppMobi();
        return TeaModel.build(map, self);
    }

    public NeuronAppMobi setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public NeuronAppMobi setArtifactUrl(String artifactUrl) {
        this.artifactUrl = artifactUrl;
        return this;
    }
    public String getArtifactUrl() {
        return this.artifactUrl;
    }

    public NeuronAppMobi setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public NeuronAppMobi setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public NeuronAppMobi setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public NeuronAppMobi setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public NeuronAppMobi setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public NeuronAppMobi setMobiUserId(String mobiUserId) {
        this.mobiUserId = mobiUserId;
        return this;
    }
    public String getMobiUserId() {
        return this.mobiUserId;
    }

    public NeuronAppMobi setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public NeuronAppMobi setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public NeuronAppMobi setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public NeuronAppMobi setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public NeuronAppMobi setStoreUrl(String storeUrl) {
        this.storeUrl = storeUrl;
        return this;
    }
    public String getStoreUrl() {
        return this.storeUrl;
    }

    public NeuronAppMobi setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public NeuronAppMobi setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
