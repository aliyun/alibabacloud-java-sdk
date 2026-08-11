// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListPostQueryResultRequest extends TeaModel {
    /**
     * <p>The request structure.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;assemblyQuery&quot;:&quot;query=id:1&amp;&amp;cluster=general&amp;&amp;config=start:0,hit:10,format:json&quot;}</p>
     */
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    /**
     * <p>sql: SQL query. ha3: HA3 query.</p>
     * 
     * <strong>example:</strong>
     * <p>ha3</p>
     */
    @NameInMap("type")
    public String type;

    public static ListPostQueryResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPostQueryResultRequest self = new ListPostQueryResultRequest();
        return TeaModel.build(map, self);
    }

    public ListPostQueryResultRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

    public ListPostQueryResultRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
