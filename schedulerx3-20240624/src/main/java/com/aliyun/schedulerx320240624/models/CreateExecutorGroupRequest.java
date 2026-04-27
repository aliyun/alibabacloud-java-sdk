// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class CreateExecutorGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>HfGUG/Qf8qRCCWlv5RT6WA==</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <strong>example:</strong>
     * <p>api_key</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("Network")
    public String network;

    /**
     * <strong>example:</strong>
     * <p>HTTPS</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>openclaw</p>
     */
    @NameInMap("WorkerType")
    public String workerType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;address&quot;:&quot;<a href="http://47.111.188.191:18789%22%7D%5D">http://47.111.188.191:18789&quot;}]</a></p>
     */
    @NameInMap("Workers")
    public String workers;

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

    public CreateExecutorGroupRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateExecutorGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
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

}
