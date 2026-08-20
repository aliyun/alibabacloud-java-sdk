// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseAliDingDocResponseBody extends TeaModel {
    /**
     * <p>The result code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The public URL of the document (echoes the input parameter).</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
     */
    @NameInMap("filePublicUrl")
    public String filePublicUrl;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-05-22 16:03:27</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The error details.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>p-toolset-b8a1de80-e9f5-49f3-8a12-873d378889c6</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F42FC60B-C54D-5DFB-A8EC-04625BFFF1F7</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The permission scope.</p>
     * 
     * <strong>example:</strong>
     * <p>repo</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>The unique identifier on the business system side, which is the business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The refund status. Query this field to confirm the refund status during processing. Valid values:</p>
     * <ul>
     * <li>SUCCESS: All refunds are successful.</li>
     * <li>FAIL: The refund failed.</li>
     * <li>WAIT_PAY: Waiting for refund.</li>
     * <li>EXPIRE: The refund has expired.</li>
     * <li>PAYING: The refund is being processed.</li>
     * <li>TERMINATE: The refund is terminated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;observedGeneration\&quot;: 7, \&quot;servicesInstances\&quot;: {}, \&quot;observedTime\&quot;: \&quot;2025-12-17T11:57:07Z\&quot;, \&quot;servicesWithPendingChanges\&quot;: [], \&quot;latestEnvironmentDeploymentName\&quot;: \&quot;manual-1765972627273-k7GZvr\&quot;}</p>
     */
    @NameInMap("status")
    public String status;

    public static CreateKnowledgeBaseAliDingDocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseAliDingDocResponseBody self = new CreateKnowledgeBaseAliDingDocResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseAliDingDocResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateKnowledgeBaseAliDingDocResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateKnowledgeBaseAliDingDocResponseBody setFilePublicUrl(String filePublicUrl) {
        this.filePublicUrl = filePublicUrl;
        return this;
    }
    public String getFilePublicUrl() {
        return this.filePublicUrl;
    }

    public CreateKnowledgeBaseAliDingDocResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CreateKnowledgeBaseAliDingDocResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateKnowledgeBaseAliDingDocResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateKnowledgeBaseAliDingDocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateKnowledgeBaseAliDingDocResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateKnowledgeBaseAliDingDocResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreateKnowledgeBaseAliDingDocResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
