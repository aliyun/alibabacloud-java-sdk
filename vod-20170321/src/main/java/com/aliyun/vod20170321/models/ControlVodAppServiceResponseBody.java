// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ControlVodAppServiceResponseBody extends TeaModel {
    @NameInMap("AppServiceStatus")
    public String appServiceStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static ControlVodAppServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ControlVodAppServiceResponseBody self = new ControlVodAppServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ControlVodAppServiceResponseBody setAppServiceStatus(String appServiceStatus) {
        this.appServiceStatus = appServiceStatus;
        return this;
    }
    public String getAppServiceStatus() {
        return this.appServiceStatus;
    }

    public ControlVodAppServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
