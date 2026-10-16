// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListTrustedServiceStatusRequest extends TeaModel {
    /**
     * <p>The management account or delegated administrator account. Valid values:</p>
     * <ul>
     * <li>Management account (default): Queries the list of trusted services enabled by the management account.</li>
     * <li>Delegated administrator account: Queries the list of trusted services enabled by the delegated administrator account.</li>
     * </ul>
     * <p>For more information about trusted services and delegated administrator accounts, see <a href="https://help.aliyun.com/document_detail/208133.html">Overview of trusted services</a> and <a href="https://help.aliyun.com/document_detail/208117.html">Manage delegated administrator accounts</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>177242285274****</p>
     */
    @NameInMap("AdminAccountId")
    public String adminAccountId;

    /**
     * <p>The page number.</p>
     * <p>Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
