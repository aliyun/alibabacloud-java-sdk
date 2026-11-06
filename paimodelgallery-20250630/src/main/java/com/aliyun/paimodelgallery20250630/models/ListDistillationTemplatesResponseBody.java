// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class ListDistillationTemplatesResponseBody extends TeaModel {
    @NameInMap("DistillationTemplates")
    public java.util.List<DistillationTemplateSummary> distillationTemplates;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDistillationTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDistillationTemplatesResponseBody self = new ListDistillationTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDistillationTemplatesResponseBody setDistillationTemplates(java.util.List<DistillationTemplateSummary> distillationTemplates) {
        this.distillationTemplates = distillationTemplates;
        return this;
    }
    public java.util.List<DistillationTemplateSummary> getDistillationTemplates() {
        return this.distillationTemplates;
    }

    public ListDistillationTemplatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDistillationTemplatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDistillationTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDistillationTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
