// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeFreeUserAssetCountResponseBody extends TeaModel {
    /**
     * <p>The asset statistics provided by basic detection.</p>
     */
    @NameInMap("Asset")
    public DescribeFreeUserAssetCountResponseBodyAsset asset;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30488BF0-FD58-52DD-B396-D014549F43A3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFreeUserAssetCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFreeUserAssetCountResponseBody self = new DescribeFreeUserAssetCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFreeUserAssetCountResponseBody setAsset(DescribeFreeUserAssetCountResponseBodyAsset asset) {
        this.asset = asset;
        return this;
    }
    public DescribeFreeUserAssetCountResponseBodyAsset getAsset() {
        return this.asset;
    }

    public DescribeFreeUserAssetCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFreeUserAssetCountResponseBodyAsset extends TeaModel {
        /**
         * <p>The number of active APIs.</p>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("AssetActive")
        public Long assetActive;

        /**
         * <p>The total number of APIs.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("AssetCount")
        public Long assetCount;

        /**
         * <p>The number of deactivated APIs.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("AssetOffline")
        public Long assetOffline;

        public static DescribeFreeUserAssetCountResponseBodyAsset build(java.util.Map<String, ?> map) throws Exception {
            DescribeFreeUserAssetCountResponseBodyAsset self = new DescribeFreeUserAssetCountResponseBodyAsset();
            return TeaModel.build(map, self);
        }

        public DescribeFreeUserAssetCountResponseBodyAsset setAssetActive(Long assetActive) {
            this.assetActive = assetActive;
            return this;
        }
        public Long getAssetActive() {
            return this.assetActive;
        }

        public DescribeFreeUserAssetCountResponseBodyAsset setAssetCount(Long assetCount) {
            this.assetCount = assetCount;
            return this;
        }
        public Long getAssetCount() {
            return this.assetCount;
        }

        public DescribeFreeUserAssetCountResponseBodyAsset setAssetOffline(Long assetOffline) {
            this.assetOffline = assetOffline;
            return this;
        }
        public Long getAssetOffline() {
            return this.assetOffline;
        }

    }

}
