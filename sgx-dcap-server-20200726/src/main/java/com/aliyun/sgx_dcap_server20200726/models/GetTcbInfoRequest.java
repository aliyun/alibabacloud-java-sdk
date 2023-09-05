// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgx_dcap_server20200726.models;

import com.aliyun.tea.*;

public class GetTcbInfoRequest extends TeaModel {
    @NameInMap("fmspc")
    public String fmspc;

    public static GetTcbInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTcbInfoRequest self = new GetTcbInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetTcbInfoRequest setFmspc(String fmspc) {
        this.fmspc = fmspc;
        return this;
    }
    public String getFmspc() {
        return this.fmspc;
    }

}
