// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateCloudAppInfoRequest extends TeaModel {
    /**
     * <p>The cloud application ID, which corresponds to a unique application package.</p>
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
     * <p>For testing purposes</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The information about the patch package to upload.</p>
     * <ol>
     * <li>Not supported when PkgType is set to android.</li>
     * <li>Only one patch can be in the uploading state at a time for the same AppId (only one patch in a non-final state is allowed per AppId).</li>
     * </ol>
     */
    @NameInMap("Patch")
    public UpdateCloudAppInfoRequestPatch patch;

    /**
     * <p>The cloud application labels. You can select multiple labels. This operation resets the cloud application labels.</p>
     * <ol>
     * <li>Valid values:
     *   a. hot
     *   b. game
     *   c. app</li>
     * <li>Special cases:
     *   a. To delete all labels, set this parameter to [&quot;NULL&quot;].</li>
     * </ol>
     */
    @NameInMap("PkgLabels")
    public java.util.List<String> pkgLabels;

    /**
     * <p>The stable PatchId. When a PatchId is not specified during business operations (such as session startup), this PatchId is used by default. Not supported when PkgType is set to android.
     * Special values:</p>
     * <ol>
     * <li>origin: cancels the patch version and uses the initial version by default.</li>
     * </ol>
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
         * <p>Specifies whether to automatically set the patch as the stable patch after a successful upload. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AsStablePatch")
        public Boolean asStablePatch;

        /**
         * <p>The download URL of the patch package.
         * Either RenderingInstanceId or DownloadURL is required. DownloadURL takes priority.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test_host/app/test-tar-pkg.tar">https://test_host/app/test-tar-pkg.tar</a></p>
         */
        @NameInMap("DownloadURL")
        public String downloadURL;

        /**
         * <p>The MD5 hash of the patch package, used for integrity verification. Valid only when DownloadURL is not empty. Required when DownloadURL is not empty.</p>
         * 
         * <strong>example:</strong>
         * <p>346f6404395adfg5bae1e45g4e943bf7</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The name or description of the patch package, which serves as a unique identifier under the AppId.
         * Naming conventions:</p>
         * <ol>
         * <li>Cannot be set to origin or all.</li>
         * <li>Must be 1 to 50 characters in length.</li>
         * <li>Can contain lowercase letters, digits, underscores (_), hyphens (-), and periods (.).</li>
         * <li>Must start and end with a letter or digit.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>p1</p>
         */
        @NameInMap("PatchName")
        public String patchName;

        /**
         * <p>The format of the installation package. The default value is the file extension of the download URL. Valid only when DownloadURL is not empty. Valid values:</p>
         * <ol>
         * <li>tar.gz</li>
         * <li>tar</li>
         * <li>zip</li>
         * <li>rar</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>tar</p>
         */
        @NameInMap("PkgFormat")
        public String pkgFormat;

        /**
         * <p>The relative path of the post-command within the application package. Only supported for Windows applications.</p>
         * 
         * <strong>example:</strong>
         * <p>install.ps1</p>
         */
        @NameInMap("PostCommandPath")
        public String postCommandPath;

        /**
         * <p>The timeout period for the post-command execution, in seconds. Only supported for Windows applications.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PostCommandTimeoutSec")
        public Integer postCommandTimeoutSec;

        /**
         * <p>The instance ID of the instance used to create the patch package. Valid only for Android application marketplace scenarios (PkgType=andrpid_appmarket). Either RenderingInstanceId or DownloadURL is required. DownloadURL takes priority.</p>
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
