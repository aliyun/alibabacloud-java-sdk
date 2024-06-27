// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeGroupStatisticsByTodayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public Boolean data;

    public static DescribeGroupStatisticsByTodayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupStatisticsByTodayResponseBody self = new DescribeGroupStatisticsByTodayResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupStatisticsByTodayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGroupStatisticsByTodayResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
