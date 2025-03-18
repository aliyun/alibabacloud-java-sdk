// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListVectorQueryResultRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    @NameInMap("path")
    public String path;

    /**
     * <p>The query type. Valid values: vector, primary_key, and vector_text.</p>
     * 
     * <strong>example:</strong>
     * <p>primary_key</p>
     */
    @NameInMap("queryType")
    public String queryType;

    /**
     * <p>The vector query type. Valid values: vector, image, and text.</p>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("vectorQueryType")
    public String vectorQueryType;

    public static ListVectorQueryResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVectorQueryResultRequest self = new ListVectorQueryResultRequest();
        return TeaModel.build(map, self);
    }

    public ListVectorQueryResultRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

    public ListVectorQueryResultRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
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
