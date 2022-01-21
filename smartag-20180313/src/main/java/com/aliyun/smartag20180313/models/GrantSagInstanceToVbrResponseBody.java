// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GrantSagInstanceToVbrResponseBody extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RequestId")
    public String requestId;

    public static GrantSagInstanceToVbrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantSagInstanceToVbrResponseBody self = new GrantSagInstanceToVbrResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantSagInstanceToVbrResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GrantSagInstanceToVbrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
