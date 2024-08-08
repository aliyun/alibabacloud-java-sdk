// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class CreateAutofeExperimentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>INVALID_INPUT_PARAMS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Detail")
    public java.util.Map<String, ?> detail;

    /**
     * <strong>example:</strong>
     * <p>t8cNdMO</p>
     */
    @NameInMap("ExperimentId")
    public String experimentId;

    /**
     * <strong>example:</strong>
     * <p>Missing \&quot;user_id\&quot; in request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>22A1EC4E-15A2-51FF-BFA3-10D6735BAA69</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAutofeExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAutofeExperimentResponseBody self = new CreateAutofeExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAutofeExperimentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAutofeExperimentResponseBody setDetail(java.util.Map<String, ?> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.Map<String, ?> getDetail() {
        return this.detail;
    }

    public CreateAutofeExperimentResponseBody setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public CreateAutofeExperimentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAutofeExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
