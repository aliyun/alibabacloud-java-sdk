// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetInterceptionTargetDetailRequest extends TeaModel {
    /**
     * <p>The ID of the network object.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListInterceptionTargetPage~~">ListInterceptionTargetPage</a> operation to query the IDs of network objects.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>402008</p>
     */
    @NameInMap("TargetId")
    public Long targetId;

    public static GetInterceptionTargetDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInterceptionTargetDetailRequest self = new GetInterceptionTargetDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetInterceptionTargetDetailRequest setTargetId(Long targetId) {
        this.targetId = targetId;
        return this;
    }
    public Long getTargetId() {
        return this.targetId;
    }

}
