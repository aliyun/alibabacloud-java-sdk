// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportAKSClusterNodeRequest extends TeaModel {
    @NameInMap("Nodes")
    public java.util.List<ImportAKSClusterNodeRequestNodes> nodes;

    @NameInMap("OperatorName")
    public String operatorName;

    @NameInMap("Workspace")
    public String workspace;

    public static ImportAKSClusterNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportAKSClusterNodeRequest self = new ImportAKSClusterNodeRequest();
        return TeaModel.build(map, self);
    }

    public ImportAKSClusterNodeRequest setNodes(java.util.List<ImportAKSClusterNodeRequestNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<ImportAKSClusterNodeRequestNodes> getNodes() {
        return this.nodes;
    }

    public ImportAKSClusterNodeRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public ImportAKSClusterNodeRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class ImportAKSClusterNodeRequestNodes extends TeaModel {
        @NameInMap("Cell")
        public String cell;

        @NameInMap("Node")
        public String node;

        public static ImportAKSClusterNodeRequestNodes build(java.util.Map<String, ?> map) throws Exception {
            ImportAKSClusterNodeRequestNodes self = new ImportAKSClusterNodeRequestNodes();
            return TeaModel.build(map, self);
        }

        public ImportAKSClusterNodeRequestNodes setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public ImportAKSClusterNodeRequestNodes setNode(String node) {
            this.node = node;
            return this;
        }
        public String getNode() {
            return this.node;
        }

    }

}
