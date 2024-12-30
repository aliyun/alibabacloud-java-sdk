// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SmartqAuthorizeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2099-12-31</p>
     */
    @NameInMap("ExpireDay")
    public String expireDay;

    /**
     * <strong>example:</strong>
     * <p>wasdasd<em><strong><strong><strong>1235235sd,ASDAS</strong></strong></strong></em>**ASDAW123</p>
     */
    @NameInMap("LlmCubeThemes")
    public String llmCubeThemes;

    /**
     * <strong>example:</strong>
     * <p>wasdasd<em><strong><strong><strong>1235235sd,ASDAS</strong></strong></strong></em>**ASDAW123</p>
     */
    @NameInMap("LlmCubes")
    public String llmCubes;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OperationType")
    public Integer operationType;

    /**
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
