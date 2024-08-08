// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class StopHpoExperimentResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>INVALID_INPUT_PARAMS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Extra error information.</p>
     */
    @NameInMap("Detail")
    public java.util.Map<String, String> detail;

    /**
     * <p>Experiment ID</p>
     * 
     * <strong>example:</strong>
     * <p>sHpITOH</p>
     */
    @NameInMap("ExpId")
    public String expId;

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
     * <p>071A904D-5A49-597F-9F69-81C7701D04AC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static StopHpoExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopHpoExperimentResponseBody self = new StopHpoExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public StopHpoExperimentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopHpoExperimentResponseBody setDetail(java.util.Map<String, String> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.Map<String, String> getDetail() {
        return this.detail;
    }

    public StopHpoExperimentResponseBody setExpId(String expId) {
        this.expId = expId;
        return this;
    }
    public String getExpId() {
        return this.expId;
    }

    public StopHpoExperimentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopHpoExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopHpoExperimentResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
