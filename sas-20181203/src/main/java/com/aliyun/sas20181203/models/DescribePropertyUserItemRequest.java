// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyUserItemRequest extends TeaModel {
    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The information about the account.</p>
     */
    @NameInMap("ForceFlush")
    public Boolean forceFlush;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of the page to return.</p>
     */
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
