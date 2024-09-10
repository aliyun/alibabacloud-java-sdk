// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetsPropertyItemRequest extends TeaModel {
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
     * <p>Specifies whether to forcefully refresh the data that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceFlush")
    public Boolean forceFlush;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
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
     * <p>The value of the search condition. You must specify this parameter based on the value of the <strong>SearchItem</strong> parameter.</p>
     * <ul>
     * <li>If you set <strong>SearchItem</strong> to <strong>domain</strong>, you must enter the domain name.</li>
     * <li>If you set <strong>SearchItem</strong> to <strong>module_name</strong>, you must enter the module name.</li>
     * <li>If you set <strong>SearchItem</strong> to <strong>path</strong>, you must enter the path to the self-starting item.</li>
     * </ul>
     * <blockquote>
     * <p> You must specify both the <strong>SearchItem</strong> and <strong>SearchInfo</strong> parameters before you can query the information about asset fingerprints by asset fingerprint name.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/lib/systemd/s****</p>
     */
    @NameInMap("SearchInfo")
    public String searchInfo;

    /**
     * <p>The type of the search condition. You must specify this parameter based on the value of the <strong>Biz</strong> parameter. Valid values:</p>
     * <ul>
     * <li><p>If you set <strong>Biz</strong> to <strong>web_server</strong>, set <strong>SearchItem</strong> to the following value:</p>
     * <ul>
     * <li><strong>domain</strong>: the domain name</li>
     * </ul>
     * </li>
     * <li><p>If you set <strong>Biz</strong> to <strong>lkm</strong>, set <strong>SearchItem</strong> to the following value:</p>
     * <ul>
     * <li><strong>module_name</strong>: the name of the module</li>
     * </ul>
     * </li>
     * <li><p>If you set <strong>Biz</strong> to <strong>autorun</strong>, set <strong>SearchItem</strong> to the following value:</p>
     * <ul>
     * <li><strong>path</strong>: the path to the self-starting item</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p> You must specify both the <strong>SearchItem</strong> and <strong>SearchInfo</strong> parameters before you can query the information about asset fingerprints by asset fingerprint name.</p>
     * </blockquote>
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
