// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeleteVariableHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static DeleteVariableHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteVariableHeaders self = new DeleteVariableHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteVariableHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteVariableHeaders setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
