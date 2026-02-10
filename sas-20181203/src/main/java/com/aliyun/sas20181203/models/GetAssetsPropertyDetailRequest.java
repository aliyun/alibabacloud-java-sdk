// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetsPropertyDetailRequest extends TeaModel {
    /**
     * <p>The type of asset fingerprint to be queried, with a default value of <strong>sca</strong>. Values:</p>
     * <ul>
     * <li><strong>lkm</strong>: Kernel module</li>
     * <li><strong>autorun</strong>: Startup item</li>
     * <li><strong>web_server</strong>: Web site</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lkm</p>
     */
    @NameInMap("Biz")
    public String biz;

    /**
     * <p>Set the page number from which to start displaying the query results. The default value is <strong>1</strong>, indicating that the display starts from the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The aggregated item name of the asset fingerprint to be queried.</p>
     * <blockquote>
     * <p>Call the <a href="~~GetAssetsPropertyItem~~">GetAssetsPropertyItem</a> API to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>virtio</p>
     */
    @NameInMap("ItemName")
    public String itemName;

    /**
     * <p>The language type for the request and response. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Used to mark the current read position. Leave it empty to start from the beginning.</p>
     * <blockquote>
     * <p>Do not fill in for the first call; the response will include the NextToken for the second call. Each subsequent call\&quot;s response will contain the NextToken for the next call.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>71640f04f6e7b49764c8d08ae170xxxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Specify the maximum number of data entries per page in a paginated query. The default number of data entries per page is 20. If the PageSize parameter is empty, 20 data entries will be returned by default.</p>
     * <blockquote>
     * <p>It is recommended that the PageSize value is not empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Server name or IP.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>A set of conditions for querying asset fingerprint details.</p>
     */
    @NameInMap("SearchCriteriaList")
    public java.util.List<GetAssetsPropertyDetailRequestSearchCriteriaList> searchCriteriaList;

    /**
     * <p>Whether to use the NextToken method to fetch the list of vulnerabilities. If this parameter is used, TotalCount will not be returned. Values:</p>
     * <ul>
     * <li><strong>true</strong>: Use the NextToken method.</li>
     * <li><strong>false</strong>: Do not use the NextToken method.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseNextToken")
    public Boolean useNextToken;

    /**
     * <p>The UUID of the asset to be queried.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> API to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>38f72ea4-4c9f-4df1-bc6c-0f267614****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static GetAssetsPropertyDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAssetsPropertyDetailRequest self = new GetAssetsPropertyDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetAssetsPropertyDetailRequest setBiz(String biz) {
        this.biz = biz;
        return this;
    }
    public String getBiz() {
        return this.biz;
    }

    public GetAssetsPropertyDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetAssetsPropertyDetailRequest setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }
    public String getItemName() {
        return this.itemName;
    }

    public GetAssetsPropertyDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetAssetsPropertyDetailRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetAssetsPropertyDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAssetsPropertyDetailRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public GetAssetsPropertyDetailRequest setSearchCriteriaList(java.util.List<GetAssetsPropertyDetailRequestSearchCriteriaList> searchCriteriaList) {
        this.searchCriteriaList = searchCriteriaList;
        return this;
    }
    public java.util.List<GetAssetsPropertyDetailRequestSearchCriteriaList> getSearchCriteriaList() {
        return this.searchCriteriaList;
    }

    public GetAssetsPropertyDetailRequest setUseNextToken(Boolean useNextToken) {
        this.useNextToken = useNextToken;
        return this;
    }
    public Boolean getUseNextToken() {
        return this.useNextToken;
    }

    public GetAssetsPropertyDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public static class GetAssetsPropertyDetailRequestSearchCriteriaList extends TeaModel {
        /**
         * <p>The name of the condition to be queried. Values are as follows:</p>
         * <ul>
         * <li><strong>remarkItemName</strong>: The aggregated item name of the asset fingerprint, supporting fuzzy matching</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><ul>
         * <li>When <strong>Biz</strong> is <strong>web_server</strong>, <strong>remarkItemName</strong> represents the domain name as the search condition.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>When <strong>Biz</strong> is <strong>lkm</strong>, <strong>remarkItemName</strong> represents the module name as the search condition.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>When <strong>Biz</strong> is <strong>autorun</strong>, <strong>remarkItemName</strong> represents the startup item path as the search condition.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>remarkItemName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the condition to be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>virtio</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetAssetsPropertyDetailRequestSearchCriteriaList build(java.util.Map<String, ?> map) throws Exception {
            GetAssetsPropertyDetailRequestSearchCriteriaList self = new GetAssetsPropertyDetailRequestSearchCriteriaList();
            return TeaModel.build(map, self);
        }

        public GetAssetsPropertyDetailRequestSearchCriteriaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAssetsPropertyDetailRequestSearchCriteriaList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
