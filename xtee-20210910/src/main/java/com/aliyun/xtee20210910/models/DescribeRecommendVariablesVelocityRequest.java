// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRecommendVariablesVelocityRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("regId")
    public String regId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("taskId")
    public Long taskId;

    @NameInMap("variableIdsStr")
    public String variableIdsStr;

    public static DescribeRecommendVariablesVelocityRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendVariablesVelocityRequest self = new DescribeRecommendVariablesVelocityRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecommendVariablesVelocityRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRecommendVariablesVelocityRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeRecommendVariablesVelocityRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public DescribeRecommendVariablesVelocityRequest setVariableIdsStr(String variableIdsStr) {
        this.variableIdsStr = variableIdsStr;
        return this;
    }
    public String getVariableIdsStr() {
        return this.variableIdsStr;
    }

}
