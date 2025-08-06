// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetAIServiceResponseBody extends TeaModel {
    @NameInMap("FailedTypes")
    public String failedTypes;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessTypes")
    public String successTypes;

    public static SetAIServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAIServiceResponseBody self = new SetAIServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAIServiceResponseBody setFailedTypes(String failedTypes) {
        this.failedTypes = failedTypes;
        return this;
    }
    public String getFailedTypes() {
        return this.failedTypes;
    }

    public SetAIServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetAIServiceResponseBody setSuccessTypes(String successTypes) {
        this.successTypes = successTypes;
        return this;
    }
    public String getSuccessTypes() {
        return this.successTypes;
    }

}
