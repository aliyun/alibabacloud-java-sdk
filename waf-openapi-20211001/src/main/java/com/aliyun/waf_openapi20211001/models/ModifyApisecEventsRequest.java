// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyApisecEventsRequest extends TeaModel {
    /**
     * <p>The ID of the hybrid cloud cluster.</p>
     * <blockquote>
     * <p>This parameter is available only for hybrid cloud scenarios. Call <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> to obtain information about hybrid cloud clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>428</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>A list of API security event IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventIds")
    public java.util.List<String> eventIds;

    /**
     * <p>The dimension of the security event. Valid values:</p>
     * <ul>
     * <li><p><strong>ip</strong> (default): IP security event.</p>
     * </li>
     * <li><p><strong>account</strong>: account security event.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("EventScope")
    public String eventScope;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to obtain the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>already confirmed.</p>
     */
    @NameInMap("Note")
    public String note;

    /**
     * <p>The region of the WAF instance. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
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
     * <p>The status of the event. Valid values:</p>
     * <ul>
     * <li><p><strong>toBeConfirmed</strong>: The event is pending confirmation.</p>
     * </li>
     * <li><p><strong>confirmed</strong>: The event is confirmed.</p>
     * </li>
     * <li><p><strong>ignored</strong>: The event is ignored.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>confirmed</p>
     */
    @NameInMap("UserStatus")
    public String userStatus;

    public static ModifyApisecEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApisecEventsRequest self = new ModifyApisecEventsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApisecEventsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyApisecEventsRequest setEventIds(java.util.List<String> eventIds) {
        this.eventIds = eventIds;
        return this;
    }
    public java.util.List<String> getEventIds() {
        return this.eventIds;
    }

    public ModifyApisecEventsRequest setEventScope(String eventScope) {
        this.eventScope = eventScope;
        return this;
    }
    public String getEventScope() {
        return this.eventScope;
    }

    public ModifyApisecEventsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyApisecEventsRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public ModifyApisecEventsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyApisecEventsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ModifyApisecEventsRequest setUserStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    public String getUserStatus() {
        return this.userStatus;
    }

}
