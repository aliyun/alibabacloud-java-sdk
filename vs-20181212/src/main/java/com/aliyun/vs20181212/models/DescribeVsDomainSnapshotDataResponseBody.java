// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainSnapshotDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SnapshotDataPerInterval")
    public DescribeVsDomainSnapshotDataResponseBodySnapshotDataPerInterval snapshotDataPerInterval;

    public static DescribeVsDomainSnapshotDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainSnapshotDataResponseBody self = new DescribeVsDomainSnapshotDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainSnapshotDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVsDomainSnapshotDataResponseBody setSnapshotDataPerInterval(DescribeVsDomainSnapshotDataResponseBodySnapshotDataPerInterval snapshotDataPerInterval) {
        this.snapshotDataPerInterval = snapshotDataPerInterval;
        return this;
    }
    public DescribeVsDomainSnapshotDataResponseBodySnapshotDataPerInterval getSnapshotDataPerInterval() {
        return this.snapshotDataPerInterval;
    }

    public static class DescribeVsDomainSnapshotDataResponseBodySnapshotDataPerIntervalDataModule extends TeaModel {
        @NameInMap("SnapshotValue")
        public String snapshotValue;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeVsDomainSnapshotDataResponseBodySnapshotDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainSnapshotDataResponseBodySnapshotDataPerIntervalDataModule self = new DescribeVsDomainSnapshotDataResponseBodySnapshotDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainSnapshotDataResponseBodySnapshotDataPerIntervalDataModule setSnapshotValue(String snapshotValue) {
            this.snapshotValue = snapshotValue;
            return this;
        }
        public String getSnapshotValue() {
            return this.snapshotValue;
        }

        public DescribeVsDomainSnapshotDataResponseBodySnapshotDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeVsDomainSnapshotDataResponseBodySnapshotDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeVsDomainSnapshotDataResponseBodySnapshotDataPerIntervalDataModule> dataModule;

        public static DescribeVsDomainSnapshotDataResponseBodySnapshotDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainSnapshotDataResponseBodySnapshotDataPerInterval self = new DescribeVsDomainSnapshotDataResponseBodySnapshotDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainSnapshotDataResponseBodySnapshotDataPerInterval setDataModule(java.util.List<DescribeVsDomainSnapshotDataResponseBodySnapshotDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeVsDomainSnapshotDataResponseBodySnapshotDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
