// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SaveWhiteListStrategyRequest extends TeaModel {
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
     * <p>The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.</p>
     * 
     * <strong>example:</strong>
     * <p>124.89.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The ID of the application whitelist policy.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeWhiteListStrategyList~~">DescribeWhiteListStrategyList</a> operation to query the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8494</p>
     */
    @NameInMap("StrategyId")
    public Long strategyId;

    /**
     * <p>The name of the application whitelist policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("StrategyName")
    public String strategyName;

    /**
     * <p>The duration of intelligent learning. Unit: hours.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StudyTime")
    public Integer studyTime;

    public static SaveWhiteListStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveWhiteListStrategyRequest self = new SaveWhiteListStrategyRequest();
        return TeaModel.build(map, self);
    }

    public SaveWhiteListStrategyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveWhiteListStrategyRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public SaveWhiteListStrategyRequest setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

    public SaveWhiteListStrategyRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public SaveWhiteListStrategyRequest setStudyTime(Integer studyTime) {
        this.studyTime = studyTime;
        return this;
    }
    public Integer getStudyTime() {
        return this.studyTime;
    }

}
