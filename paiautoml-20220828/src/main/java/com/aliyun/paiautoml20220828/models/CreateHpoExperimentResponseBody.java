// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class CreateHpoExperimentResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>INVALID_INPUT_PARAMS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Detailed information of the failure.</p>
     */
    @NameInMap("Detail")
    public java.util.Map<String, String> detail;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>sORVEck</p>
     */
    @NameInMap("ExperimentId")
    public String experimentId;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Missing \&quot;user_id\&quot; in request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3F190916-B3E5-5D1E-AD0C-35C0DF105F51</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateHpoExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHpoExperimentResponseBody self = new CreateHpoExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHpoExperimentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateHpoExperimentResponseBody setDetail(java.util.Map<String, String> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.Map<String, String> getDetail() {
        return this.detail;
    }

    public CreateHpoExperimentResponseBody setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public CreateHpoExperimentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateHpoExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
