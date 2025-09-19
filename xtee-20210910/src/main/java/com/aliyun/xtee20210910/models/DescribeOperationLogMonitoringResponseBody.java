// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOperationLogMonitoringResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned object.</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeOperationLogMonitoringResponseBodyResultObject> resultObject;

    public static DescribeOperationLogMonitoringResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperationLogMonitoringResponseBody self = new DescribeOperationLogMonitoringResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOperationLogMonitoringResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOperationLogMonitoringResponseBody setResultObject(java.util.List<DescribeOperationLogMonitoringResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeOperationLogMonitoringResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeOperationLogMonitoringResponseBodyResultObject extends TeaModel {
        /**
         * <p>Time axis slice.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-19</p>
         */
        @NameInMap("dateGrouped")
        public String dateGrouped;

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("totalCount")
        public String totalCount;

        public static DescribeOperationLogMonitoringResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeOperationLogMonitoringResponseBodyResultObject self = new DescribeOperationLogMonitoringResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeOperationLogMonitoringResponseBodyResultObject setDateGrouped(String dateGrouped) {
            this.dateGrouped = dateGrouped;
            return this;
        }
        public String getDateGrouped() {
            return this.dateGrouped;
        }

        public DescribeOperationLogMonitoringResponseBodyResultObject setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
