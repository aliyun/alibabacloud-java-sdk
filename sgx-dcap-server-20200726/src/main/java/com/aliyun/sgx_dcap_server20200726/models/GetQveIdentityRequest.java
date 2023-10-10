// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgx_dcap_server20200726.models;

import com.aliyun.tea.*;

public class GetQveIdentityRequest extends TeaModel {
    @NameInMap("AcsHost")
    public String acsHost;

    @NameInMap("ClientVpcId")
    public String clientVpcId;

    public static GetQveIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQveIdentityRequest self = new GetQveIdentityRequest();
        return TeaModel.build(map, self);
    }

    public GetQveIdentityRequest setAcsHost(String acsHost) {
        this.acsHost = acsHost;
        return this;
    }
    public String getAcsHost() {
        return this.acsHost;
    }

    public GetQveIdentityRequest setClientVpcId(String clientVpcId) {
        this.clientVpcId = clientVpcId;
        return this;
    }
    public String getClientVpcId() {
        return this.clientVpcId;
    }

}
