// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppVersionsRequest extends TeaModel {
    /**
     * <p>7171a6ca-d1cd-4928-8642-7d5cfe69\*\*\*\*</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static ListAppVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppVersionsRequest self = new ListAppVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppVersionsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
