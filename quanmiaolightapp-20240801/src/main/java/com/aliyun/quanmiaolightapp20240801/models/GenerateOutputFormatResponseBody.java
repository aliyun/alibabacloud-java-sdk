// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GenerateOutputFormatResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GenerateOutputFormatResponseBodyData data;

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
     * <p>117F5ABE-CF02-5502-9A3F-E56BC9081A64</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GenerateOutputFormatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateOutputFormatResponseBody self = new GenerateOutputFormatResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateOutputFormatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateOutputFormatResponseBody setData(GenerateOutputFormatResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateOutputFormatResponseBodyData getData() {
        return this.data;
    }

    public GenerateOutputFormatResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GenerateOutputFormatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateOutputFormatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateOutputFormatResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenerateOutputFormatResponseBodyData extends TeaModel {
        @NameInMap("outputFormat")
        public String outputFormat;

        public static GenerateOutputFormatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateOutputFormatResponseBodyData self = new GenerateOutputFormatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateOutputFormatResponseBodyData setOutputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        public String getOutputFormat() {
            return this.outputFormat;
        }

    }

}
