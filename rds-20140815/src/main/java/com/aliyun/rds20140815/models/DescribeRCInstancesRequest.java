// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstancesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Description")
    public String description;

    @NameInMap("DescriptionForFuzzy")
    public String descriptionForFuzzy;

    /**
     * <p>Queries instances by host IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.XX.XX</p>
     */
    @NameInMap("HostIp")
    public String hostIp;

    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The instance ID. This parameter is used to query a single instance.</p>
     * <blockquote>
     * <p>If no instance ID is specified (neither <strong>InstanceId</strong> nor <strong>InstanceIds</strong> is passed), the operation returns detailed information about all RDS Custom instances in the specified region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rc-i2p26bde8bckf141****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance IDs.</p>
     * <p>This parameter is used to query multiple instances at a time. Separate multiple instance IDs with commas (,). A maximum of 100 IDs are supported. Input format: <code>[&quot;InstanceID1&quot;,&quot;InstanceID2&quot;]</code>.</p>
     * <blockquote>
     * <p>If both <strong>InstanceIds</strong> and <strong>InstanceId</strong> are specified, the value of <strong>InstanceIds</strong> takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;rc-i2p26bde8bckf141****&quot;,&quot;rc-l1753m982otq2s2m****&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-node</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The page number of the instance status list.</p>
     * <p>Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for a paged query.</p>
     * <p>Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Queries instances by public IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>121.89.XX.XX</p>
     */
    @NameInMap("PublicIp")
    public String publicIp;

    /**
     * <p>The region ID. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The instance status. Valid values:</p>
     * <ul>
     * <li><strong>Pending</strong>: Being created.</li>
     * <li><strong>Running</strong>: Running.</li>
     * <li><strong>Starting</strong>: Being started.</li>
     * <li><strong>Stopping</strong>: Being stopped.</li>
     * <li><strong>Stopped</strong>: Stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Queries instances by the specified tag. Input format: <code>{&quot;TagKey&quot;:&quot;TagValue&quot;}</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;testRC&quot;:&quot;test01&quot;}</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
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

    public DescribeRCInstancesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeRCInstancesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeRCInstancesRequest setDescriptionForFuzzy(String descriptionForFuzzy) {
        this.descriptionForFuzzy = descriptionForFuzzy;
        return this;
    }
    public String getDescriptionForFuzzy() {
        return this.descriptionForFuzzy;
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
