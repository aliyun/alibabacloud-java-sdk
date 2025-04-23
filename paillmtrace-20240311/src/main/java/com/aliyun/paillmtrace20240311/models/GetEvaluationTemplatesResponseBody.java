// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class GetEvaluationTemplatesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ExecutionFailure</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("EvaluationTemplates")
    public java.util.List<?> evaluationTemplates;

    /**
     * <strong>example:</strong>
     * <p>cannot get data back.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6A87228C-969A-1381-98CF-AE07AE630FA5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetEvaluationTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEvaluationTemplatesResponseBody self = new GetEvaluationTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEvaluationTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEvaluationTemplatesResponseBody setEvaluationTemplates(java.util.List<?> evaluationTemplates) {
        this.evaluationTemplates = evaluationTemplates;
        return this;
    }
    public java.util.List<?> getEvaluationTemplates() {
        return this.evaluationTemplates;
    }

    public GetEvaluationTemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEvaluationTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
