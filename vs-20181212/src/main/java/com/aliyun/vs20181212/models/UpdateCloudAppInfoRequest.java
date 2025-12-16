// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateCloudAppInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cap-b06b26edfhytbn b94a75ae1a79efc90eb</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Patch")
    public UpdateCloudAppInfoRequestPatch patch;

    @NameInMap("PkgLabels")
    public java.util.List<String> pkgLabels;

    /**
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
        @NameInMap("AsStablePatch")
        public Boolean asStablePatch;

        /**
         * <strong>example:</strong>
         * <p><a href="https://test_host/app/test-tar-pkg.tar">https://test_host/app/test-tar-pkg.tar</a></p>
         */
        @NameInMap("DownloadURL")
        public String downloadURL;

        /**
         * <strong>example:</strong>
         * <p>346f6404395adfg5bae1e45g4e943bf7</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <strong>example:</strong>
         * <p>p1</p>
         */
        @NameInMap("PatchName")
        public String patchName;

        /**
         * <strong>example:</strong>
         * <p>tar</p>
         */
        @NameInMap("PkgFormat")
        public String pkgFormat;

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
