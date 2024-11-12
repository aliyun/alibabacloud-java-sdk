// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class UnTagResourcesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C46FF5A8-C5F0-4024-8262-B16B639225A0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the tags are removed. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UnTagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnTagResourcesResponseBody self = new UnTagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public UnTagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnTagResourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
