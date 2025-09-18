// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class CreateMmAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>mm-xxxx</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMmAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMmAppResponseBody self = new CreateMmAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMmAppResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMmAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
