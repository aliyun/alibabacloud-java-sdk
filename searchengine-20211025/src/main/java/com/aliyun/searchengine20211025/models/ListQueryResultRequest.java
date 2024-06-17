// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListQueryResultRequest extends TeaModel {
    /**
     * <p>The query statement</p>
     * 
     * <strong>example:</strong>
     * <p>query%3D1%26%26config%3Dstart%3A0%2Chit%3A10%2Cformat%3Ajson%26%26cluster%3Dgeneral</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The SQL statement that is executed in the query</p>
     * 
     * <strong>example:</strong>
     * <p>query%3Dselect%20max(content_id)%20from%20generation</p>
     */
    @NameInMap("sql")
    public String sql;

    public static ListQueryResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQueryResultRequest self = new ListQueryResultRequest();
        return TeaModel.build(map, self);
    }

    public ListQueryResultRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListQueryResultRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

}
