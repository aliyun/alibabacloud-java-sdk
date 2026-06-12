// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListAzureBlobIngestionResponseBody extends TeaModel {
    /**
     * <p>The number of tasks returned on the current page.</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>A list of Azure Blob ingestion tasks.</p>
     */
    @NameInMap("results")
    public java.util.List<AzureBlobIngestion> results;

    /**
     * <p>The total number of tasks that match the query.</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListAzureBlobIngestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAzureBlobIngestionResponseBody self = new ListAzureBlobIngestionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAzureBlobIngestionResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListAzureBlobIngestionResponseBody setResults(java.util.List<AzureBlobIngestion> results) {
        this.results = results;
        return this;
    }
    public java.util.List<AzureBlobIngestion> getResults() {
        return this.results;
    }

    public ListAzureBlobIngestionResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
