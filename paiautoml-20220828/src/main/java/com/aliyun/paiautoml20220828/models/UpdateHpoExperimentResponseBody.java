// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class UpdateHpoExperimentResponseBody extends TeaModel {
    /**
     * <p>Error code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Extra error information.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Detail")
    public java.util.Map<String, ?> detail;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Missing \&quot;user_id\&quot; in request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3F190916-B3E5-5D1E-AD0C-35C0DF105F51</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateHpoExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHpoExperimentResponseBody self = new UpdateHpoExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHpoExperimentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateHpoExperimentResponseBody setDetail(java.util.Map<String, ?> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.Map<String, ?> getDetail() {
        return this.detail;
    }

    public UpdateHpoExperimentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateHpoExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
