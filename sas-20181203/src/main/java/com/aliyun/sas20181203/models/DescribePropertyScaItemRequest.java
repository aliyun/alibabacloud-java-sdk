// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScaItemRequest extends TeaModel {
    /**
     * <p>The type of the asset fingerprint that you want to query. Default value: **sca**. Valid values:</p>
     * <br>
     * <p>*   **sca**: middleware</p>
     * <p>*   **sca_database**: database</p>
     * <p>*   **sca_web**: web service</p>
     * <br>
     * <p>> If you do not specify this parameter, the default value **sca** is used, which indicates that middleware fingerprints are queried.</p>
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
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>> We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search keyword. You must specify this parameter based on the value of the **SearchItem** parameter.</p>
     * <br>
     * <p>*   If the **SearchItem** parameter is set to **name**, you must enter the name of an asset fingerprint.</p>
     * <br>
     * <p>*   If the **SearchItem** parameter is set to **type**, you must enter the type of an asset fingerprint. Valid values:</p>
     * <br>
     * <p>    *   **system_service**: system service</p>
     * <p>    *   **software_library**: software library</p>
     * <p>    *   **docker_component**: container component</p>
     * <p>    *   **database**: database</p>
     * <p>    *   **web_container**: web container</p>
     * <p>    *   **jar**: JAR package</p>
     * <p>    *   **web_framework**: web framework</p>
     * <br>
     * <p>> You must specify both the **SearchItem** and **SearchInfo** parameters before you can query the asset fingerprints based on the specified name or type.</p>
     */
    @NameInMap("SearchInfo")
    public String searchInfo;

    /**
     * <p>The type of the search condition. Valid values:</p>
     * <br>
     * <p>*   **name**: the name of a database, middleware, or web service</p>
     * <p>*   **type**: the type of a database, middleware, or web service</p>
     * <br>
     * <p>> You must specify both the **SearchItem** and **SearchInfo** parameters before you can query the asset fingerprints based on the specified name or type.</p>
     */
    @NameInMap("SearchItem")
    public String searchItem;

    public static DescribePropertyScaItemRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyScaItemRequest self = new DescribePropertyScaItemRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertyScaItemRequest setBiz(String biz) {
        this.biz = biz;
        return this;
    }
    public String getBiz() {
        return this.biz;
    }

    public DescribePropertyScaItemRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePropertyScaItemRequest setForceFlush(Boolean forceFlush) {
        this.forceFlush = forceFlush;
        return this;
    }
    public Boolean getForceFlush() {
        return this.forceFlush;
    }

    public DescribePropertyScaItemRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePropertyScaItemRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePropertyScaItemRequest setSearchInfo(String searchInfo) {
        this.searchInfo = searchInfo;
        return this;
    }
    public String getSearchInfo() {
        return this.searchInfo;
    }

    public DescribePropertyScaItemRequest setSearchItem(String searchItem) {
        this.searchItem = searchItem;
        return this;
    }
    public String getSearchItem() {
        return this.searchItem;
    }

}
