// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DecodeDiagnosticMessageRequest extends TeaModel {
    /**
     * <p>The encoded diagnostic message obtained from the <code>AccessDeniedDetail.EncodedDiagnosticMessage</code> field in the response body when an API request is denied due to insufficient permissions. Pass this parameter to decode the permission diagnostic information when calling this operation.</p>
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
