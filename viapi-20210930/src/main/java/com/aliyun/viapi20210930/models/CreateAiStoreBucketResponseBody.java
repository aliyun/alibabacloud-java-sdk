// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class CreateAiStoreBucketResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAiStoreBucketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAiStoreBucketResponseBody self = new CreateAiStoreBucketResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAiStoreBucketResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateAiStoreBucketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
