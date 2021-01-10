// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutUsergetbyempidRequest extends TeaModel {
    @NameInMap("EmpId")
    public String empId;

    @NameInMap("TenantExternalId")
    public String tenantExternalId;

    public static GetLinkeBahamutUsergetbyempidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutUsergetbyempidRequest self = new GetLinkeBahamutUsergetbyempidRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutUsergetbyempidRequest setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public GetLinkeBahamutUsergetbyempidRequest setTenantExternalId(String tenantExternalId) {
        this.tenantExternalId = tenantExternalId;
        return this;
    }
    public String getTenantExternalId() {
        return this.tenantExternalId;
    }

}
