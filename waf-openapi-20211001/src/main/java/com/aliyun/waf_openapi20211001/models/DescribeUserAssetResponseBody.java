// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserAssetResponseBody extends TeaModel {
    /**
     * <p>The API statistics.</p>
     */
    @NameInMap("Assets")
    public java.util.List<DescribeUserAssetResponseBodyAssets> assets;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C1823E96-EF4B-5BD2-9E02-1D18****3ED8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserAssetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAssetResponseBody self = new DescribeUserAssetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserAssetResponseBody setAssets(java.util.List<DescribeUserAssetResponseBodyAssets> assets) {
        this.assets = assets;
        return this;
    }
    public java.util.List<DescribeUserAssetResponseBodyAssets> getAssets() {
        return this.assets;
    }

    public DescribeUserAssetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserAssetResponseBodyAssets extends TeaModel {
        /**
         * <p>The number of APIs returned.</p>
         * 
         * <strong>example:</strong>
         * <p>134</p>
         */
        @NameInMap("AssetNum")
        public Long assetNum;

        /**
         * <p>The time at which the API was called. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1723435200</p>
         */
        @NameInMap("TimeStamp")
        public Long timeStamp;

        public static DescribeUserAssetResponseBodyAssets build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserAssetResponseBodyAssets self = new DescribeUserAssetResponseBodyAssets();
            return TeaModel.build(map, self);
        }

        public DescribeUserAssetResponseBodyAssets setAssetNum(Long assetNum) {
            this.assetNum = assetNum;
            return this;
        }
        public Long getAssetNum() {
            return this.assetNum;
        }

        public DescribeUserAssetResponseBodyAssets setTimeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Long getTimeStamp() {
            return this.timeStamp;
        }

    }

}
