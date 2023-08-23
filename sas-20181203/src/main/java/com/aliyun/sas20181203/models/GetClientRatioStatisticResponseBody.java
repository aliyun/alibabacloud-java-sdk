// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClientRatioStatisticResponseBody extends TeaModel {
    /**
     * <p>The statistics on the client installation rate.</p>
     */
    @NameInMap("ClientInstallRatio")
    public GetClientRatioStatisticResponseBodyClientInstallRatio clientInstallRatio;

    /**
     * <p>The statistics on the client online rate.</p>
     */
    @NameInMap("ClientOnlineRatio")
    public GetClientRatioStatisticResponseBodyClientOnlineRatio clientOnlineRatio;

    /**
     * <p>The list of time when statistics were collected.</p>
     */
    @NameInMap("Dates")
    public java.util.List<Long> dates;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetClientRatioStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClientRatioStatisticResponseBody self = new GetClientRatioStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClientRatioStatisticResponseBody setClientInstallRatio(GetClientRatioStatisticResponseBodyClientInstallRatio clientInstallRatio) {
        this.clientInstallRatio = clientInstallRatio;
        return this;
    }
    public GetClientRatioStatisticResponseBodyClientInstallRatio getClientInstallRatio() {
        return this.clientInstallRatio;
    }

    public GetClientRatioStatisticResponseBody setClientOnlineRatio(GetClientRatioStatisticResponseBodyClientOnlineRatio clientOnlineRatio) {
        this.clientOnlineRatio = clientOnlineRatio;
        return this;
    }
    public GetClientRatioStatisticResponseBodyClientOnlineRatio getClientOnlineRatio() {
        return this.clientOnlineRatio;
    }

    public GetClientRatioStatisticResponseBody setDates(java.util.List<Long> dates) {
        this.dates = dates;
        return this;
    }
    public java.util.List<Long> getDates() {
        return this.dates;
    }

    public GetClientRatioStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetClientRatioStatisticResponseBodyClientInstallRatioCurrentItemsItems extends TeaModel {
        /**
         * <p>The total number of assets.</p>
         */
        @NameInMap("AssetTotalCount")
        public Integer assetTotalCount;

        /**
         * <p>The timestamp of the calculation. Unit: milliseconds.</p>
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

        public static GetClientRatioStatisticResponseBodyClientInstallRatioCurrentItemsItems build(java.util.Map<String, ?> map) throws Exception {
            GetClientRatioStatisticResponseBodyClientInstallRatioCurrentItemsItems self = new GetClientRatioStatisticResponseBodyClientInstallRatioCurrentItemsItems();
            return TeaModel.build(map, self);
        }

        public GetClientRatioStatisticResponseBodyClientInstallRatioCurrentItemsItems setAssetTotalCount(Integer assetTotalCount) {
            this.assetTotalCount = assetTotalCount;
            return this;
        }
        public Integer getAssetTotalCount() {
            return this.assetTotalCount;
        }

        public GetClientRatioStatisticResponseBodyClientInstallRatioCurrentItemsItems setCalculateTime(Long calculateTime) {
            this.calculateTime = calculateTime;
            return this;
        }
        public Long getCalculateTime() {
            return this.calculateTime;
        }

        public GetClientRatioStatisticResponseBodyClientInstallRatioCurrentItemsItems setInstallRatio(Double installRatio) {
            this.installRatio = installRatio;
            return this;
        }
        public Double getInstallRatio() {
            return this.installRatio;
        }

        public GetClientRatioStatisticResponseBodyClientInstallRatioCurrentItemsItems setInstalledAssetCount(Integer installedAssetCount) {
            this.installedAssetCount = installedAssetCount;
            return this;
        }
        public Integer getInstalledAssetCount() {
            return this.installedAssetCount;
        }

    }

    public static class GetClientRatioStatisticResponseBodyClientInstallRatioCurrentItems extends TeaModel {
        /**
         * <p>The list of the statistics on the installation rate of the client by vendor.</p>
         */
        @NameInMap("Items")
        public java.util.List<GetClientRatioStatisticResponseBodyClientInstallRatioCurrentItemsItems> items;

        /**
         * <p>The type of the server. Valid values:</p>
         * <br>
         * <p>*   **0**: an asset provided by Alibaba Cloud</p>
         * <p>*   **1**: a third-party cloud asset</p>
         * <p>*   **2**: an asset in a data center</p>
         * <p>*   **3**, **4**, **5**, and **7**: other cloud asset</p>
         * <p>*   **8**: a lightweight asset</p>
         */
        @NameInMap("Vendor")
        public Long vendor;

        public static GetClientRatioStatisticResponseBodyClientInstallRatioCurrentItems build(java.util.Map<String, ?> map) throws Exception {
            GetClientRatioStatisticResponseBodyClientInstallRatioCurrentItems self = new GetClientRatioStatisticResponseBodyClientInstallRatioCurrentItems();
            return TeaModel.build(map, self);
        }

        public GetClientRatioStatisticResponseBodyClientInstallRatioCurrentItems setItems(java.util.List<GetClientRatioStatisticResponseBodyClientInstallRatioCurrentItemsItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetClientRatioStatisticResponseBodyClientInstallRatioCurrentItemsItems> getItems() {
            return this.items;
        }

        public GetClientRatioStatisticResponseBodyClientInstallRatioCurrentItems setVendor(Long vendor) {
            this.vendor = vendor;
            return this;
        }
        public Long getVendor() {
            return this.vendor;
        }

    }

    public static class GetClientRatioStatisticResponseBodyClientInstallRatioHistoryItemsItems extends TeaModel {
        /**
         * <p>The total number of assets.</p>
         */
        @NameInMap("AssetTotalCount")
        public Integer assetTotalCount;

        /**
         * <p>The timestamp of the calculation. Unit: milliseconds.</p>
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

        public static GetClientRatioStatisticResponseBodyClientInstallRatioHistoryItemsItems build(java.util.Map<String, ?> map) throws Exception {
            GetClientRatioStatisticResponseBodyClientInstallRatioHistoryItemsItems self = new GetClientRatioStatisticResponseBodyClientInstallRatioHistoryItemsItems();
            return TeaModel.build(map, self);
        }

        public GetClientRatioStatisticResponseBodyClientInstallRatioHistoryItemsItems setAssetTotalCount(Integer assetTotalCount) {
            this.assetTotalCount = assetTotalCount;
            return this;
        }
        public Integer getAssetTotalCount() {
            return this.assetTotalCount;
        }

        public GetClientRatioStatisticResponseBodyClientInstallRatioHistoryItemsItems setCalculateTime(Long calculateTime) {
            this.calculateTime = calculateTime;
            return this;
        }
        public Long getCalculateTime() {
            return this.calculateTime;
        }

        public GetClientRatioStatisticResponseBodyClientInstallRatioHistoryItemsItems setInstallRatio(Double installRatio) {
            this.installRatio = installRatio;
            return this;
        }
        public Double getInstallRatio() {
            return this.installRatio;
        }

        public GetClientRatioStatisticResponseBodyClientInstallRatioHistoryItemsItems setInstalledAssetCount(Integer installedAssetCount) {
            this.installedAssetCount = installedAssetCount;
            return this;
        }
        public Integer getInstalledAssetCount() {
            return this.installedAssetCount;
        }

    }

    public static class GetClientRatioStatisticResponseBodyClientInstallRatioHistoryItems extends TeaModel {
        /**
         * <p>The list of statistics on the client installation rate.</p>
         */
        @NameInMap("Items")
        public java.util.List<GetClientRatioStatisticResponseBodyClientInstallRatioHistoryItemsItems> items;

        /**
         * <p>The type of the cloud asset. Valid values:</p>
         * <br>
         * <p>*   **0**: an asset provided by Alibaba Cloud</p>
         * <p>*   **1**: a third-party cloud asset</p>
         * <p>*   **2**: an asset in a data center</p>
         * <p>*   **3**, **4**, **5**, and **7**: other cloud asset</p>
         * <p>*   **8**: a simple application server</p>
         */
        @NameInMap("Vendor")
        public Long vendor;

        public static GetClientRatioStatisticResponseBodyClientInstallRatioHistoryItems build(java.util.Map<String, ?> map) throws Exception {
            GetClientRatioStatisticResponseBodyClientInstallRatioHistoryItems self = new GetClientRatioStatisticResponseBodyClientInstallRatioHistoryItems();
            return TeaModel.build(map, self);
        }

        public GetClientRatioStatisticResponseBodyClientInstallRatioHistoryItems setItems(java.util.List<GetClientRatioStatisticResponseBodyClientInstallRatioHistoryItemsItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetClientRatioStatisticResponseBodyClientInstallRatioHistoryItemsItems> getItems() {
            return this.items;
        }

        public GetClientRatioStatisticResponseBodyClientInstallRatioHistoryItems setVendor(Long vendor) {
            this.vendor = vendor;
            return this;
        }
        public Long getVendor() {
            return this.vendor;
        }

    }

    public static class GetClientRatioStatisticResponseBodyClientInstallRatio extends TeaModel {
        /**
         * <p>The list of current statistics on the installation rate of the client.</p>
         */
        @NameInMap("CurrentItems")
        public java.util.List<GetClientRatioStatisticResponseBodyClientInstallRatioCurrentItems> currentItems;

        /**
         * <p>The list of historical statistics on the installation rate of the client.</p>
         */
        @NameInMap("HistoryItems")
        public java.util.List<GetClientRatioStatisticResponseBodyClientInstallRatioHistoryItems> historyItems;

        public static GetClientRatioStatisticResponseBodyClientInstallRatio build(java.util.Map<String, ?> map) throws Exception {
            GetClientRatioStatisticResponseBodyClientInstallRatio self = new GetClientRatioStatisticResponseBodyClientInstallRatio();
            return TeaModel.build(map, self);
        }

        public GetClientRatioStatisticResponseBodyClientInstallRatio setCurrentItems(java.util.List<GetClientRatioStatisticResponseBodyClientInstallRatioCurrentItems> currentItems) {
            this.currentItems = currentItems;
            return this;
        }
        public java.util.List<GetClientRatioStatisticResponseBodyClientInstallRatioCurrentItems> getCurrentItems() {
            return this.currentItems;
        }

        public GetClientRatioStatisticResponseBodyClientInstallRatio setHistoryItems(java.util.List<GetClientRatioStatisticResponseBodyClientInstallRatioHistoryItems> historyItems) {
            this.historyItems = historyItems;
            return this;
        }
        public java.util.List<GetClientRatioStatisticResponseBodyClientInstallRatioHistoryItems> getHistoryItems() {
            return this.historyItems;
        }

    }

    public static class GetClientRatioStatisticResponseBodyClientOnlineRatioCurrentItemsItems extends TeaModel {
        /**
         * <p>The number of assets on which the client is installed.</p>
         */
        @NameInMap("AssetInstallCount")
        public Integer assetInstallCount;

        /**
         * <p>The timestamp of the calculation. Unit: milliseconds.</p>
         */
        @NameInMap("CalculateTime")
        public Long calculateTime;

        /**
         * <p>The number of online assets.</p>
         */
        @NameInMap("OnlineAssetCount")
        public Integer onlineAssetCount;

        /**
         * <p>The online rate. Unit: %.</p>
         */
        @NameInMap("OnlineRatio")
        public Double onlineRatio;

        public static GetClientRatioStatisticResponseBodyClientOnlineRatioCurrentItemsItems build(java.util.Map<String, ?> map) throws Exception {
            GetClientRatioStatisticResponseBodyClientOnlineRatioCurrentItemsItems self = new GetClientRatioStatisticResponseBodyClientOnlineRatioCurrentItemsItems();
            return TeaModel.build(map, self);
        }

        public GetClientRatioStatisticResponseBodyClientOnlineRatioCurrentItemsItems setAssetInstallCount(Integer assetInstallCount) {
            this.assetInstallCount = assetInstallCount;
            return this;
        }
        public Integer getAssetInstallCount() {
            return this.assetInstallCount;
        }

        public GetClientRatioStatisticResponseBodyClientOnlineRatioCurrentItemsItems setCalculateTime(Long calculateTime) {
            this.calculateTime = calculateTime;
            return this;
        }
        public Long getCalculateTime() {
            return this.calculateTime;
        }

        public GetClientRatioStatisticResponseBodyClientOnlineRatioCurrentItemsItems setOnlineAssetCount(Integer onlineAssetCount) {
            this.onlineAssetCount = onlineAssetCount;
            return this;
        }
        public Integer getOnlineAssetCount() {
            return this.onlineAssetCount;
        }

        public GetClientRatioStatisticResponseBodyClientOnlineRatioCurrentItemsItems setOnlineRatio(Double onlineRatio) {
            this.onlineRatio = onlineRatio;
            return this;
        }
        public Double getOnlineRatio() {
            return this.onlineRatio;
        }

    }

    public static class GetClientRatioStatisticResponseBodyClientOnlineRatioCurrentItems extends TeaModel {
        /**
         * <p>The list of current statistics on the online rate of the client by vendor.</p>
         */
        @NameInMap("Items")
        public java.util.List<GetClientRatioStatisticResponseBodyClientOnlineRatioCurrentItemsItems> items;

        /**
         * <p>The type of the cloud asset. Valid values:</p>
         * <br>
         * <p>*   **0**: an asset provided by Alibaba Cloud</p>
         * <p>*   **1**: a third-party cloud asset</p>
         * <p>*   **2**: an asset in a data center</p>
         * <p>*   **3**, **4**, **5**, and **7**: other cloud asset</p>
         * <p>*   **8**: a simple application server</p>
         */
        @NameInMap("Vendor")
        public Long vendor;

        public static GetClientRatioStatisticResponseBodyClientOnlineRatioCurrentItems build(java.util.Map<String, ?> map) throws Exception {
            GetClientRatioStatisticResponseBodyClientOnlineRatioCurrentItems self = new GetClientRatioStatisticResponseBodyClientOnlineRatioCurrentItems();
            return TeaModel.build(map, self);
        }

        public GetClientRatioStatisticResponseBodyClientOnlineRatioCurrentItems setItems(java.util.List<GetClientRatioStatisticResponseBodyClientOnlineRatioCurrentItemsItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetClientRatioStatisticResponseBodyClientOnlineRatioCurrentItemsItems> getItems() {
            return this.items;
        }

        public GetClientRatioStatisticResponseBodyClientOnlineRatioCurrentItems setVendor(Long vendor) {
            this.vendor = vendor;
            return this;
        }
        public Long getVendor() {
            return this.vendor;
        }

    }

    public static class GetClientRatioStatisticResponseBodyClientOnlineRatioHistoryItemsItems extends TeaModel {
        /**
         * <p>The number of assets on which the client is installed.</p>
         */
        @NameInMap("AssetInstallCount")
        public Integer assetInstallCount;

        /**
         * <p>The timestamp of the calculation. Unit: milliseconds.</p>
         */
        @NameInMap("CalculateTime")
        public Long calculateTime;

        /**
         * <p>The number of online assets.</p>
         */
        @NameInMap("OnlineAssetCount")
        public Integer onlineAssetCount;

        /**
         * <p>The online rate. Unit: %.</p>
         */
        @NameInMap("OnlineRatio")
        public Double onlineRatio;

        public static GetClientRatioStatisticResponseBodyClientOnlineRatioHistoryItemsItems build(java.util.Map<String, ?> map) throws Exception {
            GetClientRatioStatisticResponseBodyClientOnlineRatioHistoryItemsItems self = new GetClientRatioStatisticResponseBodyClientOnlineRatioHistoryItemsItems();
            return TeaModel.build(map, self);
        }

        public GetClientRatioStatisticResponseBodyClientOnlineRatioHistoryItemsItems setAssetInstallCount(Integer assetInstallCount) {
            this.assetInstallCount = assetInstallCount;
            return this;
        }
        public Integer getAssetInstallCount() {
            return this.assetInstallCount;
        }

        public GetClientRatioStatisticResponseBodyClientOnlineRatioHistoryItemsItems setCalculateTime(Long calculateTime) {
            this.calculateTime = calculateTime;
            return this;
        }
        public Long getCalculateTime() {
            return this.calculateTime;
        }

        public GetClientRatioStatisticResponseBodyClientOnlineRatioHistoryItemsItems setOnlineAssetCount(Integer onlineAssetCount) {
            this.onlineAssetCount = onlineAssetCount;
            return this;
        }
        public Integer getOnlineAssetCount() {
            return this.onlineAssetCount;
        }

        public GetClientRatioStatisticResponseBodyClientOnlineRatioHistoryItemsItems setOnlineRatio(Double onlineRatio) {
            this.onlineRatio = onlineRatio;
            return this;
        }
        public Double getOnlineRatio() {
            return this.onlineRatio;
        }

    }

    public static class GetClientRatioStatisticResponseBodyClientOnlineRatioHistoryItems extends TeaModel {
        /**
         * <p>The list of historical statistics on the online rate of the client by vendor.</p>
         */
        @NameInMap("Items")
        public java.util.List<GetClientRatioStatisticResponseBodyClientOnlineRatioHistoryItemsItems> items;

        /**
         * <p>The type of the server. Valid values:</p>
         * <br>
         * <p>*   **0**: an asset provided by Alibaba Cloud</p>
         * <p>*   **1**: a third-party cloud asset</p>
         * <p>*   **2**: an asset in a data center</p>
         * <p>*   **3**, **4**, **5**, and **7**: other cloud asset</p>
         * <p>*   **8**: a lightweight asset</p>
         */
        @NameInMap("Vendor")
        public Long vendor;

        public static GetClientRatioStatisticResponseBodyClientOnlineRatioHistoryItems build(java.util.Map<String, ?> map) throws Exception {
            GetClientRatioStatisticResponseBodyClientOnlineRatioHistoryItems self = new GetClientRatioStatisticResponseBodyClientOnlineRatioHistoryItems();
            return TeaModel.build(map, self);
        }

        public GetClientRatioStatisticResponseBodyClientOnlineRatioHistoryItems setItems(java.util.List<GetClientRatioStatisticResponseBodyClientOnlineRatioHistoryItemsItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetClientRatioStatisticResponseBodyClientOnlineRatioHistoryItemsItems> getItems() {
            return this.items;
        }

        public GetClientRatioStatisticResponseBodyClientOnlineRatioHistoryItems setVendor(Long vendor) {
            this.vendor = vendor;
            return this;
        }
        public Long getVendor() {
            return this.vendor;
        }

    }

    public static class GetClientRatioStatisticResponseBodyClientOnlineRatio extends TeaModel {
        /**
         * <p>The list of current statistics on the online rate of the client.</p>
         */
        @NameInMap("CurrentItems")
        public java.util.List<GetClientRatioStatisticResponseBodyClientOnlineRatioCurrentItems> currentItems;

        /**
         * <p>The list of historical statistics on the online rate of the client.</p>
         */
        @NameInMap("HistoryItems")
        public java.util.List<GetClientRatioStatisticResponseBodyClientOnlineRatioHistoryItems> historyItems;

        public static GetClientRatioStatisticResponseBodyClientOnlineRatio build(java.util.Map<String, ?> map) throws Exception {
            GetClientRatioStatisticResponseBodyClientOnlineRatio self = new GetClientRatioStatisticResponseBodyClientOnlineRatio();
            return TeaModel.build(map, self);
        }

        public GetClientRatioStatisticResponseBodyClientOnlineRatio setCurrentItems(java.util.List<GetClientRatioStatisticResponseBodyClientOnlineRatioCurrentItems> currentItems) {
            this.currentItems = currentItems;
            return this;
        }
        public java.util.List<GetClientRatioStatisticResponseBodyClientOnlineRatioCurrentItems> getCurrentItems() {
            return this.currentItems;
        }

        public GetClientRatioStatisticResponseBodyClientOnlineRatio setHistoryItems(java.util.List<GetClientRatioStatisticResponseBodyClientOnlineRatioHistoryItems> historyItems) {
            this.historyItems = historyItems;
            return this;
        }
        public java.util.List<GetClientRatioStatisticResponseBodyClientOnlineRatioHistoryItems> getHistoryItems() {
            return this.historyItems;
        }

    }

}
