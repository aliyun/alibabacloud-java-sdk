// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsprojectissueRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("State")
    public String state;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutVcsprojectissueRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsprojectissueRequest self = new GetLinkeBahamutVcsprojectissueRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsprojectissueRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetLinkeBahamutVcsprojectissueRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public GetLinkeBahamutVcsprojectissueRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
