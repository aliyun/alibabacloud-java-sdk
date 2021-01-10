// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecDWSJwriterMigrateRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("Force")
    public Boolean force;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Node")
    public String node;

    @NameInMap("WriterName")
    public String writerName;

    public static ExecDWSJwriterMigrateRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDWSJwriterMigrateRequest self = new ExecDWSJwriterMigrateRequest();
        return TeaModel.build(map, self);
    }

    public ExecDWSJwriterMigrateRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ExecDWSJwriterMigrateRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public ExecDWSJwriterMigrateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExecDWSJwriterMigrateRequest setNode(String node) {
        this.node = node;
        return this;
    }
    public String getNode() {
        return this.node;
    }

    public ExecDWSJwriterMigrateRequest setWriterName(String writerName) {
        this.writerName = writerName;
        return this;
    }
    public String getWriterName() {
        return this.writerName;
    }

}
