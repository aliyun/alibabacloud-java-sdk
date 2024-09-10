// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAccesskeyLeakListRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries to return on each page.\
     * Maximum value: 100. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <blockquote>
     * <p>We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The AccessKey ID that you want to query. Only exact match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>LTAI4Fytv7ALKzkNVBV6****</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to query the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The beginning of the time range to query. You can query all AccessKey pair leaks that are detected later than this time point. The value of this parameter is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1614155361489</p>
     */
    @NameInMap("StartTs")
    public Long startTs;

    /**
     * <p>Specifies whether an AccessKey pair leak is handled. Valid values:</p>
     * <ul>
     * <li><strong>pending</strong>: unhandled</li>
     * <li><strong>dealed</strong>: handled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pending</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeAccesskeyLeakListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccesskeyLeakListRequest self = new DescribeAccesskeyLeakListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccesskeyLeakListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAccesskeyLeakListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccesskeyLeakListRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public DescribeAccesskeyLeakListRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeAccesskeyLeakListRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

    public DescribeAccesskeyLeakListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
