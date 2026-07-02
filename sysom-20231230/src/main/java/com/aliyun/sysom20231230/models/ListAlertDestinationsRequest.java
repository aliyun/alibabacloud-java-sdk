// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAlertDestinationsRequest extends TeaModel {
    /**
     * <p>Current page number (starting from 1)</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public Integer current;

    /**
     * <p>Maximum number of records to retrieve at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>Alert contact name</p>
     * 
     * <strong>example:</strong>
     * <p>name1</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Pagination token for the next request.</p>
     * 
     * <strong>example:</strong>
     * <p>c2f78a783f49457caba6bace6f6f79e4</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Page size</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListAlertDestinationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertDestinationsRequest self = new ListAlertDestinationsRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertDestinationsRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListAlertDestinationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAlertDestinationsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAlertDestinationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAlertDestinationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
