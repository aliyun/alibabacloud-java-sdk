// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAssetRefreshTaskConfigResponseBody extends TeaModel {
    /**
     * <p>The asset synchronization configuration.</p>
     */
    @NameInMap("AssetRefreshConfig")
    public java.util.List<ListAssetRefreshTaskConfigResponseBodyAssetRefreshConfig> assetRefreshConfig;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAssetRefreshTaskConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAssetRefreshTaskConfigResponseBody self = new ListAssetRefreshTaskConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAssetRefreshTaskConfigResponseBody setAssetRefreshConfig(java.util.List<ListAssetRefreshTaskConfigResponseBodyAssetRefreshConfig> assetRefreshConfig) {
        this.assetRefreshConfig = assetRefreshConfig;
        return this;
    }
    public java.util.List<ListAssetRefreshTaskConfigResponseBodyAssetRefreshConfig> getAssetRefreshConfig() {
        return this.assetRefreshConfig;
    }

    public ListAssetRefreshTaskConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAssetRefreshTaskConfigResponseBodyAssetRefreshConfig extends TeaModel {
        /**
         * <p>The configuration type. Valid values:</p>
         * <br>
         * <p>*   **0**: host refresh task</p>
         * <p>*   **1**: cloud service refresh task</p>
         * <p>*   **2**: scheduled AccessKey pair verification task</p>
         */
        @NameInMap("RefreshConfigType")
        public Integer refreshConfigType;

        /**
         * <p>The interval at which assets are synchronized. Unit: minutes. Valid values:</p>
         * <br>
         * <p>*   **60**</p>
         * <p>*   **180**</p>
         * <p>*   **360**</p>
         * <p>*   **720**</p>
         * <p>*   **1440**</p>
         * <p>*   **10080**</p>
         */
        @NameInMap("SchedulePeriod")
        public Integer schedulePeriod;

        /**
         * <p>Indicates whether the feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **1**: The feature is enabled.</p>
         * <p>*   **0**: The feature is disabled.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The cloud asset type. Valid values:</p>
         * <br>
         * <p>*   **3**: Tencent Cloud</p>
         * <p>*   **4**: Huawei Cloud</p>
         * <p>*   **7**: Amazon Web Services (AWS)</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        public static ListAssetRefreshTaskConfigResponseBodyAssetRefreshConfig build(java.util.Map<String, ?> map) throws Exception {
            ListAssetRefreshTaskConfigResponseBodyAssetRefreshConfig self = new ListAssetRefreshTaskConfigResponseBodyAssetRefreshConfig();
            return TeaModel.build(map, self);
        }

        public ListAssetRefreshTaskConfigResponseBodyAssetRefreshConfig setRefreshConfigType(Integer refreshConfigType) {
            this.refreshConfigType = refreshConfigType;
            return this;
        }
        public Integer getRefreshConfigType() {
            return this.refreshConfigType;
        }

        public ListAssetRefreshTaskConfigResponseBodyAssetRefreshConfig setSchedulePeriod(Integer schedulePeriod) {
            this.schedulePeriod = schedulePeriod;
            return this;
        }
        public Integer getSchedulePeriod() {
            return this.schedulePeriod;
        }

        public ListAssetRefreshTaskConfigResponseBodyAssetRefreshConfig setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListAssetRefreshTaskConfigResponseBodyAssetRefreshConfig setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

}
