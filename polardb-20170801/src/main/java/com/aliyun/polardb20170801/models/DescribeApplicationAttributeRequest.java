// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationAttributeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    public static DescribeApplicationAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationAttributeRequest self = new DescribeApplicationAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationAttributeRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

}
