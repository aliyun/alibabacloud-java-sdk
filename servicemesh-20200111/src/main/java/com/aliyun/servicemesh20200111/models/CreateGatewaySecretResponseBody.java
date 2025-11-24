// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateGatewaySecretResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31d3a0f0-07ed-4f6e-9004-1804498c****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The record of creating the secret.</p>
     */
    @NameInMap("SecretCreateRecord")
    public java.util.Map<String, SecretCreateRecordValue> secretCreateRecord;

    public static CreateGatewaySecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewaySecretResponseBody self = new CreateGatewaySecretResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGatewaySecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGatewaySecretResponseBody setSecretCreateRecord(java.util.Map<String, SecretCreateRecordValue> secretCreateRecord) {
        this.secretCreateRecord = secretCreateRecord;
        return this;
    }
    public java.util.Map<String, SecretCreateRecordValue> getSecretCreateRecord() {
        return this.secretCreateRecord;
    }

}
