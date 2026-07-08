// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UploadCloudAppRequest extends TeaModel {
    /**
     * <p>The application name. For Android apps, use the package name, such as com.aaa.bbb.</p>
     * <p>Value requirements:</p>
     * <ol>
     * <li><p>Length: 4–50 characters</p>
     * </li>
     * <li><p>Allowed characters: lowercase letters, digits, underscores (_), hyphens (-), and dots (.)</p>
     * </li>
     * <li><p>The first and last characters must be a letter or digit</p>
     * </li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>com.aaa.bbb</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Value requirements:</p>
     * <ol>
     * <li><p>Length: 1–50 characters</p>
     * </li>
     * <li><p>Allowed characters: lowercase letters, digits, underscores (_), hyphens (-), and dots (.)</p>
     * </li>
     * <li><p>The first and last characters must be a letter or digit</p>
     * </li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.1</p>
     */
    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <p>A description of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>测试应用包</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The download URL of the application package.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx.xxx.xxx.apk">https://xxx.xxx.xxx.apk</a></p>
     */
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    /**
     * <p>The MD5 hash of the application package, used to verify package integrity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0CFBB7BD10CDD7279642ADAB8FEF3DEE</p>
     */
    @NameInMap("Md5")
    public String md5;

    /**
     * <p>The package format. By default, this is inferred from the file extension in the DownloadUrl. Valid values:</p>
     * <ol>
     * <li><p>apk</p>
     * </li>
     * <li><p>tar.gz</p>
     * </li>
     * <li><p>tar</p>
     * </li>
     * <li><p>zip</p>
     * </li>
     * <li><p>rar</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>apk</p>
     */
    @NameInMap("PkgFormat")
    public String pkgFormat;

    /**
     * <p>Cloud application labels. You can select multiple. Valid values:</p>
     * <ol>
     * <li><p>hot</p>
     * </li>
     * <li><p>game</p>
     * </li>
     * <li><p>app</p>
     * </li>
     * </ol>
     */
    @NameInMap("PkgLabels")
    public java.util.List<String> pkgLabels;

    /**
     * <p>The package type.</p>
     * <h2>Valid values:</h2>
     * <ol>
     * <li><p>android</p>
     * </li>
     * <li><p>win</p>
     * </li>
     * <li><p>android_appmarket: for Android app marketplace scenarios. This scenario enforces real APK PackageName restrictions:
     * a. PackageNames must be unique across different AppNames.
     * b. The same AppName with different AppVersions can map to different PackageNames.</p>
     * </li>
     * </ol>
     * <h2>Default behavior:</h2>
     * <p>If not specified, the system automatically maps the package type based on PkgFormat (or infers PkgFormat from the DownloadUrl file extension). The default mapping is:</p>
     * <ol>
     * <li><p>android: apk</p>
     * </li>
     * <li><p>win: tar.gz, tar, zip, rar</p>
     * </li>
     * <li><p>android_appmarket: apk</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>android</p>
     */
    @NameInMap("PkgType")
    public String pkgType;

    public static UploadCloudAppRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadCloudAppRequest self = new UploadCloudAppRequest();
        return TeaModel.build(map, self);
    }

    public UploadCloudAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UploadCloudAppRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public UploadCloudAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UploadCloudAppRequest setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public UploadCloudAppRequest setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public UploadCloudAppRequest setPkgFormat(String pkgFormat) {
        this.pkgFormat = pkgFormat;
        return this;
    }
    public String getPkgFormat() {
        return this.pkgFormat;
    }

    public UploadCloudAppRequest setPkgLabels(java.util.List<String> pkgLabels) {
        this.pkgLabels = pkgLabels;
        return this;
    }
    public java.util.List<String> getPkgLabels() {
        return this.pkgLabels;
    }

    public UploadCloudAppRequest setPkgType(String pkgType) {
        this.pkgType = pkgType;
        return this;
    }
    public String getPkgType() {
        return this.pkgType;
    }

}
