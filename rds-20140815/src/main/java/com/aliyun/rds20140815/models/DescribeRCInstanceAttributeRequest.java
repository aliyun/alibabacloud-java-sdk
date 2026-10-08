// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceAttributeRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-dh2jf9n6j4s14926****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-node</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The maximum number of disks returned in the response. Valid values: 10 to 500.</p>
     * <ul>
     * <li>If this parameter is not specified, the default value is 20.</li>
     * <li>If the specified value is less than 10, the value is set to 10.</li>
     * <li>If the specified value is from 10 to 500, the specified value is used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxDisksResults")
    public Long maxDisksResults;

    /**
     * <p>The private IP address of the instance in the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XXX.XXX</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeRCInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstanceAttributeRequest self = new DescribeRCInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstanceAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRCInstanceAttributeRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeRCInstanceAttributeRequest setMaxDisksResults(Long maxDisksResults) {
        this.maxDisksResults = maxDisksResults;
        return this;
    }
    public Long getMaxDisksResults() {
        return this.maxDisksResults;
    }

    public DescribeRCInstanceAttributeRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public DescribeRCInstanceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
