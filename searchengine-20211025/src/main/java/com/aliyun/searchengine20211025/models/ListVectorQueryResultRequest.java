// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListVectorQueryResultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("address")
    public String address;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    /**
     * <strong>example:</strong>
     * <p>primary_key</p>
     */
    @NameInMap("queryType")
    public String queryType;

    /**
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("vectorQueryType")
    public String vectorQueryType;

    public static ListVectorQueryResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVectorQueryResultRequest self = new ListVectorQueryResultRequest();
        return TeaModel.build(map, self);
    }

    public ListVectorQueryResultRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ListVectorQueryResultRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

    public ListVectorQueryResultRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public ListVectorQueryResultRequest setVectorQueryType(String vectorQueryType) {
        this.vectorQueryType = vectorQueryType;
        return this;
    }
    public String getVectorQueryType() {
        return this.vectorQueryType;
    }

}
