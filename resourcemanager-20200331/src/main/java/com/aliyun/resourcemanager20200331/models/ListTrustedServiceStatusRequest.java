// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListTrustedServiceStatusRequest extends TeaModel {
    /**
     * <p>The ID of the enterprise management account or delegated administrator account.</p>
     * <ul>
     * <li>If you set this parameter to the ID of an enterprise management account, the trusted services that are enabled within the enterprise management account are queried. The default value of this parameter is the ID of an enterprise management account.</li>
     * <li>If you set this parameter to the ID of a delegated administrator account, the trusted services that are enabled within the delegated administrator account are queried.</li>
     * </ul>
     * <p>For more information about trusted services and delegated administrator accounts, see <a href="https://help.aliyun.com/document_detail/208133.html">Overview of trusted services</a> and <a href="https://help.aliyun.com/document_detail/208117.html">Delegated administrator accounts</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>177242285274****</p>
     */
    @NameInMap("AdminAccountId")
    public String adminAccountId;

    /**
     * <p>The number of the page to return.</p>
     * <p>Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
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
