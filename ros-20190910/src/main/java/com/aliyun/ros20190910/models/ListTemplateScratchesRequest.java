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

}
