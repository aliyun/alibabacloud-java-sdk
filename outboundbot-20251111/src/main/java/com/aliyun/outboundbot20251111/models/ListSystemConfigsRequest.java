// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListSystemConfigsRequest extends TeaModel {
    /**
     * <p>The system configuration name.\
     * callableTime: the outbound job window.\
     * calleeDailyAttemptLimit: the maximum number of daily calls to a single callee number.</p>
     * 
     * <strong>example:</strong>
     * <p>callableTime</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The configuration type ID.\
     * If ObjectType is set to INSTANCE, this parameter specifies the instance ID.\
     * If ObjectType is set to TENANT, this parameter specifies the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The configuration type.\
     * INSTANCE: instance-level.\
     * TENANT: tenant-level.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    public static ListSystemConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSystemConfigsRequest self = new ListSystemConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListSystemConfigsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListSystemConfigsRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public ListSystemConfigsRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

}
