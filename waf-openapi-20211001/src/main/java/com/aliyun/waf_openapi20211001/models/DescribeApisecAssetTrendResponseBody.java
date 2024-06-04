// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecAssetTrendResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeApisecAssetTrendResponseBodyData> data;

    /**
     * <p>Id of the request</p>
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
        @NameInMap("AssetActive")
        public Long assetActive;

        @NameInMap("AssetCount")
        public Long assetCount;

        @NameInMap("AssetOffline")
        public Long assetOffline;

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
