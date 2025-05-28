// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SmartqAuthorizeRequest extends TeaModel {
    @NameInMap("CubeIds")
    public String cubeIds;

    /**
     * <p>Expiration time, with a default of seven days.
     * Format: 2099-12-31</p>
     * 
     * <strong>example:</strong>
     * <p>2099-12-31</p>
     */
    @NameInMap("ExpireDay")
    public String expireDay;

    /**
     * <p>Array of analysis theme IDs, separated by English commas.</p>
     * 
     * <strong>example:</strong>
     * <p>wasdasd<em><strong><strong><strong>1235235sd,ASDAS</strong></strong></strong></em>**ASDAW123</p>
     */
    @NameInMap("LlmCubeThemes")
    public String llmCubeThemes;

    /**
     * <p>Array of Q&amp;A resource IDs, separated by English commas.</p>
     * 
     * <strong>example:</strong>
     * <p>wasdasd<em><strong><strong><strong>1235235sd,ASDAS</strong></strong></strong></em>**ASDAW123</p>
     */
    @NameInMap("LlmCubes")
    public String llmCubes;

    /**
     * <p>Operation type. The values are as follows:</p>
     * <ul>
     * <li>0: Add authorization</li>
     * <li>1: Remove authorization</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OperationType")
    public Integer operationType;

    /**
     * <p>Array of user IDs, separated by English commas.</p>
     * <blockquote>
     * <p>Notice: The number of user IDs per request * (number of Q&amp;A resources + number of analysis themes) cannot exceed 100.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wasdasd<em><strong><strong><strong>1235235sd,ASDAS</strong></strong></strong></em>**ASDAW123</p>
     */
    @NameInMap("UserIds")
    public String userIds;

    public static SmartqAuthorizeRequest build(java.util.Map<String, ?> map) throws Exception {
        SmartqAuthorizeRequest self = new SmartqAuthorizeRequest();
        return TeaModel.build(map, self);
    }

    public SmartqAuthorizeRequest setCubeIds(String cubeIds) {
        this.cubeIds = cubeIds;
        return this;
    }
    public String getCubeIds() {
        return this.cubeIds;
    }

    public SmartqAuthorizeRequest setExpireDay(String expireDay) {
        this.expireDay = expireDay;
        return this;
    }
    public String getExpireDay() {
        return this.expireDay;
    }

    public SmartqAuthorizeRequest setLlmCubeThemes(String llmCubeThemes) {
        this.llmCubeThemes = llmCubeThemes;
        return this;
    }
    public String getLlmCubeThemes() {
        return this.llmCubeThemes;
    }

    public SmartqAuthorizeRequest setLlmCubes(String llmCubes) {
        this.llmCubes = llmCubes;
        return this;
    }
    public String getLlmCubes() {
        return this.llmCubes;
    }

    public SmartqAuthorizeRequest setOperationType(Integer operationType) {
        this.operationType = operationType;
        return this;
    }
    public Integer getOperationType() {
        return this.operationType;
    }

    public SmartqAuthorizeRequest setUserIds(String userIds) {
        this.userIds = userIds;
        return this;
    }
    public String getUserIds() {
        return this.userIds;
    }

}
