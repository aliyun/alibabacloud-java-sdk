// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationBackupPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The application type, such as polarclaw.</p>
     * 
     * <strong>example:</strong>
     * <p>polarclaw</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>The region ID of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeApplicationBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationBackupPolicyRequest self = new DescribeApplicationBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationBackupPolicyRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribeApplicationBackupPolicyRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public DescribeApplicationBackupPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
