// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodTieringStorageRetrievalDataResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A13-BEF6-D73936****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The retrieval data.</p>
     */
    @NameInMap("RetrievalData")
    public java.util.List<DescribeVodTieringStorageRetrievalDataResponseBodyRetrievalData> retrievalData;

    public static DescribeVodTieringStorageRetrievalDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodTieringStorageRetrievalDataResponseBody self = new DescribeVodTieringStorageRetrievalDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodTieringStorageRetrievalDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodTieringStorageRetrievalDataResponseBody setRetrievalData(java.util.List<DescribeVodTieringStorageRetrievalDataResponseBodyRetrievalData> retrievalData) {
        this.retrievalData = retrievalData;
        return this;
    }
    public java.util.List<DescribeVodTieringStorageRetrievalDataResponseBodyRetrievalData> getRetrievalData() {
        return this.retrievalData;
    }

    public static class DescribeVodTieringStorageRetrievalDataResponseBodyRetrievalData extends TeaModel {
        /**
         * <p>The Cold Archive bulk retrieval data.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CABulkRetrievalData")
        public Long CABulkRetrievalData;

        /**
         * <p>The Cold Archive high-priority retrieval data.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CAHighPriorRetrievalData")
        public Long CAHighPriorRetrievalData;

        /**
         * <p>The Cold Archive standard retrieval data.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CAStdRetrievalData")
        public Long CAStdRetrievalData;

        /**
         * <p>The storage region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The retrieval data.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("RetrievalData")
        public Long retrievalData;

        /**
         * <p>The media asset storage class.</p>
         * 
         * <strong>example:</strong>
         * <p>IA</p>
         */
        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <p>The start time of the time interval. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-02T10:20:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeVodTieringStorageRetrievalDataResponseBodyRetrievalData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodTieringStorageRetrievalDataResponseBodyRetrievalData self = new DescribeVodTieringStorageRetrievalDataResponseBodyRetrievalData();
            return TeaModel.build(map, self);
        }

        public DescribeVodTieringStorageRetrievalDataResponseBodyRetrievalData setCABulkRetrievalData(Long CABulkRetrievalData) {
            this.CABulkRetrievalData = CABulkRetrievalData;
            return this;
        }
        public Long getCABulkRetrievalData() {
            return this.CABulkRetrievalData;
        }

        public DescribeVodTieringStorageRetrievalDataResponseBodyRetrievalData setCAHighPriorRetrievalData(Long CAHighPriorRetrievalData) {
            this.CAHighPriorRetrievalData = CAHighPriorRetrievalData;
            return this;
        }
        public Long getCAHighPriorRetrievalData() {
            return this.CAHighPriorRetrievalData;
        }

        public DescribeVodTieringStorageRetrievalDataResponseBodyRetrievalData setCAStdRetrievalData(Long CAStdRetrievalData) {
            this.CAStdRetrievalData = CAStdRetrievalData;
            return this;
        }
        public Long getCAStdRetrievalData() {
            return this.CAStdRetrievalData;
        }

        public DescribeVodTieringStorageRetrievalDataResponseBodyRetrievalData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeVodTieringStorageRetrievalDataResponseBodyRetrievalData setRetrievalData(Long retrievalData) {
            this.retrievalData = retrievalData;
            return this;
        }
        public Long getRetrievalData() {
            return this.retrievalData;
        }

        public DescribeVodTieringStorageRetrievalDataResponseBodyRetrievalData setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public DescribeVodTieringStorageRetrievalDataResponseBodyRetrievalData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

}
