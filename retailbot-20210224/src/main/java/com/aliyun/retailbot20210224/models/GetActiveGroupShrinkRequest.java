// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GetActiveGroupShrinkRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("GroupId")
    public Long groupId;

    // A short description of struct
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例 ID。
    @NameInMap("ShopId")
    public String shopId;

    @NameInMap("UserProfile")
    public String userProfileShrink;

    @NameInMap("Version")
    public String version;

    public static GetActiveGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetActiveGroupShrinkRequest self = new GetActiveGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetActiveGroupShrinkRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public GetActiveGroupShrinkRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public GetActiveGroupShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetActiveGroupShrinkRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public GetActiveGroupShrinkRequest setUserProfileShrink(String userProfileShrink) {
        this.userProfileShrink = userProfileShrink;
        return this;
    }
    public String getUserProfileShrink() {
        return this.userProfileShrink;
    }

    public GetActiveGroupShrinkRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
