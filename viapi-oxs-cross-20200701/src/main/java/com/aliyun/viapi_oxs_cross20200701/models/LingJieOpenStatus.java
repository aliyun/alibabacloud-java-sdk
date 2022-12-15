// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_oxs_cross20200701.models;

import com.aliyun.tea.*;

public class LingJieOpenStatus extends TeaModel {
    @NameInMap("CommoditiesOpenStatus")
    public java.util.List<LingJieOpenStatusCommoditiesOpenStatus> commoditiesOpenStatus;

    @NameInMap("OpenTime")
    public String openTime;

    @NameInMap("ProductConsoleUrl")
    public String productConsoleUrl;

    @NameInMap("ProductEnabled")
    public Boolean productEnabled;

    @NameInMap("ProductMonitorUrl")
    public String productMonitorUrl;

    @NameInMap("ProductWikiUrl")
    public String productWikiUrl;

    public static LingJieOpenStatus build(java.util.Map<String, ?> map) throws Exception {
        LingJieOpenStatus self = new LingJieOpenStatus();
        return TeaModel.build(map, self);
    }

    public LingJieOpenStatus setCommoditiesOpenStatus(java.util.List<LingJieOpenStatusCommoditiesOpenStatus> commoditiesOpenStatus) {
        this.commoditiesOpenStatus = commoditiesOpenStatus;
        return this;
    }
    public java.util.List<LingJieOpenStatusCommoditiesOpenStatus> getCommoditiesOpenStatus() {
        return this.commoditiesOpenStatus;
    }

    public LingJieOpenStatus setOpenTime(String openTime) {
        this.openTime = openTime;
        return this;
    }
    public String getOpenTime() {
        return this.openTime;
    }

    public LingJieOpenStatus setProductConsoleUrl(String productConsoleUrl) {
        this.productConsoleUrl = productConsoleUrl;
        return this;
    }
    public String getProductConsoleUrl() {
        return this.productConsoleUrl;
    }

    public LingJieOpenStatus setProductEnabled(Boolean productEnabled) {
        this.productEnabled = productEnabled;
        return this;
    }
    public Boolean getProductEnabled() {
        return this.productEnabled;
    }

    public LingJieOpenStatus setProductMonitorUrl(String productMonitorUrl) {
        this.productMonitorUrl = productMonitorUrl;
        return this;
    }
    public String getProductMonitorUrl() {
        return this.productMonitorUrl;
    }

    public LingJieOpenStatus setProductWikiUrl(String productWikiUrl) {
        this.productWikiUrl = productWikiUrl;
        return this;
    }
    public String getProductWikiUrl() {
        return this.productWikiUrl;
    }

    public static class LingJieOpenStatusCommoditiesOpenStatus extends TeaModel {
        @NameInMap("CnName")
        public String cnName;

        @NameInMap("Commodity")
        public String commodity;

        @NameInMap("Describe")
        public String describe;

        @NameInMap("DetailPage")
        public String detailPage;

        @NameInMap("Open")
        public Boolean open;

        @NameInMap("OpenTime")
        public String openTime;

        public static LingJieOpenStatusCommoditiesOpenStatus build(java.util.Map<String, ?> map) throws Exception {
            LingJieOpenStatusCommoditiesOpenStatus self = new LingJieOpenStatusCommoditiesOpenStatus();
            return TeaModel.build(map, self);
        }

        public LingJieOpenStatusCommoditiesOpenStatus setCnName(String cnName) {
            this.cnName = cnName;
            return this;
        }
        public String getCnName() {
            return this.cnName;
        }

        public LingJieOpenStatusCommoditiesOpenStatus setCommodity(String commodity) {
            this.commodity = commodity;
            return this;
        }
        public String getCommodity() {
            return this.commodity;
        }

        public LingJieOpenStatusCommoditiesOpenStatus setDescribe(String describe) {
            this.describe = describe;
            return this;
        }
        public String getDescribe() {
            return this.describe;
        }

        public LingJieOpenStatusCommoditiesOpenStatus setDetailPage(String detailPage) {
            this.detailPage = detailPage;
            return this;
        }
        public String getDetailPage() {
            return this.detailPage;
        }

        public LingJieOpenStatusCommoditiesOpenStatus setOpen(Boolean open) {
            this.open = open;
            return this;
        }
        public Boolean getOpen() {
            return this.open;
        }

        public LingJieOpenStatusCommoditiesOpenStatus setOpenTime(String openTime) {
            this.openTime = openTime;
            return this;
        }
        public String getOpenTime() {
            return this.openTime;
        }

    }

}
