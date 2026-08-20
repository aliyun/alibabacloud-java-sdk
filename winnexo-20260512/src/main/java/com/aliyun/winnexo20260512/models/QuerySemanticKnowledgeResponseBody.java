// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QuerySemanticKnowledgeResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The semantic knowledge text related to the query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("schemaKnowledge")
    public String schemaKnowledge;

    public static QuerySemanticKnowledgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySemanticKnowledgeResponseBody self = new QuerySemanticKnowledgeResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySemanticKnowledgeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySemanticKnowledgeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySemanticKnowledgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySemanticKnowledgeResponseBody setSchemaKnowledge(String schemaKnowledge) {
        this.schemaKnowledge = schemaKnowledge;
        return this;
    }
    public String getSchemaKnowledge() {
        return this.schemaKnowledge;
    }

}
