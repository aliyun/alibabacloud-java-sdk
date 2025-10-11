// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationParametersShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("ComponentIdList")
    public String componentIdListShrink;

    public static DescribeApplicationParametersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationParametersShrinkRequest self = new DescribeApplicationParametersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationParametersShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribeApplicationParametersShrinkRequest setComponentIdListShrink(String componentIdListShrink) {
        this.componentIdListShrink = componentIdListShrink;
        return this;
    }
    public String getComponentIdListShrink() {
        return this.componentIdListShrink;
    }

}
