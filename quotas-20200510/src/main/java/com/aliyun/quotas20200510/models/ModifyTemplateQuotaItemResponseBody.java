// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ModifyTemplateQuotaItemResponseBody extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTemplateQuotaItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTemplateQuotaItemResponseBody self = new ModifyTemplateQuotaItemResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTemplateQuotaItemResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyTemplateQuotaItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
