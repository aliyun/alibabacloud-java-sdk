// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutLogsgetlogsbyuserRequest extends TeaModel {
    @NameInMap("EmpId")
    public String empId;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutLogsgetlogsbyuserRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutLogsgetlogsbyuserRequest self = new GetLinkeBahamutLogsgetlogsbyuserRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutLogsgetlogsbyuserRequest setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public GetLinkeBahamutLogsgetlogsbyuserRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetLinkeBahamutLogsgetlogsbyuserRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLinkeBahamutLogsgetlogsbyuserRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
