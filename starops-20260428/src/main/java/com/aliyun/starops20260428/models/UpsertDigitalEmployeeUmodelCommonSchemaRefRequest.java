// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class UpsertDigitalEmployeeUmodelCommonSchemaRefRequest extends TeaModel {
    /**
     * <p>The version of the public schema.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("version")
    public String version;

    public static UpsertDigitalEmployeeUmodelCommonSchemaRefRequest build(java.util.Map<String, ?> map) throws Exception {
        UpsertDigitalEmployeeUmodelCommonSchemaRefRequest self = new UpsertDigitalEmployeeUmodelCommonSchemaRefRequest();
        return TeaModel.build(map, self);
    }

    public UpsertDigitalEmployeeUmodelCommonSchemaRefRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
