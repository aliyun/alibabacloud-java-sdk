// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstancesRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <p>Query by instance host IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.XX.XX</p>
     */
    @NameInMap("HostIp")
    public String hostIp;

    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-i2p26bde8bckf141****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is used to query multiple instances simultaneously. Separate instance IDs with English commas (,), and up to 100 IDs are supported. The input format is: <code>[&quot;instance ID 1&quot;,&quot;instance ID 2&quot;]</code>.</p>
     * <blockquote>
     * <p>When both <strong>InstanceIds</strong> and <strong>instanceId</strong> are provided, the value of <strong>InstanceIds</strong> takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;rc-i2p26bde8bckf141****&quot;,&quot;rc-l1753m982otq2s2m****&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>Instance Name</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-node</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The page number.</p>
     * <p>Page starts from page 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Maximum value: 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Query by instance public IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>121.89.XX.XX</p>
     */
    @NameInMap("PublicIp")
    public String publicIp;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Instance status. Valid values:  </p>
     * <ul>
     * <li><strong>Pending</strong>: Creation in progress.  </li>
     * <li><strong>Running</strong>: Running.  </li>
     * <li><strong>Starting</strong>: Starting.  </li>
     * <li><strong>Stopping</strong>: Pausing.  </li>
     * <li><strong>Stopped</strong>: Paused.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Query by specified tag. The input format is: <code>{&quot;TagKey&quot;:&quot;TagValue&quot;}</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;testRC&quot;:&quot;test01&quot;}</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The virtual private cloud (VPC) ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6f7l4fg90****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeRCInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstancesRequest self = new DescribeRCInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstancesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeRCInstancesRequest setHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }
    public String getHostIp() {
        return this.hostIp;
    }

    public DescribeRCInstancesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeRCInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRCInstancesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeRCInstancesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeRCInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRCInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRCInstancesRequest setPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }
    public String getPublicIp() {
        return this.publicIp;
    }

    public DescribeRCInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRCInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeRCInstancesRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public DescribeRCInstancesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
