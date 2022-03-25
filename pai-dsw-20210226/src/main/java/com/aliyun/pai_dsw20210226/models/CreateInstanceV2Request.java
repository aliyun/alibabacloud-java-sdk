// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class CreateInstanceV2Request extends TeaModel {
    // 工作空间内是否他人可见
    @NameInMap("Accessibility")
    public String accessibility;

    // 数据集集合
    @NameInMap("Datasets")
    public java.util.List<CreateInstanceV2RequestDatasets> datasets;

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
    public CreateInstanceV2RequestUserVpc userVpc;

    // 工作空间Id
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateInstanceV2Request build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceV2Request self = new CreateInstanceV2Request();
        return TeaModel.build(map, self);
    }

    public CreateInstanceV2Request setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CreateInstanceV2Request setDatasets(java.util.List<CreateInstanceV2RequestDatasets> datasets) {
        this.datasets = datasets;
        return this;
    }
    public java.util.List<CreateInstanceV2RequestDatasets> getDatasets() {
        return this.datasets;
    }

    public CreateInstanceV2Request setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    public CreateInstanceV2Request setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public CreateInstanceV2Request setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateInstanceV2Request setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CreateInstanceV2Request setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceV2Request setUserVpc(CreateInstanceV2RequestUserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public CreateInstanceV2RequestUserVpc getUserVpc() {
        return this.userVpc;
    }

    public CreateInstanceV2Request setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateInstanceV2RequestDatasets extends TeaModel {
        // 数据集Id
        @NameInMap("DatasetId")
        public String datasetId;

        // 容器内挂载路径
        @NameInMap("MountPath")
        public String mountPath;

        public static CreateInstanceV2RequestDatasets build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceV2RequestDatasets self = new CreateInstanceV2RequestDatasets();
            return TeaModel.build(map, self);
        }

        public CreateInstanceV2RequestDatasets setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public CreateInstanceV2RequestDatasets setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

    }

    public static class CreateInstanceV2RequestUserVpc extends TeaModel {
        // Security Group Id
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        // VSwitch Id
        @NameInMap("VSwitchId")
        public String vSwitchId;

        // Vpc Id
        @NameInMap("VpcId")
        public String vpcId;

        public static CreateInstanceV2RequestUserVpc build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceV2RequestUserVpc self = new CreateInstanceV2RequestUserVpc();
            return TeaModel.build(map, self);
        }

        public CreateInstanceV2RequestUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateInstanceV2RequestUserVpc setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateInstanceV2RequestUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
