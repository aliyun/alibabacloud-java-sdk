// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunStyleWritingShrinkRequest extends TeaModel {
    @NameInMap("learningSamples")
    public String learningSamplesShrink;

    @NameInMap("processStage")
    public String processStage;

    @NameInMap("referenceMaterials")
    public String referenceMaterialsShrink;

    @NameInMap("styleFeature")
    public String styleFeature;

    @NameInMap("useSearch")
    public Boolean useSearch;

    @NameInMap("writingTheme")
    public String writingTheme;

    public static RunStyleWritingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunStyleWritingShrinkRequest self = new RunStyleWritingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunStyleWritingShrinkRequest setLearningSamplesShrink(String learningSamplesShrink) {
        this.learningSamplesShrink = learningSamplesShrink;
        return this;
    }
    public String getLearningSamplesShrink() {
        return this.learningSamplesShrink;
    }

    public RunStyleWritingShrinkRequest setProcessStage(String processStage) {
        this.processStage = processStage;
        return this;
    }
    public String getProcessStage() {
        return this.processStage;
    }

    public RunStyleWritingShrinkRequest setReferenceMaterialsShrink(String referenceMaterialsShrink) {
        this.referenceMaterialsShrink = referenceMaterialsShrink;
        return this;
    }
    public String getReferenceMaterialsShrink() {
        return this.referenceMaterialsShrink;
    }

    public RunStyleWritingShrinkRequest setStyleFeature(String styleFeature) {
        this.styleFeature = styleFeature;
        return this;
    }
    public String getStyleFeature() {
        return this.styleFeature;
    }

    public RunStyleWritingShrinkRequest setUseSearch(Boolean useSearch) {
        this.useSearch = useSearch;
        return this;
    }
    public Boolean getUseSearch() {
        return this.useSearch;
    }

    public RunStyleWritingShrinkRequest setWritingTheme(String writingTheme) {
        this.writingTheme = writingTheme;
        return this;
    }
    public String getWritingTheme() {
        return this.writingTheme;
    }

}
