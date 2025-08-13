// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRulePageListRequest extends TeaModel {
    /**
     * <p>Set the language type for requests and responses, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Creation type.</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("createType")
    public String createType;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public String currentPage;

    /**
     * <p>Event code.</p>
     * 
     * <strong>example:</strong>
     * <p>de_asssce8122</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>Page size, default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>Region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Policy type.</p>
     * 
     * <strong>example:</strong>
     * <p>NOMAL</p>
     */
    @NameInMap("ruleAuthType")
    public String ruleAuthType;

    /**
     * <p>Policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>营销风险识别评分</p>
     */
    @NameInMap("ruleName")
    public String ruleName;

    /**
     * <p>Policy status.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("ruleStatus")
    public String ruleStatus;

    /**
     * <p>Sorting method, default value is desc.</p>
     * <ul>
     * <li>desc: descending order</li>
     * <li>asc: ascending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("sort")
    public String sort;

    public static DescribeRulePageListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRulePageListRequest self = new DescribeRulePageListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRulePageListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRulePageListRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public DescribeRulePageListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeRulePageListRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public DescribeRulePageListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeRulePageListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeRulePageListRequest setRuleAuthType(String ruleAuthType) {
        this.ruleAuthType = ruleAuthType;
        return this;
    }
    public String getRuleAuthType() {
        return this.ruleAuthType;
    }

    public DescribeRulePageListRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DescribeRulePageListRequest setRuleStatus(String ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public String getRuleStatus() {
        return this.ruleStatus;
    }

    public DescribeRulePageListRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

}
