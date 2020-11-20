// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateConnectionToOtherZoneResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    public static MigrateConnectionToOtherZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateConnectionToOtherZoneResponse self = new MigrateConnectionToOtherZoneResponse();
        return TeaModel.build(map, self);
    }

    public MigrateConnectionToOtherZoneResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MigrateConnectionToOtherZoneResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MigrateConnectionToOtherZoneResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
