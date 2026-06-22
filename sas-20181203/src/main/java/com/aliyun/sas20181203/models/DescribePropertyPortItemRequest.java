// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyPortItemRequest extends TeaModel {
    /**
     * <p>The page number of the current page to display in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether to forcibly refresh the data to be queried.</p>
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
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The port number.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("Port")
    public String port;

    public static DescribePropertyPortItemRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyPortItemRequest self = new DescribePropertyPortItemRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertyPortItemRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePropertyPortItemRequest setForceFlush(Boolean forceFlush) {
        this.forceFlush = forceFlush;
        return this;
    }
    public Boolean getForceFlush() {
        return this.forceFlush;
    }

    public DescribePropertyPortItemRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePropertyPortItemRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

}
