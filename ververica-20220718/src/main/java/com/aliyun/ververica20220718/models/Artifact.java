// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Artifact extends TeaModel {
    @NameInMap("jarArtifact")
    public JarArtifact jarArtifact;

    @NameInMap("kind")
    public String kind;

    @NameInMap("pythonArtifact")
    public PythonArtifact pythonArtifact;

    @NameInMap("sqlArtifact")
    public SqlArtifact sqlArtifact;

    public static Artifact build(java.util.Map<String, ?> map) throws Exception {
        Artifact self = new Artifact();
        return TeaModel.build(map, self);
    }

    public Artifact setJarArtifact(JarArtifact jarArtifact) {
        this.jarArtifact = jarArtifact;
        return this;
    }
    public JarArtifact getJarArtifact() {
        return this.jarArtifact;
    }

    public Artifact setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public Artifact setPythonArtifact(PythonArtifact pythonArtifact) {
        this.pythonArtifact = pythonArtifact;
        return this;
    }
    public PythonArtifact getPythonArtifact() {
        return this.pythonArtifact;
    }

    public Artifact setSqlArtifact(SqlArtifact sqlArtifact) {
        this.sqlArtifact = sqlArtifact;
        return this;
    }
    public SqlArtifact getSqlArtifact() {
        return this.sqlArtifact;
    }

}
