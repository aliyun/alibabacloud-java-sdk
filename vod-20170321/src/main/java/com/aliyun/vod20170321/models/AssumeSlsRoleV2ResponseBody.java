// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AssumeSlsRoleV2ResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlsAuthResult")
    public String slsAuthResult;

    public static AssumeSlsRoleV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssumeSlsRoleV2ResponseBody self = new AssumeSlsRoleV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public AssumeSlsRoleV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssumeSlsRoleV2ResponseBody setSlsAuthResult(String slsAuthResult) {
        this.slsAuthResult = slsAuthResult;
        return this;
    }
    public String getSlsAuthResult() {
        return this.slsAuthResult;
    }

}
