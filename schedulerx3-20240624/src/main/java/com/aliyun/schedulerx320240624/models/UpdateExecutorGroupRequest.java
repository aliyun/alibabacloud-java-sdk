// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class UpdateExecutorGroupRequest extends TeaModel {
    /**
     * <p>The client secret.</p>
     * 
     * <strong>example:</strong>
     * <p>K4KWGINZVY9JwcZT0/vpSg==</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>The authentication type.</p>
     * 
     * <strong>example:</strong>
     * <p>APP</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>Specifies whether to enable auto scaling.</p>
     */
    @NameInMap("AutoScale")
    public Boolean autoScale;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-d6a5243b6fa</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The CMS workspace ID.</p>
     */
    @NameInMap("CmsWorkspaceId")
    public String cmsWorkspaceId;

    /**
     * <p>The description of the executor group.</p>
     * 
     * <strong>example:</strong>
     * <p>group1</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>110176</p>
     */
    @NameInMap("Id")
    @Deprecated
    public String id;

    /**
     * <p>The name of the executor group.</p>
     * 
     * <strong>example:</strong>
     * <p>group1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The network configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("Network")
    public String network;

    /**
     * <p>The protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>openai</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The executor type.</p>
     * 
     * <strong>example:</strong>
     * <p>openclaw</p>
     */
    @NameInMap("WorkerType")
    public String workerType;

    /**
     * <p>The list of specified machines in JSON format.</p>
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

    public static UpdateExecutorGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExecutorGroupRequest self = new UpdateExecutorGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExecutorGroupRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public UpdateExecutorGroupRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public UpdateExecutorGroupRequest setAutoScale(Boolean autoScale) {
        this.autoScale = autoScale;
        return this;
    }
    public Boolean getAutoScale() {
        return this.autoScale;
    }

    public UpdateExecutorGroupRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateExecutorGroupRequest setCmsWorkspaceId(String cmsWorkspaceId) {
        this.cmsWorkspaceId = cmsWorkspaceId;
        return this;
    }
    public String getCmsWorkspaceId() {
        return this.cmsWorkspaceId;
    }

    public UpdateExecutorGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    @Deprecated
    public UpdateExecutorGroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateExecutorGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateExecutorGroupRequest setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public UpdateExecutorGroupRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UpdateExecutorGroupRequest setWorkerType(String workerType) {
        this.workerType = workerType;
        return this;
    }
    public String getWorkerType() {
        return this.workerType;
    }

    public UpdateExecutorGroupRequest setWorkers(String workers) {
        this.workers = workers;
        return this;
    }
    public String getWorkers() {
        return this.workers;
    }

    public UpdateExecutorGroupRequest setXAttrs(String XAttrs) {
        this.XAttrs = XAttrs;
        return this;
    }
    public String getXAttrs() {
        return this.XAttrs;
    }

}
