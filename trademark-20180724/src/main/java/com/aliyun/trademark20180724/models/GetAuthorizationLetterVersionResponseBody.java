// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class GetAuthorizationLetterVersionResponseBody extends TeaModel {
    @NameInMap("Version")
    public String version;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAuthorizationLetterVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationLetterVersionResponseBody self = new GetAuthorizationLetterVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationLetterVersionResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetAuthorizationLetterVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
