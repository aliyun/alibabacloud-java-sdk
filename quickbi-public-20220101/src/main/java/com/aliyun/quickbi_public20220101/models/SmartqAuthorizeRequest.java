// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SmartqAuthorizeRequest extends TeaModel {
    /**
     * <p>An array of dataset IDs. Separate multiple IDs with commas.</p>
     * <blockquote>
     * <p>Notice: This parameter is converted to the corresponding Q\&amp;A resource ID for authorization. If a \<code>cubeId\\</code> does not correspond to an existing Q\&amp;A resource, an error is reported that the Q\&amp;A resource does not exist. Ensure that the \<code>cubeId\\</code> is correct.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>wasdasd<em><strong><strong><strong>1235235sd,ASDAS</strong></strong></strong></em>**ASDAW123</p>
     */
    @NameInMap("CubeIds")
    public String cubeIds;

    /**
     * <p>The expiration time. The default is seven days.
     * Format: 2099-12-31</p>
     * 
     * <strong>example:</strong>
     * <p>2099-12-31</p>
     */
    @NameInMap("ExpireDay")
    public String expireDay;

    /**
     * <p>An array of analysis subject IDs. Separate multiple IDs with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>wasdasd<em><strong><strong><strong>1235235sd,ASDAS</strong></strong></strong></em>**ASDAW123</p>
     */
    @NameInMap("LlmCubeThemes")
    public String llmCubeThemes;

    /**
     * <p>An array of Q\&amp;A resource IDs. Separate multiple IDs with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>wasdasd<em><strong><strong><strong>1235235sd,ASDAS</strong></strong></strong></em>**ASDAW123</p>
     */
    @NameInMap("LlmCubes")
    public String llmCubes;

    /**
     * <p>The operation type. Valid values:</p>
     * <ul>
     * <li><p>0: Grant authorization</p>
     * </li>
     * <li><p>1: Delete authorization</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OperationType")
    public Integer operationType;

    /**
     * <p>An array of user IDs. Separate multiple IDs with commas.</p>
     * <blockquote>
     * <p>Notice: The number of user IDs × (the number of Q\&amp;A resources + the number of analysis subjects) in a single request cannot exceed 100.</p>
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
