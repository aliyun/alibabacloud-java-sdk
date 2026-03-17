// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GrantSagInstanceToVbrResponseBody extends TeaModel {
    /**
     * <p>The ID of the authorization.</p>
     * 
     * <strong>example:</strong>
     * <p>sgv-3x8djyem7vqh70****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>49CEBB2B-9E5C-4789-8A29-3255A56A67B1</p>
     */
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
