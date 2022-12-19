// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyUserItemRequest extends TeaModel {
    // The number of the page to return.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // Specifies whether to forcefully refresh the data that you want to query. Valid values:
    // 
    // *   **true**: yes
    // *   **false**: no
    @NameInMap("ForceFlush")
    public Boolean forceFlush;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The information about the account.
    @NameInMap("User")
    public String user;

    public static DescribePropertyUserItemRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyUserItemRequest self = new DescribePropertyUserItemRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertyUserItemRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePropertyUserItemRequest setForceFlush(Boolean forceFlush) {
        this.forceFlush = forceFlush;
        return this;
    }
    public Boolean getForceFlush() {
        return this.forceFlush;
    }

    public DescribePropertyUserItemRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePropertyUserItemRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
