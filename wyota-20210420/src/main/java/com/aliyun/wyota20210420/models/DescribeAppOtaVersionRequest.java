// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DescribeAppOtaVersionRequest extends TeaModel {
    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("ClientType")
    public Integer clientType;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("NullChannel")
    public Boolean nullChannel;

    @NameInMap("OtaType")
    public Integer otaType;

    @NameInMap("Project")
    public String project;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("VersionUid")
    public String versionUid;

    public static DescribeAppOtaVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppOtaVersionRequest self = new DescribeAppOtaVersionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppOtaVersionRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public DescribeAppOtaVersionRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public DescribeAppOtaVersionRequest setClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }
    public Integer getClientType() {
        return this.clientType;
    }

    public DescribeAppOtaVersionRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public DescribeAppOtaVersionRequest setNullChannel(Boolean nullChannel) {
        this.nullChannel = nullChannel;
        return this;
    }
    public Boolean getNullChannel() {
        return this.nullChannel;
    }

    public DescribeAppOtaVersionRequest setOtaType(Integer otaType) {
        this.otaType = otaType;
        return this;
    }
    public Integer getOtaType() {
        return this.otaType;
    }

    public DescribeAppOtaVersionRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DescribeAppOtaVersionRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeAppOtaVersionRequest setVersionUid(String versionUid) {
        this.versionUid = versionUid;
        return this;
    }
    public String getVersionUid() {
        return this.versionUid;
    }

}
