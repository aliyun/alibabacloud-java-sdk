// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupClientsRequest extends TeaModel {
    /**
     * <p>The region in which the anti-ransomware feature is supported.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeSupportRegion~~">DescribeSupportRegion</a> operation to query the regions in which the anti-ransomware feature is supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SupportRegionId")
    public String supportRegionId;

    public static DescribeBackupClientsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupClientsRequest self = new DescribeBackupClientsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupClientsRequest setSupportRegionId(String supportRegionId) {
        this.supportRegionId = supportRegionId;
        return this;
    }
    public String getSupportRegionId() {
        return this.supportRegionId;
    }

}
