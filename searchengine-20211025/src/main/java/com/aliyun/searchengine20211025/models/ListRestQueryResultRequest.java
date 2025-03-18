// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListRestQueryResultRequest extends TeaModel {
    /**
     * <p>The name of the index table.</p>
     * 
     * <strong>example:</strong>
     * <p>main_index</p>
     */
    @NameInMap("indexName")
    public String indexName;

    /**
     * <p>The rest query statement.</p>
     * 
     * <strong>example:</strong>
     * <p>query%3Drelation_id%3A%221151274675_2%22%26%26cluster%3Dgeneral%26%26config%3Dstart%3A0%2Chit%3A10%2Cformat%3Ajson</p>
     */
    @NameInMap("query")
    public java.util.Map<String, ?> query;

    public static ListRestQueryResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRestQueryResultRequest self = new ListRestQueryResultRequest();
        return TeaModel.build(map, self);
    }

    public ListRestQueryResultRequest setIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }
    public String getIndexName() {
        return this.indexName;
    }

    public ListRestQueryResultRequest setQuery(java.util.Map<String, ?> query) {
        this.query = query;
        return this;
    }
    public java.util.Map<String, ?> getQuery() {
        return this.query;
    }

}
