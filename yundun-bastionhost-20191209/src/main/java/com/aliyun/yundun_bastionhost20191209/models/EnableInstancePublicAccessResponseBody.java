// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class EnableInstancePublicAccessResponseBody extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RequestId")
    public String requestId;

    public static EnableInstancePublicAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableInstancePublicAccessResponseBody self = new EnableInstancePublicAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableInstancePublicAccessResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableInstancePublicAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
