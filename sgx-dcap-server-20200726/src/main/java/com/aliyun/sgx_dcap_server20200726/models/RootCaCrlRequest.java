// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgx_dcap_server20200726.models;

import com.aliyun.tea.*;

public class RootCaCrlRequest extends TeaModel {
    @NameInMap("AcsHost")
    public String acsHost;

    @NameInMap("ClientVpcId")
    public String clientVpcId;

    public static RootCaCrlRequest build(java.util.Map<String, ?> map) throws Exception {
        RootCaCrlRequest self = new RootCaCrlRequest();
        return TeaModel.build(map, self);
    }

    public RootCaCrlRequest setAcsHost(String acsHost) {
        this.acsHost = acsHost;
        return this;
    }
    public String getAcsHost() {
        return this.acsHost;
    }

    public RootCaCrlRequest setClientVpcId(String clientVpcId) {
        this.clientVpcId = clientVpcId;
        return this;
    }
    public String getClientVpcId() {
        return this.clientVpcId;
    }

}
