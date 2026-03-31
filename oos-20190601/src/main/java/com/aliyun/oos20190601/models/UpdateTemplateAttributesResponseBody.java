// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateTemplateAttributesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A5320F1D-92D9-44BB-A416-5FC525ED6D57</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTemplateAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateAttributesResponseBody self = new UpdateTemplateAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
