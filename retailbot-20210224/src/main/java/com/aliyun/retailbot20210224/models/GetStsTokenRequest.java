// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GetStsTokenRequest extends TeaModel {
    @NameInMap("AccessKey")
    public String accessKey;

    @NameInMap("AccessSecret")
    public String accessSecret;

    @NameInMap("TenantId")
    public Long tenantId;

    public static GetStsTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStsTokenRequest self = new GetStsTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetStsTokenRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public GetStsTokenRequest setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }
    public String getAccessSecret() {
        return this.accessSecret;
    }

    public GetStsTokenRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
