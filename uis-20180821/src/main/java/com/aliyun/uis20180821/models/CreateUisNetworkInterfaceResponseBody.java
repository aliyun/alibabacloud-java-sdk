// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class CreateUisNetworkInterfaceResponseBody extends TeaModel {
    @NameInMap("UisEniId")
    public String uisEniId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateUisNetworkInterfaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUisNetworkInterfaceResponseBody self = new CreateUisNetworkInterfaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUisNetworkInterfaceResponseBody setUisEniId(String uisEniId) {
        this.uisEniId = uisEniId;
        return this;
    }
    public String getUisEniId() {
        return this.uisEniId;
    }

    public CreateUisNetworkInterfaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
