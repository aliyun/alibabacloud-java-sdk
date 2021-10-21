// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UploadNotaryDataResponseBody extends TeaModel {
    @NameInMap("UserAuthUrl")
    public String userAuthUrl;

    @NameInMap("RequestId")
    public String requestId;

    public static UploadNotaryDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadNotaryDataResponseBody self = new UploadNotaryDataResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadNotaryDataResponseBody setUserAuthUrl(String userAuthUrl) {
        this.userAuthUrl = userAuthUrl;
        return this;
    }
    public String getUserAuthUrl() {
        return this.userAuthUrl;
    }

    public UploadNotaryDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
