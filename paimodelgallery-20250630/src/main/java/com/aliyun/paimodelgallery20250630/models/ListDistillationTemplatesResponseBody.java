// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class ListDistillationTemplatesResponseBody extends TeaModel {
    /**
     * <p>The list of distillation template summaries, sorted by OrderNumber in ascending order.</p>
     */
    @NameInMap("DistillationTemplates")
    public java.util.List<DistillationTemplateSummary> distillationTemplates;

    /**
     * <p>The page number, which echoes the PageNumber value in the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page, which echoes the PageSize value in the request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of templates that match the filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
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
