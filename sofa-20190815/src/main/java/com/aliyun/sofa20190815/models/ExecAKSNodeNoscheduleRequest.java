// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecAKSNodeNoscheduleRequest extends TeaModel {
    @NameInMap("Cluster")
    public String cluster;

    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("Nodes")
    public java.util.List<ExecAKSNodeNoscheduleRequestNodes> nodes;

    public static ExecAKSNodeNoscheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAKSNodeNoscheduleRequest self = new ExecAKSNodeNoscheduleRequest();
        return TeaModel.build(map, self);
    }

    public ExecAKSNodeNoscheduleRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public ExecAKSNodeNoscheduleRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public ExecAKSNodeNoscheduleRequest setNodes(java.util.List<ExecAKSNodeNoscheduleRequestNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<ExecAKSNodeNoscheduleRequestNodes> getNodes() {
        return this.nodes;
    }

    public static class ExecAKSNodeNoscheduleRequestNodes extends TeaModel {
        @NameInMap("Data")
        public String data;

        public static ExecAKSNodeNoscheduleRequestNodes build(java.util.Map<String, ?> map) throws Exception {
            ExecAKSNodeNoscheduleRequestNodes self = new ExecAKSNodeNoscheduleRequestNodes();
            return TeaModel.build(map, self);
        }

        public ExecAKSNodeNoscheduleRequestNodes setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

}
