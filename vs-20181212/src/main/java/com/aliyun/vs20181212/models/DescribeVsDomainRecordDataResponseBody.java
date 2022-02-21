// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainRecordDataResponseBody extends TeaModel {
    @NameInMap("RecordDataPerInterval")
    public DescribeVsDomainRecordDataResponseBodyRecordDataPerInterval recordDataPerInterval;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVsDomainRecordDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainRecordDataResponseBody self = new DescribeVsDomainRecordDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainRecordDataResponseBody setRecordDataPerInterval(DescribeVsDomainRecordDataResponseBodyRecordDataPerInterval recordDataPerInterval) {
        this.recordDataPerInterval = recordDataPerInterval;
        return this;
    }
    public DescribeVsDomainRecordDataResponseBodyRecordDataPerInterval getRecordDataPerInterval() {
        return this.recordDataPerInterval;
    }

    public DescribeVsDomainRecordDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVsDomainRecordDataResponseBodyRecordDataPerIntervalDataModule extends TeaModel {
        @NameInMap("RecordValue")
        public String recordValue;

        @NameInMap("StreamCountValue")
        public String streamCountValue;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeVsDomainRecordDataResponseBodyRecordDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainRecordDataResponseBodyRecordDataPerIntervalDataModule self = new DescribeVsDomainRecordDataResponseBodyRecordDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainRecordDataResponseBodyRecordDataPerIntervalDataModule setRecordValue(String recordValue) {
            this.recordValue = recordValue;
            return this;
        }
        public String getRecordValue() {
            return this.recordValue;
        }

        public DescribeVsDomainRecordDataResponseBodyRecordDataPerIntervalDataModule setStreamCountValue(String streamCountValue) {
            this.streamCountValue = streamCountValue;
            return this;
        }
        public String getStreamCountValue() {
            return this.streamCountValue;
        }

        public DescribeVsDomainRecordDataResponseBodyRecordDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeVsDomainRecordDataResponseBodyRecordDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeVsDomainRecordDataResponseBodyRecordDataPerIntervalDataModule> dataModule;

        public static DescribeVsDomainRecordDataResponseBodyRecordDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainRecordDataResponseBodyRecordDataPerInterval self = new DescribeVsDomainRecordDataResponseBodyRecordDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainRecordDataResponseBodyRecordDataPerInterval setDataModule(java.util.List<DescribeVsDomainRecordDataResponseBodyRecordDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeVsDomainRecordDataResponseBodyRecordDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
