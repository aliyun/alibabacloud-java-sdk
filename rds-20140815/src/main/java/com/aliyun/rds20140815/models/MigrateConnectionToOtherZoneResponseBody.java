// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateConnectionToOtherZoneResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MigrateConnectionToOtherZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MigrateConnectionToOtherZoneResponseBody self = new MigrateConnectionToOtherZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public MigrateConnectionToOtherZoneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

}
