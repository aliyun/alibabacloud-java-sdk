// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserAssetRequest extends TeaModel {
    /**
     * <p>The ID of the hybrid cloud cluster.</p>
     * <blockquote>
     * <p>This parameter applies only to hybrid cloud scenarios. You can call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to obtain hybrid cloud cluster information.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>428</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The type of statistics. Valid values:</p>
     * <ul>
     * <li><strong>asset_num</strong>: total number of API assets.</li>
     * <li><strong>asset_active</strong>: number of active APIs.</li>
     * <li><strong>asset_newborn</strong>: number of APIs added today.</li>
     * <li><strong>asset_offline</strong>: number of inactive APIs.</li>
     * <li><strong>asset_bot</strong>: number of APIs with bot requests.</li>
     * <li><strong>asset_cross_border</strong>: number of APIs with cross-border data transfer.</li>
     * <li><strong>sensitive_api</strong>: number of APIs with sensitive data in responses.</li>
     * <li><strong>sensitive_domain</strong>: number of sites with sensitive data in responses.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asset_num</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The query time in UNIX timestamp format (UTC). Unit: seconds.</p>
     * <blockquote>
     * <p>Notice: This parameter is deprecated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1723435200</p>
     */
    @NameInMap("Days")
    @Deprecated
    public String days;

    /**
     * <p>Instance ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-uax37ijm***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region where the WAF instance is deployed. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static DescribeUserAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAssetRequest self = new DescribeUserAssetRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserAssetRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeUserAssetRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    @Deprecated
    public DescribeUserAssetRequest setDays(String days) {
        this.days = days;
        return this;
    }
    public String getDays() {
        return this.days;
    }

    public DescribeUserAssetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeUserAssetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeUserAssetRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
