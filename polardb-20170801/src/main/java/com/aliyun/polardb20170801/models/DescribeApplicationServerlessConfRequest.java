// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationServerlessConfRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    public static DescribeApplicationServerlessConfRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationServerlessConfRequest self = new DescribeApplicationServerlessConfRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationServerlessConfRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

}
