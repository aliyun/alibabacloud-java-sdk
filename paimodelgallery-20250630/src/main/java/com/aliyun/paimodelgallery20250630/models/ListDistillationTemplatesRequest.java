// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class ListDistillationTemplatesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>reasoning</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <strong>example:</strong>
     * <p>推理</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>advanced_cot_distill</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <strong>example:</strong>
     * <p>scenario</p>
     */
    @NameInMap("TemplateKind")
    public String templateKind;

    public static ListDistillationTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDistillationTemplatesRequest self = new ListDistillationTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListDistillationTemplatesRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListDistillationTemplatesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListDistillationTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDistillationTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDistillationTemplatesRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ListDistillationTemplatesRequest setTemplateKind(String templateKind) {
        this.templateKind = templateKind;
        return this;
    }
    public String getTemplateKind() {
        return this.templateKind;
    }

}
