// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AssumeSlsRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlsAuthResult")
    public String slsAuthResult;

    public static AssumeSlsRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssumeSlsRoleResponseBody self = new AssumeSlsRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public AssumeSlsRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssumeSlsRoleResponseBody setSlsAuthResult(String slsAuthResult) {
        this.slsAuthResult = slsAuthResult;
        return this;
    }
    public String getSlsAuthResult() {
        return this.slsAuthResult;
    }

}
