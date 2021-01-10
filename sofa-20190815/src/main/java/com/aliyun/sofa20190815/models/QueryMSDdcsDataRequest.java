// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSDdcsDataRequest extends TeaModel {
    @NameInMap("AttributeId")
    public Long attributeId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryMSDdcsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMSDdcsDataRequest self = new QueryMSDdcsDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryMSDdcsDataRequest setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
        return this;
    }
    public Long getAttributeId() {
        return this.attributeId;
    }

    public QueryMSDdcsDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
