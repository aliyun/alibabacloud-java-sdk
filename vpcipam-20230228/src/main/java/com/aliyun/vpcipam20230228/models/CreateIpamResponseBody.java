// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class CreateIpamResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ipam-ccxbnsbhew0d6t****</p>
     */
    @NameInMap("IpamId")
    public String ipamId;

    /**
     * <strong>example:</strong>
     * <p>ipam-scope-8wiontzmiy6cg0****</p>
     */
    @NameInMap("PrivateDefaultScopeId")
    public String privateDefaultScopeId;

    /**
     * <strong>example:</strong>
     * <p>ipam-scope-r5c5c7bmym1brc****</p>
     */
    @NameInMap("PublicDefaultScopeId")
    public String publicDefaultScopeId;

    /**
     * <strong>example:</strong>
     * <p>0ED8D006-F706-4D23-88ED-E11ED39DCAC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateIpamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIpamResponseBody self = new CreateIpamResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIpamResponseBody setIpamId(String ipamId) {
        this.ipamId = ipamId;
        return this;
    }
    public String getIpamId() {
        return this.ipamId;
    }

    public CreateIpamResponseBody setPrivateDefaultScopeId(String privateDefaultScopeId) {
        this.privateDefaultScopeId = privateDefaultScopeId;
        return this;
    }
    public String getPrivateDefaultScopeId() {
        return this.privateDefaultScopeId;
    }

    public CreateIpamResponseBody setPublicDefaultScopeId(String publicDefaultScopeId) {
        this.publicDefaultScopeId = publicDefaultScopeId;
        return this;
    }
    public String getPublicDefaultScopeId() {
        return this.publicDefaultScopeId;
    }

    public CreateIpamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
