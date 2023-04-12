// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListTrustedServiceStatusRequest extends TeaModel {
    /**
     * <p>The ID of the management account or delegated administrator account.</p>
     * <br>
     * <p>*   If you set this parameter to the ID of a management account, the trusted services that are enabled within the management account are queried. The default value of this parameter is the ID of an management account.</p>
     * <p>*   If you set this parameter to the ID of a delegated administrator account, the trusted services that are enabled within the delegated administrator account are queried.</p>
     * <br>
     * <p>For more information about trusted services and delegated administrator accounts, see [Overview of trusted services](~~208133~~) and [Delegated administrator accounts](~~208117~~).</p>
     */
    @NameInMap("AdminAccountId")
    public String adminAccountId;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     */
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
