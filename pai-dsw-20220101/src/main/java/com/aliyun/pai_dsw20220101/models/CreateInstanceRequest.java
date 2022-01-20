// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    // 工作空间内是否他人可见
    @NameInMap("Accessibility")
    public String accessibility;

    // 数据集集合
    @NameInMap("Datasets")
    public java.util.List<CreateInstanceRequestDatasets> datasets;

    // 实例对应的Ecs规格
    @NameInMap("EcsSpec")
    public String ecsSpec;

    // 环境变量
    @NameInMap("EnvironmentVariables")
    public java.util.Map<String, String> environmentVariables;

    // 镜像Id
    @NameInMap("ImageId")
    public String imageId;

    // 镜像地址
    @NameInMap("ImageUrl")
    public String imageUrl;

    // 实例名称
    @NameInMap("InstanceName")
    public String instanceName;

    // user vpc配置
    @NameInMap("UserVpc")
    public CreateInstanceRequestUserVpc userVpc;

    // 工作空间Id
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CreateInstanceRequest setDatasets(java.util.List<CreateInstanceRequestDatasets> datasets) {
        this.datasets = datasets;
        return this;
    }
    public java.util.List<CreateInstanceRequestDatasets> getDatasets() {
        return this.datasets;
    }

    public CreateInstanceRequest setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    public CreateInstanceRequest setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public CreateInstanceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateInstanceRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CreateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceRequest setUserVpc(CreateInstanceRequestUserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public CreateInstanceRequestUserVpc getUserVpc() {
        return this.userVpc;
    }

    public CreateInstanceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateInstanceRequestDatasets extends TeaModel {
        // 数据集Id
        @NameInMap("DatasetId")
        public String datasetId;

        // 容器内挂载路径
        @NameInMap("MountPath")
        public String mountPath;

        public static CreateInstanceRequestDatasets build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestDatasets self = new CreateInstanceRequestDatasets();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestDatasets setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public CreateInstanceRequestDatasets setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

    }

    public static class CreateInstanceRequestUserVpc extends TeaModel {
        // Security Group Id
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        // VSwitch Id
        @NameInMap("VSwitchId")
        public String vSwitchId;

        // Vpc Id
        @NameInMap("VpcId")
        public String vpcId;

        public static CreateInstanceRequestUserVpc build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestUserVpc self = new CreateInstanceRequestUserVpc();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateInstanceRequestUserVpc setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateInstanceRequestUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
