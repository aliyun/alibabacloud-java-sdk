// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class QueryAutoShutdownPoliciesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dsw-730xxxxxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Token")
    public String token;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static QueryAutoShutdownPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAutoShutdownPoliciesRequest self = new QueryAutoShutdownPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public QueryAutoShutdownPoliciesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryAutoShutdownPoliciesRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public QueryAutoShutdownPoliciesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
