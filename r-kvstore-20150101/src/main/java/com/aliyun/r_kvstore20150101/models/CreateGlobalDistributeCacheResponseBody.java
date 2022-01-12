// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateGlobalDistributeCacheResponseBody extends TeaModel {
    @NameInMap("GlobalInstanceId")
    public String globalInstanceId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateGlobalDistributeCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalDistributeCacheResponseBody self = new CreateGlobalDistributeCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGlobalDistributeCacheResponseBody setGlobalInstanceId(String globalInstanceId) {
        this.globalInstanceId = globalInstanceId;
        return this;
    }
    public String getGlobalInstanceId() {
        return this.globalInstanceId;
    }

    public CreateGlobalDistributeCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
