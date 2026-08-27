// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListTemplateScratchesRequest extends TeaModel {
    /**
     * <p>The page number of the resource scenario list.</p>
     * <p>Start value: 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page in a paged query. Settings for paging.</p>
     * <p>Maximum value: 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the resource scenario.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the resource scenario. Valid values:</p>
     * <ul>
     * <li>GENERATE_IN_PROGRESS: being generated.</li>
     * <li>GENERATE_COMPLETE: generated.</li>
     * <li>GENERATE_FAILED: failed to be generated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;GENERATE_COMPLETE&quot;]</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags of the resource scenario.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListTemplateScratchesRequestTags> tags;

    /**
     * <p>The ID of the resource scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>ts-7f7a704cf71c49a6****</p>
     */
    @NameInMap("TemplateScratchId")
    public String templateScratchId;

    /**
     * <p>The type of the resource scenario. Valid values:</p>
     * <ul>
     * <li><p>ArchitectureReplication: resource replication.</p>
     * </li>
     * <li><p>ArchitectureDetection: resource detection.</p>
     * </li>
     * <li><p>ResourceImport: resource management.</p>
     * </li>
     * <li><p>ResourceMigration: resource migration.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ArchitectureReplication</p>
     */
    @NameInMap("TemplateScratchType")
    public String templateScratchType;

    public static ListTemplateScratchesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateScratchesRequest self = new ListTemplateScratchesRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplateScratchesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTemplateScratchesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTemplateScratchesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTemplateScratchesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListTemplateScratchesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTemplateScratchesRequest setTags(java.util.List<ListTemplateScratchesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListTemplateScratchesRequestTags> getTags() {
        return this.tags;
    }

    public ListTemplateScratchesRequest setTemplateScratchId(String templateScratchId) {
        this.templateScratchId = templateScratchId;
        return this;
    }
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    public ListTemplateScratchesRequest setTemplateScratchType(String templateScratchType) {
        this.templateScratchType = templateScratchType;
        return this;
    }
    public String getTemplateScratchType() {
        return this.templateScratchType;
    }

    public static class ListTemplateScratchesRequestTags extends TeaModel {
        /**
         * <p>The tag key of the resource scenario.</p>
         * <blockquote>
         * <p>Tags is optional. If you specify Tags, you must specify Tags.N.Key.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>usage</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTemplateScratchesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateScratchesRequestTags self = new ListTemplateScratchesRequestTags();
            return TeaModel.build(map, self);
        }

        public ListTemplateScratchesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTemplateScratchesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
