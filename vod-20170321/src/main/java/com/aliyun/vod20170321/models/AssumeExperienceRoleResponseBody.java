// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AssumeExperienceRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static AssumeExperienceRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssumeExperienceRoleResponseBody self = new AssumeExperienceRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public AssumeExperienceRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssumeExperienceRoleResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
