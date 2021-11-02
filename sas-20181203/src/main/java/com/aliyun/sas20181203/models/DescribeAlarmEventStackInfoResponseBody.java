// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAlarmEventStackInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StackInfo")
    public String stackInfo;

    public static DescribeAlarmEventStackInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmEventStackInfoResponseBody self = new DescribeAlarmEventStackInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmEventStackInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlarmEventStackInfoResponseBody setStackInfo(String stackInfo) {
        this.stackInfo = stackInfo;
        return this;
    }
    public String getStackInfo() {
        return this.stackInfo;
    }

}
