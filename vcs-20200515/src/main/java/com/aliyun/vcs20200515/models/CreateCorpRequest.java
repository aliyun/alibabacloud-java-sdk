// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateCorpRequest extends TeaModel {
    @NameInMap("AlgorithmType")
    public String algorithmType;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("CorpName")
    public String corpName;

    @NameInMap("Description")
    public String description;

    @NameInMap("IconPath")
    public String iconPath;

    @NameInMap("IsvSubId")
    public String isvSubId;

    @NameInMap("ParentCorpId")
    public String parentCorpId;

    public static CreateCorpRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCorpRequest self = new CreateCorpRequest();
        return TeaModel.build(map, self);
    }

    public CreateCorpRequest setAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }
    public String getAlgorithmType() {
        return this.algorithmType;
    }

    public CreateCorpRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateCorpRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public CreateCorpRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCorpRequest setIconPath(String iconPath) {
        this.iconPath = iconPath;
        return this;
    }
    public String getIconPath() {
        return this.iconPath;
    }

    public CreateCorpRequest setIsvSubId(String isvSubId) {
        this.isvSubId = isvSubId;
        return this;
    }
    public String getIsvSubId() {
        return this.isvSubId;
    }

    public CreateCorpRequest setParentCorpId(String parentCorpId) {
        this.parentCorpId = parentCorpId;
        return this;
    }
    public String getParentCorpId() {
        return this.parentCorpId;
    }

}
