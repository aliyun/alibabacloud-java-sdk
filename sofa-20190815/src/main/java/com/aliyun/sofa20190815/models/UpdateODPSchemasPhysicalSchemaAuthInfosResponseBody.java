// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateODPSchemasPhysicalSchemaAuthInfosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static UpdateODPSchemasPhysicalSchemaAuthInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateODPSchemasPhysicalSchemaAuthInfosResponseBody self = new UpdateODPSchemasPhysicalSchemaAuthInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateODPSchemasPhysicalSchemaAuthInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateODPSchemasPhysicalSchemaAuthInfosResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateODPSchemasPhysicalSchemaAuthInfosResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

}
