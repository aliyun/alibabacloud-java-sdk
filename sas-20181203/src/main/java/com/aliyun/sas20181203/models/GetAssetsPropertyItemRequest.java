// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetsPropertyItemRequest extends TeaModel {
    /**
     * <p>The type of Asset Fingerprints to query. Default value: <strong>sca</strong>. Valid values:</p>
     * <ul>
     * <li><strong>lkm</strong>: kernel module</li>
     * <li><strong>autorun</strong>: startup item</li>
     * <li><strong>web_server</strong>: website.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lkm</p>
     */
    @NameInMap("Biz")
    public String biz;

    /**
     * <p>The page number of the page to return. Default value: <strong>1</strong>, which indicates the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether to forcefully refresh the data to be queried. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Forcefully refresh.</li>
     * <li><strong>false</strong>: Do not forcefully refresh.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceFlush")
    public Boolean forceFlush;

    /**
     * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries to return on each page when using paging. Default value: 20. If the PageSize parameter is left empty, 20 entries are returned by default.</p>
     * <blockquote>
     * <p>Do not leave PageSize empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The content to query. Specify different query content based on the value of <strong>SearchItem</strong>:</p>
     * <ul>
     * <li>If <strong>SearchItem</strong> is set to <strong>domain</strong>, enter the domain name of the Asset Fingerprints entry.</li>
     * <li>If <strong>SearchItem</strong> is set to <strong>module_name</strong>, enter the module name of the Asset Fingerprints entry.</li>
     * <li>If <strong>SearchItem</strong> is set to <strong>path</strong>, enter the startup item path of the Asset Fingerprints entry.</li>
     * </ul>
     * <blockquote>
     * <p>The <strong>SearchItem</strong> and <strong>SearchInfo</strong> parameters must be used together. Both parameters must be set at the same time for the query to take effect. Setting only one parameter does not take effect. You can use these parameters to query all data of a specific Asset Fingerprints entry by name.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/lib/systemd/s****</p>
     */
    @NameInMap("SearchInfo")
    public String searchInfo;

    /**
     * <p>The type of query condition. Set different aggregation search conditions based on the <strong>Biz</strong> parameter. Valid values:</p>
     * <ul>
     * <li>If <strong>Biz</strong> is set to <strong>web_server</strong>, the following search conditions are supported for <strong>SearchItem</strong>:<ul>
     * <li><strong>domain</strong>: domain name</li>
     * </ul>
     * </li>
     * <li>If <strong>Biz</strong> is set to <strong>lkm</strong>, the following search conditions are supported for <strong>SearchItem</strong>:<ul>
     * <li><strong>module_name</strong>: module name</li>
     * </ul>
     * </li>
     * <li>If <strong>Biz</strong> is set to <strong>autorun</strong>, the following search conditions are supported for <strong>SearchItem</strong>:<ul>
     * <li><strong>path</strong>: startup item path<blockquote>
     * <p>The <strong>SearchItem</strong> and <strong>SearchInfo</strong> parameters must be used together. Both parameters must be set at the same time for the query to take effect. Setting only one parameter does not take effect. You can use these parameters to query all data of a specific Asset Fingerprints entry by name.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>path</p>
     */
    @NameInMap("SearchItem")
    public String searchItem;

    public static GetAssetsPropertyItemRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAssetsPropertyItemRequest self = new GetAssetsPropertyItemRequest();
        return TeaModel.build(map, self);
    }

    public GetAssetsPropertyItemRequest setBiz(String biz) {
        this.biz = biz;
        return this;
    }
    public String getBiz() {
        return this.biz;
    }

    public GetAssetsPropertyItemRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetAssetsPropertyItemRequest setForceFlush(Boolean forceFlush) {
        this.forceFlush = forceFlush;
        return this;
    }
    public Boolean getForceFlush() {
        return this.forceFlush;
    }

    public GetAssetsPropertyItemRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetAssetsPropertyItemRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAssetsPropertyItemRequest setSearchInfo(String searchInfo) {
        this.searchInfo = searchInfo;
        return this;
    }
    public String getSearchInfo() {
        return this.searchInfo;
    }

    public GetAssetsPropertyItemRequest setSearchItem(String searchItem) {
        this.searchItem = searchItem;
        return this;
    }
    public String getSearchItem() {
        return this.searchItem;
    }

}
