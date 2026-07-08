// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeStreamVodListResponseBody extends TeaModel {
    /**
     * <p>VOD record list</p>
     */
    @NameInMap("Records")
    public java.util.List<DescribeStreamVodListResponseBodyRecords> records;

    /**
     * <p>Request ID of this task.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeStreamVodListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamVodListResponseBody self = new DescribeStreamVodListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStreamVodListResponseBody setRecords(java.util.List<DescribeStreamVodListResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribeStreamVodListResponseBodyRecords> getRecords() {
        return this.records;
    }

    public DescribeStreamVodListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeStreamVodListResponseBodyRecords extends TeaModel {
        /**
         * <p>VOD record end time (unix timestamp, unit: seconds)</p>
         * 
         * <strong>example:</strong>
         * <p>1634873413</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>VOD record start time (unix timestamp, unit: seconds)</p>
         * 
         * <strong>example:</strong>
         * <p>1639077653</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static DescribeStreamVodListResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeStreamVodListResponseBodyRecords self = new DescribeStreamVodListResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribeStreamVodListResponseBodyRecords setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeStreamVodListResponseBodyRecords setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
