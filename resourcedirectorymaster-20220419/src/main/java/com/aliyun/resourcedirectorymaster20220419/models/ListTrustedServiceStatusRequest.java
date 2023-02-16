// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListTrustedServiceStatusRequest extends TeaModel {
    @NameInMap("AdminAccountId")
    public String adminAccountId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListTrustedServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrustedServiceStatusRequest self = new ListTrustedServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public ListTrustedServiceStatusRequest setAdminAccountId(String adminAccountId) {
        this.adminAccountId = adminAccountId;
        return this;
    }
    public String getAdminAccountId() {
        return this.adminAccountId;
    }

    public ListTrustedServiceStatusRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTrustedServiceStatusRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
