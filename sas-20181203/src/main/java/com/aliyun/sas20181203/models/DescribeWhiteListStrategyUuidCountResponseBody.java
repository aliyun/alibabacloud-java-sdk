// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWhiteListStrategyUuidCountResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of the servers on which the application whitelist policy takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("UuidCount")
    public Integer uuidCount;

    public static DescribeWhiteListStrategyUuidCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteListStrategyUuidCountResponseBody self = new DescribeWhiteListStrategyUuidCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteListStrategyUuidCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWhiteListStrategyUuidCountResponseBody setUuidCount(Integer uuidCount) {
        this.uuidCount = uuidCount;
        return this;
    }
    public Integer getUuidCount() {
        return this.uuidCount;
    }

}
