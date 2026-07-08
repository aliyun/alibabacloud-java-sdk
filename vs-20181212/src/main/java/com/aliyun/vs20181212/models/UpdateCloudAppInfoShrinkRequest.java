// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateCloudAppInfoShrinkRequest extends TeaModel {
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
    public String patchShrink;

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
    public String pkgLabelsShrink;

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

    public static UpdateCloudAppInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudAppInfoShrinkRequest self = new UpdateCloudAppInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudAppInfoShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateCloudAppInfoShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCloudAppInfoShrinkRequest setPatchShrink(String patchShrink) {
        this.patchShrink = patchShrink;
        return this;
    }
    public String getPatchShrink() {
        return this.patchShrink;
    }

    public UpdateCloudAppInfoShrinkRequest setPkgLabelsShrink(String pkgLabelsShrink) {
        this.pkgLabelsShrink = pkgLabelsShrink;
        return this;
    }
    public String getPkgLabelsShrink() {
        return this.pkgLabelsShrink;
    }

    public UpdateCloudAppInfoShrinkRequest setStablePatchId(String stablePatchId) {
        this.stablePatchId = stablePatchId;
        return this;
    }
    public String getStablePatchId() {
        return this.stablePatchId;
    }

}
