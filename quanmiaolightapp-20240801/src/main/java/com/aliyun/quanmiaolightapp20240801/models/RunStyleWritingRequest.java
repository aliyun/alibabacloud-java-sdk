// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunStyleWritingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("learningSamples")
    public java.util.List<String> learningSamples;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("referenceMaterials")
    public java.util.List<String> referenceMaterials;

    @NameInMap("styleFeature")
    public String styleFeature;

    /**
     * <p>This parameter is required.</p>
     */
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

    public RunStyleWritingRequest setWritingTheme(String writingTheme) {
        this.writingTheme = writingTheme;
        return this;
    }
    public String getWritingTheme() {
        return this.writingTheme;
    }

}
