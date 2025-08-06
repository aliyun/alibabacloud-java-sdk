// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AssumeOssRoleResponseBody extends TeaModel {
    @NameInMap("OssAuthResult")
    public String ossAuthResult;

    @NameInMap("RequestId")
    public String requestId;

    public static AssumeOssRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssumeOssRoleResponseBody self = new AssumeOssRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public AssumeOssRoleResponseBody setOssAuthResult(String ossAuthResult) {
        this.ossAuthResult = ossAuthResult;
        return this;
    }
    public String getOssAuthResult() {
        return this.ossAuthResult;
    }

    public AssumeOssRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
