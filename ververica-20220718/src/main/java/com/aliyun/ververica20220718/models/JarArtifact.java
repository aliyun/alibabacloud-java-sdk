// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class JarArtifact extends TeaModel {
    @NameInMap("additionalDependencies")
    public java.util.List<String> additionalDependencies;

    @NameInMap("entryClass")
    public String entryClass;

    @NameInMap("jarUri")
    public String jarUri;

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
