// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecAssetTrendResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeApisecAssetTrendResponseBodyData> data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19****5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApisecAssetTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecAssetTrendResponseBody self = new DescribeApisecAssetTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisecAssetTrendResponseBody setData(java.util.List<DescribeApisecAssetTrendResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeApisecAssetTrendResponseBodyData> getData() {
        return this.data;
    }

    public DescribeApisecAssetTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeApisecAssetTrendResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("AssetActive")
        public Long assetActive;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("AssetCount")
        public Long assetCount;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("AssetOffline")
        public Long assetOffline;

        /**
         * <strong>example:</strong>
         * <p>1683600042</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeApisecAssetTrendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisecAssetTrendResponseBodyData self = new DescribeApisecAssetTrendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApisecAssetTrendResponseBodyData setAssetActive(Long assetActive) {
            this.assetActive = assetActive;
            return this;
        }
        public Long getAssetActive() {
            return this.assetActive;
        }

        public DescribeApisecAssetTrendResponseBodyData setAssetCount(Long assetCount) {
            this.assetCount = assetCount;
            return this;
        }
        public Long getAssetCount() {
            return this.assetCount;
        }

        public DescribeApisecAssetTrendResponseBodyData setAssetOffline(Long assetOffline) {
            this.assetOffline = assetOffline;
            return this;
        }
        public Long getAssetOffline() {
            return this.assetOffline;
        }

        public DescribeApisecAssetTrendResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
