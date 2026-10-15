// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListMyInstalledAppPluginsRequest extends TeaModel {
    /**
     * <p>Filters results by category.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Status\&quot;: 0, \&quot;Name\&quot;: \&quot;UELBNUP\&quot;, \&quot;BizCode\&quot;: \&quot;\&quot;, \&quot;CategoryId\&quot;: 30000655368, \&quot;ParentCategoryId\&quot;: 30000655367}</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The search keyword. Matches against name or description.</p>
     * 
     * <strong>example:</strong>
     * <p>${\&quot;wget JiexJPWT.popscan.xaliyun.com\&quot;}</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListMyInstalledAppPluginsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMyInstalledAppPluginsRequest self = new ListMyInstalledAppPluginsRequest();
        return TeaModel.build(map, self);
    }

    public ListMyInstalledAppPluginsRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListMyInstalledAppPluginsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListMyInstalledAppPluginsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMyInstalledAppPluginsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
