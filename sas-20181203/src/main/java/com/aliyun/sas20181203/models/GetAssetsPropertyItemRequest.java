// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetsPropertyItemRequest extends TeaModel {
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
     * <p>Specifies whether to forcefully refresh the data that you want to query. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("ForceFlush")
    public Boolean forceFlush;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <br>
     * <p>> We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The value of the search condition. You must specify this parameter based on the value of the **SearchItem** parameter.</p>
     * <br>
     * <p>*   If you set **SearchItem** to **domain**, you must enter the domain name.</p>
     * <p>*   If you set **SearchItem** to **module_name**, you must enter the module name.</p>
     * <p>*   If you set **SearchItem** to **path**, you must enter the path to the self-starting item.</p>
     * <br>
     * <p>>  You must specify both the **SearchItem** and **SearchInfo** parameters before you can query the information about asset fingerprints by asset fingerprint name.</p>
     */
    @NameInMap("SearchInfo")
    public String searchInfo;

    /**
     * <p>The type of the search condition. You must specify this parameter based on the value of the **Biz** parameter. Valid values:</p>
     * <br>
     * <p>*   If you set **Biz** to **web_server**, set **SearchItem** to the following value:</p>
     * <br>
     * <p>    *   **domain**: the domain name</p>
     * <br>
     * <p>*   If you set **Biz** to **lkm**, set **SearchItem** to the following value:</p>
     * <br>
     * <p>    *   **module_name**: the name of the module</p>
     * <br>
     * <p>*   If you set **Biz** to **autorun**, set **SearchItem** to the following value:</p>
     * <br>
     * <p>    *   **path**: the path to the self-starting item</p>
     * <br>
     * <p>>  You must specify both the **SearchItem** and **SearchInfo** parameters before you can query the information about asset fingerprints by asset fingerprint name.</p>
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
