// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("AcountName")
    public String acountName;

    public static CreateAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountResponseBody self = new CreateAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAccountResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAccountResponseBody setAcountName(String acountName) {
        this.acountName = acountName;
        return this;
    }
    public String getAcountName() {
        return this.acountName;
    }

}
