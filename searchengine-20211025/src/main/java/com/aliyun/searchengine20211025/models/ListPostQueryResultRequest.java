// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListPostQueryResultRequest extends TeaModel {
    /**
     * <p>The instance endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("address")
    public String address;

    /**
     * <p>The request body.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    /**
     * <p>The query type. Valid values: sql: SQL query. ha3: Havenask query.</p>
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

    public ListPostQueryResultRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
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
