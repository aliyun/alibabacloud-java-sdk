// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class CreateUploadPolicyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Option")
    public String option;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>scene</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateUploadPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadPolicyRequest self = new CreateUploadPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateUploadPolicyRequest setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

    public CreateUploadPolicyRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
