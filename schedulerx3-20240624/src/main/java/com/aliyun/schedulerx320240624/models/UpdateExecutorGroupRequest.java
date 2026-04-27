// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class UpdateExecutorGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>K4KWGINZVY9JwcZT0/vpSg==</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <strong>example:</strong>
     * <p>APP</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-d6a5243b6fa</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>group1</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>110176</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("Network")
    public String network;

    /**
     * <strong>example:</strong>
     * <p>openai</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <strong>example:</strong>
     * <p>openclaw</p>
     */
    @NameInMap("WorkerType")
    public String workerType;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;address&quot;:&quot;<a href="http://47.111.188.191:18789%22%7D%5D">http://47.111.188.191:18789&quot;}]</a></p>
     */
    @NameInMap("Workers")
    public String workers;

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

    public UpdateExecutorGroupRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateExecutorGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateExecutorGroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
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

}
