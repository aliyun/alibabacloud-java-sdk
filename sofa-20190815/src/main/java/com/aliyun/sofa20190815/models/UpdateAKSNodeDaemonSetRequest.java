// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateAKSNodeDaemonSetRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Nodes")
    public java.util.List<UpdateAKSNodeDaemonSetRequestNodes> nodes;

    @NameInMap("OperatorName")
    public String operatorName;

    @NameInMap("UpdateStrategy")
    public String updateStrategy;

    @NameInMap("UpdateVersion")
    public String updateVersion;

    @NameInMap("Workspace")
    public String workspace;

    public static UpdateAKSNodeDaemonSetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAKSNodeDaemonSetRequest self = new UpdateAKSNodeDaemonSetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAKSNodeDaemonSetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAKSNodeDaemonSetRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateAKSNodeDaemonSetRequest setNodes(java.util.List<UpdateAKSNodeDaemonSetRequestNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<UpdateAKSNodeDaemonSetRequestNodes> getNodes() {
        return this.nodes;
    }

    public UpdateAKSNodeDaemonSetRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public UpdateAKSNodeDaemonSetRequest setUpdateStrategy(String updateStrategy) {
        this.updateStrategy = updateStrategy;
        return this;
    }
    public String getUpdateStrategy() {
        return this.updateStrategy;
    }

    public UpdateAKSNodeDaemonSetRequest setUpdateVersion(String updateVersion) {
        this.updateVersion = updateVersion;
        return this;
    }
    public String getUpdateVersion() {
        return this.updateVersion;
    }

    public UpdateAKSNodeDaemonSetRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class UpdateAKSNodeDaemonSetRequestNodes extends TeaModel {
        @NameInMap("Data")
        public String data;

        public static UpdateAKSNodeDaemonSetRequestNodes build(java.util.Map<String, ?> map) throws Exception {
            UpdateAKSNodeDaemonSetRequestNodes self = new UpdateAKSNodeDaemonSetRequestNodes();
            return TeaModel.build(map, self);
        }

        public UpdateAKSNodeDaemonSetRequestNodes setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

}
