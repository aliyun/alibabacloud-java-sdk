// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RestoreDdrTableResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5*****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>75BBF1EF-1E90-4950-BFFB-252D26E8259B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RestoreDdrTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestoreDdrTableResponseBody self = new RestoreDdrTableResponseBody();
        return TeaModel.build(map, self);
    }

    public RestoreDdrTableResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public RestoreDdrTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
