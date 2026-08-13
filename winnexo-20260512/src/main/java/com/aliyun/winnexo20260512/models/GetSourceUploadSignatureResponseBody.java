// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetSourceUploadSignatureResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>文件 Content-Type</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("contentType")
    public String contentType;

    /**
     * <p>签名 URL 有效时长（秒）</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("expiresIn")
    public Long expiresIn;

    /**
     * <p>文件公开访问 URL</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
     */
    @NameInMap("filePublicUrl")
    public String filePublicUrl;

    /**
     * <p>文件记录 ID</p>
     * 
     * <strong>example:</strong>
     * <p>exampleFileRecordId</p>
     */
    @NameInMap("fileRecordId")
    public String fileRecordId;

    /**
     * <p>文件 OSS 内部 URL</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
     */
    @NameInMap("fileUrl")
    public String fileUrl;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>上传 HTTP 方法（固定为 PUT）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("method")
    public String method;

    /**
     * <p>OSS 对象名</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("objectName")
    public String objectName;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>签名上传 URL（PUT 方式）</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
     */
    @NameInMap("uploadSignatureUrl")
    public String uploadSignatureUrl;

    public static GetSourceUploadSignatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSourceUploadSignatureResponseBody self = new GetSourceUploadSignatureResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSourceUploadSignatureResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSourceUploadSignatureResponseBody setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public GetSourceUploadSignatureResponseBody setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
    public Long getExpiresIn() {
        return this.expiresIn;
    }

    public GetSourceUploadSignatureResponseBody setFilePublicUrl(String filePublicUrl) {
        this.filePublicUrl = filePublicUrl;
        return this;
    }
    public String getFilePublicUrl() {
        return this.filePublicUrl;
    }

    public GetSourceUploadSignatureResponseBody setFileRecordId(String fileRecordId) {
        this.fileRecordId = fileRecordId;
        return this;
    }
    public String getFileRecordId() {
        return this.fileRecordId;
    }

    public GetSourceUploadSignatureResponseBody setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public GetSourceUploadSignatureResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSourceUploadSignatureResponseBody setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public GetSourceUploadSignatureResponseBody setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }
    public String getObjectName() {
        return this.objectName;
    }

    public GetSourceUploadSignatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSourceUploadSignatureResponseBody setUploadSignatureUrl(String uploadSignatureUrl) {
        this.uploadSignatureUrl = uploadSignatureUrl;
        return this;
    }
    public String getUploadSignatureUrl() {
        return this.uploadSignatureUrl;
    }

}
