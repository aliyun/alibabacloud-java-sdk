// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetsPropertyDetailRequest extends TeaModel {
    /**
     * <p>The type of the asset fingerprint that you want to query. Default value: <strong>sca</strong>. Valid values:</p>
     * <ul>
     * <li><strong>lkm</strong>: kernel module</li>
     * <li><strong>autorun</strong>: startup item</li>
     * <li><strong>web_server</strong>: website</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lkm</p>
     */
    @NameInMap("Biz")
    public String biz;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the aggregation item for the asset fingerprint that you want to query.</p>
     * <blockquote>
     * <p>You can call the <a href="~~GetAssetsPropertyItem~~">GetAssetsPropertyItem</a> operation to query the names of aggregation items.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>virtio</p>
     */
    @NameInMap("ItemName")
    public String itemName;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
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

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <blockquote>
     * <p>We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name or IP address of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The conditions that are used to query the details about the asset fingerprint.</p>
     */
    @NameInMap("SearchCriteriaList")
    public java.util.List<GetAssetsPropertyDetailRequestSearchCriteriaList> searchCriteriaList;

    @NameInMap("UseNextToken")
    public Boolean useNextToken;

    /**
     * <p>The UUID of the server.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
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
         * <p>The name of the condition. Valid values:</p>
         * <ul>
         * <li><strong>remarkItemName</strong>: the aggregation item of the asset fingerprints. Fuzzy match is supported.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If <strong>Biz</strong> is set to <strong>web_server</strong>, <strong>remarkItemName</strong> specifies a domain name. </li>
         * <li>If <strong>Biz</strong> is set to <strong>lkm</strong>, <strong>remarkItemName</strong> specifies a module name.</li>
         * <li>If <strong>Biz</strong> is set to <strong>autorun</strong>, <strong>remarkItemName</strong> specifies the path to a startup item.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>remarkItemName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the condition.</p>
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
