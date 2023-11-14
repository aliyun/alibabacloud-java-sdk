// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyImageFixCycleConfigResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the configurations of the scheduled image fix are modified.</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyImageFixCycleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageFixCycleConfigResponseBody self = new ModifyImageFixCycleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyImageFixCycleConfigResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ModifyImageFixCycleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
