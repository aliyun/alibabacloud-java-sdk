// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyUserItemRequest extends TeaModel {
    /**
     * <p>The page number of the current page to display in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether to forcefully refresh the data to be queried. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Forcefully refresh.</li>
     * <li><strong>false</strong>: Do not forcefully refresh.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ForceFlush")
    public Boolean forceFlush;

    /**
     * <p>The maximum number of entries to display on each page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The account information of Asset Fingerprints.</p>
     * 
     * <strong>example:</strong>
     * <p>adm</p>
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
