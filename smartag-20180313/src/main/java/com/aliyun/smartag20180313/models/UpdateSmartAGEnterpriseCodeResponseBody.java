// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAGEnterpriseCodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSmartAGEnterpriseCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAGEnterpriseCodeResponseBody self = new UpdateSmartAGEnterpriseCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAGEnterpriseCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
