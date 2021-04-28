// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class Image extends TeaModel {
    // 镜像ID
    @NameInMap("ImageId")
    public String imageId;

    // 镜像名称
    @NameInMap("ImageName")
    public String imageName;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 资源类型
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    // 算法框架
    @NameInMap("Framework")
    public String framework;

    // 算法框架版本
    @NameInMap("FrameworkVersion")
    public String frameworkVersion;

    // 镜像操作系统分发版
    @NameInMap("OS")
    public String OS;

    // 分发版版本
    @NameInMap("OSVersion")
    public String OSVersion;

    // Cuda版本
    @NameInMap("CudaVersion")
    public String cudaVersion;

    // 镜像类型
    @NameInMap("Type")
    public String type;

    public static Image build(java.util.Map<String, ?> map) throws Exception {
        Image self = new Image();
        return TeaModel.build(map, self);
    }

    public Image setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public Image setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public Image setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public Image setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public Image setFramework(String framework) {
        this.framework = framework;
        return this;
    }
    public String getFramework() {
        return this.framework;
    }

    public Image setFrameworkVersion(String frameworkVersion) {
        this.frameworkVersion = frameworkVersion;
        return this;
    }
    public String getFrameworkVersion() {
        return this.frameworkVersion;
    }

    public Image setOS(String OS) {
        this.OS = OS;
        return this;
    }
    public String getOS() {
        return this.OS;
    }

    public Image setOSVersion(String OSVersion) {
        this.OSVersion = OSVersion;
        return this;
    }
    public String getOSVersion() {
        return this.OSVersion;
    }

    public Image setCudaVersion(String cudaVersion) {
        this.cudaVersion = cudaVersion;
        return this;
    }
    public String getCudaVersion() {
        return this.cudaVersion;
    }

    public Image setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
