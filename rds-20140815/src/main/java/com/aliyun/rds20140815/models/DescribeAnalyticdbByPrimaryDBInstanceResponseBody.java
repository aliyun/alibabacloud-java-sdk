// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAnalyticdbByPrimaryDBInstanceResponseBody extends TeaModel {
    /**
     * <p>The number of associated analytic instances.</p>
     */
    @NameInMap("AnalyticDBCount")
    public Integer analyticDBCount;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAnalyticdbByPrimaryDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnalyticdbByPrimaryDBInstanceResponseBody self = new DescribeAnalyticdbByPrimaryDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAnalyticdbByPrimaryDBInstanceResponseBody setAnalyticDBCount(Integer analyticDBCount) {
        this.analyticDBCount = analyticDBCount;
        return this;
    }
    public Integer getAnalyticDBCount() {
        return this.analyticDBCount;
    }

    public DescribeAnalyticdbByPrimaryDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
