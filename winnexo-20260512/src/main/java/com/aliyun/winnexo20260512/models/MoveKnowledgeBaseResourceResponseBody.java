// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class MoveKnowledgeBaseResourceResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The target knowledge base ID. This value is echoed from the request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleKnowledgeId</p>
     */
    @NameInMap("knowledgeId")
    public String knowledgeId;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>375701FC-2FB9-5782-BE8F-A3F5E2F2158C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The source directory ID. This value is echoed from the request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceDirectoryId</p>
     */
    @NameInMap("sourceDirectoryId")
    public String sourceDirectoryId;

    /**
     * <p>The unique identifier on the business system side, that is, the business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2000358</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The target directory ID. This value is echoed from the request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleTargetDirectoryId</p>
     */
    @NameInMap("targetDirectoryId")
    public String targetDirectoryId;

    public static MoveKnowledgeBaseResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveKnowledgeBaseResourceResponseBody self = new MoveKnowledgeBaseResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveKnowledgeBaseResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MoveKnowledgeBaseResourceResponseBody setKnowledgeId(String knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public String getKnowledgeId() {
        return this.knowledgeId;
    }

    public MoveKnowledgeBaseResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MoveKnowledgeBaseResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MoveKnowledgeBaseResourceResponseBody setSourceDirectoryId(String sourceDirectoryId) {
        this.sourceDirectoryId = sourceDirectoryId;
        return this;
    }
    public String getSourceDirectoryId() {
        return this.sourceDirectoryId;
    }

    public MoveKnowledgeBaseResourceResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public MoveKnowledgeBaseResourceResponseBody setTargetDirectoryId(String targetDirectoryId) {
        this.targetDirectoryId = targetDirectoryId;
        return this;
    }
    public String getTargetDirectoryId() {
        return this.targetDirectoryId;
    }

}
