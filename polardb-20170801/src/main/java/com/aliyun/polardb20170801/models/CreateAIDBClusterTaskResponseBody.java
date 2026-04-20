// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAIDBClusterTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pm-2zo88***</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>2035638*******</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CED079B7-A408-41A1-BFF1-EC608E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAIDBClusterTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAIDBClusterTaskResponseBody self = new CreateAIDBClusterTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAIDBClusterTaskResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateAIDBClusterTaskResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateAIDBClusterTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
