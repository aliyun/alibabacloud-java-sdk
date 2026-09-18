// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class ListDistillationTemplatesRequest extends TeaModel {
    /**
     * <p>The template category for scenario-specific template filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>reasoning</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The search keyword for cross-language substring matching against template names, descriptions, and other text fields. If this parameter is left empty, no keyword filtering is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>inference</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number, starting from 1. If this parameter is not specified or is invalid, the default value 1 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. If this parameter is not specified or is invalid, the default value is used. If the value exceeds the upper limit, the upper limit is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The template ID for exact filtering. If this parameter is left empty, no filtering by ID is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>advanced_cot_distill</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

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

}
