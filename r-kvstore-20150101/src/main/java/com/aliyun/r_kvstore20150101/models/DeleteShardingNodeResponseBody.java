// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DeleteShardingNodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteShardingNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteShardingNodeResponseBody self = new DeleteShardingNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteShardingNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
