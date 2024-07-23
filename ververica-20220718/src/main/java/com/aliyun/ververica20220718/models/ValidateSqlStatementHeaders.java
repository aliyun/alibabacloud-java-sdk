// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ValidateSqlStatementHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a14bd5d90a****</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static ValidateSqlStatementHeaders build(java.util.Map<String, ?> map) throws Exception {
        ValidateSqlStatementHeaders self = new ValidateSqlStatementHeaders();
        return TeaModel.build(map, self);
    }

    public ValidateSqlStatementHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ValidateSqlStatementHeaders setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
