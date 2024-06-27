// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeVariableMarketListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("chargingMode")
    public String chargingMode;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("paging")
    public String paging;

    @NameInMap("queryContent")
    public String queryContent;

    @NameInMap("regId")
    public String regId;

    @NameInMap("scenesStr")
    public String scenesStr;

    @NameInMap("source")
    public String source;

    @NameInMap("title")
    public String title;

    public static DescribeVariableMarketListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVariableMarketListRequest self = new DescribeVariableMarketListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVariableMarketListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVariableMarketListRequest setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }
    public String getChargingMode() {
        return this.chargingMode;
    }

    public DescribeVariableMarketListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVariableMarketListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVariableMarketListRequest setPaging(String paging) {
        this.paging = paging;
        return this;
    }
    public String getPaging() {
        return this.paging;
    }

    public DescribeVariableMarketListRequest setQueryContent(String queryContent) {
        this.queryContent = queryContent;
        return this;
    }
    public String getQueryContent() {
        return this.queryContent;
    }

    public DescribeVariableMarketListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeVariableMarketListRequest setScenesStr(String scenesStr) {
        this.scenesStr = scenesStr;
        return this;
    }
    public String getScenesStr() {
        return this.scenesStr;
    }

    public DescribeVariableMarketListRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeVariableMarketListRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
