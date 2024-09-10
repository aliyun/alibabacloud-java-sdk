// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteContainerPluginRuleResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the container plug-in is manually deleted. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB3936FA7</p>
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
