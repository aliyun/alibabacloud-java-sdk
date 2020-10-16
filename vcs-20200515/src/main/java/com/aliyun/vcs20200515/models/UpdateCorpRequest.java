// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateCorpRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("CorpName")
    public String corpName;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("ParentCorpId")
    public String parentCorpId;

    @NameInMap("Description")
    public String description;

    @NameInMap("IsvSubId")
    public String isvSubId;

    @NameInMap("IconPath")
    public String iconPath;

    public static UpdateCorpRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCorpRequest self = new UpdateCorpRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCorpRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public UpdateCorpRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public UpdateCorpRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateCorpRequest setParentCorpId(String parentCorpId) {
        this.parentCorpId = parentCorpId;
        return this;
    }
    public String getParentCorpId() {
        return this.parentCorpId;
    }

    public UpdateCorpRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCorpRequest setIsvSubId(String isvSubId) {
        this.isvSubId = isvSubId;
        return this;
    }
    public String getIsvSubId() {
        return this.isvSubId;
    }

    public UpdateCorpRequest setIconPath(String iconPath) {
        this.iconPath = iconPath;
        return this;
    }
    public String getIconPath() {
        return this.iconPath;
    }

}
