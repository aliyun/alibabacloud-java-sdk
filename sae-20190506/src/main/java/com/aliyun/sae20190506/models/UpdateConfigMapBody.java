// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateConfigMapBody extends TeaModel {
    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    @NameInMap("Description")
    public String description;

    public static UpdateConfigMapBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigMapBody self = new UpdateConfigMapBody();
        return TeaModel.build(map, self);
    }

    public UpdateConfigMapBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateConfigMapBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
