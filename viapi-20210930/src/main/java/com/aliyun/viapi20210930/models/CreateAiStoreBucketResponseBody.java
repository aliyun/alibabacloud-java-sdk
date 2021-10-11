// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class CreateAiStoreBucketResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static CreateAiStoreBucketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAiStoreBucketResponseBody self = new CreateAiStoreBucketResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAiStoreBucketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAiStoreBucketResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
