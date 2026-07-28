// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationUsageRequest extends TeaModel {
    /**
     * <p>The Hermes application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-123456</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The number of recent days to query. Valid values: 1 to 365. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Days")
    public Integer days;

    public static DescribeApplicationUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationUsageRequest self = new DescribeApplicationUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationUsageRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribeApplicationUsageRequest setDays(Integer days) {
        this.days = days;
        return this;
    }
    public Integer getDays() {
        return this.days;
    }

}
