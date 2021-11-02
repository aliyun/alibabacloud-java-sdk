// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodStorageDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StorageData")
    public DescribeVodStorageDataResponseBodyStorageData storageData;

    public static DescribeVodStorageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodStorageDataResponseBody self = new DescribeVodStorageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodStorageDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeVodStorageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodStorageDataResponseBody setStorageData(DescribeVodStorageDataResponseBodyStorageData storageData) {
        this.storageData = storageData;
        return this;
    }
    public DescribeVodStorageDataResponseBodyStorageData getStorageData() {
        return this.storageData;
    }

    public static class DescribeVodStorageDataResponseBodyStorageDataStorageDataItem extends TeaModel {
        @NameInMap("NetworkOut")
        public String networkOut;

        @NameInMap("StorageUtilization")
        public String storageUtilization;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeVodStorageDataResponseBodyStorageDataStorageDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodStorageDataResponseBodyStorageDataStorageDataItem self = new DescribeVodStorageDataResponseBodyStorageDataStorageDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeVodStorageDataResponseBodyStorageDataStorageDataItem setNetworkOut(String networkOut) {
            this.networkOut = networkOut;
            return this;
        }
        public String getNetworkOut() {
            return this.networkOut;
        }

        public DescribeVodStorageDataResponseBodyStorageDataStorageDataItem setStorageUtilization(String storageUtilization) {
            this.storageUtilization = storageUtilization;
            return this;
        }
        public String getStorageUtilization() {
            return this.storageUtilization;
        }

        public DescribeVodStorageDataResponseBodyStorageDataStorageDataItem setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeVodStorageDataResponseBodyStorageData extends TeaModel {
        @NameInMap("StorageDataItem")
        public java.util.List<DescribeVodStorageDataResponseBodyStorageDataStorageDataItem> storageDataItem;

        public static DescribeVodStorageDataResponseBodyStorageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodStorageDataResponseBodyStorageData self = new DescribeVodStorageDataResponseBodyStorageData();
            return TeaModel.build(map, self);
        }

        public DescribeVodStorageDataResponseBodyStorageData setStorageDataItem(java.util.List<DescribeVodStorageDataResponseBodyStorageDataStorageDataItem> storageDataItem) {
            this.storageDataItem = storageDataItem;
            return this;
        }
        public java.util.List<DescribeVodStorageDataResponseBodyStorageDataStorageDataItem> getStorageDataItem() {
            return this.storageDataItem;
        }

    }

}
