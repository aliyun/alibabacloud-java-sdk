// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListDelegatedAdministratorsRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The identifier of the trusted service.</p>
     * <br>
     * <p>For more information, see the `Trusted service identifier` column in [Supported trusted services](~~208133~~).</p>
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
