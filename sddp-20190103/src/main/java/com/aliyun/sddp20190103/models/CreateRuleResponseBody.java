// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateRuleResponseBody extends TeaModel {
    /**
     * <p>The unique ID of the sensitive data detection rule.</p>
     */
    @NameInMap("Id")
    public Integer id;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRuleResponseBody self = new CreateRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRuleResponseBody setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public CreateRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
