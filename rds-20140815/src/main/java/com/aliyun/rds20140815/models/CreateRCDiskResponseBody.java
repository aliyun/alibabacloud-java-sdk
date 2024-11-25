// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateRCDiskResponseBody extends TeaModel {
    /**
     * <p>The disk ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rcd-2zegrjtnkp6dqbe1egca</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>100789370230206</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F2911788-25E8-42E5-A3A3-1B38D263F01E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRCDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRCDiskResponseBody self = new CreateRCDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRCDiskResponseBody setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public CreateRCDiskResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateRCDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
