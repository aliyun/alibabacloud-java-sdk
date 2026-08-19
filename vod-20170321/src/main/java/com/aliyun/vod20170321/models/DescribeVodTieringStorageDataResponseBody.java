// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodTieringStorageDataResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4AF6-D7393642CA58****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The storage usage data.</p>
     */
    @NameInMap("StorageData")
    public java.util.List<DescribeVodTieringStorageDataResponseBodyStorageData> storageData;

    public static DescribeVodTieringStorageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodTieringStorageDataResponseBody self = new DescribeVodTieringStorageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodTieringStorageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodTieringStorageDataResponseBody setStorageData(java.util.List<DescribeVodTieringStorageDataResponseBodyStorageData> storageData) {
        this.storageData = storageData;
        return this;
    }
    public java.util.List<DescribeVodTieringStorageDataResponseBodyStorageData> getStorageData() {
        return this.storageData;
    }

    public static class DescribeVodTieringStorageDataResponseBodyStorageData extends TeaModel {
        /**
         * <p>The size of data stored for less than one month. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("LessthanMonthDatasize")
        public Long lessthanMonthDatasize;

        /**
         * <p>The storage region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The storage class.</p>
         * 
         * <strong>example:</strong>
         * <p>IA</p>
         */
        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <p>The storage usage. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("StorageUtilization")
        public Long storageUtilization;

        /**
         * <p>The start time of the time interval. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-29T01:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeVodTieringStorageDataResponseBodyStorageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodTieringStorageDataResponseBodyStorageData self = new DescribeVodTieringStorageDataResponseBodyStorageData();
            return TeaModel.build(map, self);
        }

        public DescribeVodTieringStorageDataResponseBodyStorageData setLessthanMonthDatasize(Long lessthanMonthDatasize) {
            this.lessthanMonthDatasize = lessthanMonthDatasize;
            return this;
        }
        public Long getLessthanMonthDatasize() {
            return this.lessthanMonthDatasize;
        }

        public DescribeVodTieringStorageDataResponseBodyStorageData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeVodTieringStorageDataResponseBodyStorageData setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public DescribeVodTieringStorageDataResponseBodyStorageData setStorageUtilization(Long storageUtilization) {
            this.storageUtilization = storageUtilization;
            return this;
        }
        public Long getStorageUtilization() {
            return this.storageUtilization;
        }

        public DescribeVodTieringStorageDataResponseBodyStorageData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

}
