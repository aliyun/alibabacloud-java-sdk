// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class UpdateExecutorsRequest extends TeaModel {
    /**
     * <p>The application name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The Cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-a1804a3226d</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The Worker type.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s_service</p>
     */
    @NameInMap("WorkerType")
    public String workerType;

    /**
     * <p>A JSON-formatted string that contains a list of Workers.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;cluster&quot;:&quot;xxxxx&quot;,&quot;namespace&quot;:&quot;xxxxx&quot;,&quot;service&quot;:&quot;xxxxx&quot;}]</p>
     */
    @NameInMap("Workers")
    public String workers;

    public static UpdateExecutorsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExecutorsRequest self = new UpdateExecutorsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExecutorsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateExecutorsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateExecutorsRequest setWorkerType(String workerType) {
        this.workerType = workerType;
        return this;
    }
    public String getWorkerType() {
        return this.workerType;
    }

    public UpdateExecutorsRequest setWorkers(String workers) {
        this.workers = workers;
        return this;
    }
    public String getWorkers() {
        return this.workers;
    }

}
