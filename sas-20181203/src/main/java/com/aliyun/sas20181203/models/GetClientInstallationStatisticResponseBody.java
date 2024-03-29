// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClientInstallationStatisticResponseBody extends TeaModel {
    /**
     * <p>The statistics on the client installation rate.</p>
     */
    @NameInMap("ClientInstallRatio")
    public GetClientInstallationStatisticResponseBodyClientInstallRatio clientInstallRatio;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetClientInstallationStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClientInstallationStatisticResponseBody self = new GetClientInstallationStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClientInstallationStatisticResponseBody setClientInstallRatio(GetClientInstallationStatisticResponseBodyClientInstallRatio clientInstallRatio) {
        this.clientInstallRatio = clientInstallRatio;
        return this;
    }
    public GetClientInstallationStatisticResponseBodyClientInstallRatio getClientInstallRatio() {
        return this.clientInstallRatio;
    }

    public GetClientInstallationStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetClientInstallationStatisticResponseBodyClientInstallRatioCurrentItemsItems extends TeaModel {
        /**
         * <p>The total number of cloud assets.</p>
         */
        @NameInMap("AssetTotalCount")
        public Integer assetTotalCount;

        /**
         * <p>The timestamp of the calculation. Unit: millisecond.</p>
         */
        @NameInMap("CalculateTime")
        public Long calculateTime;

        /**
         * <p>The installation rate. Unit: %.</p>
         */
        @NameInMap("InstallRatio")
        public Double installRatio;

        /**
         * <p>The number of assets on which the client is installed.</p>
         */
        @NameInMap("InstalledAssetCount")
        public Integer installedAssetCount;

        public static GetClientInstallationStatisticResponseBodyClientInstallRatioCurrentItemsItems build(java.util.Map<String, ?> map) throws Exception {
            GetClientInstallationStatisticResponseBodyClientInstallRatioCurrentItemsItems self = new GetClientInstallationStatisticResponseBodyClientInstallRatioCurrentItemsItems();
            return TeaModel.build(map, self);
        }

        public GetClientInstallationStatisticResponseBodyClientInstallRatioCurrentItemsItems setAssetTotalCount(Integer assetTotalCount) {
            this.assetTotalCount = assetTotalCount;
            return this;
        }
        public Integer getAssetTotalCount() {
            return this.assetTotalCount;
        }

        public GetClientInstallationStatisticResponseBodyClientInstallRatioCurrentItemsItems setCalculateTime(Long calculateTime) {
            this.calculateTime = calculateTime;
            return this;
        }
        public Long getCalculateTime() {
            return this.calculateTime;
        }

        public GetClientInstallationStatisticResponseBodyClientInstallRatioCurrentItemsItems setInstallRatio(Double installRatio) {
            this.installRatio = installRatio;
            return this;
        }
        public Double getInstallRatio() {
            return this.installRatio;
        }

        public GetClientInstallationStatisticResponseBodyClientInstallRatioCurrentItemsItems setInstalledAssetCount(Integer installedAssetCount) {
            this.installedAssetCount = installedAssetCount;
            return this;
        }
        public Integer getInstalledAssetCount() {
            return this.installedAssetCount;
        }

    }

    public static class GetClientInstallationStatisticResponseBodyClientInstallRatioCurrentItems extends TeaModel {
        /**
         * <p>The current statistics on the installation rate of the client.</p>
         */
        @NameInMap("Items")
        public java.util.List<GetClientInstallationStatisticResponseBodyClientInstallRatioCurrentItemsItems> items;

        /**
         * <p>The type of the cloud asset. Valid values:</p>
         * <br>
         * <p>*   **0**: a cloud asset provided by Alibaba Cloud.</p>
         * <p>*   **1**: a third-party cloud asset</p>
         * <p>*   **2**: an asset in a data center</p>
         * <p>*   **3**, **4**, **5**, and **7**: other cloud asset</p>
         * <p>*   **8**: a lightweight cloud asset</p>
         */
        @NameInMap("Vendor")
        public Long vendor;

        public static GetClientInstallationStatisticResponseBodyClientInstallRatioCurrentItems build(java.util.Map<String, ?> map) throws Exception {
            GetClientInstallationStatisticResponseBodyClientInstallRatioCurrentItems self = new GetClientInstallationStatisticResponseBodyClientInstallRatioCurrentItems();
            return TeaModel.build(map, self);
        }

        public GetClientInstallationStatisticResponseBodyClientInstallRatioCurrentItems setItems(java.util.List<GetClientInstallationStatisticResponseBodyClientInstallRatioCurrentItemsItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetClientInstallationStatisticResponseBodyClientInstallRatioCurrentItemsItems> getItems() {
            return this.items;
        }

        public GetClientInstallationStatisticResponseBodyClientInstallRatioCurrentItems setVendor(Long vendor) {
            this.vendor = vendor;
            return this;
        }
        public Long getVendor() {
            return this.vendor;
        }

    }

    public static class GetClientInstallationStatisticResponseBodyClientInstallRatioHistoryItemsItems extends TeaModel {
        /**
         * <p>The total number of cloud assets.</p>
         */
        @NameInMap("AssetTotalCount")
        public Integer assetTotalCount;

        /**
         * <p>The timestamp of the calculation. Unit: millisecond.</p>
         */
        @NameInMap("CalculateTime")
        public Long calculateTime;

        /**
         * <p>The installation rate. Unit: %.</p>
         */
        @NameInMap("InstallRatio")
        public Double installRatio;

        /**
         * <p>The number of cloud assets on which the client is installed.</p>
         */
        @NameInMap("InstalledAssetCount")
        public Integer installedAssetCount;

        public static GetClientInstallationStatisticResponseBodyClientInstallRatioHistoryItemsItems build(java.util.Map<String, ?> map) throws Exception {
            GetClientInstallationStatisticResponseBodyClientInstallRatioHistoryItemsItems self = new GetClientInstallationStatisticResponseBodyClientInstallRatioHistoryItemsItems();
            return TeaModel.build(map, self);
        }

        public GetClientInstallationStatisticResponseBodyClientInstallRatioHistoryItemsItems setAssetTotalCount(Integer assetTotalCount) {
            this.assetTotalCount = assetTotalCount;
            return this;
        }
        public Integer getAssetTotalCount() {
            return this.assetTotalCount;
        }

        public GetClientInstallationStatisticResponseBodyClientInstallRatioHistoryItemsItems setCalculateTime(Long calculateTime) {
            this.calculateTime = calculateTime;
            return this;
        }
        public Long getCalculateTime() {
            return this.calculateTime;
        }

        public GetClientInstallationStatisticResponseBodyClientInstallRatioHistoryItemsItems setInstallRatio(Double installRatio) {
            this.installRatio = installRatio;
            return this;
        }
        public Double getInstallRatio() {
            return this.installRatio;
        }

        public GetClientInstallationStatisticResponseBodyClientInstallRatioHistoryItemsItems setInstalledAssetCount(Integer installedAssetCount) {
            this.installedAssetCount = installedAssetCount;
            return this;
        }
        public Integer getInstalledAssetCount() {
            return this.installedAssetCount;
        }

    }

    public static class GetClientInstallationStatisticResponseBodyClientInstallRatioHistoryItems extends TeaModel {
        /**
         * <p>The statistics on the client installation rate.</p>
         */
        @NameInMap("Items")
        public java.util.List<GetClientInstallationStatisticResponseBodyClientInstallRatioHistoryItemsItems> items;

        /**
         * <p>The type of the cloud asset. Valid values:</p>
         * <br>
         * <p>*   **0**: a cloud asset provided by Alibaba Cloud.</p>
         * <p>*   **1**: a third-party cloud asset</p>
         * <p>*   **2**: an asset in a data center</p>
         * <p>*   **3**, **4**, **5**, and **7**: other cloud asset</p>
         * <p>*   **8**: a lightweight cloud asset</p>
         */
        @NameInMap("Vendor")
        public Long vendor;

        public static GetClientInstallationStatisticResponseBodyClientInstallRatioHistoryItems build(java.util.Map<String, ?> map) throws Exception {
            GetClientInstallationStatisticResponseBodyClientInstallRatioHistoryItems self = new GetClientInstallationStatisticResponseBodyClientInstallRatioHistoryItems();
            return TeaModel.build(map, self);
        }

        public GetClientInstallationStatisticResponseBodyClientInstallRatioHistoryItems setItems(java.util.List<GetClientInstallationStatisticResponseBodyClientInstallRatioHistoryItemsItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetClientInstallationStatisticResponseBodyClientInstallRatioHistoryItemsItems> getItems() {
            return this.items;
        }

        public GetClientInstallationStatisticResponseBodyClientInstallRatioHistoryItems setVendor(Long vendor) {
            this.vendor = vendor;
            return this;
        }
        public Long getVendor() {
            return this.vendor;
        }

    }

    public static class GetClientInstallationStatisticResponseBodyClientInstallRatio extends TeaModel {
        /**
         * <p>The current statistics on the installation rate of the client.</p>
         */
        @NameInMap("CurrentItems")
        public java.util.List<GetClientInstallationStatisticResponseBodyClientInstallRatioCurrentItems> currentItems;

        /**
         * <p>The time when statistics were collected.</p>
         */
        @NameInMap("Dates")
        public java.util.List<Long> dates;

        /**
         * <p>The historical statistics on the installation rate of the agent.</p>
         */
        @NameInMap("HistoryItems")
        public java.util.List<GetClientInstallationStatisticResponseBodyClientInstallRatioHistoryItems> historyItems;

        public static GetClientInstallationStatisticResponseBodyClientInstallRatio build(java.util.Map<String, ?> map) throws Exception {
            GetClientInstallationStatisticResponseBodyClientInstallRatio self = new GetClientInstallationStatisticResponseBodyClientInstallRatio();
            return TeaModel.build(map, self);
        }

        public GetClientInstallationStatisticResponseBodyClientInstallRatio setCurrentItems(java.util.List<GetClientInstallationStatisticResponseBodyClientInstallRatioCurrentItems> currentItems) {
            this.currentItems = currentItems;
            return this;
        }
        public java.util.List<GetClientInstallationStatisticResponseBodyClientInstallRatioCurrentItems> getCurrentItems() {
            return this.currentItems;
        }

        public GetClientInstallationStatisticResponseBodyClientInstallRatio setDates(java.util.List<Long> dates) {
            this.dates = dates;
            return this;
        }
        public java.util.List<Long> getDates() {
            return this.dates;
        }

        public GetClientInstallationStatisticResponseBodyClientInstallRatio setHistoryItems(java.util.List<GetClientInstallationStatisticResponseBodyClientInstallRatioHistoryItems> historyItems) {
            this.historyItems = historyItems;
            return this;
        }
        public java.util.List<GetClientInstallationStatisticResponseBodyClientInstallRatioHistoryItems> getHistoryItems() {
            return this.historyItems;
        }

    }

}
