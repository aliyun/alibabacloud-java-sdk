// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class PythonArtifact extends TeaModel {
    /**
     * <p>The URL of the additional dependency file.</p>
     */
    @NameInMap("additionalDependencies")
    public java.util.List<String> additionalDependencies;

    /**
     * <p>The Python archive file on which the deployment depends.</p>
     */
    @NameInMap("additionalPythonArchives")
    public java.util.List<String> additionalPythonArchives;

    /**
     * <p>The Python library file on which the deployment depends.</p>
     */
    @NameInMap("additionalPythonLibraries")
    public java.util.List<String> additionalPythonLibraries;

    /**
     * <p>The startup module for the Python deployment.</p>
     * 
     * <strong>example:</strong>
     * <p>test.py</p>
     */
    @NameInMap("entryModule")
    public String entryModule;

    /**
     * <p>The startup parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>start from main</p>
     */
    @NameInMap("mainArgs")
    public String mainArgs;

    /**
     * <p>The full URL for the Python deployment.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oss/bucket/test.py">https://oss/bucket/test.py</a></p>
     */
    @NameInMap("pythonArtifactUri")
    public String pythonArtifactUri;

    public static PythonArtifact build(java.util.Map<String, ?> map) throws Exception {
        PythonArtifact self = new PythonArtifact();
        return TeaModel.build(map, self);
    }

    public PythonArtifact setAdditionalDependencies(java.util.List<String> additionalDependencies) {
        this.additionalDependencies = additionalDependencies;
        return this;
    }
    public java.util.List<String> getAdditionalDependencies() {
        return this.additionalDependencies;
    }

    public PythonArtifact setAdditionalPythonArchives(java.util.List<String> additionalPythonArchives) {
        this.additionalPythonArchives = additionalPythonArchives;
        return this;
    }
    public java.util.List<String> getAdditionalPythonArchives() {
        return this.additionalPythonArchives;
    }

    public PythonArtifact setAdditionalPythonLibraries(java.util.List<String> additionalPythonLibraries) {
        this.additionalPythonLibraries = additionalPythonLibraries;
        return this;
    }
    public java.util.List<String> getAdditionalPythonLibraries() {
        return this.additionalPythonLibraries;
    }

    public PythonArtifact setEntryModule(String entryModule) {
        this.entryModule = entryModule;
        return this;
    }
    public String getEntryModule() {
        return this.entryModule;
    }

    public PythonArtifact setMainArgs(String mainArgs) {
        this.mainArgs = mainArgs;
        return this;
    }
    public String getMainArgs() {
        return this.mainArgs;
    }

    public PythonArtifact setPythonArtifactUri(String pythonArtifactUri) {
        this.pythonArtifactUri = pythonArtifactUri;
        return this;
    }
    public String getPythonArtifactUri() {
        return this.pythonArtifactUri;
    }

}
