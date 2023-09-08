// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListQueryResultRequest extends TeaModel {
    /**
     * <p>353490</p>
     */
    @NameInMap("query")
    public String query;

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
