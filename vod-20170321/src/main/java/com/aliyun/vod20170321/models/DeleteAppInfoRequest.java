// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAppInfoRequest extends TeaModel {
    /**
     * <p>The application ID. Set this parameter to the value of AppId returned by the <a href="https://help.aliyun.com/document_detail/113266.html">CreateApp</a> or <a href="https://help.aliyun.com/document_detail/114000.html">ListApps</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static DeleteAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppInfoRequest self = new DeleteAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
