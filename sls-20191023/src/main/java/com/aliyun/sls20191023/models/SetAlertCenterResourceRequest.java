// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class SetAlertCenterResourceRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("Language")
    public String language;

    @NameInMap("Region")
    public String region;

    public static SetAlertCenterResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAlertCenterResourceRequest self = new SetAlertCenterResourceRequest();
        return TeaModel.build(map, self);
    }

    public SetAlertCenterResourceRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public SetAlertCenterResourceRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SetAlertCenterResourceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
