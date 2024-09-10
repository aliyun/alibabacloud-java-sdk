// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCanTrySasResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CanTry")
    public Integer canTry;

    /**
     * <strong>example:</strong>
     * <p>E90DE229-9FC6-58F6-BF4B-03AD6179****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCanTrySasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCanTrySasResponseBody self = new DescribeCanTrySasResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCanTrySasResponseBody setCanTry(Integer canTry) {
        this.canTry = canTry;
        return this;
    }
    public Integer getCanTry() {
        return this.canTry;
    }

    public DescribeCanTrySasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
