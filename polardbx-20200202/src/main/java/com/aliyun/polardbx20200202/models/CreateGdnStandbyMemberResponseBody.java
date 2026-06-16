// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateGdnStandbyMemberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pxc-hzravgpt8q****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>173CA69A-3513-591D-8A09-C1EA37CBE2D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateGdnStandbyMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGdnStandbyMemberResponseBody self = new CreateGdnStandbyMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGdnStandbyMemberResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateGdnStandbyMemberResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateGdnStandbyMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
