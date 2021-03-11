// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeStreamVodListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Records")
    public java.util.List<DescribeStreamVodListResponseBodyRecords> records;

    public static DescribeStreamVodListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamVodListResponseBody self = new DescribeStreamVodListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStreamVodListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStreamVodListResponseBody setRecords(java.util.List<DescribeStreamVodListResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribeStreamVodListResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class DescribeStreamVodListResponseBodyRecords extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

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
