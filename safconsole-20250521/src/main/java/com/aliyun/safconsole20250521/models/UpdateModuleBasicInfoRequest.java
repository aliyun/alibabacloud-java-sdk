// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class UpdateModuleBasicInfoRequest extends TeaModel {
    /**
     * <p>Customer model ID</p>
     * 
     * <strong>example:</strong>
     * <p>456</p>
     */
    @NameInMap("CustomerModuleId")
    public Integer customerModuleId;

    /**
     * <p>Model name.</p>
     * 
     * <strong>example:</strong>
     * <p>moduleName</p>
     */
    @NameInMap("CustomerModuleName")
    public String customerModuleName;

    /**
     * <p>Description.</p>
     * 
     * <strong>example:</strong>
     * <p>备注</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Module type.</p>
     * 
     * <strong>example:</strong>
     * <p>PMML</p>
     */
    @NameInMap("ModuleType")
    public String moduleType;

    /**
     * <p>Test address.</p>
     * 
     * <strong>example:</strong>
     * <p>saf/xxxxx/xxx.pmml</p>
     */
    @NameInMap("StorePath")
    public String storePath;

    public static UpdateModuleBasicInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModuleBasicInfoRequest self = new UpdateModuleBasicInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModuleBasicInfoRequest setCustomerModuleId(Integer customerModuleId) {
        this.customerModuleId = customerModuleId;
        return this;
    }
    public Integer getCustomerModuleId() {
        return this.customerModuleId;
    }

    public UpdateModuleBasicInfoRequest setCustomerModuleName(String customerModuleName) {
        this.customerModuleName = customerModuleName;
        return this;
    }
    public String getCustomerModuleName() {
        return this.customerModuleName;
    }

    public UpdateModuleBasicInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateModuleBasicInfoRequest setModuleType(String moduleType) {
        this.moduleType = moduleType;
        return this;
    }
    public String getModuleType() {
        return this.moduleType;
    }

    public UpdateModuleBasicInfoRequest setStorePath(String storePath) {
        this.storePath = storePath;
        return this;
    }
    public String getStorePath() {
        return this.storePath;
    }

}
