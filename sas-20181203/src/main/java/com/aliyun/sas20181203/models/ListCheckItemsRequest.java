// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckItemsRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     * 
     * <strong>example:</strong>
     * <p>100000000001</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The name of the custom check item.</p>
     * 
     * <strong>example:</strong>
     * <p>testCheckItemName</p>
     */
    @NameInMap("CheckShowName")
    public String checkShowName;

    /**
     * <p>The source type of the situational awareness check item.</p>
     */
    @NameInMap("CheckTypes")
    public java.util.List<String> checkTypes;

    /**
     * <p>Specifies the page number to display when performing a paginated query. The starting value is <strong>1</strong>, and the default value is <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language type for requests and responses. The default value is <strong>zh</strong>. Values:</p>
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
     * <p>Specifies the maximum number of data entries to display per page when performing a paginated query. The default number of data entries displayed per page is 20, and if the PageSize parameter is empty, it will default to returning 20 data entries.</p>
     * <blockquote>
     * <p>It is recommended that the PageSize value is not left empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the check item.</p>
     */
    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    public static ListCheckItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCheckItemsRequest self = new ListCheckItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListCheckItemsRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public ListCheckItemsRequest setCheckShowName(String checkShowName) {
        this.checkShowName = checkShowName;
        return this;
    }
    public String getCheckShowName() {
        return this.checkShowName;
    }

    public ListCheckItemsRequest setCheckTypes(java.util.List<String> checkTypes) {
        this.checkTypes = checkTypes;
        return this;
    }
    public java.util.List<String> getCheckTypes() {
        return this.checkTypes;
    }

    public ListCheckItemsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCheckItemsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListCheckItemsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCheckItemsRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

}
