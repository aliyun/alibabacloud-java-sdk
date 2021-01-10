// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcscommitchangeRequest extends TeaModel {
    @NameInMap("BahamutCharset")
    public String bahamutCharset;

    @NameInMap("CommitId")
    public String commitId;

    @NameInMap("Path")
    public String path;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutVcscommitchangeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcscommitchangeRequest self = new GetLinkeBahamutVcscommitchangeRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcscommitchangeRequest setBahamutCharset(String bahamutCharset) {
        this.bahamutCharset = bahamutCharset;
        return this;
    }
    public String getBahamutCharset() {
        return this.bahamutCharset;
    }

    public GetLinkeBahamutVcscommitchangeRequest setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public GetLinkeBahamutVcscommitchangeRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public GetLinkeBahamutVcscommitchangeRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetLinkeBahamutVcscommitchangeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
