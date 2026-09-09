// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class UpdateDigitalEmployeeUmodelRequest extends TeaModel {
    /**
     * <p>The updated UModel description of the digital human.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample description</p>
     */
    @NameInMap("description")
    public String description;

    public static UpdateDigitalEmployeeUmodelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDigitalEmployeeUmodelRequest self = new UpdateDigitalEmployeeUmodelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDigitalEmployeeUmodelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
