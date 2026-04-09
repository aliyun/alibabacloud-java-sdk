// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GetApiMcpServerRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v6ZZ7ftCzEILW***</p>
     */
    @NameInMap("id")
    public String id;

    public static GetApiMcpServerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApiMcpServerRequest self = new GetApiMcpServerRequest();
        return TeaModel.build(map, self);
    }

    public GetApiMcpServerRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
