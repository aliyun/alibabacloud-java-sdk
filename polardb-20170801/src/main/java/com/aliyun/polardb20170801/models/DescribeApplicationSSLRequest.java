// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationSSLRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-xxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    public static DescribeApplicationSSLRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationSSLRequest self = new DescribeApplicationSSLRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationSSLRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

}
