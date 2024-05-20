// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppVersionsRequest extends TeaModel {
    /**
     * <p>The returned message.</p>
     * <br>
     * <p>This parameter is required.</p>
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
