// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunStyleWritingRequest extends TeaModel {
    @NameInMap("learningSamples")
    public java.util.List<String> learningSamples;

    @NameInMap("processStage")
    public String processStage;

    @NameInMap("referenceMaterials")
    public java.util.List<String> referenceMaterials;

    @NameInMap("styleFeature")
    public String styleFeature;

    @NameInMap("useSearch")
    public Boolean useSearch;

    @NameInMap("writingTheme")
    public String writingTheme;

    public static RunStyleWritingRequest build(java.util.Map<String, ?> map) throws Exception {
        RunStyleWritingRequest self = new RunStyleWritingRequest();
        return TeaModel.build(map, self);
    }

    public RunStyleWritingRequest setLearningSamples(java.util.List<String> learningSamples) {
        this.learningSamples = learningSamples;
        return this;
    }
    public java.util.List<String> getLearningSamples() {
        return this.learningSamples;
    }

    public RunStyleWritingRequest setProcessStage(String processStage) {
        this.processStage = processStage;
        return this;
    }
    public String getProcessStage() {
        return this.processStage;
    }

    public RunStyleWritingRequest setReferenceMaterials(java.util.List<String> referenceMaterials) {
        this.referenceMaterials = referenceMaterials;
        return this;
    }
    public java.util.List<String> getReferenceMaterials() {
        return this.referenceMaterials;
    }

    public RunStyleWritingRequest setStyleFeature(String styleFeature) {
        this.styleFeature = styleFeature;
        return this;
    }
    public String getStyleFeature() {
        return this.styleFeature;
    }

    public RunStyleWritingRequest setUseSearch(Boolean useSearch) {
        this.useSearch = useSearch;
        return this;
    }
    public Boolean getUseSearch() {
        return this.useSearch;
    }

    public RunStyleWritingRequest setWritingTheme(String writingTheme) {
        this.writingTheme = writingTheme;
        return this;
    }
    public String getWritingTheme() {
        return this.writingTheme;
    }

}
