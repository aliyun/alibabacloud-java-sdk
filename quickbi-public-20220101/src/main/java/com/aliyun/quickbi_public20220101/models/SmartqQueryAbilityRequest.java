// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SmartqQueryAbilityRequest extends TeaModel {
    /**
     * <p>The ID of the dataset. To obtain the ID, navigate to \<em>\<em>Workbench\</em>\</em> &gt; \<em>\<em>Dataset\</em>\</em> in the Quick BI console. Open the dataset and find the \<code>cubeId\\</code> in the URL.</p>
     * <p>In multi-table scenarios, this parameter must be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>7c7223ae-****-3c744528014b</p>
     */
    @NameInMap("CubeId")
    public String cubeId;

    /**
     * <p>A list of dataset IDs. The model selects one or more tables from the list to generate an answer based on the question. This parameter is required for multi-table scenarios and is not used for single-table scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>7c7****-3c744528014b,a876asd***yhashd2</p>
     */
    @NameInMap("MultipleCubeIds")
    public String multipleCubeIds;

    /**
     * <p>The ID of the user.</p>
     * <blockquote>
     * <p>Notice: If you do not specify this parameter, data is queried as the organization owner by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>7c7223ae-****-3c744528014b</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The question in text format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
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

    public SmartqQueryAbilityRequest setMultipleCubeIds(String multipleCubeIds) {
        this.multipleCubeIds = multipleCubeIds;
        return this;
    }
    public String getMultipleCubeIds() {
        return this.multipleCubeIds;
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
