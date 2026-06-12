// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListElasticsearchIngestionsResponseBody extends TeaModel {
    /**
     * <p>The number of Elasticsearch/OpenSearch import jobs returned in the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>The list of Elasticsearch/OpenSearch import jobs.</p>
     */
    @NameInMap("results")
    public java.util.List<ESIngestion> results;

    /**
     * <p>The total number of Elasticsearch/OpenSearch import jobs in the project.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListElasticsearchIngestionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListElasticsearchIngestionsResponseBody self = new ListElasticsearchIngestionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListElasticsearchIngestionsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListElasticsearchIngestionsResponseBody setResults(java.util.List<ESIngestion> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ESIngestion> getResults() {
        return this.results;
    }

    public ListElasticsearchIngestionsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
