// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class SyncComponentTemplateConfigResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>ture</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static SyncComponentTemplateConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncComponentTemplateConfigResponseBody self = new SyncComponentTemplateConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncComponentTemplateConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncComponentTemplateConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
