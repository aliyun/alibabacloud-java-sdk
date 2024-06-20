// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourcesRequest extends TeaModel {
    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to obtain the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The query conditions. Specify the value of this parameter as a string in the JSON format.</p>
     * <blockquote>
     * <p> The results vary based on the query condition. For more information, see the &quot;<strong>Query parameters</strong>&quot; section in this topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;product\&quot;:\&quot;waf\&quot;}</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou:</strong> the Chinese mainland.</li>
     * <li><strong>ap-southeast-1:</strong> outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The tags of the resources that you want to query. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDefenseResourcesRequestTag> tag;

    public static DescribeDefenseResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseResourcesRequest self = new DescribeDefenseResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseResourcesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDefenseResourcesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDefenseResourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDefenseResourcesRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public DescribeDefenseResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDefenseResourcesRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeDefenseResourcesRequest setTag(java.util.List<DescribeDefenseResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDefenseResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeDefenseResourcesRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>Tagkey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TagValue1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDefenseResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefenseResourcesRequestTag self = new DescribeDefenseResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDefenseResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDefenseResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
