// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetCategoriesRequest extends TeaModel {
    /**
     * <p>The ID of the category. If you specify this parameter, the system queries the category based on the ID. You can specify only one category ID. You can use one of the following methods to obtain the ID:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. Choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Categories</strong>. On the Audio and Video / Image Category or Short Video Material Category tab, view the category ID.</li>
     * <li>Obtain the category ID from the response to the <a href="~~AddCategory~~">AddCategory</a> operation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>49339****</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>The number of the page where the subcategories to be returned are listed. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries to return on each page of the subcategory list. Default value: <strong>10</strong>. Maximum value: <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The sorting method of the results. Valid values:</p>
     * <ul>
     * <li><strong>CreationTime:Desc</strong> (default): The results are sorted in reverse chronological order based on the creation time.</li>
     * <li><strong>CreationTime:Asc</strong>: The results are sorted in chronological order based on the creation time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreationTime:Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The type of the category. If you specify this parameter, the system queries the category based on the type. Valid values:</p>
     * <ul>
     * <li><strong>default</strong> (default): audio, video, and image files</li>
     * <li><strong>material</strong>: short video materials</li>
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
