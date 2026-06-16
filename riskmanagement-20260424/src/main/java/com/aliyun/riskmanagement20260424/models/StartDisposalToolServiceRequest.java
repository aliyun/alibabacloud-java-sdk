// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class StartDisposalToolServiceRequest extends TeaModel {
    @NameInMap("AuthType")
    public String authType;

    public static StartDisposalToolServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDisposalToolServiceRequest self = new StartDisposalToolServiceRequest();
        return TeaModel.build(map, self);
    }

    public StartDisposalToolServiceRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

}
