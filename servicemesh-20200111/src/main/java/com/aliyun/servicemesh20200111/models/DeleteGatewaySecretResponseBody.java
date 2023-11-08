// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteGatewaySecretResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The records of deleting the secret in all clusters.</p>
     */
    @NameInMap("SecretDeleteRecord")
    public java.util.Map<String, SecretDeleteRecordValue> secretDeleteRecord;

    public static DeleteGatewaySecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewaySecretResponseBody self = new DeleteGatewaySecretResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGatewaySecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteGatewaySecretResponseBody setSecretDeleteRecord(java.util.Map<String, SecretDeleteRecordValue> secretDeleteRecord) {
        this.secretDeleteRecord = secretDeleteRecord;
        return this;
    }
    public java.util.Map<String, SecretDeleteRecordValue> getSecretDeleteRecord() {
        return this.secretDeleteRecord;
    }

}
