// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyConsumerGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cg-xxxxxx</p>
     */
    @NameInMap("ConsumerGroupId")
    public String consumerGroupId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A7E6A8FD-C50B-46B2-BA85-D8B8D3******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyConsumerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyConsumerGroupResponseBody self = new ModifyConsumerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyConsumerGroupResponseBody setConsumerGroupId(String consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
        return this;
    }
    public String getConsumerGroupId() {
        return this.consumerGroupId;
    }

    public ModifyConsumerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
