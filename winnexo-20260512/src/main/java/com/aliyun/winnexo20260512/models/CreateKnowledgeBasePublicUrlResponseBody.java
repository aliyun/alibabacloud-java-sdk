// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBasePublicUrlResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The ID of the requested target directory in the enterprise knowledge base.</p>
     * 
     * <strong>example:</strong>
     * <p>dir_tenant_child</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The creation time in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-14T10:00:00+08:00</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The error message. This parameter is empty if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The name of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>Project plan</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The URL of the submitted public web page.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com">https://example.com</a></p>
     */
    @NameInMap("originalUrl")
    public String originalUrl;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The scope of the resource. The value is fixed to TENANT.</p>
     * 
     * <strong>example:</strong>
     * <p>TENANT</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>The ID of the newly created source.</p>
     * 
     * <strong>example:</strong>
     * <p>src_public_url_1</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The status of the resource. A value of RUNNING indicates that the request is accepted but the crawling and parsing are not completed.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("status")
    public String status;

    public static CreateKnowledgeBasePublicUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBasePublicUrlResponseBody self = new CreateKnowledgeBasePublicUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBasePublicUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateKnowledgeBasePublicUrlResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateKnowledgeBasePublicUrlResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CreateKnowledgeBasePublicUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateKnowledgeBasePublicUrlResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateKnowledgeBasePublicUrlResponseBody setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
        return this;
    }
    public String getOriginalUrl() {
        return this.originalUrl;
    }

    public CreateKnowledgeBasePublicUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateKnowledgeBasePublicUrlResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateKnowledgeBasePublicUrlResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreateKnowledgeBasePublicUrlResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
