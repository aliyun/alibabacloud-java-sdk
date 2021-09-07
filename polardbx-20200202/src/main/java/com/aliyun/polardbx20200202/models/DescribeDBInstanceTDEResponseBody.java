// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceTDEResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DescribeDBInstanceTDEResponseBodyData data;

    public static DescribeDBInstanceTDEResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceTDEResponseBody self = new DescribeDBInstanceTDEResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceTDEResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceTDEResponseBody setData(DescribeDBInstanceTDEResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDBInstanceTDEResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeDBInstanceTDEResponseBodyData extends TeaModel {
        @NameInMap("TDEStatus")
        public String TDEStatus;

        public static DescribeDBInstanceTDEResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceTDEResponseBodyData self = new DescribeDBInstanceTDEResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceTDEResponseBodyData setTDEStatus(String TDEStatus) {
            this.TDEStatus = TDEStatus;
            return this;
        }
        public String getTDEStatus() {
            return this.TDEStatus;
        }

    }

}
