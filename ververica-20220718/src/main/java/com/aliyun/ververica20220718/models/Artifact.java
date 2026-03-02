// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Artifact extends TeaModel {
    /**
     * <p>The information required for the SQL deployment.</p>
     */
    @NameInMap("jarArtifact")
    public JarArtifact jarArtifact;

    /**
     * <p>The type of the deployment. This parameter is required and cannot be modified after the deployment is created.</p>
     * <ul>
     * <li>SQLSCRIPT</li>
     * <li>JAR</li>
     * <li>PYTHON</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SQLSCRIPT</p>
     */
    @NameInMap("kind")
    public String kind;

    /**
     * <p>The information required for the Python deployment.</p>
     */
    @NameInMap("pythonArtifact")
    public PythonArtifact pythonArtifact;

    /**
     * <p>The information required for the JAR deployment.</p>
     */
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
