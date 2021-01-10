// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDTXBiztypeRelationRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryDTXBiztypeRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDTXBiztypeRelationRequest self = new QueryDTXBiztypeRelationRequest();
        return TeaModel.build(map, self);
    }

    public QueryDTXBiztypeRelationRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryDTXBiztypeRelationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
