// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceTDEResponseBody extends TeaModel {
    /**
     * <p>The data struct.</p>
     */
    @NameInMap("Data")
    public DescribeDBInstanceTDEResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceTDEResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceTDEResponseBody self = new DescribeDBInstanceTDEResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceTDEResponseBody setData(DescribeDBInstanceTDEResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDBInstanceTDEResponseBodyData getData() {
        return this.data;
    }

    public DescribeDBInstanceTDEResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceTDEResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether TDE is enabled. Valid values:</p>
         * <ul>
         * <li>0: TDE is disabled.</li>
         * <li>1: TDE is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
