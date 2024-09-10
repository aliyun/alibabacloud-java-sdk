// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAgentlessTaskCountRequest extends TeaModel {
    /**
     * <p>The instance ID of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>s-m5edddcwq7d57d******</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>Specifies the type of the object being inspected. Valid values:</p>
     * <ul>
     * <li><strong>3</strong>: User Snapshot.</li>
     * <li><strong>4</strong>: User Image.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TargetType")
    public Integer targetType;

    public static GetAgentlessTaskCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentlessTaskCountRequest self = new GetAgentlessTaskCountRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentlessTaskCountRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public GetAgentlessTaskCountRequest setTargetType(Integer targetType) {
        this.targetType = targetType;
        return this;
    }
    public Integer getTargetType() {
        return this.targetType;
    }

}
