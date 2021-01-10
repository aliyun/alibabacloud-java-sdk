// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutUsergetbyempldsRequest extends TeaModel {
    @NameInMap("EmpIds")
    public String empIds;

    @NameInMap("TenantExternalId")
    public String tenantExternalId;

    public static GetLinkeBahamutUsergetbyempldsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutUsergetbyempldsRequest self = new GetLinkeBahamutUsergetbyempldsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutUsergetbyempldsRequest setEmpIds(String empIds) {
        this.empIds = empIds;
        return this;
    }
    public String getEmpIds() {
        return this.empIds;
    }

    public GetLinkeBahamutUsergetbyempldsRequest setTenantExternalId(String tenantExternalId) {
        this.tenantExternalId = tenantExternalId;
        return this;
    }
    public String getTenantExternalId() {
        return this.tenantExternalId;
    }

}
