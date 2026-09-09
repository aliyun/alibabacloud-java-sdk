// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class ConnectorCreateInput extends TeaModel {
    /**
     * <p>The authentication configuration used to access the target service.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("authentication")
    public ConnectorAuthenticationInput authentication;

    /**
     * <p>The list of capabilities granted to the Connector.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("capabilityGrants")
    public java.util.List<java.util.Map<String, ?>> capabilityGrants;

    /**
     * <p>Idempotency token</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8f73d0f4-3c8a-4eed-91e6-cf2f7ebcb3d7</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

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
     * <p>Specifies whether to enable the Connector after creation.</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

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
     * <p>The runtime configuration of the Connector.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("runtime")
    public ConnectorRuntime runtime;

    /**
     * <p>Provider target</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("target")
    public java.util.Map<String, ?> target;

    public static ConnectorCreateInput build(java.util.Map<String, ?> map) throws Exception {
        ConnectorCreateInput self = new ConnectorCreateInput();
        return TeaModel.build(map, self);
    }

    public ConnectorCreateInput setAuthentication(ConnectorAuthenticationInput authentication) {
        this.authentication = authentication;
        return this;
    }
    public ConnectorAuthenticationInput getAuthentication() {
        return this.authentication;
    }

    public ConnectorCreateInput setCapabilityGrants(java.util.List<java.util.Map<String, ?>> capabilityGrants) {
        this.capabilityGrants = capabilityGrants;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getCapabilityGrants() {
        return this.capabilityGrants;
    }

    public ConnectorCreateInput setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ConnectorCreateInput setConfiguration(java.util.Map<String, ?> configuration) {
        this.configuration = configuration;
        return this;
    }
    public java.util.Map<String, ?> getConfiguration() {
        return this.configuration;
    }

    public ConnectorCreateInput setConnectorName(String connectorName) {
        this.connectorName = connectorName;
        return this;
    }
    public String getConnectorName() {
        return this.connectorName;
    }

    public ConnectorCreateInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ConnectorCreateInput setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ConnectorCreateInput setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ConnectorCreateInput setPolicy(java.util.Map<String, ?> policy) {
        this.policy = policy;
        return this;
    }
    public java.util.Map<String, ?> getPolicy() {
        return this.policy;
    }

    public ConnectorCreateInput setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public ConnectorCreateInput setRuntime(ConnectorRuntime runtime) {
        this.runtime = runtime;
        return this;
    }
    public ConnectorRuntime getRuntime() {
        return this.runtime;
    }

    public ConnectorCreateInput setTarget(java.util.Map<String, ?> target) {
        this.target = target;
        return this;
    }
    public java.util.Map<String, ?> getTarget() {
        return this.target;
    }

}
