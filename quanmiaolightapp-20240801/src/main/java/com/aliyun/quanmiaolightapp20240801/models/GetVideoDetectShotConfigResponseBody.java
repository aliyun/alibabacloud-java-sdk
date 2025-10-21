// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GetVideoDetectShotConfigResponseBody extends TeaModel {
    /**
     * <p>code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetVideoDetectShotConfigResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>msg</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>success</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetVideoDetectShotConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoDetectShotConfigResponseBody self = new GetVideoDetectShotConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoDetectShotConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVideoDetectShotConfigResponseBody setData(GetVideoDetectShotConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetVideoDetectShotConfigResponseBodyData getData() {
        return this.data;
    }

    public GetVideoDetectShotConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetVideoDetectShotConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVideoDetectShotConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoDetectShotConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetVideoDetectShotConfigResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("asyncConcurrency")
        public Integer asyncConcurrency;

        public static GetVideoDetectShotConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVideoDetectShotConfigResponseBodyData self = new GetVideoDetectShotConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVideoDetectShotConfigResponseBodyData setAsyncConcurrency(Integer asyncConcurrency) {
            this.asyncConcurrency = asyncConcurrency;
            return this;
        }
        public Integer getAsyncConcurrency() {
            return this.asyncConcurrency;
        }

    }

}
