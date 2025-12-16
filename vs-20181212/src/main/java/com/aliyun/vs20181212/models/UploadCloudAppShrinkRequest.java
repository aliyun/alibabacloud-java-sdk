// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UploadCloudAppShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>com.aaa.bbb</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.1</p>
     */
    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx.xxx.xxx.apk">https://xxx.xxx.xxx.apk</a></p>
     */
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0CFBB7BD10CDD7279642ADAB8FEF3DEE</p>
     */
    @NameInMap("Md5")
    public String md5;

    @NameInMap("PkgFormat")
    public String pkgFormat;

    @NameInMap("PkgLabels")
    public String pkgLabelsShrink;

    @NameInMap("PkgType")
    public String pkgType;

    public static UploadCloudAppShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadCloudAppShrinkRequest self = new UploadCloudAppShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UploadCloudAppShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UploadCloudAppShrinkRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public UploadCloudAppShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UploadCloudAppShrinkRequest setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public UploadCloudAppShrinkRequest setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public UploadCloudAppShrinkRequest setPkgFormat(String pkgFormat) {
        this.pkgFormat = pkgFormat;
        return this;
    }
    public String getPkgFormat() {
        return this.pkgFormat;
    }

    public UploadCloudAppShrinkRequest setPkgLabelsShrink(String pkgLabelsShrink) {
        this.pkgLabelsShrink = pkgLabelsShrink;
        return this;
    }
    public String getPkgLabelsShrink() {
        return this.pkgLabelsShrink;
    }

    public UploadCloudAppShrinkRequest setPkgType(String pkgType) {
        this.pkgType = pkgType;
        return this;
    }
    public String getPkgType() {
        return this.pkgType;
    }

}
