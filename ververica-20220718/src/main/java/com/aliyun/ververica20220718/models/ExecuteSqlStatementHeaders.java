// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ExecuteSqlStatementHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>710d6a64d8c34d</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static ExecuteSqlStatementHeaders build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSqlStatementHeaders self = new ExecuteSqlStatementHeaders();
        return TeaModel.build(map, self);
    }

    public ExecuteSqlStatementHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ExecuteSqlStatementHeaders setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
