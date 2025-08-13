// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModelNameIsDuplicationRequest extends TeaModel {
    /**
     * <p>Model name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text-embedding-v2</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>Region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    public static ModelNameIsDuplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelNameIsDuplicationRequest self = new ModelNameIsDuplicationRequest();
        return TeaModel.build(map, self);
    }

    public ModelNameIsDuplicationRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ModelNameIsDuplicationRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
