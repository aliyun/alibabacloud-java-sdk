// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class QueryArmsEnableRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>017f39b8-dfa4-4e16-a84b-1dcee4b1****</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static QueryArmsEnableRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryArmsEnableRequest self = new QueryArmsEnableRequest();
        return TeaModel.build(map, self);
    }

    public QueryArmsEnableRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
