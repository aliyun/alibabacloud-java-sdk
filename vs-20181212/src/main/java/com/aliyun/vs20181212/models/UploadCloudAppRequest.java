// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UploadCloudAppRequest extends TeaModel {
    /**
     * <p>The application name. For Android applications, use the package name, such as com.aaa.bbb.</p>
     * <p>Value rules:</p>
     * <ol>
     * <li>Length: 4 to 50 characters.</li>
     * <li>Lowercase letters, digits, underscores (_), hyphens (-), and periods (.).</li>
     * <li>The first and last characters must be letters or digits.</li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>com.aaa.bbb</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The application version. For Android applications, use the VersionName, such as 1.1.1.</p>
     * <p>Value rules:</p>
     * <ol>
     * <li>Length: 1 to 50 characters.</li>
     * <li>Lowercase letters, digits, underscores (_), hyphens (-), and periods (.).</li>
     * <li>The first and last characters must be letters or digits.</li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.1</p>
     */
    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <p>The description of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>Test application package</p>
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
     * <p>The MD5 checksum of the application package, used to verify package integrity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0CFBB7BD10CDD7279642ADAB8FEF3DEE</p>
     */
    @NameInMap("Md5")
    public String md5;

    /**
     * <p>The package format. The default value is the file extension of the download URL. Valid values:</p>
     * <ol>
     * <li>apk</li>
     * <li>tar.gz</li>
     * <li>tar</li>
     * <li>zip</li>
     * <li>rar</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>apk</p>
     */
    @NameInMap("PkgFormat")
    public String pkgFormat;

    /**
     * <p>The cloud application labels. You can select multiple values. Valid values:</p>
     * <ol>
     * <li>hot</li>
     * <li>game</li>
     * <li>app</li>
     * </ol>
     */
    @NameInMap("PkgLabels")
    public java.util.List<String> pkgLabels;

    /**
     * <p>The package type.</p>
     * <h2>Valid values:</h2>
     * <ol>
     * <li>android</li>
     * <li>win</li>
     * <li>android_appmarket: corresponds to the Android app marketplace scenario. In this scenario, the actual APK PackageName is restricted:
     * a. Different AppName values cannot share the same PackageName.
     * b. The same AppName with different AppVersion values can be associated with different PackageName values.</li>
     * </ol>
     * <h2>Default value:</h2>
     * <p>If not specified, the package type is automatically mapped based on PkgFormat (or the file extension of DownloadUrl). Default mappings between PkgFormat and package type:</p>
     * <ol>
     * <li>android: apk (the apk format is mapped to android by default).</li>
     * <li>win: tar.gz, tar, zip, rar.</li>
     * <li>android_appmarket: apk.</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>android</p>
     */
    @NameInMap("PkgType")
    public String pkgType;

    /**
     * <p>The relative path of the post-installation command within the application package. Only supported for win type applications.</p>
     * 
     * <strong>example:</strong>
     * <p>install.ps1</p>
     */
    @NameInMap("PostCommandPath")
    public String postCommandPath;

    /**
     * <p>The timeout period (in seconds) for the post-installation command. Only supported for win type applications.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PostCommandTimeoutSec")
    public Integer postCommandTimeoutSec;

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

    public UploadCloudAppRequest setPostCommandPath(String postCommandPath) {
        this.postCommandPath = postCommandPath;
        return this;
    }
    public String getPostCommandPath() {
        return this.postCommandPath;
    }

    public UploadCloudAppRequest setPostCommandTimeoutSec(Integer postCommandTimeoutSec) {
        this.postCommandTimeoutSec = postCommandTimeoutSec;
        return this;
    }
    public Integer getPostCommandTimeoutSec() {
        return this.postCommandTimeoutSec;
    }

}
