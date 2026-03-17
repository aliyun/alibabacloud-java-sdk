// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AddSnatEntryResponseBody extends TeaModel {
    /**
     * <p>The ID of the SNAT instance.</p>
     * 
     * <strong>example:</strong>
     * <p>snat-m2obgkt5ya1puz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>56BF6C79-C77D-41A0-86DD-A4B156E784EA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddSnatEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSnatEntryResponseBody self = new AddSnatEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSnatEntryResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddSnatEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
