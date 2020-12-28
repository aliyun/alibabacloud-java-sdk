// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateConnectionToOtherZoneResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static MigrateConnectionToOtherZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MigrateConnectionToOtherZoneResponseBody self = new MigrateConnectionToOtherZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public MigrateConnectionToOtherZoneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MigrateConnectionToOtherZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MigrateConnectionToOtherZoneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
