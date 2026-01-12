// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class CreateProjectShrinkRequest extends TeaModel {
    @NameInMap("AutoBuild")
    public Boolean autoBuild;

    @NameInMap("Dependencies")
    public String dependencies;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("Gender")
    public String gender;

    @NameInMap("Height")
    public Double height;

    @NameInMap("Intro")
    public String intro;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("MapUuid")
    public String mapUuid;

    @NameInMap("Method")
    public String method;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("Title")
    public String title;

    @NameInMap("TryOnParams")
    public String tryOnParamsShrink;

    @NameInMap("Type")
    public String type;

    @NameInMap("Weight")
    public Double weight;

    public static CreateProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectShrinkRequest self = new CreateProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectShrinkRequest setAutoBuild(Boolean autoBuild) {
        this.autoBuild = autoBuild;
        return this;
    }
    public Boolean getAutoBuild() {
        return this.autoBuild;
    }

    public CreateProjectShrinkRequest setDependencies(String dependencies) {
        this.dependencies = dependencies;
        return this;
    }
    public String getDependencies() {
        return this.dependencies;
    }

    public CreateProjectShrinkRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public CreateProjectShrinkRequest setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public CreateProjectShrinkRequest setHeight(Double height) {
        this.height = height;
        return this;
    }
    public Double getHeight() {
        return this.height;
    }

    public CreateProjectShrinkRequest setIntro(String intro) {
        this.intro = intro;
        return this;
    }
    public String getIntro() {
        return this.intro;
    }

    public CreateProjectShrinkRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public CreateProjectShrinkRequest setMapUuid(String mapUuid) {
        this.mapUuid = mapUuid;
        return this;
    }
    public String getMapUuid() {
        return this.mapUuid;
    }

    public CreateProjectShrinkRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public CreateProjectShrinkRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateProjectShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateProjectShrinkRequest setTryOnParamsShrink(String tryOnParamsShrink) {
        this.tryOnParamsShrink = tryOnParamsShrink;
        return this;
    }
    public String getTryOnParamsShrink() {
        return this.tryOnParamsShrink;
    }

    public CreateProjectShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateProjectShrinkRequest setWeight(Double weight) {
        this.weight = weight;
        return this;
    }
    public Double getWeight() {
        return this.weight;
    }

}
