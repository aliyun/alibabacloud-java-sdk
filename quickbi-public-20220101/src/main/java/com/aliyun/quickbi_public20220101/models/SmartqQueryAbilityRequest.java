// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SmartqQueryAbilityRequest extends TeaModel {
    /**
     * <p>Dataset ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7c7223ae-****-3c744528014b</p>
     */
    @NameInMap("CubeId")
    public String cubeId;

    /**
     * <p>User ID.</p>
     * <blockquote>
     * <p>Notice: If this field is not filled, the data will be queried by default as the organization owner.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>7c7223ae-****-3c744528014b</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>Question text.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>This year\&quot;s sales data</p>
     */
    @NameInMap("UserQuestion")
    public String userQuestion;

    public static SmartqQueryAbilityRequest build(java.util.Map<String, ?> map) throws Exception {
        SmartqQueryAbilityRequest self = new SmartqQueryAbilityRequest();
        return TeaModel.build(map, self);
    }

    public SmartqQueryAbilityRequest setCubeId(String cubeId) {
        this.cubeId = cubeId;
        return this;
    }
    public String getCubeId() {
        return this.cubeId;
    }

    public SmartqQueryAbilityRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SmartqQueryAbilityRequest setUserQuestion(String userQuestion) {
        this.userQuestion = userQuestion;
        return this;
    }
    public String getUserQuestion() {
        return this.userQuestion;
    }

}
