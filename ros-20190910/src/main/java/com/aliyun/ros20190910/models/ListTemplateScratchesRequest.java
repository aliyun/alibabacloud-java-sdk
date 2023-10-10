// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListTemplateScratchesRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Maximum value: 50.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the scenario.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the scenario. Valid values:</p>
     * <br>
     * <p>*   GENERATE_IN_PROGRESS: The scenario is being created.</p>
     * <p>*   GENERATE_COMPLETE: The scenario is created.</p>
     * <p>*   GENERATE_FAILED: The scenario fails to be created.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags of the scenario.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListTemplateScratchesRequestTags> tags;

    /**
     * <p>The ID of the scenario.</p>
     */
    @NameInMap("TemplateScratchId")
    public String templateScratchId;

    /**
     * <p>The type of the scenario. Valid values:</p>
     * <br>
     * <p>*   ResourceImport: resource management</p>
     * <p>*   ArchitectureReplication: resource replication</p>
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
         * <p>The tag key of the scenario.</p>
         * <br>
         * <p>> Tags is optional. If you want to specify Tags, you must specify Key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the scenario.</p>
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
