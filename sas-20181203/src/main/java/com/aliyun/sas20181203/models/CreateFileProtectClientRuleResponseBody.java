// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileProtectClientRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>ACF97412-FD09-4D1F-994F-34DF12BREF20</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateFileProtectClientRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFileProtectClientRuleResponseBody self = new CreateFileProtectClientRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFileProtectClientRuleResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateFileProtectClientRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
