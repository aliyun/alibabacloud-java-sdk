// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QuerySemanticKnowledgeResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>与 query 相关的语义知识文本</p>
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
