// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserAssetRequest extends TeaModel {
    /**
     * <p>The ID of the hybrid cloud cluster.</p>
     * <blockquote>
     * <p>This parameter applies only to hybrid cloud scenarios. Call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to query information about hybrid cloud clusters.</p>
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
     * <li><p><strong>asset_num</strong>: the total number of API assets.</p>
     * </li>
     * <li><p><strong>asset_active</strong>: the number of active APIs.</p>
     * </li>
     * <li><p><strong>asset_newborn</strong>: the number of APIs that are added today.</p>
     * </li>
     * <li><p><strong>asset_offline</strong>: the number of inactive APIs.</p>
     * </li>
     * <li><p><strong>asset_bot</strong>: the number of APIs that receive bot requests.</p>
     * </li>
     * <li><p><strong>asset_cross_border</strong>: the number of APIs that are used for cross-border data transmission.</p>
     * </li>
     * <li><p><strong>sensitive_api</strong>: the number of APIs whose responses contain sensitive data.</p>
     * </li>
     * <li><p><strong>sensitive_domain</strong>: the number of sites whose responses contain sensitive data.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asset_num</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The time to query. The value is a UNIX timestamp in seconds. The time is in Coordinated Universal Time (UTC).</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>1723435200</p>
     */
    @NameInMap("Days")
    @Deprecated
    public String days;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-uax37ijm***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
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
