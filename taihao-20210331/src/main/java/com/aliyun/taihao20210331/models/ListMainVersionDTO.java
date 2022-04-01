// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListMainVersionDTO extends TeaModel {
    // iaasType
    @NameInMap("IaasType")
    public String iaasType;

    // createTime
    @NameInMap("createTime")
    public String createTime;

    // mainVersion
    @NameInMap("mainVersion")
    public String mainVersion;

    // releaseType
    @NameInMap("releaseType")
    public String releaseType;

    // status
    @NameInMap("status")
    public String status;

    // type
    @NameInMap("type")
    public String type;

    public static ListMainVersionDTO build(java.util.Map<String, ?> map) throws Exception {
        ListMainVersionDTO self = new ListMainVersionDTO();
        return TeaModel.build(map, self);
    }

    public ListMainVersionDTO setIaasType(String iaasType) {
        this.iaasType = iaasType;
        return this;
    }
    public String getIaasType() {
        return this.iaasType;
    }

    public ListMainVersionDTO setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ListMainVersionDTO setMainVersion(String mainVersion) {
        this.mainVersion = mainVersion;
        return this;
    }
    public String getMainVersion() {
        return this.mainVersion;
    }

    public ListMainVersionDTO setReleaseType(String releaseType) {
        this.releaseType = releaseType;
        return this;
    }
    public String getReleaseType() {
        return this.releaseType;
    }

    public ListMainVersionDTO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListMainVersionDTO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
