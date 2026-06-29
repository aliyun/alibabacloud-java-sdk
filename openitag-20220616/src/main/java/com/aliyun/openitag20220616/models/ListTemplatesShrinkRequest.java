// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class ListTemplatesShrinkRequest extends TeaModel {
    /**
     * <p>Page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Search content</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>List of application types.</p>
     */
    @NameInMap("Types")
    public String typesShrink;

    public static ListTemplatesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesShrinkRequest self = new ListTemplatesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplatesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTemplatesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTemplatesShrinkRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListTemplatesShrinkRequest setTypesShrink(String typesShrink) {
        this.typesShrink = typesShrink;
        return this;
    }
    public String getTypesShrink() {
        return this.typesShrink;
    }

}
