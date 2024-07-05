// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodStorageDataResponseBody extends TeaModel {
    /**
     * <p>The time granularity at which the data was queried. Valid values:</p>
     * <ul>
     * <li><strong>hour</strong></li>
     * <li><strong>day</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>day</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C370DAF1-C838-4288-****-9A87633D248E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The storage usage data returned.</p>
     */
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
        /**
         * <p>The outbound traffic. Unit: bytes. The outbound traffic is generated when videos are directly downloaded or played from OSS buckets without Alibaba Cloud CDN acceleration.</p>
         * 
         * <strong>example:</strong>
         * <p>111111</p>
         */
        @NameInMap("NetworkOut")
        public String networkOut;

        /**
         * <p>The detailed usage data of storage-related resources. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>111111</p>
         */
        @NameInMap("StorageUtilization")
        public String storageUtilization;

        /**
         * <p>The timestamp of the returned data. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-01T15:00:00Z</p>
         */
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
