// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListDelegatedAdministratorsRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * <p>Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The identifier of the trusted service.</p>
     * <p>For more information, see the <code>Trusted service identifier</code> column in <a href="https://help.aliyun.com/document_detail/208133.html">Supported trusted services</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cloudfw.aliyuncs.com</p>
     */
    @NameInMap("ServicePrincipal")
    public String servicePrincipal;

    public static ListDelegatedAdministratorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDelegatedAdministratorsRequest self = new ListDelegatedAdministratorsRequest();
        return TeaModel.build(map, self);
    }

    public ListDelegatedAdministratorsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDelegatedAdministratorsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDelegatedAdministratorsRequest setServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
        return this;
    }
    public String getServicePrincipal() {
        return this.servicePrincipal;
    }

}
