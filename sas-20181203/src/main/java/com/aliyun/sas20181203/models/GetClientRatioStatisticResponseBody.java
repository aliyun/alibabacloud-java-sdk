// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClientRatioStatisticResponseBody extends TeaModel {
    @NameInMap("ClientInstallRatio")
    public GetClientRatioStatisticResponseBodyClientInstallRatio clientInstallRatio;

    @NameInMap("ClientOnlineRatio")
    public GetClientRatioStatisticResponseBodyClientOnlineRatio clientOnlineRatio;

    @NameInMap("Dates")
    public java.util.List<Long> dates;

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
        @NameInMap("AssetTotalCount")
        public Integer assetTotalCount;

        @NameInMap("CalculateTime")
        public Long calculateTime;

        @NameInMap("InstallRatio")
        public Double installRatio;

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
        @NameInMap("Items")
        public java.util.List<GetClientRatioStatisticResponseBodyClientInstallRatioCurrentItemsItems> items;

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
        @NameInMap("AssetTotalCount")
        public Integer assetTotalCount;

        @NameInMap("CalculateTime")
        public Long calculateTime;

        @NameInMap("InstallRatio")
        public Double installRatio;

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
        @NameInMap("Items")
        public java.util.List<GetClientRatioStatisticResponseBodyClientInstallRatioHistoryItemsItems> items;

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
        @NameInMap("CurrentItems")
        public java.util.List<GetClientRatioStatisticResponseBodyClientInstallRatioCurrentItems> currentItems;

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
        @NameInMap("AssetInstallCount")
        public Integer assetInstallCount;

        @NameInMap("CalculateTime")
        public Long calculateTime;

        @NameInMap("OnlineAssetCount")
        public Integer onlineAssetCount;

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
        @NameInMap("Items")
        public java.util.List<GetClientRatioStatisticResponseBodyClientOnlineRatioCurrentItemsItems> items;

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
        @NameInMap("AssetInstallCount")
        public Integer assetInstallCount;

        @NameInMap("CalculateTime")
        public Long calculateTime;

        @NameInMap("OnlineAssetCount")
        public Integer onlineAssetCount;

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
        @NameInMap("Items")
        public java.util.List<GetClientRatioStatisticResponseBodyClientOnlineRatioHistoryItemsItems> items;

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
        @NameInMap("CurrentItems")
        public java.util.List<GetClientRatioStatisticResponseBodyClientOnlineRatioCurrentItems> currentItems;

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
