// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateSqlInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("cu")
    public Integer cu;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("useAsDefault")
    public Boolean useAsDefault;

    public static UpdateSqlInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSqlInstanceRequest self = new UpdateSqlInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSqlInstanceRequest setCu(Integer cu) {
        this.cu = cu;
        return this;
    }
    public Integer getCu() {
        return this.cu;
    }

    public UpdateSqlInstanceRequest setUseAsDefault(Boolean useAsDefault) {
        this.useAsDefault = useAsDefault;
        return this;
    }
    public Boolean getUseAsDefault() {
        return this.useAsDefault;
    }

}
