// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockProcessListRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <blockquote>
     * <p>We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the process.</p>
     * 
     * <strong>example:</strong>
     * <p>cron</p>
     */
    @NameInMap("ProcessName")
    public String processName;

    /**
     * <p>Specifies whether the process is added to the process whitelist. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: The process is added to the process whitelist.</li>
     * <li><strong>0</strong>: The process is not added to the process whitelist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static DescribeWebLockProcessListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockProcessListRequest self = new DescribeWebLockProcessListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockProcessListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWebLockProcessListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWebLockProcessListRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public DescribeWebLockProcessListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
