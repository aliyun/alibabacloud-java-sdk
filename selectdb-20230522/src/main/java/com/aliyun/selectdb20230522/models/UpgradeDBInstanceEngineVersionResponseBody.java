// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceEngineVersionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeDBInstanceEngineVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceEngineVersionResponseBody self = new UpgradeDBInstanceEngineVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceEngineVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpgradeDBInstanceEngineVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpgradeDBInstanceEngineVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
