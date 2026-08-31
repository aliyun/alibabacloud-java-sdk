// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListNextResourceRecordResponseBody extends TeaModel {
    /**
     * <p>The list of resource records.</p>
     */
    @NameInMap("items")
    public java.util.List<ResourceRecord> items;

    /**
     * <p>The maximum number of records returned in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <p>The pagination token for the next page. An empty value indicates that no more data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>t7F6JzTNNTjkq2tRBH8hR0a_NcuVYQWjbVwdFeuFhkylsUhrDl0JSofT5mrbI0oV&quot;</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The total number of records that match the filter criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>245</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListNextResourceRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNextResourceRecordResponseBody self = new ListNextResourceRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNextResourceRecordResponseBody setItems(java.util.List<ResourceRecord> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ResourceRecord> getItems() {
        return this.items;
    }

    public ListNextResourceRecordResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListNextResourceRecordResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNextResourceRecordResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
