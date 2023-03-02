// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetCategoriesRequest extends TeaModel {
    /**
     * <p>The ID of the category. Default value: **-1**, which indicates the parent category ID of a level 1 category.</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>The number of the page where the subcategories to be returned are listed. Default value: **1**.</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries to return on each page of the subcategory list. Default value: **10**. Maximum value: **100**.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The method for sorting the results. Valid values:</p>
     * <br>
     * <p>*   **CreationTime:Desc** (default): The results are sorted in reverse chronological order based on the creation time.</p>
     * <p>*   **CreationTime:Asc**: The results are sorted in chronological order based on the creation time.</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The type of the category. Valid values:</p>
     * <br>
     * <p>*   **default** (default): default category</p>
     * <p>*   **material**: material category</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetCategoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCategoriesRequest self = new GetCategoriesRequest();
        return TeaModel.build(map, self);
    }

    public GetCategoriesRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

    public GetCategoriesRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public GetCategoriesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetCategoriesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public GetCategoriesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
