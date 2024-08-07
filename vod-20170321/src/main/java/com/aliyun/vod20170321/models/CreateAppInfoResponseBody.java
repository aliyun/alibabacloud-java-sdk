// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateAppInfoResponseBody extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A13-34D5-D7393642****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppInfoResponseBody self = new CreateAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppInfoResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
