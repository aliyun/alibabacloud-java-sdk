// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchDeleteAKSClusterNodeRequest extends TeaModel {
    @NameInMap("DestroyComputer")
    public Boolean destroyComputer;

    @NameInMap("OperatorName")
    public String operatorName;

    @NameInMap("Password")
    public String password;

    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("Nodes")
    public java.util.List<BatchDeleteAKSClusterNodeRequestNodes> nodes;

    public static BatchDeleteAKSClusterNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteAKSClusterNodeRequest self = new BatchDeleteAKSClusterNodeRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteAKSClusterNodeRequest setDestroyComputer(Boolean destroyComputer) {
        this.destroyComputer = destroyComputer;
        return this;
    }
    public Boolean getDestroyComputer() {
        return this.destroyComputer;
    }

    public BatchDeleteAKSClusterNodeRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public BatchDeleteAKSClusterNodeRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public BatchDeleteAKSClusterNodeRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public BatchDeleteAKSClusterNodeRequest setNodes(java.util.List<BatchDeleteAKSClusterNodeRequestNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<BatchDeleteAKSClusterNodeRequestNodes> getNodes() {
        return this.nodes;
    }

    public static class BatchDeleteAKSClusterNodeRequestNodes extends TeaModel {
        @NameInMap("Data")
        public String data;

        public static BatchDeleteAKSClusterNodeRequestNodes build(java.util.Map<String, ?> map) throws Exception {
            BatchDeleteAKSClusterNodeRequestNodes self = new BatchDeleteAKSClusterNodeRequestNodes();
            return TeaModel.build(map, self);
        }

        public BatchDeleteAKSClusterNodeRequestNodes setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

}
