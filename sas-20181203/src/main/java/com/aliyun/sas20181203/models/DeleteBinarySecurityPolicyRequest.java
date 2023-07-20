// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteBinarySecurityPolicyRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DeleteBinarySecurityPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBinarySecurityPolicyRequest self = new DeleteBinarySecurityPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBinarySecurityPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteBinarySecurityPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteBinarySecurityPolicyRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
