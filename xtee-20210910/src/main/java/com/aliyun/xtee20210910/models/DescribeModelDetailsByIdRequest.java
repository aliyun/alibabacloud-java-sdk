// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeModelDetailsByIdRequest extends TeaModel {
    /**
     * <p>Model ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20619</p>
     */
    @NameInMap("ModelId")
    public String modelId;

    /**
     * <p>Region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    public static DescribeModelDetailsByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelDetailsByIdRequest self = new DescribeModelDetailsByIdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeModelDetailsByIdRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public DescribeModelDetailsByIdRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
