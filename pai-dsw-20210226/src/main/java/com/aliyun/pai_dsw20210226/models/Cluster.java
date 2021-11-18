// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class Cluster extends TeaModel {
    // 集群id
    @NameInMap("ClusterId")
    public String clusterId;

    // 集群类型
    @NameInMap("ClusterType")
    public String clusterType;

    // 集群配置
    @NameInMap("Config")
    public String config;

    // 集群名称
    @NameInMap("Name")
    public String name;

    // nas文件id
    @NameInMap("Nas")
    public String nas;

    // 集群owner
    @NameInMap("Owner")
    public String owner;

    // 个人nas挂载到容器路径
    @NameInMap("PrivateContainerPath")
    public String privateContainerPath;

    // 个人nas挂载路径
    @NameInMap("PrivateNasPath")
    public String privateNasPath;

    // 公共nas挂载到容器的路径
    @NameInMap("PublicContainerPath")
    public String publicContainerPath;

    // 公共nas挂载路径
    @NameInMap("PublicNasPath")
    public String publicNasPath;

    // 集群状态
    @NameInMap("State")
    public String state;

    // 集群vSwitch
    @NameInMap("VSwitchId")
    public String vSwitchId;

    // 集群vpc
    @NameInMap("VpcId")
    public String vpcId;

    public static Cluster build(java.util.Map<String, ?> map) throws Exception {
        Cluster self = new Cluster();
        return TeaModel.build(map, self);
    }

    public Cluster setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public Cluster setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public Cluster setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public Cluster setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Cluster setNas(String nas) {
        this.nas = nas;
        return this;
    }
    public String getNas() {
        return this.nas;
    }

    public Cluster setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public Cluster setPrivateContainerPath(String privateContainerPath) {
        this.privateContainerPath = privateContainerPath;
        return this;
    }
    public String getPrivateContainerPath() {
        return this.privateContainerPath;
    }

    public Cluster setPrivateNasPath(String privateNasPath) {
        this.privateNasPath = privateNasPath;
        return this;
    }
    public String getPrivateNasPath() {
        return this.privateNasPath;
    }

    public Cluster setPublicContainerPath(String publicContainerPath) {
        this.publicContainerPath = publicContainerPath;
        return this;
    }
    public String getPublicContainerPath() {
        return this.publicContainerPath;
    }

    public Cluster setPublicNasPath(String publicNasPath) {
        this.publicNasPath = publicNasPath;
        return this;
    }
    public String getPublicNasPath() {
        return this.publicNasPath;
    }

    public Cluster setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public Cluster setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public Cluster setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
