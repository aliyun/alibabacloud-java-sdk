// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListSystemConfigsRequest extends TeaModel {
    /**
     * <p>名称</p>
     * 
     * <strong>example:</strong>
     * <p>callableTime</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>对象ID</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>外呼开发时补充参数限制</p>
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
