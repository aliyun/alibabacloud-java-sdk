// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteIntelligentStrategyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteIntelligentStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIntelligentStrategyResponseBody self = new DeleteIntelligentStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIntelligentStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteIntelligentStrategyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
