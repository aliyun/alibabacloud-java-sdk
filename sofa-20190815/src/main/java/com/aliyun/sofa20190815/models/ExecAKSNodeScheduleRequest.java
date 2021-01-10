// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecAKSNodeScheduleRequest extends TeaModel {
    @NameInMap("Cluster")
    public String cluster;

    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("Nodes")
    public java.util.List<ExecAKSNodeScheduleRequestNodes> nodes;

    public static ExecAKSNodeScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAKSNodeScheduleRequest self = new ExecAKSNodeScheduleRequest();
        return TeaModel.build(map, self);
    }

    public ExecAKSNodeScheduleRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public ExecAKSNodeScheduleRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public ExecAKSNodeScheduleRequest setNodes(java.util.List<ExecAKSNodeScheduleRequestNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<ExecAKSNodeScheduleRequestNodes> getNodes() {
        return this.nodes;
    }

    public static class ExecAKSNodeScheduleRequestNodes extends TeaModel {
        @NameInMap("Data")
        public String data;

        public static ExecAKSNodeScheduleRequestNodes build(java.util.Map<String, ?> map) throws Exception {
            ExecAKSNodeScheduleRequestNodes self = new ExecAKSNodeScheduleRequestNodes();
            return TeaModel.build(map, self);
        }

        public ExecAKSNodeScheduleRequestNodes setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

}
