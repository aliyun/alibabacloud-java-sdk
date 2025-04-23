// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class EvaluateTraceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InvalidInputParams</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>6000043e103011f0922edec44617e03c</p>
     */
    @NameInMap("EvaluationId")
    public String evaluationId;

    /**
     * <strong>example:</strong>
     * <p>eval_request missing dataset id or times</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F1AB295E-0D1F-5ECE-9FFA-98ABB4CB5DF5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EvaluateTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EvaluateTraceResponseBody self = new EvaluateTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public EvaluateTraceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EvaluateTraceResponseBody setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
        return this;
    }
    public String getEvaluationId() {
        return this.evaluationId;
    }

    public EvaluateTraceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EvaluateTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
