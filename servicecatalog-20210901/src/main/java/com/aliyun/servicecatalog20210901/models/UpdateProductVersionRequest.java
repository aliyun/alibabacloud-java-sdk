// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateProductVersionRequest extends TeaModel {
    /**
     * <p>Specifies whether the product version is visible to end users. Valid values:</p>
     * <br>
     * <p>*   true: The product version is visible to end users. This is the default value.</p>
     * <p>*   false: The product version is invisible to end users.</p>
     */
    @NameInMap("Active")
    public Boolean active;

    /**
     * <p>The description of the product version.</p>
     * <br>
     * <p>The value must be 1 to 128 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The recommendation information. Valid values:</p>
     * <br>
     * <p>*   Default: No recommendation information is provided. This is the default value.</p>
     * <p>*   Recommended: the recommendation version.</p>
     * <p>*   Latest: the latest version.</p>
     * <p>*   Deprecated: the version that is about to be deprecated.</p>
     */
    @NameInMap("Guidance")
    public String guidance;

    /**
     * <p>The ID of the product version.</p>
     */
    @NameInMap("ProductVersionId")
    public String productVersionId;

    /**
     * <p>The name of the product version.</p>
     * <br>
     * <p>The value must be 1 to 128 characters in length.</p>
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
