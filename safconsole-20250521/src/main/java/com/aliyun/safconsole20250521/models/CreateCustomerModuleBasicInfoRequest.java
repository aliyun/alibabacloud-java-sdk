// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class CreateCustomerModuleBasicInfoRequest extends TeaModel {
    /**
     * <p>The display identifier of the model for customers.</p>
     * 
     * <strong>example:</strong>
     * <p>module01</p>
     */
    @NameInMap("CustomerModuleName")
    public String customerModuleName;

    /**
     * <p>Model description.</p>
     * 
     * <strong>example:</strong>
     * <p>模型描述</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Model deployment type.</p>
     * 
     * <strong>example:</strong>
     * <p>PMML</p>
     */
    @NameInMap("ModuleType")
    public String moduleType;

    /**
     * <p>Model storage path.</p>
     * 
     * <strong>example:</strong>
     * <p>customer/xxxxxxxxx/xxxxxxxx.pmml</p>
     */
    @NameInMap("StorePath")
    public String storePath;

    public static CreateCustomerModuleBasicInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomerModuleBasicInfoRequest self = new CreateCustomerModuleBasicInfoRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomerModuleBasicInfoRequest setCustomerModuleName(String customerModuleName) {
        this.customerModuleName = customerModuleName;
        return this;
    }
    public String getCustomerModuleName() {
        return this.customerModuleName;
    }

    public CreateCustomerModuleBasicInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCustomerModuleBasicInfoRequest setModuleType(String moduleType) {
        this.moduleType = moduleType;
        return this;
    }
    public String getModuleType() {
        return this.moduleType;
    }

    public CreateCustomerModuleBasicInfoRequest setStorePath(String storePath) {
        this.storePath = storePath;
        return this;
    }
    public String getStorePath() {
        return this.storePath;
    }

}
