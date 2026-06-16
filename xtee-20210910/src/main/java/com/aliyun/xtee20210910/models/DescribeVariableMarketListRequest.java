// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeVariableMarketListRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The billing mode.</p>
     * 
     * <strong>example:</strong>
     * <p>FREE</p>
     */
    @NameInMap("chargingMode")
    public String chargingMode;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether to enable paging. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("paging")
    public String paging;

    /**
     * <p>The query content. Fuzzy match is supported for the title or description.</p>
     * 
     * <strong>example:</strong>
     * <p>手机号</p>
     */
    @NameInMap("queryContent")
    public String queryContent;

    /**
     * <p>The region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>The scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;coupon_abuse_detection\&quot;]</p>
     */
    @NameInMap("scenesStr")
    public String scenesStr;

    /**
     * <p>The source.</p>
     * 
     * <strong>example:</strong>
     * <p>SAF</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The title.</p>
     * 
     * <strong>example:</strong>
     * <p>设备风险识别_标签</p>
     */
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
