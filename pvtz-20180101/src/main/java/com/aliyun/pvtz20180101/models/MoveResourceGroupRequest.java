// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class MoveResourceGroupRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("NewResourceGroupId")
    public String newResourceGroupId;

    public static MoveResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveResourceGroupRequest self = new MoveResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public MoveResourceGroupRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public MoveResourceGroupRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public MoveResourceGroupRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public MoveResourceGroupRequest setNewResourceGroupId(String newResourceGroupId) {
        this.newResourceGroupId = newResourceGroupId;
        return this;
    }
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
    }

}
