// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UploadCloudAppShrinkRequest extends TeaModel {
    /**
     * <p>The application name. For Android applications, we recommend that you use the package name, such as com.aaa.bbb. Naming conventions: 1. The length is 4 to 50 characters. 2. The name can contain lowercase letters, digits, underscores (_), hyphens (-), and periods (.). 3. The first and last characters must be letters or digits.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>com.aaa.bbb</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The application version. For Android applications, we recommend that you use the VersionName, such as 1.1.1. Naming conventions: 1. The length is 1 to 50 characters. 2. The version can contain lowercase letters, digits, underscores (_), hyphens (-), and periods (.). 3. The first and last characters must be letters or digits.</p>
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
     * <p>The MD5 hash of the application package, which is used to check the integrity of the application package.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0CFBB7BD10CDD7279642ADAB8FEF3DEE</p>
     */
    @NameInMap("Md5")
    public String md5;

    /**
     * <p>The format of the installation package. The default value is the file name extension of the download URL. Valid values: 1. apk 2. tar.gz 3. tar 4. zip 5. rar.</p>
     * 
     * <strong>example:</strong>
     * <p>apk</p>
     */
    @NameInMap("PkgFormat")
    public String pkgFormat;

    /**
     * <p>The tags of the cloud application. You can specify multiple tags. Valid values: 1. hot 2. game 3. app.</p>
     */
    @NameInMap("PkgLabels")
    public String pkgLabelsShrink;

    /**
     * <p>The type of the installation package. ## Valid values: 1. android 2. win 3. android_appmarket: This value applies to Android app marketplace scenarios. In this scenario, the actual package name of the APK is restricted. a. The package names of different AppName values cannot be duplicated. b. Different AppVersion values of the same AppName can be associated with different package names. ## Default value description: If this parameter is not specified, the installation package type is automatically mapped based on the PkgFormat parameter or the file name extension of the DownloadUrl parameter. The default mapping between PkgFormat and the installation package type is as follows: 1. android: apk. The apk format is mapped to android by default. 2. win: tar.gz, tar, zip, and rar. 3. android_appmarket: apk.</p>
     * 
     * <strong>example:</strong>
     * <p>android</p>
     */
    @NameInMap("PkgType")
    public String pkgType;

    /**
     * <p>The relative path of the post-command in the application package. This parameter is supported only for Windows applications.</p>
     * 
     * <strong>example:</strong>
     * <p>install.ps1</p>
     */
    @NameInMap("PostCommandPath")
    public String postCommandPath;

    /**
     * <p>The timeout period for executing the post-command, in seconds. This parameter is supported only for Windows applications.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PostCommandTimeoutSec")
    public Integer postCommandTimeoutSec;

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

    public UploadCloudAppShrinkRequest setPostCommandPath(String postCommandPath) {
        this.postCommandPath = postCommandPath;
        return this;
    }
    public String getPostCommandPath() {
        return this.postCommandPath;
    }

    public UploadCloudAppShrinkRequest setPostCommandTimeoutSec(Integer postCommandTimeoutSec) {
        this.postCommandTimeoutSec = postCommandTimeoutSec;
        return this;
    }
    public Integer getPostCommandTimeoutSec() {
        return this.postCommandTimeoutSec;
    }

}
