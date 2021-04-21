// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class SetUsersPermissionsRequest extends TeaModel {
    // 需要设置权限的用户ID，多个用英文逗号（,）分隔，最多30个，每个ID由纯数字组成
    @NameInMap("UserIds")
    public String userIds;

    // 白板文档唯一标识符
    @NameInMap("DocKey")
    public String docKey;

    // 白板应用唯一标识符
    @NameInMap("AppID")
    public String appID;

    // 用户白板权限类型，可选值：ban/read/edit
    @NameInMap("PermissionType")
    public String permissionType;

    public static SetUsersPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        SetUsersPermissionsRequest self = new SetUsersPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public SetUsersPermissionsRequest setUserIds(String userIds) {
        this.userIds = userIds;
        return this;
    }
    public String getUserIds() {
        return this.userIds;
    }

    public SetUsersPermissionsRequest setDocKey(String docKey) {
        this.docKey = docKey;
        return this;
    }
    public String getDocKey() {
        return this.docKey;
    }

    public SetUsersPermissionsRequest setAppID(String appID) {
        this.appID = appID;
        return this;
    }
    public String getAppID() {
        return this.appID;
    }

    public SetUsersPermissionsRequest setPermissionType(String permissionType) {
        this.permissionType = permissionType;
        return this;
    }
    public String getPermissionType() {
        return this.permissionType;
    }

}
