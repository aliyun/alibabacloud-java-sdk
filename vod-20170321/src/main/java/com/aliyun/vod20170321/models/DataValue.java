// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DataValue extends TeaModel {
    @NameInMap("ItemId")
    public String itemId;

    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Status")
    public String status;

    @NameInMap("PurchaseStatus")
    public String purchaseStatus;

    @NameInMap("ExpiredOn")
    public String expiredOn;

    public static DataValue build(java.util.Map<String, ?> map) throws Exception {
        DataValue self = new DataValue();
        return TeaModel.build(map, self);
    }

    public DataValue setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public DataValue setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public DataValue setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DataValue setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DataValue setPurchaseStatus(String purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
        return this;
    }
    public String getPurchaseStatus() {
        return this.purchaseStatus;
    }

    public DataValue setExpiredOn(String expiredOn) {
        this.expiredOn = expiredOn;
        return this;
    }
    public String getExpiredOn() {
        return this.expiredOn;
    }

}
