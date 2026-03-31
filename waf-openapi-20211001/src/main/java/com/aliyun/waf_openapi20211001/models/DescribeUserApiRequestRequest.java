// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserApiRequestRequest extends TeaModel {
    /**
     * <p>The API.</p>
     * <blockquote>
     * <p>Notice: This parameter is deprecated, please use ApiId to query.</p>
     * </blockquote>
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
     * <p>For hybrid cloud scenarios only, you can call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to query the hybrid cloud clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>428</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The domain name or IP address of the API.</p>
     * <blockquote>
     * <p>Notice: This parameter is deprecated, please use ApiId to query.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c.***.com</p>
     */
    @NameInMap("Domain")
    @Deprecated
    public String domain;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-zxu38***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region in which the WAF instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Chinese mainland</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland</li>
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
     * <p>The type of the statistics. Valid values:</p>
     * <ul>
     * <li><strong>api_ip</strong>: total traffic</li>
     * <li><strong>api_cross_border_ip</strong>: cross-border traffic</li>
     * <li><strong>api_bot_ip</strong>: bot traffic</li>
     * <li><strong>remote_region</strong>: geographical location</li>
     * <li><strong>client_id</strong>: client type</li>
     * <li><strong>http_referer</strong>: Referer</li>
     * <li><strong>api_cnt</strong>: total number of calls</li>
     * <li><strong>bot_cnt</strong>: number of bot calls</li>
     * <li><strong>cross_border_cnt</strong>: number of cross-border requests</li>
     * <li><strong>api_freq</strong>: call frequency</li>
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
