// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class Image extends TeaModel {
    // 资源类型
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    // 镜像作者
    @NameInMap("Author")
    public String author;

    // Cuda版本
    @NameInMap("CudaVersion")
    public String cudaVersion;

    // 镜像描述
    @NameInMap("Description")
    public String description;

    // Ecs镜像key
    @NameInMap("EcsImageKey")
    public String ecsImageKey;

    // 算法框架
    @NameInMap("Framework")
    public String framework;

    // 算法框架版本
    @NameInMap("FrameworkVersion")
    public String frameworkVersion;

    // 镜像父镜像
    @NameInMap("FromImageId")
    public String fromImageId;

    // 镜像名称
    @NameInMap("FromImageName")
    public String fromImageName;

    // 创建时间
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 修改时间
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    // 镜像ID
    @NameInMap("ImageId")
    public String imageId;

    // 镜像名称
    @NameInMap("ImageName")
    public String imageName;

    // 镜像url
    @NameInMap("ImageUrl")
    public String imageUrl;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 镜像命名空间
    @NameInMap("Namespace")
    public String namespace;

    // 镜像操作系统分发版
    @NameInMap("OS")
    public String OS;

    // 分发版版本
    @NameInMap("OSVersion")
    public String OSVersion;

    // python版本
    @NameInMap("PythonVersion")
    public String pythonVersion;

    // 地区
    @NameInMap("Region")
    public String region;

    // 镜像仓库
    @NameInMap("Repository")
    public String repository;

    // 跳转的镜像站点页面
    @NameInMap("RepositoryPage")
    public String repositoryPage;

    // 资源类型
    @NameInMap("ResourceType")
    public Long resourceType;

    // 镜像的根镜像
    @NameInMap("RootImageId")
    public String rootImageId;

    // 镜像是否被其他实例共享
    @NameInMap("Shared")
    public Boolean shared;

    // 镜像短url
    @NameInMap("ShortImageUrl")
    public String shortImageUrl;

    // 镜像仓库短名称
    @NameInMap("ShortRepository")
    public String shortRepository;

    // 镜像状态
    @NameInMap("Stage")
    public String stage;

    // 镜像状态代码
    @NameInMap("StageCode")
    public Long stageCode;

    // 保存镜像建议的名称
    @NameInMap("SuggestedName")
    public String suggestedName;

    // Tag
    @NameInMap("Tag")
    public String tag;

    // 镜像类型
    @NameInMap("Type")
    public String type;

    // 工作空间镜像id
    @NameInMap("WorkspaceImageId")
    public String workspaceImageId;

    public static Image build(java.util.Map<String, ?> map) throws Exception {
        Image self = new Image();
        return TeaModel.build(map, self);
    }

    public Image setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public Image setAuthor(String author) {
        this.author = author;
        return this;
    }
    public String getAuthor() {
        return this.author;
    }

    public Image setCudaVersion(String cudaVersion) {
        this.cudaVersion = cudaVersion;
        return this;
    }
    public String getCudaVersion() {
        return this.cudaVersion;
    }

    public Image setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Image setEcsImageKey(String ecsImageKey) {
        this.ecsImageKey = ecsImageKey;
        return this;
    }
    public String getEcsImageKey() {
        return this.ecsImageKey;
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

    public Image setFromImageId(String fromImageId) {
        this.fromImageId = fromImageId;
        return this;
    }
    public String getFromImageId() {
        return this.fromImageId;
    }

    public Image setFromImageName(String fromImageName) {
        this.fromImageName = fromImageName;
        return this;
    }
    public String getFromImageName() {
        return this.fromImageName;
    }

    public Image setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public Image setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
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

    public Image setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public Image setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public Image setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
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

    public Image setPythonVersion(String pythonVersion) {
        this.pythonVersion = pythonVersion;
        return this;
    }
    public String getPythonVersion() {
        return this.pythonVersion;
    }

    public Image setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public Image setRepository(String repository) {
        this.repository = repository;
        return this;
    }
    public String getRepository() {
        return this.repository;
    }

    public Image setRepositoryPage(String repositoryPage) {
        this.repositoryPage = repositoryPage;
        return this;
    }
    public String getRepositoryPage() {
        return this.repositoryPage;
    }

    public Image setResourceType(Long resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Long getResourceType() {
        return this.resourceType;
    }

    public Image setRootImageId(String rootImageId) {
        this.rootImageId = rootImageId;
        return this;
    }
    public String getRootImageId() {
        return this.rootImageId;
    }

    public Image setShared(Boolean shared) {
        this.shared = shared;
        return this;
    }
    public Boolean getShared() {
        return this.shared;
    }

    public Image setShortImageUrl(String shortImageUrl) {
        this.shortImageUrl = shortImageUrl;
        return this;
    }
    public String getShortImageUrl() {
        return this.shortImageUrl;
    }

    public Image setShortRepository(String shortRepository) {
        this.shortRepository = shortRepository;
        return this;
    }
    public String getShortRepository() {
        return this.shortRepository;
    }

    public Image setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

    public Image setStageCode(Long stageCode) {
        this.stageCode = stageCode;
        return this;
    }
    public Long getStageCode() {
        return this.stageCode;
    }

    public Image setSuggestedName(String suggestedName) {
        this.suggestedName = suggestedName;
        return this;
    }
    public String getSuggestedName() {
        return this.suggestedName;
    }

    public Image setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public Image setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Image setWorkspaceImageId(String workspaceImageId) {
        this.workspaceImageId = workspaceImageId;
        return this;
    }
    public String getWorkspaceImageId() {
        return this.workspaceImageId;
    }

}
