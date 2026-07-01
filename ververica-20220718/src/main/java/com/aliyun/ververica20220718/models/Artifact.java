// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Artifact extends TeaModel {
    /**
     * <p>Required for a data ingestion job.</p>
     */
    @NameInMap("cdcYamlArtifact")
    public CdcYamlArtifact cdcYamlArtifact;

    /**
     * <p>Required for a JAR job.</p>
     */
    @NameInMap("jarArtifact")
    public JarArtifact jarArtifact;

    /**
     * <p>Specifies the kind of job. This field is required and cannot be changed after creation.</p>
     * <ul>
     * <li><p>SQLSCRIPT: An SQL job.</p>
     * </li>
     * <li><p>JAR: A JAR job.</p>
     * </li>
     * <li><p>PYTHON: A Python job.</p>
     * </li>
     * <li><p>CDCYAML: A CDC data ingestion job.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SQLSCRIPT</p>
     */
    @NameInMap("kind")
    public String kind;

    /**
     * <p>Required for a Python job.</p>
     */
    @NameInMap("pythonArtifact")
    public PythonArtifact pythonArtifact;

    /**
     * <p>Required for an SQL job.</p>
     */
    @NameInMap("sqlArtifact")
    public SqlArtifact sqlArtifact;

    public static Artifact build(java.util.Map<String, ?> map) throws Exception {
        Artifact self = new Artifact();
        return TeaModel.build(map, self);
    }

    public Artifact setCdcYamlArtifact(CdcYamlArtifact cdcYamlArtifact) {
        this.cdcYamlArtifact = cdcYamlArtifact;
        return this;
    }
    public CdcYamlArtifact getCdcYamlArtifact() {
        return this.cdcYamlArtifact;
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
