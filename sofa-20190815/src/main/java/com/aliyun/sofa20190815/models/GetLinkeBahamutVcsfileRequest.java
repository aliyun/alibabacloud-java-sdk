// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsfileRequest extends TeaModel {
    @NameInMap("Filename")
    public String filename;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Ref")
    public String ref;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutVcsfileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsfileRequest self = new GetLinkeBahamutVcsfileRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsfileRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public GetLinkeBahamutVcsfileRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetLinkeBahamutVcsfileRequest setRef(String ref) {
        this.ref = ref;
        return this;
    }
    public String getRef() {
        return this.ref;
    }

    public GetLinkeBahamutVcsfileRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
