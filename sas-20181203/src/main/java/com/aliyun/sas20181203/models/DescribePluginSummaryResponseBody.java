// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePluginSummaryResponseBody extends TeaModel {
    /**
     * <p>The details of the plug-in data.</p>
     */
    @NameInMap("Data")
    public DescribePluginSummaryResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1383B0DB-D5D6-4B0C-9E6B-75939C8E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePluginSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginSummaryResponseBody self = new DescribePluginSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePluginSummaryResponseBody setData(DescribePluginSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePluginSummaryResponseBodyData getData() {
        return this.data;
    }

    public DescribePluginSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePluginSummaryResponseBodyDataFailedReasons extends TeaModel {
        /**
         * <p>The error code for the installation failure.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The number of hosts on which the installation failed for this reason.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The cause of the installation failure.</p>
         * 
         * <strong>example:</strong>
         * <p>Other</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static DescribePluginSummaryResponseBodyDataFailedReasons build(java.util.Map<String, ?> map) throws Exception {
            DescribePluginSummaryResponseBodyDataFailedReasons self = new DescribePluginSummaryResponseBodyDataFailedReasons();
            return TeaModel.build(map, self);
        }

        public DescribePluginSummaryResponseBodyDataFailedReasons setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribePluginSummaryResponseBodyDataFailedReasons setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePluginSummaryResponseBodyDataFailedReasons setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class DescribePluginSummaryResponseBodyData extends TeaModel {
        /**
         * <p>The number of hosts on which the plug-in failed to be installed.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("FailedCnt")
        public Integer failedCnt;

        /**
         * <p>The causes of installation failures.</p>
         */
        @NameInMap("FailedReasons")
        public java.util.List<DescribePluginSummaryResponseBodyDataFailedReasons> failedReasons;

        /**
         * <p>The number of hosts on which the plug-in is offline.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("OfflineCnt")
        public Integer offlineCnt;

        /**
         * <p>The number of hosts on which the plug-in is online.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OnlineCnt")
        public Integer onlineCnt;

        /**
         * <p>The number of hosts for which the plug-in is not enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SwitchOffCnt")
        public Integer switchOffCnt;

        /**
         * <p>The total number of hosts.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalCnt")
        public Integer totalCnt;

        public static DescribePluginSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePluginSummaryResponseBodyData self = new DescribePluginSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePluginSummaryResponseBodyData setFailedCnt(Integer failedCnt) {
            this.failedCnt = failedCnt;
            return this;
        }
        public Integer getFailedCnt() {
            return this.failedCnt;
        }

        public DescribePluginSummaryResponseBodyData setFailedReasons(java.util.List<DescribePluginSummaryResponseBodyDataFailedReasons> failedReasons) {
            this.failedReasons = failedReasons;
            return this;
        }
        public java.util.List<DescribePluginSummaryResponseBodyDataFailedReasons> getFailedReasons() {
            return this.failedReasons;
        }

        public DescribePluginSummaryResponseBodyData setOfflineCnt(Integer offlineCnt) {
            this.offlineCnt = offlineCnt;
            return this;
        }
        public Integer getOfflineCnt() {
            return this.offlineCnt;
        }

        public DescribePluginSummaryResponseBodyData setOnlineCnt(Integer onlineCnt) {
            this.onlineCnt = onlineCnt;
            return this;
        }
        public Integer getOnlineCnt() {
            return this.onlineCnt;
        }

        public DescribePluginSummaryResponseBodyData setSwitchOffCnt(Integer switchOffCnt) {
            this.switchOffCnt = switchOffCnt;
            return this;
        }
        public Integer getSwitchOffCnt() {
            return this.switchOffCnt;
        }

        public DescribePluginSummaryResponseBodyData setTotalCnt(Integer totalCnt) {
            this.totalCnt = totalCnt;
            return this;
        }
        public Integer getTotalCnt() {
            return this.totalCnt;
        }

    }

}
