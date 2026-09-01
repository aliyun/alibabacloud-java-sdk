// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckItemRequest extends TeaModel {
    /**
     * <p>The page number of the page to return. Default value: <strong>1</strong>, which indicates that the first page is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries per page in a paged query. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of task sources.</p>
     */
    @NameInMap("TaskSources")
    public java.util.List<String> taskSources;

    public static ListCheckItemRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCheckItemRequest self = new ListCheckItemRequest();
        return TeaModel.build(map, self);
    }

    public ListCheckItemRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCheckItemRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListCheckItemRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCheckItemRequest setTaskSources(java.util.List<String> taskSources) {
        this.taskSources = taskSources;
        return this;
    }
    public java.util.List<String> getTaskSources() {
        return this.taskSources;
    }

}
