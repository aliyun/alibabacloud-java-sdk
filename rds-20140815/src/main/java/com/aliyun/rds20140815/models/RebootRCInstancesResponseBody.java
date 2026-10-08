// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RebootRCInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RebootRCInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebootRCInstancesResponseBody self = new RebootRCInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public RebootRCInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
