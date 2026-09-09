// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class ConnectorUpdateInput extends TeaModel {
    /**
     * <p>The authentication configuration used to replace the existing credentials.</p>
     */
    @NameInMap("authentication")
    public ConnectorAuthenticationUpdateInput authentication;

    /**
     * <p>The list of capabilities used to replace the existing grants.</p>
     */
    @NameInMap("capabilityGrants")
    public java.util.List<java.util.Map<String, ?>> capabilityGrants;

    /**
     * <p>The provider configuration used to update the Connector. Only AlibabaCloudResources allows null. Other providers must provide an object.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("configuration")
    public java.util.Map<String, ?> configuration;

    /**
     * <p>The description of the Connector.</p>
     * 
     * <strong>example:</strong>
     * <p>Production observability data</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name of the Connector.</p>
     * 
     * <strong>example:</strong>
     * <p>CMS 2.0 production workspace</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>Specifies whether to enable the Connector.</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The execution policy used to replace the existing policy.</p>
     */
    @NameInMap("policy")
    public java.util.Map<String, ?> policy;

    /**
     * <p>The runtime configuration used to update the Connector.</p>
     */
    @NameInMap("runtime")
    public ConnectorRuntime runtime;

    /**
     * <p>The provider target used to update the Connector.</p>
     */
    @NameInMap("target")
    public java.util.Map<String, ?> target;

    public static ConnectorUpdateInput build(java.util.Map<String, ?> map) throws Exception {
        ConnectorUpdateInput self = new ConnectorUpdateInput();
        return TeaModel.build(map, self);
    }

    public ConnectorUpdateInput setAuthentication(ConnectorAuthenticationUpdateInput authentication) {
        this.authentication = authentication;
        return this;
    }
    public ConnectorAuthenticationUpdateInput getAuthentication() {
        return this.authentication;
    }

    public ConnectorUpdateInput setCapabilityGrants(java.util.List<java.util.Map<String, ?>> capabilityGrants) {
        this.capabilityGrants = capabilityGrants;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getCapabilityGrants() {
        return this.capabilityGrants;
    }

    public ConnectorUpdateInput setConfiguration(java.util.Map<String, ?> configuration) {
        this.configuration = configuration;
        return this;
    }
    public java.util.Map<String, ?> getConfiguration() {
        return this.configuration;
    }

    public ConnectorUpdateInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ConnectorUpdateInput setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ConnectorUpdateInput setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ConnectorUpdateInput setPolicy(java.util.Map<String, ?> policy) {
        this.policy = policy;
        return this;
    }
    public java.util.Map<String, ?> getPolicy() {
        return this.policy;
    }

    public ConnectorUpdateInput setRuntime(ConnectorRuntime runtime) {
        this.runtime = runtime;
        return this;
    }
    public ConnectorRuntime getRuntime() {
        return this.runtime;
    }

    public ConnectorUpdateInput setTarget(java.util.Map<String, ?> target) {
        this.target = target;
        return this;
    }
    public java.util.Map<String, ?> getTarget() {
        return this.target;
    }

}
