// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class MoveKnowledgeBaseResourceResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>目标知识库 ID（echo 回入参）</p>
     * 
     * <strong>example:</strong>
     * <p>exampleKnowledgeId</p>
     */
    @NameInMap("knowledgeId")
    public String knowledgeId;

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
     * <p>源目录 ID（echo 回入参）</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceDirectoryId</p>
     */
    @NameInMap("sourceDirectoryId")
    public String sourceDirectoryId;

    /**
     * <p>资源 ID（echo 回入参）</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceId</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>目标目录 ID（echo 回入参）</p>
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
