// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class SyncAlertUsersRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("Users")
    public String users;

    public static SyncAlertUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAlertUsersRequest self = new SyncAlertUsersRequest();
        return TeaModel.build(map, self);
    }

    public SyncAlertUsersRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public SyncAlertUsersRequest setUsers(String users) {
        this.users = users;
        return this;
    }
    public String getUsers() {
        return this.users;
    }

}
