// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWhiteListEffectiveAssetsRequest extends TeaModel {
    /**
     * <p>The page number. Default value: <strong>1</strong>. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether to return the number of <strong>untrusted programs</strong>. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: no</li>
     * <li><strong>1</strong>: yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NeedStatistics")
    public Integer needStatistics;

    /**
     * <p>The number of entries per page. Maximum value: <strong>1000</strong>. Default value: 20. If you leave this parameter empty, 20 data entries are returned per page.</p>
     * <blockquote>
     * <p> We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The condition that is used to query assets. You can enter an IP address, a public IP address, an private IP address, or an asset name for fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>222.185.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.</p>
     * 
     * <strong>example:</strong>
     * <p>27.212.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The ID of the policy.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeWhiteListStrategyList~~">DescribeWhiteListStrategyList</a> operation to obtain the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8437592</p>
     */
    @NameInMap("StrategyId")
    public Long strategyId;

    public static DescribeWhiteListEffectiveAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteListEffectiveAssetsRequest self = new DescribeWhiteListEffectiveAssetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteListEffectiveAssetsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWhiteListEffectiveAssetsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeWhiteListEffectiveAssetsRequest setNeedStatistics(Integer needStatistics) {
        this.needStatistics = needStatistics;
        return this;
    }
    public Integer getNeedStatistics() {
        return this.needStatistics;
    }

    public DescribeWhiteListEffectiveAssetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWhiteListEffectiveAssetsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeWhiteListEffectiveAssetsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeWhiteListEffectiveAssetsRequest setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

}
