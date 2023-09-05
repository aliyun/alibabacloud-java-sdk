// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgx_dcap_server20200726.models;

import com.aliyun.tea.*;

public class PckCrlRequest extends TeaModel {
    @NameInMap("ca")
    public String ca;

    public static PckCrlRequest build(java.util.Map<String, ?> map) throws Exception {
        PckCrlRequest self = new PckCrlRequest();
        return TeaModel.build(map, self);
    }

    public PckCrlRequest setCa(String ca) {
        this.ca = ca;
        return this;
    }
    public String getCa() {
        return this.ca;
    }

}
