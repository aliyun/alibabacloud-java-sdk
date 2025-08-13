// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateRecommendTaskRequest extends TeaModel {
    /**
     * <p>Set the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>注册样本</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5467</p>
     */
    @NameInMap("sampleId")
    public Long sampleId;

    /**
     * <p>Variables to be calculated, variables</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;1112\&quot;,\&quot;1113\&quot;]</p>
     */
    @NameInMap("variablesStr")
    public String variablesStr;

    /**
     * <p>Indicator effect</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;dxkkLw8fe18\&quot;,\&quot;dxUxSCM26d7\&quot;]</p>
     */
    @NameInMap("velocitiesStr")
    public String velocitiesStr;

    public static CreateRecommendTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecommendTaskRequest self = new CreateRecommendTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecommendTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateRecommendTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRecommendTaskRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreateRecommendTaskRequest setSampleId(Long sampleId) {
        this.sampleId = sampleId;
        return this;
    }
    public Long getSampleId() {
        return this.sampleId;
    }

    public CreateRecommendTaskRequest setVariablesStr(String variablesStr) {
        this.variablesStr = variablesStr;
        return this;
    }
    public String getVariablesStr() {
        return this.variablesStr;
    }

    public CreateRecommendTaskRequest setVelocitiesStr(String velocitiesStr) {
        this.velocitiesStr = velocitiesStr;
        return this;
    }
    public String getVelocitiesStr() {
        return this.velocitiesStr;
    }

}
