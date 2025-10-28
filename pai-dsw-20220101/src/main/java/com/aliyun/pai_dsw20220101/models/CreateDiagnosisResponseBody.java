// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class CreateDiagnosisResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Resource.InsufficientResource</p>
     */
    @NameInMap("ReasonCode")
    public String reasonCode;

    /**
     * <strong>example:</strong>
     * <p>Insufficient resource</p>
     */
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    /**
     * <strong>example:</strong>
     * <p>Switch resource config</p>
     */
    @NameInMap("SolutionMessage")
    public String solutionMessage;

    public static CreateDiagnosisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosisResponseBody self = new CreateDiagnosisResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDiagnosisResponseBody setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public CreateDiagnosisResponseBody setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    public CreateDiagnosisResponseBody setSolutionMessage(String solutionMessage) {
        this.solutionMessage = solutionMessage;
        return this;
    }
    public String getSolutionMessage() {
        return this.solutionMessage;
    }

}
