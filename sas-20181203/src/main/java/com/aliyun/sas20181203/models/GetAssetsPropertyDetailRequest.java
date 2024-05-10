// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetsPropertyDetailRequest extends TeaModel {
    /**
     * <p>The type of the asset fingerprint that you want to query. Default value: **sca**. Valid values:</p>
     * <br>
     * <p>*   **lkm**: kernel module</p>
     * <p>*   **autorun**: startup item</p>
     * <p>*   **web_server**: website</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Biz")
    public String biz;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the aggregation item for the asset fingerprint that you want to query.</p>
     * <br>
     * <p>> You can call the [GetAssetsPropertyItem](~~GetAssetsPropertyItem~~) operation to query the names of aggregation items.</p>
     */
    @NameInMap("ItemName")
    public String itemName;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <br>
     * <p>> We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name or IP address of the server.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The conditions that are used to query the details about the asset fingerprint.</p>
     */
    @NameInMap("SearchCriteriaList")
    public java.util.List<GetAssetsPropertyDetailRequestSearchCriteriaList> searchCriteriaList;

    /**
     * <p>The UUID of the server.</p>
     * <br>
     * <p>> You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.</p>
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
         * <br>
         * <p>*   **remarkItemName**: the aggregation item of the asset fingerprints. Fuzzy match is supported.</p>
         * <br>
         * <p>> *   If **Biz** is set to **web_server**, **remarkItemName** specifies a domain name. </p>
         * <p>> *   If **Biz** is set to **lkm**, **remarkItemName** specifies a module name.</p>
         * <p>> *   If **Biz** is set to **autorun**, **remarkItemName** specifies the path to a startup item.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the condition.</p>
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
