// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class GetRagEvaluatorTaskResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>not found</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;xx not found&quot;</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1CC93E65-6734-5060-BEF7-0EB0A4862BCF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The response result.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;odps_task_id&quot;: 224525243,<br>  &quot;usage&quot; : {
     *     &quot;cu&quot; : 0.000
     *   }</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static GetRagEvaluatorTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRagEvaluatorTaskResponseBody self = new GetRagEvaluatorTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRagEvaluatorTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRagEvaluatorTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRagEvaluatorTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRagEvaluatorTaskResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
