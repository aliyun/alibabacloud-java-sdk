// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ImageRepository extends TeaModel {
    // 创建时间
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 修改时间
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    // 地区Id
    @NameInMap("RegionId")
    public String regionId;

    // 仓库名称
    @NameInMap("RepoName")
    public String repoName;

    // 仓库命名空间
    @NameInMap("RepoNamespace")
    public String repoNamespace;

    // 仓库状态
    @NameInMap("RepoStatus")
    public String repoStatus;

    // 仓库地址
    @NameInMap("Repository")
    public String repository;

    public static ImageRepository build(java.util.Map<String, ?> map) throws Exception {
        ImageRepository self = new ImageRepository();
        return TeaModel.build(map, self);
    }

    public ImageRepository setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public ImageRepository setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public ImageRepository setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ImageRepository setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public ImageRepository setRepoNamespace(String repoNamespace) {
        this.repoNamespace = repoNamespace;
        return this;
    }
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    public ImageRepository setRepoStatus(String repoStatus) {
        this.repoStatus = repoStatus;
        return this;
    }
    public String getRepoStatus() {
        return this.repoStatus;
    }

    public ImageRepository setRepository(String repository) {
        this.repository = repository;
        return this;
    }
    public String getRepository() {
        return this.repository;
    }

}
