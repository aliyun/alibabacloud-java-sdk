// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateCloudAppInfoShrinkRequest extends TeaModel {
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
    public String patchShrink;

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
    public String pkgLabelsShrink;

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
