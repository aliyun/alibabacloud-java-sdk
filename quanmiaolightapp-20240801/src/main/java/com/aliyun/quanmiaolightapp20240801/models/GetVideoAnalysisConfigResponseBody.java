// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GetVideoAnalysisConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetVideoAnalysisConfigResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>085BE2D2-BB7E-59A6-B688-F2CB32124E7F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetVideoAnalysisConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoAnalysisConfigResponseBody self = new GetVideoAnalysisConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoAnalysisConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVideoAnalysisConfigResponseBody setData(GetVideoAnalysisConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetVideoAnalysisConfigResponseBodyData getData() {
        return this.data;
    }

    public GetVideoAnalysisConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetVideoAnalysisConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVideoAnalysisConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoAnalysisConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetVideoAnalysisConfigResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("asyncConcurrency")
        public Integer asyncConcurrency;

        public static GetVideoAnalysisConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAnalysisConfigResponseBodyData self = new GetVideoAnalysisConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVideoAnalysisConfigResponseBodyData setAsyncConcurrency(Integer asyncConcurrency) {
            this.asyncConcurrency = asyncConcurrency;
            return this;
        }
        public Integer getAsyncConcurrency() {
            return this.asyncConcurrency;
        }

    }

}
