// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class RefreshUsersPermissionsRequest extends TeaModel {
    @NameInMap("UserIds")
    public String userIds;

    @NameInMap("DocKey")
    public String docKey;

    @NameInMap("AppID")
    public String appID;

    public static RefreshUsersPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshUsersPermissionsRequest self = new RefreshUsersPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public RefreshUsersPermissionsRequest setUserIds(String userIds) {
        this.userIds = userIds;
        return this;
    }
    public String getUserIds() {
        return this.userIds;
    }

    public RefreshUsersPermissionsRequest setDocKey(String docKey) {
        this.docKey = docKey;
        return this;
    }
    public String getDocKey() {
        return this.docKey;
    }

    public RefreshUsersPermissionsRequest setAppID(String appID) {
        this.appID = appID;
        return this;
    }
    public String getAppID() {
        return this.appID;
    }

}
