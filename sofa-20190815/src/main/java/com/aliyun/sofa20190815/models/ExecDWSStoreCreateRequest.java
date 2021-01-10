// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecDWSStoreCreateRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Role")
    public String role;

    @NameInMap("StoreTimestamp")
    public Long storeTimestamp;

    @NameInMap("Topic")
    public String topic;

    public static ExecDWSStoreCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDWSStoreCreateRequest self = new ExecDWSStoreCreateRequest();
        return TeaModel.build(map, self);
    }

    public ExecDWSStoreCreateRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ExecDWSStoreCreateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExecDWSStoreCreateRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ExecDWSStoreCreateRequest setStoreTimestamp(Long storeTimestamp) {
        this.storeTimestamp = storeTimestamp;
        return this;
    }
    public Long getStoreTimestamp() {
        return this.storeTimestamp;
    }

    public ExecDWSStoreCreateRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
