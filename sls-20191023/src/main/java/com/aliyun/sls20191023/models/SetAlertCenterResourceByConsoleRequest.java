// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class SetAlertCenterResourceByConsoleRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("Language")
    public String language;

    @NameInMap("Region")
    public String region;

    public static SetAlertCenterResourceByConsoleRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAlertCenterResourceByConsoleRequest self = new SetAlertCenterResourceByConsoleRequest();
        return TeaModel.build(map, self);
    }

    public SetAlertCenterResourceByConsoleRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public SetAlertCenterResourceByConsoleRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SetAlertCenterResourceByConsoleRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
