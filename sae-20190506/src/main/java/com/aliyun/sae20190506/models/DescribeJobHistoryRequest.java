// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeJobHistoryRequest extends TeaModel {
    /**
     * <p>The ID of the job template.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The number of entries to return on each page. Valid values: 0 to 10000.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The status of the job. Valid values:</p>
     * <br>
     * <p>*   **0**: The job is not executed.</p>
     * <p>*   **1**: The job is executed.</p>
     * <p>*   **2**: The job fails to be executed.</p>
     * <p>*   **3**: The job is being executed.</p>
     */
    @NameInMap("State")
    public String state;

    public static DescribeJobHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobHistoryRequest self = new DescribeJobHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeJobHistoryRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeJobHistoryRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeJobHistoryRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeJobHistoryRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
