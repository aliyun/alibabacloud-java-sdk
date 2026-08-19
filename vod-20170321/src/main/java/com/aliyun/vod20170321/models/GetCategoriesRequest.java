// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetCategoriesRequest extends TeaModel {
    /**
     * <p>The category ID. If you specify this parameter, the information about the specified category is returned. Only a single category ID is supported. You can obtain the category ID by using the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Asset Management Configuration</strong> &gt; <strong>Category Management</strong> to view the category ID.</li>
     * <li>Obtain the category ID from the response of the <a href="~~AddCategory~~">AddCategory</a> operation when you create a category.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>49339****</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>The page number of the subcategory list. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page of the subcategory list. Default value: <strong>10</strong>. Maximum value: <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The method for sorting the query results. Valid values:</p>
     * <ul>
     * <li><strong>CreationTime:Desc</strong> (default): sorts the results by creation time in descending order.</li>
     * <li><strong>CreationTime:Asc</strong>: sorts the results by creation time in ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreationTime:Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The categorization type. If you specify this parameter, a filtered query is performed to return categories of the specified type. Valid values:</p>
     * <ul>
     * <li><strong>default</strong>: audio, video, and image categorization.</li>
     * <li><strong>material</strong>: short video material categorization.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
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
