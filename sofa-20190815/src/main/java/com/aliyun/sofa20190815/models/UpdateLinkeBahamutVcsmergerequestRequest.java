// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutVcsmergerequestRequest extends TeaModel {
    @NameInMap("BahamutCharset")
    public String bahamutCharset;

    @NameInMap("MergeRequestId")
    public String mergeRequestId;

    @NameInMap("Path")
    public String path;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("TenantId")
    public String tenantId;

    public static UpdateLinkeBahamutVcsmergerequestRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutVcsmergerequestRequest self = new UpdateLinkeBahamutVcsmergerequestRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutVcsmergerequestRequest setBahamutCharset(String bahamutCharset) {
        this.bahamutCharset = bahamutCharset;
        return this;
    }
    public String getBahamutCharset() {
        return this.bahamutCharset;
    }

    public UpdateLinkeBahamutVcsmergerequestRequest setMergeRequestId(String mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
        return this;
    }
    public String getMergeRequestId() {
        return this.mergeRequestId;
    }

    public UpdateLinkeBahamutVcsmergerequestRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public UpdateLinkeBahamutVcsmergerequestRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateLinkeBahamutVcsmergerequestRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
