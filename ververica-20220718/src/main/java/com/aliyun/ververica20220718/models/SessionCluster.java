// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class SessionCluster extends TeaModel {
    @NameInMap("basicResourceSetting")
    public BasicResourceSetting basicResourceSetting;

    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <strong>example:</strong>
     * <p>27846363877456****</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <strong>example:</strong>
     * <p>****@streamcompute.onaliyun.com</p>
     */
    @NameInMap("creatorName")
    public String creatorName;

    /**
     * <strong>example:</strong>
     * <p>default-queue</p>
     */
    @NameInMap("deploymentTargetName")
    public String deploymentTargetName;

    /**
     * <strong>example:</strong>
     * <p>vvr-6.0.7-flink-1.15</p>
     */
    @NameInMap("engineVersion")
    public String engineVersion;

    /**
     * <strong>example:</strong>
     * <p>{&quot;taskmanager.numberOfTaskSlots&quot;:&quot;1&quot;}</p>
     */
    @NameInMap("flinkConf")
    public java.util.Map<String, ?> flinkConf;

    @NameInMap("labels")
    public java.util.Map<String, ?> labels;

    @NameInMap("logging")
    public Logging logging;

    @NameInMap("modifiedAt")
    public Long modifiedAt;

    /**
     * <strong>example:</strong>
     * <p>27846363877456****</p>
     */
    @NameInMap("modifier")
    public String modifier;

    /**
     * <strong>example:</strong>
     * <p>****@streamcompute.onaliyun.com</p>
     */
    @NameInMap("modifierName")
    public String modifierName;

    /**
     * <strong>example:</strong>
     * <p>test-sessionCluster</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>default-namespace</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <strong>example:</strong>
     * <p>1f68a52c-1760-43c6-97fb-afe0674b****</p>
     */
    @NameInMap("sessionClusterId")
    public String sessionClusterId;

    @NameInMap("status")
    public SessionClusterStatus status;

    /**
     * <strong>example:</strong>
     * <p>edcef******b4f</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static SessionCluster build(java.util.Map<String, ?> map) throws Exception {
        SessionCluster self = new SessionCluster();
        return TeaModel.build(map, self);
    }

    public SessionCluster setBasicResourceSetting(BasicResourceSetting basicResourceSetting) {
        this.basicResourceSetting = basicResourceSetting;
        return this;
    }
    public BasicResourceSetting getBasicResourceSetting() {
        return this.basicResourceSetting;
    }

    public SessionCluster setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public SessionCluster setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public SessionCluster setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public SessionCluster setDeploymentTargetName(String deploymentTargetName) {
        this.deploymentTargetName = deploymentTargetName;
        return this;
    }
    public String getDeploymentTargetName() {
        return this.deploymentTargetName;
    }

    public SessionCluster setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public SessionCluster setFlinkConf(java.util.Map<String, ?> flinkConf) {
        this.flinkConf = flinkConf;
        return this;
    }
    public java.util.Map<String, ?> getFlinkConf() {
        return this.flinkConf;
    }

    public SessionCluster setLabels(java.util.Map<String, ?> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
    }

    public SessionCluster setLogging(Logging logging) {
        this.logging = logging;
        return this;
    }
    public Logging getLogging() {
        return this.logging;
    }

    public SessionCluster setModifiedAt(Long modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    public Long getModifiedAt() {
        return this.modifiedAt;
    }

    public SessionCluster setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public SessionCluster setModifierName(String modifierName) {
        this.modifierName = modifierName;
        return this;
    }
    public String getModifierName() {
        return this.modifierName;
    }

    public SessionCluster setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SessionCluster setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SessionCluster setSessionClusterId(String sessionClusterId) {
        this.sessionClusterId = sessionClusterId;
        return this;
    }
    public String getSessionClusterId() {
        return this.sessionClusterId;
    }

    public SessionCluster setStatus(SessionClusterStatus status) {
        this.status = status;
        return this;
    }
    public SessionClusterStatus getStatus() {
        return this.status;
    }

    public SessionCluster setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
