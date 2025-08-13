// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRecommendVariablesVelocityRequest extends TeaModel {
    /**
     * <p>Set the language type for request and response, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Region Code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Task ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6770764</p>
     */
    @NameInMap("taskId")
    public Long taskId;

    /**
     * <p>Variable IDs</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;232\&quot;,\&quot;233\&quot;]</p>
     */
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
