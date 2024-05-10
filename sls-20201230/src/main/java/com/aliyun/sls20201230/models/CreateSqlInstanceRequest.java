// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateSqlInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("cu")
    public Integer cu;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("useAsDefault")
    public Boolean useAsDefault;

    public static CreateSqlInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlInstanceRequest self = new CreateSqlInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateSqlInstanceRequest setCu(Integer cu) {
        this.cu = cu;
        return this;
    }
    public Integer getCu() {
        return this.cu;
    }

    public CreateSqlInstanceRequest setUseAsDefault(Boolean useAsDefault) {
        this.useAsDefault = useAsDefault;
        return this;
    }
    public Boolean getUseAsDefault() {
        return this.useAsDefault;
    }

}
