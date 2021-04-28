// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    // 实例名称
    @NameInMap("InstanceName")
    public String instanceName;

    // 实例规格
    @NameInMap("EcsSpec")
    public String ecsSpec;

    // 镜像id
    @NameInMap("ImageId")
    public String imageId;

    // nas文件系统id
    @NameInMap("NasFileSystemId")
    public String nasFileSystemId;

    // 打通的vpc网络配置
    @NameInMap("UserVpc")
    public UserVpc userVpc;

    // 镜像地址
    @NameInMap("ImageUrl")
    public String imageUrl;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceRequest setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    public CreateInstanceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateInstanceRequest setNasFileSystemId(String nasFileSystemId) {
        this.nasFileSystemId = nasFileSystemId;
        return this;
    }
    public String getNasFileSystemId() {
        return this.nasFileSystemId;
    }

    public CreateInstanceRequest setUserVpc(UserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    public CreateInstanceRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
