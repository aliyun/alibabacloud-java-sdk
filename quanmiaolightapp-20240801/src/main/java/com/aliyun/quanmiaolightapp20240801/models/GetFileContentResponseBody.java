// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GetFileContentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetFileContentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BE603C85-90AA-50FC-A2D6-128AA9FA200D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static GetFileContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileContentResponseBody self = new GetFileContentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileContentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFileContentResponseBody setData(GetFileContentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFileContentResponseBodyData getData() {
        return this.data;
    }

    public GetFileContentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetFileContentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFileContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFileContentResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetFileContentResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("content")
        public String content;

        public static GetFileContentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFileContentResponseBodyData self = new GetFileContentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFileContentResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
