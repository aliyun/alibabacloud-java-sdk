// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLJobDataSourceConfig extends TeaModel {
    /**
     * <p>The AI computing CPFS access point ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-example</p>
     */
    @NameInMap("AccessPointId")
    public String accessPointId;

    /**
     * <p>The datasource ID. You must specify one of DataSourceId, Uri, or ModelId.</p>
     * 
     * <strong>example:</strong>
     * <p>d-gx8xxxxx</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>The datasource version.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("DataSourceVersion")
    public String dataSourceVersion;

    /**
     * <p>Specifies whether to enable data caching.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableCache")
    public Boolean enableCache;

    /**
     * <p>The ModelGallery model ID to mount. The latest version of the model that you have access to is used. You must specify one of DataSourceId, Uri, or ModelId. Model mounting supports read-only access only.</p>
     * 
     * <strong>example:</strong>
     * <p>model-v63llpfh7u824imbni</p>
     */
    @NameInMap("ModelId")
    public String modelId;

    /**
     * <p>The mount access mode.</p>
     * 
     * <strong>example:</strong>
     * <p>RO</p>
     */
    @NameInMap("MountAccess")
    public String mountAccess;

    /**
     * <p>The absolute mount path in the worker container. This parameter is required for RLJob datasources.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/mnt/input</p>
     */
    @NameInMap("MountPath")
    public String mountPath;

    /**
     * <p>The extended datasource configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The ARN of the RAM role used to access the datasource.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1872xxxxxxxxx:role/account-pai-prod</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>The JSON string of the role chain used to access the datasource.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("RoleChain")
    public String roleChain;

    /**
     * <p>The datasource URI. You must specify one of DataSourceId, Uri, or ModelId.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://example-bucket/data/</p>
     */
    @NameInMap("Uri")
    public String uri;

    public static RLJobDataSourceConfig build(java.util.Map<String, ?> map) throws Exception {
        RLJobDataSourceConfig self = new RLJobDataSourceConfig();
        return TeaModel.build(map, self);
    }

    public RLJobDataSourceConfig setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }
    public String getAccessPointId() {
        return this.accessPointId;
    }

    public RLJobDataSourceConfig setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public RLJobDataSourceConfig setDataSourceVersion(String dataSourceVersion) {
        this.dataSourceVersion = dataSourceVersion;
        return this;
    }
    public String getDataSourceVersion() {
        return this.dataSourceVersion;
    }

    public RLJobDataSourceConfig setEnableCache(Boolean enableCache) {
        this.enableCache = enableCache;
        return this;
    }
    public Boolean getEnableCache() {
        return this.enableCache;
    }

    public RLJobDataSourceConfig setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RLJobDataSourceConfig setMountAccess(String mountAccess) {
        this.mountAccess = mountAccess;
        return this;
    }
    public String getMountAccess() {
        return this.mountAccess;
    }

    public RLJobDataSourceConfig setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }
    public String getMountPath() {
        return this.mountPath;
    }

    public RLJobDataSourceConfig setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public RLJobDataSourceConfig setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public RLJobDataSourceConfig setRoleChain(String roleChain) {
        this.roleChain = roleChain;
        return this;
    }
    public String getRoleChain() {
        return this.roleChain;
    }

    public RLJobDataSourceConfig setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
