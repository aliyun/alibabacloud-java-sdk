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
     * <p>用于测试使用</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Information about the patch package to upload.</p>
     * <ol>
     * <li><p>This parameter is not supported when PkgType is android.</p>
     * </li>
     * <li><p>For the same AppId, only one patch can be in the process of uploading at a time. This means only one patch can be in a state other than its desired state.</p>
     * </li>
     * </ol>
     */
    @NameInMap("Patch")
    public UpdateCloudAppInfoRequestPatch patch;

    /**
     * <p>The tags for the cloud application. You can select multiple tags. This action resets all existing tags for the cloud application.</p>
     * <ol>
     * <li><p>Valid values:
     * hot, game, and app.</p>
     * </li>
     * <li><p>Special case:
     * To delete all tags, enter [&quot;NULL&quot;].</p>
     * </li>
     * </ol>
     */
    @NameInMap("PkgLabels")
    public java.util.List<String> pkgLabels;

    /**
     * <p>The ID of the stable patch. This patch is used by default if you do not specify a PatchId when the application is in use, such as during a session startup. This parameter is not supported when PkgType is android.
     * Special value:</p>
     * <ol>
     * <li>If you set this parameter to origin, the patch version is removed and the initial version is used.</li>
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
         * <p>Specifies whether to automatically set the patch as the stable version after it is successfully uploaded. The default value is false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AsStablePatch")
        public Boolean asStablePatch;

        /**
         * <p>The download URL for the patch package.
         * You must specify either RenderingInstanceId or DownloadURL.
         * DownloadURL takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test_host/app/test-tar-pkg.tar">https://test_host/app/test-tar-pkg.tar</a></p>
         */
        @NameInMap("DownloadURL")
        public String downloadURL;

        /**
         * <p>The MD5 hash of the patch package, used to verify integrity. This parameter is valid only if DownloadURL is not empty. It is required if DownloadURL is not empty.</p>
         * 
         * <strong>example:</strong>
         * <p>346f6404395adfg5bae1e45g4e943bf7</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The name or description of the patch package. This is a unique identifier under the AppId.
         * Default naming conventions:</p>
         * <ol>
         * <li><p>Cannot be origin or all.</p>
         * </li>
         * <li><p>Must be 1 to 50 characters in length.</p>
         * </li>
         * <li><p>Can contain lowercase letters, digits, underscores (_), hyphens (-), and periods (.).</p>
         * </li>
         * <li><p>The first and last characters must be a letter or a digit.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>p1</p>
         */
        @NameInMap("PatchName")
        public String patchName;

        /**
         * <p>The format of the installation package. By default, the system uses the file extension from the download URL. This parameter is valid only if DownloadURL is not empty. Valid values:</p>
         * <ol>
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
         * <p>tar</p>
         */
        @NameInMap("PkgFormat")
        public String pkgFormat;

        /**
         * <p>The instance ID required to create the patch package. This parameter is valid only in the Android application marketplace scenario (PkgType=andrpid_appmarket). Specify either RenderingInstanceId or DownloadURL. DownloadURL takes precedence.</p>
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

        public UpdateCloudAppInfoRequestPatch setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

    }

}
