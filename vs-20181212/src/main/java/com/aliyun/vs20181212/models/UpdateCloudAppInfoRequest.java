// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateCloudAppInfoRequest extends TeaModel {
    /**
     * <p>The ID of the cloud application, which corresponds to a unique application package.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cap-b06b26edfhytbn b94a75ae1a79efc90eb</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The description of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>Used for testing</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The information about the patch package to be uploaded. 1. This parameter is not supported when PkgType is set to android. 2. Only one patch package can be in the uploading state (non-final state) for the same AppId at a time.</p>
     */
    @NameInMap("Patch")
    public UpdateCloudAppInfoRequestPatch patch;

    /**
     * <p>The tags of the cloud application. You can specify multiple tags to reset the cloud application tags. Valid values:</p>
     * <ul>
     * <li>hot</li>
     * <li>game</li>
     * <li>app
     * To delete all tags, set the value to [&quot;NULL&quot;].</li>
     * </ul>
     */
    @NameInMap("PkgLabels")
    public java.util.List<String> pkgLabels;

    /**
     * <p>The ID of the stable patch. This is the default patch ID used in customer business scenarios, such as session startup, when no patch ID is specified. This parameter is not supported when PkgType is set to android. Special value: origin: cancels the patch version and uses the initial version by default.</p>
     * 
     * <strong>example:</strong>
     * <p>patch-03fa76e8e13a49b6a966b063d9d309b4</p>
     */
    @NameInMap("StablePatchId")
    public String stablePatchId;

    public static UpdateCloudAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudAppInfoRequest self = new UpdateCloudAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudAppInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateCloudAppInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCloudAppInfoRequest setPatch(UpdateCloudAppInfoRequestPatch patch) {
        this.patch = patch;
        return this;
    }
    public UpdateCloudAppInfoRequestPatch getPatch() {
        return this.patch;
    }

    public UpdateCloudAppInfoRequest setPkgLabels(java.util.List<String> pkgLabels) {
        this.pkgLabels = pkgLabels;
        return this;
    }
    public java.util.List<String> getPkgLabels() {
        return this.pkgLabels;
    }

    public UpdateCloudAppInfoRequest setStablePatchId(String stablePatchId) {
        this.stablePatchId = stablePatchId;
        return this;
    }
    public String getStablePatchId() {
        return this.stablePatchId;
    }

    public static class UpdateCloudAppInfoRequestPatch extends TeaModel {
        /**
         * <p>Specifies whether to automatically configure the patch as the stable patch after a successful upload. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AsStablePatch")
        public Boolean asStablePatch;

        /**
         * <p>The download URL of the patch package. By default, the format of the patch package is the same as that of the original cloud application package. You must specify either RenderingInstanceId or DownloadURL. DownloadURL takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test_host/app/test-tar-pkg.tar">https://test_host/app/test-tar-pkg.tar</a></p>
         */
        @NameInMap("DownloadURL")
        public String downloadURL;

        /**
         * <p>The MD5 hash of the patch package, which is used to verify integrity. This parameter is valid and required only when DownloadURL is not empty.</p>
         * 
         * <strong>example:</strong>
         * <p>346f6404395adfg5bae1e45g4e943bf7</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The name or description of the patch package, which is one of the unique identifiers under the AppId. Naming conventions: 1. The value cannot be origin or all. 2. The length must be 1 to 50 characters. 3. The value can contain lowercase letters, digits, underscores (_), hyphens (-), and periods (.). 4. The first and last characters must be letters or digits.</p>
         * 
         * <strong>example:</strong>
         * <p>p1</p>
         */
        @NameInMap("PatchName")
        public String patchName;

        /**
         * <p>The format of the installation package. By default, the format is the same as the suffix of the download file URL. This parameter is valid only when DownloadURL is not empty. Valid values:</p>
         * <ul>
         * <li>tar.gz</li>
         * <li>tar</li>
         * <li>zip</li>
         * <li>rar</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tar</p>
         */
        @NameInMap("PkgFormat")
        public String pkgFormat;

        /**
         * <p>The relative path of the post-command within the application package. This parameter is supported only for Windows applications.</p>
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

        /**
         * <p>The instance ID used to create the patch package. This parameter is valid only for Android application marketplace scenarios where PkgType is set to andrpid_appmarket. You must specify either RenderingInstanceId or DownloadURL. DownloadURL takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>render-d7ec79fe47ce47aca2d8d7500d25a28a</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        public static UpdateCloudAppInfoRequestPatch build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudAppInfoRequestPatch self = new UpdateCloudAppInfoRequestPatch();
            return TeaModel.build(map, self);
        }

        public UpdateCloudAppInfoRequestPatch setAsStablePatch(Boolean asStablePatch) {
            this.asStablePatch = asStablePatch;
            return this;
        }
        public Boolean getAsStablePatch() {
            return this.asStablePatch;
        }

        public UpdateCloudAppInfoRequestPatch setDownloadURL(String downloadURL) {
            this.downloadURL = downloadURL;
            return this;
        }
        public String getDownloadURL() {
            return this.downloadURL;
        }

        public UpdateCloudAppInfoRequestPatch setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public UpdateCloudAppInfoRequestPatch setPatchName(String patchName) {
            this.patchName = patchName;
            return this;
        }
        public String getPatchName() {
            return this.patchName;
        }

        public UpdateCloudAppInfoRequestPatch setPkgFormat(String pkgFormat) {
            this.pkgFormat = pkgFormat;
            return this;
        }
        public String getPkgFormat() {
            return this.pkgFormat;
        }

        public UpdateCloudAppInfoRequestPatch setPostCommandPath(String postCommandPath) {
            this.postCommandPath = postCommandPath;
            return this;
        }
        public String getPostCommandPath() {
            return this.postCommandPath;
        }

        public UpdateCloudAppInfoRequestPatch setPostCommandTimeoutSec(Integer postCommandTimeoutSec) {
            this.postCommandTimeoutSec = postCommandTimeoutSec;
            return this;
        }
        public Integer getPostCommandTimeoutSec() {
            return this.postCommandTimeoutSec;
        }

        public UpdateCloudAppInfoRequestPatch setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

    }

}
