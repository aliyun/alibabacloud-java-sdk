// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateWebApplicationScalingConfigInput extends TeaModel {
    /**
     * <p>The maximum number of instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaximumInstanceCount")
    public Long maximumInstanceCount;

    /**
     * <p>The minimum number of instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinimumInstanceCount")
    public Long minimumInstanceCount;

    public static UpdateWebApplicationScalingConfigInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebApplicationScalingConfigInput self = new UpdateWebApplicationScalingConfigInput();
        return TeaModel.build(map, self);
    }

    public UpdateWebApplicationScalingConfigInput setMaximumInstanceCount(Long maximumInstanceCount) {
        this.maximumInstanceCount = maximumInstanceCount;
        return this;
    }
    public Long getMaximumInstanceCount() {
        return this.maximumInstanceCount;
    }

    public UpdateWebApplicationScalingConfigInput setMinimumInstanceCount(Long minimumInstanceCount) {
        this.minimumInstanceCount = minimumInstanceCount;
        return this;
    }
    public Long getMinimumInstanceCount() {
        return this.minimumInstanceCount;
    }

}
