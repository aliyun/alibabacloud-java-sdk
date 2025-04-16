// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class ExportAnalysisTagDetailByTaskIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p><a href="http://www.example.com/xxxx.xlsx">http://www.example.com/xxxx.xlsx</a></p>
     */
    @NameInMap("data")
    public String data;

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

    public static ExportAnalysisTagDetailByTaskIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportAnalysisTagDetailByTaskIdResponseBody self = new ExportAnalysisTagDetailByTaskIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportAnalysisTagDetailByTaskIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExportAnalysisTagDetailByTaskIdResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ExportAnalysisTagDetailByTaskIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExportAnalysisTagDetailByTaskIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExportAnalysisTagDetailByTaskIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
