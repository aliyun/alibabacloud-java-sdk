// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteContainerPluginRuleResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the container plug-in is manually deleted. Valid values:</p>
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

    public static DeleteContainerPluginRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteContainerPluginRuleResponseBody self = new DeleteContainerPluginRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteContainerPluginRuleResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteContainerPluginRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
