// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyApplicationWhitelistRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>pac-*******************</p>
     */
    @NameInMap("ComponentId")
    public String componentId;

    /**
     * <strong>example:</strong>
     * <p>Append</p>
     */
    @NameInMap("ModifyMode")
    public String modifyMode;

    /**
     * <strong>example:</strong>
     * <p>sg-**************</p>
     */
    @NameInMap("SecurityGroups")
    public String securityGroups;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("SecurityIPArrayName")
    public String securityIPArrayName;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1,172.17.0.0/24</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    public static ModifyApplicationWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationWhitelistRequest self = new ModifyApplicationWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationWhitelistRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ModifyApplicationWhitelistRequest setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

    public ModifyApplicationWhitelistRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

    public ModifyApplicationWhitelistRequest setSecurityGroups(String securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }
    public String getSecurityGroups() {
        return this.securityGroups;
    }

    public ModifyApplicationWhitelistRequest setSecurityIPArrayName(String securityIPArrayName) {
        this.securityIPArrayName = securityIPArrayName;
        return this;
    }
    public String getSecurityIPArrayName() {
        return this.securityIPArrayName;
    }

    public ModifyApplicationWhitelistRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

}
