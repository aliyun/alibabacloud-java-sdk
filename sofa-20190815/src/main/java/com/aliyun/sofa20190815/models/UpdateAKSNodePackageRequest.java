// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateAKSNodePackageRequest extends TeaModel {
    @NameInMap("Nodes")
    public java.util.List<UpdateAKSNodePackageRequestNodes> nodes;

    @NameInMap("OperatorName")
    public String operatorName;

    @NameInMap("UpdateVersion")
    public String updateVersion;

    @NameInMap("Workspace")
    public String workspace;

    public static UpdateAKSNodePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAKSNodePackageRequest self = new UpdateAKSNodePackageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAKSNodePackageRequest setNodes(java.util.List<UpdateAKSNodePackageRequestNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<UpdateAKSNodePackageRequestNodes> getNodes() {
        return this.nodes;
    }

    public UpdateAKSNodePackageRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public UpdateAKSNodePackageRequest setUpdateVersion(String updateVersion) {
        this.updateVersion = updateVersion;
        return this;
    }
    public String getUpdateVersion() {
        return this.updateVersion;
    }

    public UpdateAKSNodePackageRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class UpdateAKSNodePackageRequestNodes extends TeaModel {
        @NameInMap("Data")
        public String data;

        public static UpdateAKSNodePackageRequestNodes build(java.util.Map<String, ?> map) throws Exception {
            UpdateAKSNodePackageRequestNodes self = new UpdateAKSNodePackageRequestNodes();
            return TeaModel.build(map, self);
        }

        public UpdateAKSNodePackageRequestNodes setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

}
