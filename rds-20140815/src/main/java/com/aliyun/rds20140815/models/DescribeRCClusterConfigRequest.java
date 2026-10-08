// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCClusterConfigRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The validity period of the temporary KubeConfig. Unit: minutes. Valid values: 15 (15 minutes) to 4320 (3 days).</p>
     * <blockquote>
     * <p>If this parameter is not specified, the system automatically determines a longer validity period. The specific expiration time is indicated by the value of the <code>expiration</code> field in the response.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TemporaryDurationMinutes")
    public Integer temporaryDurationMinutes;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     * <blockquote>
     * <p>Reserved parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeRCClusterConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCClusterConfigRequest self = new DescribeRCClusterConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRCClusterConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRCClusterConfigRequest setTemporaryDurationMinutes(Integer temporaryDurationMinutes) {
        this.temporaryDurationMinutes = temporaryDurationMinutes;
        return this;
    }
    public Integer getTemporaryDurationMinutes() {
        return this.temporaryDurationMinutes;
    }

    public DescribeRCClusterConfigRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
