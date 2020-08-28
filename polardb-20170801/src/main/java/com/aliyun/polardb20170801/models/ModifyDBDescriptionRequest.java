// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBDescriptionRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("DBName")
    @Validation(required = true)
    public String DBName;

    @NameInMap("DBDescription")
    @Validation(required = true)
    public String DBDescription;

    public static ModifyDBDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBDescriptionRequest self = new ModifyDBDescriptionRequest();
        return TeaModel.build(map, self);
    }

}
