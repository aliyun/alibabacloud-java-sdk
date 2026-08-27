// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalFeishuDocResponseBody extends TeaModel {
    /**
     * <p>SUCCESS indicates success. In case of failure, the corresponding error type is returned, such as ERR_BAD_REQUEST, ERR_VALIDATION_FAILED, or ERR_INTERNAL_SERVER_ERROR.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The folder ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dir_personal_child</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The document URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.feishu.cn/docx/doxcnExample">https://example.feishu.cn/docx/doxcnExample</a></p>
     */
    @NameInMap("docUrl")
    public String docUrl;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-26T10:00:00+08:00</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The name of the AI assistant.</p>
     * 
     * <strong>example:</strong>
     * <p>ProjectPlan</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The permission scope.</p>
     * 
     * <strong>example:</strong>
     * <p>PERSONAL</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>The source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>src_feishu_doc_1</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The status.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("status")
    public String status;

    public static CreatePersonalFeishuDocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalFeishuDocResponseBody self = new CreatePersonalFeishuDocResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePersonalFeishuDocResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePersonalFeishuDocResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreatePersonalFeishuDocResponseBody setDocUrl(String docUrl) {
        this.docUrl = docUrl;
        return this;
    }
    public String getDocUrl() {
        return this.docUrl;
    }

    public CreatePersonalFeishuDocResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CreatePersonalFeishuDocResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePersonalFeishuDocResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePersonalFeishuDocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePersonalFeishuDocResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreatePersonalFeishuDocResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreatePersonalFeishuDocResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
