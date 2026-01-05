// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateProductVersionRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the product version. Valid values:</p>
     * <ul>
     * <li>true: enables the product version. This is the default value.</li>
     * <li>false: disables the product version.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Active")
    public Boolean active;

    /**
     * <p>The description of the product version.</p>
     * <p>The value must be 1 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>The description of the product version.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The recommendation information. Valid values:</p>
     * <ul>
     * <li>Default: No recommendation information is provided. This is the default value.</li>
     * <li>Recommended: the recommended version.</li>
     * <li>Latest: the latest version.</li>
     * <li>Deprecated: the version that is about to be discontinued.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("Guidance")
    public String guidance;

    /**
     * <p>The ID of the product version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pv-bp15e79d26****</p>
     */
    @NameInMap("ProductVersionId")
    public String productVersionId;

    /**
     * <p>The name of the product version.</p>
     * <p>The value must be 1 to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("ProductVersionName")
    public String productVersionName;

    public static UpdateProductVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductVersionRequest self = new UpdateProductVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductVersionRequest setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public UpdateProductVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProductVersionRequest setGuidance(String guidance) {
        this.guidance = guidance;
        return this;
    }
    public String getGuidance() {
        return this.guidance;
    }

    public UpdateProductVersionRequest setProductVersionId(String productVersionId) {
        this.productVersionId = productVersionId;
        return this;
    }
    public String getProductVersionId() {
        return this.productVersionId;
    }

    public UpdateProductVersionRequest setProductVersionName(String productVersionName) {
        this.productVersionName = productVersionName;
        return this;
    }
    public String getProductVersionName() {
        return this.productVersionName;
    }

}
