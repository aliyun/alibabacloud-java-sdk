// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class CreateExecutorsRequest extends TeaModel {
    /**
     * <p>The name of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The worker type. The only valid value is <code>k8s_service</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s_service</p>
     */
    @NameInMap("WorkerType")
    public String workerType;

    /**
     * <p>A JSON string that contains an array of workers.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;cluster&quot;:&quot;xxxxx&quot;,&quot;namespace&quot;:&quot;xxxxx&quot;,&quot;service&quot;:&quot;xxxxx&quot;}]</p>
     */
    @NameInMap("Workers")
    public String workers;

    public static CreateExecutorsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExecutorsRequest self = new CreateExecutorsRequest();
        return TeaModel.build(map, self);
    }

    public CreateExecutorsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateExecutorsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateExecutorsRequest setWorkerType(String workerType) {
        this.workerType = workerType;
        return this;
    }
    public String getWorkerType() {
        return this.workerType;
    }

    public CreateExecutorsRequest setWorkers(String workers) {
        this.workers = workers;
        return this;
    }
    public String getWorkers() {
        return this.workers;
    }

}
