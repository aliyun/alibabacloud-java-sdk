// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyApplicationServerlessConfResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>D0CEC6AC-7760-409A-A0D5-E6CD86******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyApplicationServerlessConfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationServerlessConfResponseBody self = new ModifyApplicationServerlessConfResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationServerlessConfResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ModifyApplicationServerlessConfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
