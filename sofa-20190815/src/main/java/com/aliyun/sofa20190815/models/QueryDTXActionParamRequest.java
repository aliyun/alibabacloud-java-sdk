// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDTXActionParamRequest extends TeaModel {
    @NameInMap("Env")
    public String env;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TenantName")
    public String tenantName;

    public static QueryDTXActionParamRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDTXActionParamRequest self = new QueryDTXActionParamRequest();
        return TeaModel.build(map, self);
    }

    public QueryDTXActionParamRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public QueryDTXActionParamRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryDTXActionParamRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
