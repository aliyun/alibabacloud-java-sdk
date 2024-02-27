// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_verify_agent20240131.models;

import com.aliyun.tea.*;

public class CreateRequest extends TeaModel {
    @NameInMap("appName")
    public String appName;

    @NameInMap("bundleId")
    public String bundleId;

    @NameInMap("packName")
    public String packName;

    @NameInMap("platform")
    public String platform;

    @NameInMap("schemeName")
    public String schemeName;

    @NameInMap("signName")
    public String signName;

    public static CreateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRequest self = new CreateRequest();
        return TeaModel.build(map, self);
    }

    public CreateRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateRequest setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

    public CreateRequest setPackName(String packName) {
        this.packName = packName;
        return this;
    }
    public String getPackName() {
        return this.packName;
    }

    public CreateRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateRequest setSchemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }
    public String getSchemeName() {
        return this.schemeName;
    }

    public CreateRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

}
