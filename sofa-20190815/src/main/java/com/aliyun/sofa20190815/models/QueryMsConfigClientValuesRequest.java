// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsConfigClientValuesRequest extends TeaModel {
    @NameInMap("AttributeId")
    public Long attributeId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Ips")
    public String ips;

    public static QueryMsConfigClientValuesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsConfigClientValuesRequest self = new QueryMsConfigClientValuesRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsConfigClientValuesRequest setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
        return this;
    }
    public Long getAttributeId() {
        return this.attributeId;
    }

    public QueryMsConfigClientValuesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMsConfigClientValuesRequest setIps(String ips) {
        this.ips = ips;
        return this;
    }
    public String getIps() {
        return this.ips;
    }

}
