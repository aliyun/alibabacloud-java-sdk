// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceNetTypeResponseBody extends TeaModel {
    @NameInMap("NewConnectionString")
    public String newConnectionString;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OldConnectionString")
    public String oldConnectionString;

    public static SwitchDBInstanceNetTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchDBInstanceNetTypeResponseBody self = new SwitchDBInstanceNetTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchDBInstanceNetTypeResponseBody setNewConnectionString(String newConnectionString) {
        this.newConnectionString = newConnectionString;
        return this;
    }
    public String getNewConnectionString() {
        return this.newConnectionString;
    }

    public SwitchDBInstanceNetTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SwitchDBInstanceNetTypeResponseBody setOldConnectionString(String oldConnectionString) {
        this.oldConnectionString = oldConnectionString;
        return this;
    }
    public String getOldConnectionString() {
        return this.oldConnectionString;
    }

}
