// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class DeleteTemplateQuotaItemResponseBody extends TeaModel {
    /**
     * <p>The ID of the quota template.</p>
     * 
     * <strong>example:</strong>
     * <p>1****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D47B3A10-CDAC-5412-B2EE-EC9A3DBE9053</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTemplateQuotaItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplateQuotaItemResponseBody self = new DeleteTemplateQuotaItemResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTemplateQuotaItemResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteTemplateQuotaItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
