// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListConsumerGroupsRequest extends TeaModel {
    /**
     * <p>The filter condition for the query. If not provided, all consumer groups under the specified instance will be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>CID-TEST</p>
     */
    @NameInMap("filter")
    public String filter;

    /**
     * <p>Page number, indicating which page of results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, the maximum number of results to display per page.</p>
     * <p>Value range: [10, 100].</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListConsumerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerGroupsRequest self = new ListConsumerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListConsumerGroupsRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListConsumerGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListConsumerGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
