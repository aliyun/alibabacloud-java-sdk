// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppVersionsQuery extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    public static ListAppVersionsQuery build(java.util.Map<String, ?> map) throws Exception {
        ListAppVersionsQuery self = new ListAppVersionsQuery();
        return TeaModel.build(map, self);
    }

    public ListAppVersionsQuery setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
