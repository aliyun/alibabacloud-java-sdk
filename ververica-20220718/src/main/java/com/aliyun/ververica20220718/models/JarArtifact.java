// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class JarArtifact extends TeaModel {
    /**
     * <p>The full URL of the additional dependency file. You can enter the dependency file for the JAR deployment.</p>
     */
    @NameInMap("additionalDependencies")
    public java.util.List<String> additionalDependencies;

    /**
     * <p>The entry class. You must enter the full name of the class.</p>
     * 
     * <strong>example:</strong>
     * <p>org.apapche.flink.test</p>
     */
    @NameInMap("entryClass")
    public String entryClass;

    /**
     * <p>The full URL for the JAR deployment.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oss/bucket/test.jar">https://oss/bucket/test.jar</a></p>
     */
    @NameInMap("jarUri")
    public String jarUri;

    /**
     * <p>The parameters required by the entry class.</p>
     * 
     * <strong>example:</strong>
     * <p>start from main</p>
     */
    @NameInMap("mainArgs")
    public String mainArgs;

    public static JarArtifact build(java.util.Map<String, ?> map) throws Exception {
        JarArtifact self = new JarArtifact();
        return TeaModel.build(map, self);
    }

    public JarArtifact setAdditionalDependencies(java.util.List<String> additionalDependencies) {
        this.additionalDependencies = additionalDependencies;
        return this;
    }
    public java.util.List<String> getAdditionalDependencies() {
        return this.additionalDependencies;
    }

    public JarArtifact setEntryClass(String entryClass) {
        this.entryClass = entryClass;
        return this;
    }
    public String getEntryClass() {
        return this.entryClass;
    }

    public JarArtifact setJarUri(String jarUri) {
        this.jarUri = jarUri;
        return this;
    }
    public String getJarUri() {
        return this.jarUri;
    }

    public JarArtifact setMainArgs(String mainArgs) {
        this.mainArgs = mainArgs;
        return this;
    }
    public String getMainArgs() {
        return this.mainArgs;
    }

}
