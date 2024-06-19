// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateAccountResponseBody extends TeaModel {
    /**
     * <p>The name of the account.</p>
     * 
     * <strong>example:</strong>
     * <p>demoaccount</p>
     */
    @NameInMap("AcountName")
    public String acountName;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABAF95F6-35C1-4177-AF3A-70969EBD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountResponseBody self = new CreateAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccountResponseBody setAcountName(String acountName) {
        this.acountName = acountName;
        return this;
    }
    public String getAcountName() {
        return this.acountName;
    }

    public CreateAccountResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
