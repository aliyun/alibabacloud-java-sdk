// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateRenderingDataPackageRequest extends TeaModel {
    /**
     * <p>Data type. Valid values:</p>
     * <ul>
     * <li><p>Package (default value).</p>
     * </li>
     * <li><p>Baseline.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Package</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>Description.</p>
     * 
     * <strong>example:</strong>
     * <p>testdescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Billing type. Valid values:</p>
     * <ul>
     * <li>Hour: Hour.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Hour</p>
     */
    @NameInMap("InstanceBillingCycle")
    public String instanceBillingCycle;

    /**
     * <p>Cloud application service instance ID (Note: This operation is only for crs.cp.\* series instance types.)</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    public static CreateRenderingDataPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRenderingDataPackageRequest self = new CreateRenderingDataPackageRequest();
        return TeaModel.build(map, self);
    }

    public CreateRenderingDataPackageRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateRenderingDataPackageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRenderingDataPackageRequest setInstanceBillingCycle(String instanceBillingCycle) {
        this.instanceBillingCycle = instanceBillingCycle;
        return this;
    }
    public String getInstanceBillingCycle() {
        return this.instanceBillingCycle;
    }

    public CreateRenderingDataPackageRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

}
