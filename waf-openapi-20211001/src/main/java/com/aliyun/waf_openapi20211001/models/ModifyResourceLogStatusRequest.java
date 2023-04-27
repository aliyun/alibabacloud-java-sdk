// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyResourceLogStatusRequest extends TeaModel {
    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <br>
     * <p>>  You can call the [DescribeInstance](~~433756~~) operation to obtain the ID of the WAF instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou:** the Chinese mainland.</p>
     * <p>*   **ap-southeast-1:** outside the Chinese mainland.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The protected object on which you want to manage the log collection feature.</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>Specifies whether to enable the log collection feature for the protected object. Valid values:</p>
     * <br>
     * <p>*   **true:** enables the log collection feature.</p>
     * <p>*   **false:** disables the log collection feature.</p>
     */
    @NameInMap("Status")
    public Boolean status;

    public static ModifyResourceLogStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceLogStatusRequest self = new ModifyResourceLogStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyResourceLogStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyResourceLogStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyResourceLogStatusRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public ModifyResourceLogStatusRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ModifyResourceLogStatusRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
