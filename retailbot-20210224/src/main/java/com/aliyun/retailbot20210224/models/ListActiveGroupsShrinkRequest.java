// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListActiveGroupsShrinkRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageParam")
    public String pageParamShrink;

    @NameInMap("ShopId")
    public String shopId;

    @NameInMap("UserProfile")
    public String userProfileShrink;

    public static ListActiveGroupsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListActiveGroupsShrinkRequest self = new ListActiveGroupsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListActiveGroupsShrinkRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public ListActiveGroupsShrinkRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public ListActiveGroupsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListActiveGroupsShrinkRequest setPageParamShrink(String pageParamShrink) {
        this.pageParamShrink = pageParamShrink;
        return this;
    }
    public String getPageParamShrink() {
        return this.pageParamShrink;
    }

    public ListActiveGroupsShrinkRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public ListActiveGroupsShrinkRequest setUserProfileShrink(String userProfileShrink) {
        this.userProfileShrink = userProfileShrink;
        return this;
    }
    public String getUserProfileShrink() {
        return this.userProfileShrink;
    }

}
