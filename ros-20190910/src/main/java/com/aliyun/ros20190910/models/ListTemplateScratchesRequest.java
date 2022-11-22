// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListTemplateScratchesRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public java.util.List<ListTemplateScratchesRequestTags> tags;

    @NameInMap("TemplateScratchId")
    public String templateScratchId;

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
        @NameInMap("Key")
        public String key;

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
