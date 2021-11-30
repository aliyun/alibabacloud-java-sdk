// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketVersioningResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    public static GetBucketVersioningResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketVersioningResponseBody self = new GetBucketVersioningResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketVersioningResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
