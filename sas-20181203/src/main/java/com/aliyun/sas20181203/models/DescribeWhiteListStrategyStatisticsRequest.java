// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWhiteListStrategyStatisticsRequest extends TeaModel {
    /**
     * <p>The page number of the page to return. Default value: <strong>1</strong>, which indicates the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The maximum number of entries per page for a paged query. Maximum value: 1000. Default value: 20. If you leave this parameter empty, 20 entries are returned.</p>
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
     * <p>The source IP address of the request. You do not need to specify this parameter. The system automatically obtains this value.</p>
     * 
     * <strong>example:</strong>
     * <p>183.63.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The policy ID.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeWhiteListStrategyList~~">DescribeWhiteListStrategyList</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3645</p>
     */
    @NameInMap("StrategyIds")
    public String strategyIds;

    public static DescribeWhiteListStrategyStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteListStrategyStatisticsRequest self = new DescribeWhiteListStrategyStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteListStrategyStatisticsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWhiteListStrategyStatisticsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeWhiteListStrategyStatisticsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWhiteListStrategyStatisticsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeWhiteListStrategyStatisticsRequest setStrategyIds(String strategyIds) {
        this.strategyIds = strategyIds;
        return this;
    }
    public String getStrategyIds() {
        return this.strategyIds;
    }

}
