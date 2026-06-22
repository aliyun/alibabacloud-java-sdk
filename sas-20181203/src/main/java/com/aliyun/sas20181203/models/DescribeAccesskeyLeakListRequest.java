// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAccesskeyLeakListRequest extends TeaModel {
    /**
     * <p>The page number of the current page in a paged query. Default value: <strong>1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The maximum number of entries per page for a paged query. The maximum value of PageSize is 100. The default number of entries per page is 20. If the PageSize parameter is left empty, 20 entries are returned by default.</p>
     * <blockquote>
     * <p>Do not leave PageSize empty.</p>
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
     * <p>yourAccessKeyID</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The ID of the member account in the resource directory (Alibaba Cloud account).</p>
     * <blockquote>
     * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1232428423234****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The discovery time of the leaked information that you want to query. All AccessKey leak information discovered after this point in time is returned. This parameter is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1614155361489</p>
     */
    @NameInMap("StartTs")
    public Long startTs;

    /**
     * <p>The processing status of the leaked AccessKey information that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>pending</strong>: unprocessed</li>
     * <li><strong>dealed</strong>: processed.</li>
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
