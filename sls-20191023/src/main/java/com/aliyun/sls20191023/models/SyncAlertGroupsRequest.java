// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class SyncAlertGroupsRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("Groups")
    public String groups;

    public static SyncAlertGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAlertGroupsRequest self = new SyncAlertGroupsRequest();
        return TeaModel.build(map, self);
    }

    public SyncAlertGroupsRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public SyncAlertGroupsRequest setGroups(String groups) {
        this.groups = groups;
        return this;
    }
    public String getGroups() {
        return this.groups;
    }

}
