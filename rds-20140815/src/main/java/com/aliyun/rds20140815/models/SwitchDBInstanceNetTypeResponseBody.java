// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceNetTypeResponseBody extends TeaModel {
    /**
     * <p>The endpoint that is used to connect to the instance after the switch of endpoints.</p>
     * 
     * <strong>example:</strong>
     * <p>new**********.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("NewConnectionString")
    public String newConnectionString;

    /**
     * <p>The endpoint that is used to connect to the instance before the switch of endpoints.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1**************.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("OldConnectionString")
    public String oldConnectionString;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>65BDA532-28AF-4122-AA39-B382721EEE64</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public SwitchDBInstanceNetTypeResponseBody setOldConnectionString(String oldConnectionString) {
        this.oldConnectionString = oldConnectionString;
        return this;
    }
    public String getOldConnectionString() {
        return this.oldConnectionString;
    }

    public SwitchDBInstanceNetTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
