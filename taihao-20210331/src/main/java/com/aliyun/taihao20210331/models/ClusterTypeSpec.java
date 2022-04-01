// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ClusterTypeSpec extends TeaModel {
    // clusterRamRole
    @NameInMap("clusterRamRole")
    public String clusterRamRole;

    // clusterType
    @NameInMap("clusterType")
    public String clusterType;

    // extraParams
    @NameInMap("extraParams")
    public java.util.List<ExtraParamSpec> extraParams;

    // haType
    @NameInMap("haType")
    public String haType;

    @NameInMap("metaStoreTypes")
    public java.util.List<String> metaStoreTypes;

    // nodeCountConstraints
    @NameInMap("nodeCountConstraints")
    public java.util.List<NodeCountConstraint> nodeCountConstraints;

    // nodeGroupSpecs
    @NameInMap("nodeGroupSpecs")
    public java.util.List<NodeGroupSpec> nodeGroupSpecs;

    // realign
    @NameInMap("realign")
    public Boolean realign;

    // scenario
    @NameInMap("scenario")
    public String scenario;

    public static ClusterTypeSpec build(java.util.Map<String, ?> map) throws Exception {
        ClusterTypeSpec self = new ClusterTypeSpec();
        return TeaModel.build(map, self);
    }

    public ClusterTypeSpec setClusterRamRole(String clusterRamRole) {
        this.clusterRamRole = clusterRamRole;
        return this;
    }
    public String getClusterRamRole() {
        return this.clusterRamRole;
    }

    public ClusterTypeSpec setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public ClusterTypeSpec setExtraParams(java.util.List<ExtraParamSpec> extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public java.util.List<ExtraParamSpec> getExtraParams() {
        return this.extraParams;
    }

    public ClusterTypeSpec setHaType(String haType) {
        this.haType = haType;
        return this;
    }
    public String getHaType() {
        return this.haType;
    }

    public ClusterTypeSpec setMetaStoreTypes(java.util.List<String> metaStoreTypes) {
        this.metaStoreTypes = metaStoreTypes;
        return this;
    }
    public java.util.List<String> getMetaStoreTypes() {
        return this.metaStoreTypes;
    }

    public ClusterTypeSpec setNodeCountConstraints(java.util.List<NodeCountConstraint> nodeCountConstraints) {
        this.nodeCountConstraints = nodeCountConstraints;
        return this;
    }
    public java.util.List<NodeCountConstraint> getNodeCountConstraints() {
        return this.nodeCountConstraints;
    }

    public ClusterTypeSpec setNodeGroupSpecs(java.util.List<NodeGroupSpec> nodeGroupSpecs) {
        this.nodeGroupSpecs = nodeGroupSpecs;
        return this;
    }
    public java.util.List<NodeGroupSpec> getNodeGroupSpecs() {
        return this.nodeGroupSpecs;
    }

    public ClusterTypeSpec setRealign(Boolean realign) {
        this.realign = realign;
        return this;
    }
    public Boolean getRealign() {
        return this.realign;
    }

    public ClusterTypeSpec setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

}
