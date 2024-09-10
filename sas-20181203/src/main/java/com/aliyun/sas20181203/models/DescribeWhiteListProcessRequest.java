// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWhiteListProcessRequest extends TeaModel {
    /**
     * <p>The page number. Default value: <strong>1</strong>. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The sort order. Default value: descending order. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: ascending order</li>
     * <li><strong>2</strong>: descending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Desc")
    public Integer desc;

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
     * <p>The item based on which you want to sort the returned results. Default value: <strong>process type</strong>. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: process type</li>
     * <li><strong>2</strong>: degree of trustability</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OrderBy")
    public Integer orderBy;

    /**
     * <p>The number of entries per page. Maximum value: 1000. Default value: 20. If you leave this parameter empty, 20 data entries are returned per page.</p>
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
     * <p>The name of the process.</p>
     * 
     * <strong>example:</strong>
     * <p>sys_creat</p>
     */
    @NameInMap("ProcessName")
    public String processName;

    /**
     * <p>The type of the process. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: trusted</li>
     * <li><strong>2</strong>: suspicious</li>
     * <li><strong>3</strong>: malicious</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProcessType")
    public Integer processType;

    /**
     * <p>The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.</p>
     * 
     * <strong>example:</strong>
     * <p>27.223.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The ID of the policy.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeWhiteListStrategyList~~">DescribeWhiteListStrategyList</a> operation to obtain the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8562</p>
     */
    @NameInMap("StrategyId")
    public Long strategyId;

    public static DescribeWhiteListProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteListProcessRequest self = new DescribeWhiteListProcessRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteListProcessRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWhiteListProcessRequest setDesc(Integer desc) {
        this.desc = desc;
        return this;
    }
    public Integer getDesc() {
        return this.desc;
    }

    public DescribeWhiteListProcessRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeWhiteListProcessRequest setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public Integer getOrderBy() {
        return this.orderBy;
    }

    public DescribeWhiteListProcessRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWhiteListProcessRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public DescribeWhiteListProcessRequest setProcessType(Integer processType) {
        this.processType = processType;
        return this;
    }
    public Integer getProcessType() {
        return this.processType;
    }

    public DescribeWhiteListProcessRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeWhiteListProcessRequest setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

}
