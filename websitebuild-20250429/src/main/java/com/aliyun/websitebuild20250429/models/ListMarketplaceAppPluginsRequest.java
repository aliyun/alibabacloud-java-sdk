// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListMarketplaceAppPluginsRequest extends TeaModel {
    /**
     * <p>Filters the results by category.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;CateName\&quot;: u\&quot;\u57fa\u7840\u533b\u5b66\u7efc\u5408\&quot;, \&quot;CateId\&quot;: 1000675720, \&quot;Level\&quot;: 2, \&quot;Type\&quot;: \&quot;default\&quot;, \&quot;ParentId\&quot;: 1000675713}</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The search keyword.</p>
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

    /**
     * <p>Filters the results by platform. Valid values: web and miniprogram.</p>
     * 
     * <strong>example:</strong>
     * <p>linux/amd64</p>
     */
    @NameInMap("Platform")
    public String platform;

    public static ListMarketplaceAppPluginsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMarketplaceAppPluginsRequest self = new ListMarketplaceAppPluginsRequest();
        return TeaModel.build(map, self);
    }

    public ListMarketplaceAppPluginsRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListMarketplaceAppPluginsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListMarketplaceAppPluginsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMarketplaceAppPluginsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMarketplaceAppPluginsRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

}
