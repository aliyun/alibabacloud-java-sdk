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
     * <p>Used for testing</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The information about the patch package to be uploaded. 1. This parameter is not supported when PkgType is set to android. 2. Only one patch package can be in the uploading state (non-final state) for the same AppId at a time.</p>
     */
    @NameInMap("Patch")
    public String patchShrink;

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
    public String pkgLabelsShrink;

    /**
     * <p>The ID of the stable patch. This is the default patch ID used in customer business scenarios, such as session startup, when no patch ID is specified. This parameter is not supported when PkgType is set to android. Special value: origin: cancels the patch version and uses the initial version by default.</p>
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
