// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScaItemRequest extends TeaModel {
    /**
     * <p>The type of the asset fingerprint that you want to query. Default value: <strong>sca</strong>. Valid values:</p>
     * <ul>
     * <li><strong>sca</strong>: middleware</li>
     * <li><strong>sca_database</strong>: database</li>
     * <li><strong>sca_web</strong>: web service</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, the default value <strong>sca</strong> is used, which indicates that middleware fingerprints are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sca</p>
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
     * <p>The number of entries to return on each page.</p>
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
     * <p>The search keyword. You must specify this parameter based on the value of the <strong>SearchItem</strong> parameter.</p>
     * <ul>
     * <li><p>If the <strong>SearchItem</strong> parameter is set to <strong>name</strong>, you must enter the name of an asset fingerprint.</p>
     * </li>
     * <li><p>If the <strong>SearchItem</strong> parameter is set to <strong>type</strong>, you must enter the type of an asset fingerprint. Valid values:</p>
     * <ul>
     * <li><strong>system_service</strong>: system service</li>
     * <li><strong>software_library</strong>: software library</li>
     * <li><strong>docker_component</strong>: container component</li>
     * <li><strong>database</strong>: database</li>
     * <li><strong>web_container</strong>: web container</li>
     * <li><strong>jar</strong>: JAR package</li>
     * <li><strong>web_framework</strong>: web framework</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You must specify both the <strong>SearchItem</strong> and <strong>SearchInfo</strong> parameters before you can query the asset fingerprints based on the specified name or type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>system_service</p>
     */
    @NameInMap("SearchInfo")
    public String searchInfo;

    /**
     * <p>The type of the search condition. Valid values:</p>
     * <ul>
     * <li><strong>name</strong>: the name of a database, middleware, or web service</li>
     * <li><strong>type</strong>: the type of a database, middleware, or web service</li>
     * </ul>
     * <blockquote>
     * <p>You must specify both the <strong>SearchItem</strong> and <strong>SearchInfo</strong> parameters before you can query the asset fingerprints based on the specified name or type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>type</p>
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
