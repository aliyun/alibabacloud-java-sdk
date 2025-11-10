// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class DeleteApiMcpServerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v6ZZ7ftCzEILW***</p>
     */
    @NameInMap("id")
    public String id;

    public static DeleteApiMcpServerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiMcpServerRequest self = new DeleteApiMcpServerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApiMcpServerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteApiMcpServerRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
