// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class SqlArtifact extends TeaModel {
    /**
     * <p>The additional dependency files. If you want to use dependencies such as UDFs, connectors, and formats that are not registered on Ververica Platform (VVP), you need to configure this parameter. You do not need to configure this parameter for dependencies that are registered on VVP.</p>
     */
    @NameInMap("additionalDependencies")
    public java.util.List<String> additionalDependencies;

    /**
     * <p>The script of the SQL deployment.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATE TEMPORARY TABLE datagen_source(   name VARCHAR ) WITH (   \&quot;connector\&quot; = \&quot;datagen\&quot; ); CREATE TEMPORARY TABLE blackhole_sink(   name  VARCHAR ) with (   \&quot;connector\&quot; = \&quot;blackhole\&quot; ); INSERT INTO blackhole_sink SELECT name from datagen_source;</p>
     */
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
