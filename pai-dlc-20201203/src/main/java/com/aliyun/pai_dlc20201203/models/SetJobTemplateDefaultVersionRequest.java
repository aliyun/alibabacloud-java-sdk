// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class SetJobTemplateDefaultVersionRequest extends TeaModel {
    /**
     * <p>要设置为默认的模板版本号</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Version")
    public Integer version;

    public static SetJobTemplateDefaultVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetJobTemplateDefaultVersionRequest self = new SetJobTemplateDefaultVersionRequest();
        return TeaModel.build(map, self);
    }

    public SetJobTemplateDefaultVersionRequest setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

}
