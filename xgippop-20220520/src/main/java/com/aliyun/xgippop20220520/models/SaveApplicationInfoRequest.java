// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class SaveApplicationInfoRequest extends TeaModel {
    // 阿里UID
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("AppId")
    public String appId;

    // 应用名称
    @NameInMap("AppName")
    public String appName;

    // dynamic|static
    @NameInMap("AppTypeList")
    public String appTypeList;

    // [
    @NameInMap("AppingList")
    public String appingList;

    // 商品code
    @NameInMap("ItemCode")
    public String itemCode;

    public static SaveApplicationInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveApplicationInfoRequest self = new SaveApplicationInfoRequest();
        return TeaModel.build(map, self);
    }

    public SaveApplicationInfoRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public SaveApplicationInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SaveApplicationInfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SaveApplicationInfoRequest setAppTypeList(String appTypeList) {
        this.appTypeList = appTypeList;
        return this;
    }
    public String getAppTypeList() {
        return this.appTypeList;
    }

    public SaveApplicationInfoRequest setAppingList(String appingList) {
        this.appingList = appingList;
        return this;
    }
    public String getAppingList() {
        return this.appingList;
    }

    public SaveApplicationInfoRequest setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }
    public String getItemCode() {
        return this.itemCode;
    }

}
