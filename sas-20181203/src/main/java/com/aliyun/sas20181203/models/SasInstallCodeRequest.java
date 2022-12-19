// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SasInstallCodeRequest extends TeaModel {
    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    public static SasInstallCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        SasInstallCodeRequest self = new SasInstallCodeRequest();
        return TeaModel.build(map, self);
    }

    public SasInstallCodeRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
