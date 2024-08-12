// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetAppOtaLatestVersionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BaseVersion")
    public String baseVersion;

    @NameInMap("ClientType")
    public Integer clientType;

    @NameInMap("ClientUid")
    public String clientUid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OsType")
    public String osType;

    @NameInMap("Project")
    public String project;

    public static GetAppOtaLatestVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppOtaLatestVersionRequest self = new GetAppOtaLatestVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetAppOtaLatestVersionRequest setBaseVersion(String baseVersion) {
        this.baseVersion = baseVersion;
        return this;
    }
    public String getBaseVersion() {
        return this.baseVersion;
    }

    public GetAppOtaLatestVersionRequest setClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }
    public Integer getClientType() {
        return this.clientType;
    }

    public GetAppOtaLatestVersionRequest setClientUid(String clientUid) {
        this.clientUid = clientUid;
        return this;
    }
    public String getClientUid() {
        return this.clientUid;
    }

    public GetAppOtaLatestVersionRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public GetAppOtaLatestVersionRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
