// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDomainsRequest extends TeaModel {
    /**
     * <p>An array of HTTPS listener ports.</p>
     */
    @NameInMap("Backend")
    public String backend;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The page number of the page to return. Default value: 1.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The HTTPS address of the origin server.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>Queries the list of a domain name that is added to Web Application Firewall (WAF).</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou:** the Chinese mainland.</p>
     * <p>*   **ap-southeast-1:** outside the Chinese mainland.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The source IP address. The value of this parameter is specified by the system.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The tag of the resource. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDomainsRequestTag> tag;

    public static DescribeDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainsRequest self = new DescribeDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainsRequest setBackend(String backend) {
        this.backend = backend;
        return this;
    }
    public String getBackend() {
        return this.backend;
    }

    public DescribeDomainsRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDomainsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDomainsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDomainsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeDomainsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeDomainsRequest setTag(java.util.List<DescribeDomainsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDomainsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeDomainsRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDomainsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsRequestTag self = new DescribeDomainsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDomainsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
