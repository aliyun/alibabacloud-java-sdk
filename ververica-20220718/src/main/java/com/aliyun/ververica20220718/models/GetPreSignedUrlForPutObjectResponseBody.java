// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetPreSignedUrlForPutObjectResponseBody extends TeaModel {
    @NameInMap("data")
    public GetPreSignedUrlForObjectResult data;

    /**
     * <strong>example:</strong>
     * <p>990301</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>文件不存在</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetPreSignedUrlForPutObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPreSignedUrlForPutObjectResponseBody self = new GetPreSignedUrlForPutObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPreSignedUrlForPutObjectResponseBody setData(GetPreSignedUrlForObjectResult data) {
        this.data = data;
        return this;
    }
    public GetPreSignedUrlForObjectResult getData() {
        return this.data;
    }

    public GetPreSignedUrlForPutObjectResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPreSignedUrlForPutObjectResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPreSignedUrlForPutObjectResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetPreSignedUrlForPutObjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPreSignedUrlForPutObjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
