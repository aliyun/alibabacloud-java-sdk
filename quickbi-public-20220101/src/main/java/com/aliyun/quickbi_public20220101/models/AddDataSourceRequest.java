// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddDataSourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddModel")
    public String addModel;

    public static AddDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDataSourceRequest self = new AddDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public AddDataSourceRequest setAddModel(String addModel) {
        this.addModel = addModel;
        return this;
    }
    public String getAddModel() {
        return this.addModel;
    }

}
