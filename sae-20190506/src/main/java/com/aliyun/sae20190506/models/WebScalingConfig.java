// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebScalingConfig extends TeaModel {
    /**
     * <p>The maximum number of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaximumInstanceCount")
    public Long maximumInstanceCount;

    /**
     * <p>The minimum number of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinimumInstanceCount")
    public Long minimumInstanceCount;

    public static WebScalingConfig build(java.util.Map<String, ?> map) throws Exception {
        WebScalingConfig self = new WebScalingConfig();
        return TeaModel.build(map, self);
    }

    public WebScalingConfig setMaximumInstanceCount(Long maximumInstanceCount) {
        this.maximumInstanceCount = maximumInstanceCount;
        return this;
    }
    public Long getMaximumInstanceCount() {
        return this.maximumInstanceCount;
    }

    public WebScalingConfig setMinimumInstanceCount(Long minimumInstanceCount) {
        this.minimumInstanceCount = minimumInstanceCount;
        return this;
    }
    public Long getMinimumInstanceCount() {
        return this.minimumInstanceCount;
    }

}
