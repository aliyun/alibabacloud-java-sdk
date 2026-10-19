// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairSkvDdbTableRequest extends TeaModel {
    /**
     * <p>The ID of the instance to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tt-bp1zxszhcgatnx\<em>\</em>\<em>\</em></p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeTairSkvDdbTableRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairSkvDdbTableRequest self = new DescribeTairSkvDdbTableRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTairSkvDdbTableRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTairSkvDdbTableRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
