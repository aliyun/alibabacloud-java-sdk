// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListOSSIngestionsResponseBody extends TeaModel {
    /**
     * <p>The number of OSS data import jobs that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>The OSS data import jobs.</p>
     */
    @NameInMap("results")
    public java.util.List<OSSIngestion> results;

    /**
     * <p>The total number of OSS data import jobs in the project.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListOSSIngestionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOSSIngestionsResponseBody self = new ListOSSIngestionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOSSIngestionsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListOSSIngestionsResponseBody setResults(java.util.List<OSSIngestion> results) {
        this.results = results;
        return this;
    }
    public java.util.List<OSSIngestion> getResults() {
        return this.results;
    }

    public ListOSSIngestionsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
