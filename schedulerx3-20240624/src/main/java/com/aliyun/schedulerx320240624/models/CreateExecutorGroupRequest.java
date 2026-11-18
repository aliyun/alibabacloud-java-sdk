// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class CreateExecutorGroupRequest extends TeaModel {
    /**
     * <p>The client secret.</p>
     * 
     * <strong>example:</strong>
     * <p>HfGUG/Qf8qRCCWlv5RT6WA==</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>The authentication type.</p>
     * 
     * <strong>example:</strong>
     * <p>api_key</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>The auto scaling configuration.</p>
     */
    @NameInMap("AutoScale")
    public Boolean autoScale;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The CloudMonitor Service (CMS) workspace ID.</p>
     */
    @NameInMap("CmsWorkspaceId")
    public String cmsWorkspaceId;

    /**
     * <p>The description of the worker group.</p>
     * 
     * <strong>example:</strong>
     * <p>group1</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The integration method of the executor. Valid values: manual (indicates manual entry) and acs (indicates ACS integration).</p>
     * 
     * <strong>example:</strong>
     * <p>manual</p>
     */
    @NameInMap("IntegrationType")
    public String integrationType;

    /**
     * <p>The name of the worker group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The network type. Valid values: public and private.</p>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("Network")
    public String network;

    /**
     * <p>The backend protocol. Valid values:</p>
     * <ul>
     * <li><p><strong>HTTP</strong> (default): Supports association with HTTPS, HTTP, and QUIC listeners.</p>
     * </li>
     * <li><p><strong>HTTPS</strong>: Supports association with HTTPS listeners.</p>
     * </li>
     * <li><p><strong>gRPC</strong>: Supports association with HTTPS and QUIC listeners.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If <strong>ServerGroupType</strong> is set to <strong>Fc</strong>, you do not need to configure the backend protocol.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HTTPS</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The worker type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>openclaw</p>
     */
    @NameInMap("WorkerType")
    public String workerType;

    /**
     * <p>The list of workers in JSON format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;address&quot;:&quot;<a href="http://47.111.188.191:18789%22%7D%5D">http://47.111.188.191:18789&quot;}]</a></p>
     */
    @NameInMap("Workers")
    public String workers;

    /**
     * <p>The extended configuration of the executor group.</p>
     * 
     * <strong>example:</strong>
     * <p>Not publicly available</p>
     */
    @NameInMap("XAttrs")
    public String XAttrs;

    public static CreateExecutorGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExecutorGroupRequest self = new CreateExecutorGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateExecutorGroupRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public CreateExecutorGroupRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public CreateExecutorGroupRequest setAutoScale(Boolean autoScale) {
        this.autoScale = autoScale;
        return this;
    }
    public Boolean getAutoScale() {
        return this.autoScale;
    }

    public CreateExecutorGroupRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateExecutorGroupRequest setCmsWorkspaceId(String cmsWorkspaceId) {
        this.cmsWorkspaceId = cmsWorkspaceId;
        return this;
    }
    public String getCmsWorkspaceId() {
        return this.cmsWorkspaceId;
    }

    public CreateExecutorGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateExecutorGroupRequest setIntegrationType(String integrationType) {
        this.integrationType = integrationType;
        return this;
    }
    public String getIntegrationType() {
        return this.integrationType;
    }

    public CreateExecutorGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateExecutorGroupRequest setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public CreateExecutorGroupRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateExecutorGroupRequest setWorkerType(String workerType) {
        this.workerType = workerType;
        return this;
    }
    public String getWorkerType() {
        return this.workerType;
    }

    public CreateExecutorGroupRequest setWorkers(String workers) {
        this.workers = workers;
        return this;
    }
    public String getWorkers() {
        return this.workers;
    }

    public CreateExecutorGroupRequest setXAttrs(String XAttrs) {
        this.XAttrs = XAttrs;
        return this;
    }
    public String getXAttrs() {
        return this.XAttrs;
    }

}
