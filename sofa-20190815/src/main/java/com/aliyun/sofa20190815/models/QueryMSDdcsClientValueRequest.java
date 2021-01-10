// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSDdcsClientValueRequest extends TeaModel {
    @NameInMap("AttributeId")
    public Long attributeId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Ips")
    public String ips;

    public static QueryMSDdcsClientValueRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMSDdcsClientValueRequest self = new QueryMSDdcsClientValueRequest();
        return TeaModel.build(map, self);
    }

    public QueryMSDdcsClientValueRequest setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
        return this;
    }
    public Long getAttributeId() {
        return this.attributeId;
    }

    public QueryMSDdcsClientValueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMSDdcsClientValueRequest setIps(String ips) {
        this.ips = ips;
        return this;
    }
    public String getIps() {
        return this.ips;
    }

}
