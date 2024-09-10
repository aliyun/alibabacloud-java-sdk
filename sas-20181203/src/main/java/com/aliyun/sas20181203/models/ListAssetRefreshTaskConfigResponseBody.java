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
     * 
     * <strong>example:</strong>
     * <p>D65AADFC-1D20-5A6A-8F6A-9FA53C0DC1F8</p>
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
         * <p>The type of the configuration. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: server synchronization task</li>
         * <li><strong>1</strong>: cloud service synchronization task</li>
         * <li><strong>2</strong>: scheduled AccessKey pair verification task</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RefreshConfigType")
        public Integer refreshConfigType;

        /**
         * <p>The synchronization cycle. Valid values:</p>
         * <ul>
         * <li><strong>60</strong>: 60 minutes</li>
         * <li><strong>180</strong>: 3 hours</li>
         * <li><strong>360</strong>: 6 hours</li>
         * <li><strong>720</strong>: 12 hours</li>
         * <li><strong>1440</strong>: 1 day</li>
         * <li><strong>10080</strong>: 7 days</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>360</p>
         */
        @NameInMap("SchedulePeriod")
        public Integer schedulePeriod;

        /**
         * <p>The status of the configuration. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enabled</li>
         * <li><strong>0</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The service provider of the cloud asset. Valid values:</p>
         * <ul>
         * <li><strong>3</strong>: Tencent Cloud</li>
         * <li><strong>4</strong>: Huawei Cloud</li>
         * <li><strong>7</strong>: Amazon Web Services (AWS) Cloud</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
