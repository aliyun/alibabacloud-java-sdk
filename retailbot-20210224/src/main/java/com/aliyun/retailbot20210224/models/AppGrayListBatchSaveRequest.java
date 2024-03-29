// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class AppGrayListBatchSaveRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("Content")
    public java.util.List<AppGrayListBatchSaveRequestContent> content;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TenantId")
    public Long tenantId;

    public static AppGrayListBatchSaveRequest build(java.util.Map<String, ?> map) throws Exception {
        AppGrayListBatchSaveRequest self = new AppGrayListBatchSaveRequest();
        return TeaModel.build(map, self);
    }

    public AppGrayListBatchSaveRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public AppGrayListBatchSaveRequest setContent(java.util.List<AppGrayListBatchSaveRequestContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<AppGrayListBatchSaveRequestContent> getContent() {
        return this.content;
    }

    public AppGrayListBatchSaveRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AppGrayListBatchSaveRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public static class AppGrayListBatchSaveRequestContent extends TeaModel {
        @NameInMap("SellerId")
        public String sellerId;

        @NameInMap("SellerName")
        public String sellerName;

        @NameInMap("ShopId")
        public String shopId;

        @NameInMap("ShopName")
        public String shopName;

        @NameInMap("Version")
        public String version;

        public static AppGrayListBatchSaveRequestContent build(java.util.Map<String, ?> map) throws Exception {
            AppGrayListBatchSaveRequestContent self = new AppGrayListBatchSaveRequestContent();
            return TeaModel.build(map, self);
        }

        public AppGrayListBatchSaveRequestContent setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public String getSellerId() {
            return this.sellerId;
        }

        public AppGrayListBatchSaveRequestContent setSellerName(String sellerName) {
            this.sellerName = sellerName;
            return this;
        }
        public String getSellerName() {
            return this.sellerName;
        }

        public AppGrayListBatchSaveRequestContent setShopId(String shopId) {
            this.shopId = shopId;
            return this;
        }
        public String getShopId() {
            return this.shopId;
        }

        public AppGrayListBatchSaveRequestContent setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }
        public String getShopName() {
            return this.shopName;
        }

        public AppGrayListBatchSaveRequestContent setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
