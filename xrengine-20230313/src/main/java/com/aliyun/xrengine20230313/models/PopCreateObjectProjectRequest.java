// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopCreateObjectProjectRequest extends TeaModel {
    @NameInMap("AutoBuild")
    public Boolean autoBuild;

    @NameInMap("BizUsage")
    public String bizUsage;

    @NameInMap("CustomSource")
    public String customSource;

    @NameInMap("Dependencies")
    public String dependencies;

    @NameInMap("ForeignUid")
    public String foreignUid;

    @NameInMap("Intro")
    public String intro;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("RecommendStatus")
    public String recommendStatus;

    @NameInMap("Title")
    public String title;

    public static PopCreateObjectProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        PopCreateObjectProjectRequest self = new PopCreateObjectProjectRequest();
        return TeaModel.build(map, self);
    }

    public PopCreateObjectProjectRequest setAutoBuild(Boolean autoBuild) {
        this.autoBuild = autoBuild;
        return this;
    }
    public Boolean getAutoBuild() {
        return this.autoBuild;
    }

    public PopCreateObjectProjectRequest setBizUsage(String bizUsage) {
        this.bizUsage = bizUsage;
        return this;
    }
    public String getBizUsage() {
        return this.bizUsage;
    }

    public PopCreateObjectProjectRequest setCustomSource(String customSource) {
        this.customSource = customSource;
        return this;
    }
    public String getCustomSource() {
        return this.customSource;
    }

    public PopCreateObjectProjectRequest setDependencies(String dependencies) {
        this.dependencies = dependencies;
        return this;
    }
    public String getDependencies() {
        return this.dependencies;
    }

    public PopCreateObjectProjectRequest setForeignUid(String foreignUid) {
        this.foreignUid = foreignUid;
        return this;
    }
    public String getForeignUid() {
        return this.foreignUid;
    }

    public PopCreateObjectProjectRequest setIntro(String intro) {
        this.intro = intro;
        return this;
    }
    public String getIntro() {
        return this.intro;
    }

    public PopCreateObjectProjectRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public PopCreateObjectProjectRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public PopCreateObjectProjectRequest setRecommendStatus(String recommendStatus) {
        this.recommendStatus = recommendStatus;
        return this;
    }
    public String getRecommendStatus() {
        return this.recommendStatus;
    }

    public PopCreateObjectProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
