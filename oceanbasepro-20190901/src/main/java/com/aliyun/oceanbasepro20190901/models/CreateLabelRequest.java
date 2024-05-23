// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateLabelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLabelRequest self = new CreateLabelRequest();
        return TeaModel.build(map, self);
    }

    public CreateLabelRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
