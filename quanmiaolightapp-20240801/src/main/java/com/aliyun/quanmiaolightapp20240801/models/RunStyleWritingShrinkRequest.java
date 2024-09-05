// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunStyleWritingShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("learningSamples")
    public String learningSamplesShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("referenceMaterials")
    public String referenceMaterialsShrink;

    @NameInMap("styleFeature")
    public String styleFeature;

    /**
     * <p>This parameter is required.</p>
     */
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

    public RunStyleWritingShrinkRequest setWritingTheme(String writingTheme) {
        this.writingTheme = writingTheme;
        return this;
    }
    public String getWritingTheme() {
        return this.writingTheme;
    }

}
