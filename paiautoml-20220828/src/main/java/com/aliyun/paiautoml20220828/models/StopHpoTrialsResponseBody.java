// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class StopHpoTrialsResponseBody extends TeaModel {
    /**
     * <p>Error code.</p>
     * 
     * <strong>example:</strong>
     * <p>INVALID_USER_OR_EXP</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Extra error information.</p>
     */
    @NameInMap("Detail")
    public java.util.Map<String, String> detail;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>failed to stop any trial</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>071A904D-5A49-597F-9F69-81C7701D04AC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The results of trial stop.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     \&quot;xrYq99\&quot;:\&quot;successfully stopped trial,\&quot;,
     *     \&quot;xrYq9N\&quot;:\&quot;failed to stop trial,\&quot;
     * }</p>
     */
    @NameInMap("Results")
    public java.util.Map<String, ?> results;

    public static StopHpoTrialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopHpoTrialsResponseBody self = new StopHpoTrialsResponseBody();
        return TeaModel.build(map, self);
    }

    public StopHpoTrialsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopHpoTrialsResponseBody setDetail(java.util.Map<String, String> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.Map<String, String> getDetail() {
        return this.detail;
    }

    public StopHpoTrialsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopHpoTrialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopHpoTrialsResponseBody setResults(java.util.Map<String, ?> results) {
        this.results = results;
        return this;
    }
    public java.util.Map<String, ?> getResults() {
        return this.results;
    }

}
