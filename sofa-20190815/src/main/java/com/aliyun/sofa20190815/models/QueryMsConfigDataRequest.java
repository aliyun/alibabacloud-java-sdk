// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsConfigDataRequest extends TeaModel {
    @NameInMap("AttributeId")
    public Long attributeId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryMsConfigDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsConfigDataRequest self = new QueryMsConfigDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsConfigDataRequest setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
        return this;
    }
    public Long getAttributeId() {
        return this.attributeId;
    }

    public QueryMsConfigDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
