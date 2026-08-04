// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UpdateResourceGroupRequest extends TeaModel {
    /**
     * <p>The description of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>test_new_havpn_tf</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>prophet</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Whether to detach the resource group from the currently connected VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Unbind")
    public Boolean unbind;

    /**
     * <p>Information about the VPC connected to the resource group.</p>
     */
    @NameInMap("UserVpc")
    public UserVpc userVpc;

    public static UpdateResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceGroupRequest self = new UpdateResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateResourceGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateResourceGroupRequest setUnbind(Boolean unbind) {
        this.unbind = unbind;
        return this;
    }
    public Boolean getUnbind() {
        return this.unbind;
    }

    public UpdateResourceGroupRequest setUserVpc(UserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

}
