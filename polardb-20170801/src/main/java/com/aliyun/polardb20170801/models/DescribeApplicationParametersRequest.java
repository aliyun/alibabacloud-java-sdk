// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationParametersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("ComponentIdList")
    public java.util.List<String> componentIdList;

    public static DescribeApplicationParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationParametersRequest self = new DescribeApplicationParametersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationParametersRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribeApplicationParametersRequest setComponentIdList(java.util.List<String> componentIdList) {
        this.componentIdList = componentIdList;
        return this;
    }
    public java.util.List<String> getComponentIdList() {
        return this.componentIdList;
    }

}
