// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribePvtzStatisticsHistoryResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribePvtzStatisticsHistoryResponseBodyData> data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>46973D4C-E3E4-4ABA-9190-9A9DE406C7E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePvtzStatisticsHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePvtzStatisticsHistoryResponseBody self = new DescribePvtzStatisticsHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePvtzStatisticsHistoryResponseBody setData(java.util.List<DescribePvtzStatisticsHistoryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribePvtzStatisticsHistoryResponseBodyData> getData() {
        return this.data;
    }

    public DescribePvtzStatisticsHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePvtzStatisticsHistoryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>29</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>wget At8P8tza.popscan.xaliyun.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("FailCount")
        public Long failCount;

        /**
         * <strong>example:</strong>
         * <p>UDP、TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("Qtype")
        public String qtype;

        /**
         * <strong>example:</strong>
         * <p>95</p>
         */
        @NameInMap("Ratio")
        public Long ratio;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SuccessCount")
        public Long successCount;

        /**
         * <strong>example:</strong>
         * <p>1687190400000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <strong>example:</strong>
         * <p>cn-zhangjiakou-share.log.aliyuncs.com</p>
         */
        @NameInMap("ZoneName")
        public String zoneName;

        public static DescribePvtzStatisticsHistoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePvtzStatisticsHistoryResponseBodyData self = new DescribePvtzStatisticsHistoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePvtzStatisticsHistoryResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribePvtzStatisticsHistoryResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribePvtzStatisticsHistoryResponseBodyData setFailCount(Long failCount) {
            this.failCount = failCount;
            return this;
        }
        public Long getFailCount() {
            return this.failCount;
        }

        public DescribePvtzStatisticsHistoryResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribePvtzStatisticsHistoryResponseBodyData setQtype(String qtype) {
            this.qtype = qtype;
            return this;
        }
        public String getQtype() {
            return this.qtype;
        }

        public DescribePvtzStatisticsHistoryResponseBodyData setRatio(Long ratio) {
            this.ratio = ratio;
            return this;
        }
        public Long getRatio() {
            return this.ratio;
        }

        public DescribePvtzStatisticsHistoryResponseBodyData setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

        public DescribePvtzStatisticsHistoryResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribePvtzStatisticsHistoryResponseBodyData setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

}
