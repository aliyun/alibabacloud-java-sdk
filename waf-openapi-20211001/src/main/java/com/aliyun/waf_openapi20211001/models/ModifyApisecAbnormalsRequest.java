// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyApisecAbnormalsRequest extends TeaModel {
    /**
     * <p>A list of API security risk IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AbnormalIds")
    public java.util.List<String> abnormalIds;

    /**
     * <p>The ID of the hybrid cloud cluster.</p>
     * <blockquote>
     * <p>This parameter is available only for hybrid cloud scenarios. Call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to query information about hybrid cloud clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>428</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The remarks for the status change.</p>
     * 
     * <strong>example:</strong>
     * <p>already fixed.</p>
     */
    @NameInMap("Note")
    public String note;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: a region outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The status of the security risk. Valid values:</p>
     * <ul>
     * <li><p><strong>toBeConfirmed</strong>: The security risk is to be confirmed.</p>
     * </li>
     * <li><p><strong>confirmed</strong>: The security risk is confirmed.</p>
     * </li>
     * <li><p><strong>toBeFixed</strong>: The security risk is to be fixed.</p>
     * </li>
     * <li><p><strong>fixed</strong>: The security risk is fixed.</p>
     * </li>
     * <li><p><strong>ignored</strong>: The security risk is ignored.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fixed</p>
     */
    @NameInMap("UserStatus")
    public String userStatus;

    public static ModifyApisecAbnormalsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApisecAbnormalsRequest self = new ModifyApisecAbnormalsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApisecAbnormalsRequest setAbnormalIds(java.util.List<String> abnormalIds) {
        this.abnormalIds = abnormalIds;
        return this;
    }
    public java.util.List<String> getAbnormalIds() {
        return this.abnormalIds;
    }

    public ModifyApisecAbnormalsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyApisecAbnormalsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyApisecAbnormalsRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public ModifyApisecAbnormalsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyApisecAbnormalsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ModifyApisecAbnormalsRequest setUserStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    public String getUserStatus() {
        return this.userStatus;
    }

}
