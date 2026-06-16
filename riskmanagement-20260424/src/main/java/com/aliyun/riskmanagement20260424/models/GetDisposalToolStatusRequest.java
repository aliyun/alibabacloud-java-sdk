// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetDisposalToolStatusRequest extends TeaModel {
    @NameInMap("AuthType")
    public String authType;

    public static GetDisposalToolStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDisposalToolStatusRequest self = new GetDisposalToolStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetDisposalToolStatusRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

}
