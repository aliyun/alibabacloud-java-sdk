// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeJobHistoryRequest extends TeaModel {
    /**
     * <p>The ID of the job template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e1a7a07-abcb-4652-a1d3-2d57f415****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The number of entries per page in the paging Settings for a paged query. Valid values: 0 to 10000.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The running status of the job. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Not run.</li>
     * <li><strong>1</strong>: Succeeded.</li>
     * <li><strong>2</strong>: Failed.</li>
     * <li><strong>3</strong>: Running.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
