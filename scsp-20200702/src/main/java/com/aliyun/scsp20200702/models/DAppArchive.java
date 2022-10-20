// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class DAppArchive extends TeaModel {
    @NameInMap("App")
    public DApp app;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("GmtCreate")
    public Long gmtCreate;

    @NameInMap("Id")
    public String id;

    @NameInMap("ResCount")
    public Integer resCount;

    @NameInMap("Status")
    public DPair status;

    @NameInMap("Version")
    public String version;

    public static DAppArchive build(java.util.Map<String, ?> map) throws Exception {
        DAppArchive self = new DAppArchive();
        return TeaModel.build(map, self);
    }

    public DAppArchive setApp(DApp app) {
        this.app = app;
        return this;
    }
    public DApp getApp() {
        return this.app;
    }

    public DAppArchive setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public DAppArchive setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public DAppArchive setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DAppArchive setResCount(Integer resCount) {
        this.resCount = resCount;
        return this;
    }
    public Integer getResCount() {
        return this.resCount;
    }

    public DAppArchive setStatus(DPair status) {
        this.status = status;
        return this;
    }
    public DPair getStatus() {
        return this.status;
    }

    public DAppArchive setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
