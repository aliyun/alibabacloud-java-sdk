// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSceneRulePageListRequest extends TeaModel {
    /**
     * <p>Set the language type for requests and received messages. Default value is <strong>zh</strong>. Values: </p>
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
     * <p>Creation type</p>
     * 
     * <strong>example:</strong>
     * <p>NOMAL</p>
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
     * <p>Event code</p>
     * 
     * <strong>example:</strong>
     * <p>de_ahgctb7098</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>Number of items per page in the returned results. Default value: 20, minimum value: 1, maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Strategy type</p>
     * 
     * <strong>example:</strong>
     * <p>CUSTMER</p>
     */
    @NameInMap("ruleAuthType")
    public String ruleAuthType;

    /**
     * <p>Strategy name</p>
     * 
     * <strong>example:</strong>
     * <p>营销风险识别</p>
     */
    @NameInMap("ruleName")
    public String ruleName;

    /**
     * <p>Strategy status</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("ruleStatus")
    public String ruleStatus;

    public static DescribeSceneRulePageListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneRulePageListRequest self = new DescribeSceneRulePageListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSceneRulePageListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSceneRulePageListRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public DescribeSceneRulePageListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSceneRulePageListRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public DescribeSceneRulePageListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeSceneRulePageListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeSceneRulePageListRequest setRuleAuthType(String ruleAuthType) {
        this.ruleAuthType = ruleAuthType;
        return this;
    }
    public String getRuleAuthType() {
        return this.ruleAuthType;
    }

    public DescribeSceneRulePageListRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DescribeSceneRulePageListRequest setRuleStatus(String ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public String getRuleStatus() {
        return this.ruleStatus;
    }

}
