// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateTemplateQuotaItemResponseBody extends TeaModel {
    /**
     * <p>The ID of the quota template.</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateTemplateQuotaItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateQuotaItemResponseBody self = new CreateTemplateQuotaItemResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTemplateQuotaItemResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateTemplateQuotaItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
