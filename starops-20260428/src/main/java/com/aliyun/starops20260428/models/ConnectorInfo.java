// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class ConnectorInfo extends TeaModel {
    /**
     * <p>Safe authentication identity</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("authentication")
    public ConnectorAuthentication authentication;

    /**
     * <p>The list of capabilities granted to the Connector.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("capabilityGrants")
    public java.util.List<java.util.Map<String, ?>> capabilityGrants;

    /**
     * <p>Provider configuration</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("configuration")
    public java.util.Map<String, ?> configuration;

    /**
     * <p>Connector name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cms2-prod</p>
     */
    @NameInMap("connectorName")
    public String connectorName;

    /**
     * <p>Creation time</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-25T12:00:00Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>Description</p>
     * 
     * <strong>example:</strong>
     * <p>Production observability data</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Display name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CMS 2.0 production workspace</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>Indicates whether the Connector is enabled.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>ETag</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;connector-rev-1&quot;</p>
     */
    @NameInMap("etag")
    public String etag;

    /**
     * <p>Digital employee name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>production-ops</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The execution policy of the Connector.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("policy")
    public java.util.Map<String, ?> policy;

    /**
     * <p>Provider</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AlibabaCloudCms</p>
     */
    @NameInMap("provider")
    public String provider;

    /**
     * <p>Revision</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("revision")
    public Long revision;

    /**
     * <p>The runtime configuration of the Connector.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("runtime")
    public ConnectorRuntime runtime;

    /**
     * <p>Resource status</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("status")
    public java.util.Map<String, ?> status;

    /**
     * <p>Provider target</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("target")
    public java.util.Map<String, ?> target;

    /**
     * <p>Update time</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-25T12:00:00Z</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    public static ConnectorInfo build(java.util.Map<String, ?> map) throws Exception {
        ConnectorInfo self = new ConnectorInfo();
        return TeaModel.build(map, self);
    }

    public ConnectorInfo setAuthentication(ConnectorAuthentication authentication) {
        this.authentication = authentication;
        return this;
    }
    public ConnectorAuthentication getAuthentication() {
        return this.authentication;
    }

    public ConnectorInfo setCapabilityGrants(java.util.List<java.util.Map<String, ?>> capabilityGrants) {
        this.capabilityGrants = capabilityGrants;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getCapabilityGrants() {
        return this.capabilityGrants;
    }

    public ConnectorInfo setConfiguration(java.util.Map<String, ?> configuration) {
        this.configuration = configuration;
        return this;
    }
    public java.util.Map<String, ?> getConfiguration() {
        return this.configuration;
    }

    public ConnectorInfo setConnectorName(String connectorName) {
        this.connectorName = connectorName;
        return this;
    }
    public String getConnectorName() {
        return this.connectorName;
    }

    public ConnectorInfo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ConnectorInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ConnectorInfo setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ConnectorInfo setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ConnectorInfo setEtag(String etag) {
        this.etag = etag;
        return this;
    }
    public String getEtag() {
        return this.etag;
    }

    public ConnectorInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ConnectorInfo setPolicy(java.util.Map<String, ?> policy) {
        this.policy = policy;
        return this;
    }
    public java.util.Map<String, ?> getPolicy() {
        return this.policy;
    }

    public ConnectorInfo setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public ConnectorInfo setRevision(Long revision) {
        this.revision = revision;
        return this;
    }
    public Long getRevision() {
        return this.revision;
    }

    public ConnectorInfo setRuntime(ConnectorRuntime runtime) {
        this.runtime = runtime;
        return this;
    }
    public ConnectorRuntime getRuntime() {
        return this.runtime;
    }

    public ConnectorInfo setStatus(java.util.Map<String, ?> status) {
        this.status = status;
        return this;
    }
    public java.util.Map<String, ?> getStatus() {
        return this.status;
    }

    public ConnectorInfo setTarget(java.util.Map<String, ?> target) {
        this.target = target;
        return this;
    }
    public java.util.Map<String, ?> getTarget() {
        return this.target;
    }

    public ConnectorInfo setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
