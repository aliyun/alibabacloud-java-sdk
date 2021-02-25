// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryServiceConfigRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ViewCode")
    public String viewCode;

    @NameInMap("Parameters")
    public String parameters;

    public static QueryServiceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryServiceConfigRequest self = new QueryServiceConfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryServiceConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryServiceConfigRequest setViewCode(String viewCode) {
        this.viewCode = viewCode;
        return this;
    }
    public String getViewCode() {
        return this.viewCode;
    }

    public QueryServiceConfigRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

}
