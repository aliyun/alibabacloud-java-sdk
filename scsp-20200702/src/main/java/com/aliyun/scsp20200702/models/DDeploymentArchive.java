// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class DDeploymentArchive extends TeaModel {
    // 应用数量
    @NameInMap("AppCount")
    public Integer appCount;

    // 创建时间
    @NameInMap("GmtCreate")
    public Long gmtCreate;

    // id
    @NameInMap("Id")
    public String id;

    // 名称
    @NameInMap("Name")
    public String name;

    // 资源数量
    @NameInMap("ResCount")
    public Integer resCount;

    // 状态
    @NameInMap("Status")
    public DPair status;

    // 版本
    @NameInMap("Version")
    public String version;

    public static DDeploymentArchive build(java.util.Map<String, ?> map) throws Exception {
        DDeploymentArchive self = new DDeploymentArchive();
        return TeaModel.build(map, self);
    }

    public DDeploymentArchive setAppCount(Integer appCount) {
        this.appCount = appCount;
        return this;
    }
    public Integer getAppCount() {
        return this.appCount;
    }

    public DDeploymentArchive setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public DDeploymentArchive setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DDeploymentArchive setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DDeploymentArchive setResCount(Integer resCount) {
        this.resCount = resCount;
        return this;
    }
    public Integer getResCount() {
        return this.resCount;
    }

    public DDeploymentArchive setStatus(DPair status) {
        this.status = status;
        return this;
    }
    public DPair getStatus() {
        return this.status;
    }

    public DDeploymentArchive setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
