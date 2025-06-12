// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DecodeDiagnosticMessageRequest extends TeaModel {
    /**
     * <p>The encoded diagnostic information in the response that contains an access denied error. The error is caused by no RAM permissions.</p>
     * 
     * <strong>example:</strong>
     * <p>AQEAAAAAZBgxr0U1MjA1NTM1LUM4BBktMzE5RS1CODgxLUU1QTI0RDNFQTM1****</p>
     */
    @NameInMap("EncodedDiagnosticMessage")
    public String encodedDiagnosticMessage;

    public static DecodeDiagnosticMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        DecodeDiagnosticMessageRequest self = new DecodeDiagnosticMessageRequest();
        return TeaModel.build(map, self);
    }

    public DecodeDiagnosticMessageRequest setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
        this.encodedDiagnosticMessage = encodedDiagnosticMessage;
        return this;
    }
    public String getEncodedDiagnosticMessage() {
        return this.encodedDiagnosticMessage;
    }

}
