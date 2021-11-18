// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    @NameInMap("DatasetList")
    public java.util.List<Dataset> datasetList;

    // 实例规格
    @NameInMap("EcsSpec")
    public String ecsSpec;

    // 环境参数
    @NameInMap("Environments")
    public java.util.Map<String, ?> environments;

    // 镜像id
    @NameInMap("ImageId")
    public String imageId;

    // 镜像地址
    @NameInMap("ImageUrl")
    public String imageUrl;

    // 实例名称
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("IsPublic")
    public Long isPublic;

    // nas文件系统id
    @NameInMap("NasFileSystemId")
    public String nasFileSystemId;

    // 实例的真实用户名称
    @NameInMap("UserName")
    public String userName;

    // 打通的vpc网络配置
    @NameInMap("UserVpc")
    public UserVpc userVpc;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setDatasetList(java.util.List<Dataset> datasetList) {
        this.datasetList = datasetList;
        return this;
    }
    public java.util.List<Dataset> getDatasetList() {
        return this.datasetList;
    }

    public CreateInstanceRequest setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    public CreateInstanceRequest setEnvironments(java.util.Map<String, ?> environments) {
        this.environments = environments;
        return this;
    }
    public java.util.Map<String, ?> getEnvironments() {
        return this.environments;
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

    public CreateInstanceRequest setIsPublic(Long isPublic) {
        this.isPublic = isPublic;
        return this;
    }
    public Long getIsPublic() {
        return this.isPublic;
    }

    public CreateInstanceRequest setNasFileSystemId(String nasFileSystemId) {
        this.nasFileSystemId = nasFileSystemId;
        return this;
    }
    public String getNasFileSystemId() {
        return this.nasFileSystemId;
    }

    public CreateInstanceRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateInstanceRequest setUserVpc(UserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    public CreateInstanceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
