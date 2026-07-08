// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserApiRequestRequest extends TeaModel {
    /**
     * <p>The API operation.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is deprecated. Use the ApiId parameter instead.</p>
     * 
     * <strong>example:</strong>
     * <p>/api/v1/know</p>
     */
    @NameInMap("ApiFormat")
    @Deprecated
    public String apiFormat;

    /**
     * <p>The ID of the API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3799f0695c0d687f3295d132fe49bc14</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The ID of the hybrid cloud cluster.</p>
     * <blockquote>
     * <p>This parameter applies only to hybrid cloud scenarios. Call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to obtain information about hybrid cloud clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>428</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The domain name or IP address of the API operation.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is deprecated. Use the ApiId parameter instead.</p>
     * 
     * <strong>example:</strong>
     * <p>c.***.com</p>
     */
    @NameInMap("Domain")
    @Deprecated
    public String domain;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-zxu38***</p>
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

    /**
     * <p>The type of statistics. Valid values:</p>
     * <ul>
     * <li><p><strong>api_ip</strong>: total traffic.</p>
     * </li>
     * <li><p><strong>api_cross_border_ip</strong>: cross-border traffic.</p>
     * </li>
     * <li><p><strong>api_bot_ip</strong>: bot traffic.</p>
     * </li>
     * <li><p><strong>remote_region</strong>: geographic location statistics.</p>
     * </li>
     * <li><p><strong>client_id</strong>: client type statistics.</p>
     * </li>
     * <li><p><strong>http_referer</strong>: Referer statistics.</p>
     * </li>
     * <li><p><strong>api_cnt</strong>: total number of calls.</p>
     * </li>
     * <li><p><strong>bot_cnt</strong>: number of bot requests.</p>
     * </li>
     * <li><p><strong>cross_border_cnt</strong>: number of cross-border requests.</p>
     * </li>
     * <li><p><strong>api_freq</strong>: call frequency.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>api_ip</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeUserApiRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserApiRequestRequest self = new DescribeUserApiRequestRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public DescribeUserApiRequestRequest setApiFormat(String apiFormat) {
        this.apiFormat = apiFormat;
        return this;
    }
    public String getApiFormat() {
        return this.apiFormat;
    }

    public DescribeUserApiRequestRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeUserApiRequestRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    @Deprecated
    public DescribeUserApiRequestRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeUserApiRequestRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeUserApiRequestRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeUserApiRequestRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeUserApiRequestRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
