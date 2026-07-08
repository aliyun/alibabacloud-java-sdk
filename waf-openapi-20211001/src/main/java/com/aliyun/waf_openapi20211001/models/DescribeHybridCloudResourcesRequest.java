// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudResourcesRequest extends TeaModel {
    /**
     * <p>The IP address or domain name of the origin server that corresponds to the domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.XX.XX</p>
     */
    @NameInMap("Backend")
    public String backend;

    /**
     * <p>Specifies whether to enable public cloud disaster recovery. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CnameEnabled")
    public Boolean cnameEnabled;

    /**
     * <p>The domain name to query.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-***********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number to return when paging is used. Default value: <strong>1</strong>, which indicates the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page when paging is used. Default value: <strong>10</strong>, which indicates 10 entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

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
     * <p>rg-acfmvtc5z52****</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static DescribeHybridCloudResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudResourcesRequest self = new DescribeHybridCloudResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudResourcesRequest setBackend(String backend) {
        this.backend = backend;
        return this;
    }
    public String getBackend() {
        return this.backend;
    }

    public DescribeHybridCloudResourcesRequest setCnameEnabled(Boolean cnameEnabled) {
        this.cnameEnabled = cnameEnabled;
        return this;
    }
    public Boolean getCnameEnabled() {
        return this.cnameEnabled;
    }

    public DescribeHybridCloudResourcesRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeHybridCloudResourcesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeHybridCloudResourcesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHybridCloudResourcesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeHybridCloudResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHybridCloudResourcesRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
