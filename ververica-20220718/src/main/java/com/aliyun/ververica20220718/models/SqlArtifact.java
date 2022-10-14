// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class SqlArtifact extends TeaModel {
    @NameInMap("additionalDependencies")
    public java.util.List<String> additionalDependencies;

    @NameInMap("sqlScript")
    public String sqlScript;

    public static SqlArtifact build(java.util.Map<String, ?> map) throws Exception {
        SqlArtifact self = new SqlArtifact();
        return TeaModel.build(map, self);
    }

    public SqlArtifact setAdditionalDependencies(java.util.List<String> additionalDependencies) {
        this.additionalDependencies = additionalDependencies;
        return this;
    }
    public java.util.List<String> getAdditionalDependencies() {
        return this.additionalDependencies;
    }

    public SqlArtifact setSqlScript(String sqlScript) {
        this.sqlScript = sqlScript;
        return this;
    }
    public String getSqlScript() {
        return this.sqlScript;
    }

}
