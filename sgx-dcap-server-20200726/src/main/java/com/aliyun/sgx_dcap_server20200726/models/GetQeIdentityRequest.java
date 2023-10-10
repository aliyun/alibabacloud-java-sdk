// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgx_dcap_server20200726.models;

import com.aliyun.tea.*;

public class GetQeIdentityRequest extends TeaModel {
    @NameInMap("AcsHost")
    public String acsHost;

    @NameInMap("ClientVpcId")
    public String clientVpcId;

    public static GetQeIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQeIdentityRequest self = new GetQeIdentityRequest();
        return TeaModel.build(map, self);
    }

    public GetQeIdentityRequest setAcsHost(String acsHost) {
        this.acsHost = acsHost;
        return this;
    }
    public String getAcsHost() {
        return this.acsHost;
    }

    public GetQeIdentityRequest setClientVpcId(String clientVpcId) {
        this.clientVpcId = clientVpcId;
        return this;
    }
    public String getClientVpcId() {
        return this.clientVpcId;
    }

}
