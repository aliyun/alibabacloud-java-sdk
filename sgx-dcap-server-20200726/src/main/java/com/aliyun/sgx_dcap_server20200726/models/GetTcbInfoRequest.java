// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgx_dcap_server20200726.models;

import com.aliyun.tea.*;

public class GetTcbInfoRequest extends TeaModel {
    @NameInMap("AcsHost")
    public String acsHost;

    @NameInMap("ClientVpcId")
    public String clientVpcId;

    @NameInMap("fmspc")
    public String fmspc;

    public static GetTcbInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTcbInfoRequest self = new GetTcbInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetTcbInfoRequest setAcsHost(String acsHost) {
        this.acsHost = acsHost;
        return this;
    }
    public String getAcsHost() {
        return this.acsHost;
    }

    public GetTcbInfoRequest setClientVpcId(String clientVpcId) {
        this.clientVpcId = clientVpcId;
        return this;
    }
    public String getClientVpcId() {
        return this.clientVpcId;
    }

    public GetTcbInfoRequest setFmspc(String fmspc) {
        this.fmspc = fmspc;
        return this;
    }
    public String getFmspc() {
        return this.fmspc;
    }

}
