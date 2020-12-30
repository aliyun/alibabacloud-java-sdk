// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class CreatePkgVersionRequest extends TeaModel {
    @NameInMap("PkgVersionLabel")
    public String pkgVersionLabel;

    @NameInMap("PkgVersionDescription")
    public String pkgVersionDescription;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("PackageSource")
    public String packageSource;

    public static CreatePkgVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePkgVersionRequest self = new CreatePkgVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreatePkgVersionRequest setPkgVersionLabel(String pkgVersionLabel) {
        this.pkgVersionLabel = pkgVersionLabel;
        return this;
    }
    public String getPkgVersionLabel() {
        return this.pkgVersionLabel;
    }

    public CreatePkgVersionRequest setPkgVersionDescription(String pkgVersionDescription) {
        this.pkgVersionDescription = pkgVersionDescription;
        return this;
    }
    public String getPkgVersionDescription() {
        return this.pkgVersionDescription;
    }

    public CreatePkgVersionRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreatePkgVersionRequest setPackageSource(String packageSource) {
        this.packageSource = packageSource;
        return this;
    }
    public String getPackageSource() {
        return this.packageSource;
    }

}
