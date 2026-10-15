// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AppServiceAggregate extends TeaModel {
    /**
     * <p>The business ID of the application instance.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20251211153330000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The deletion flag.</p>
     */
    @NameInMap("Deleted")
    public Integer deleted;

    /**
     * <p>The end time. It is in ISO 8601 format and uses the UTC (Z) time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-07-18T02:23:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>esp bizId</p>
     */
    @NameInMap("EspBizId")
    public String espBizId;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-07-30T02:08:40Z</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <p>The modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>Tue Sep 09 10:27:49 CST 2025</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The operation address of the application.</p>
     */
    @NameInMap("Group")
    public AppServiceGroup group;

    /**
     * <p>The associated business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250915163734000001</p>
     */
    @NameInMap("InstanceBizId")
    public String instanceBizId;

    /**
     * <p>The service name.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of flow nodes.</p>
     */
    @NameInMap("NodeList")
    public java.util.List<TreeNode> nodeList;

    /**
     * <p>The unique identifier for an operation.</p>
     */
    @NameInMap("OperationAddress")
    public AppOperationAddress operationAddress;

    /**
     * <p>The configuration information of the application service.</p>
     */
    @NameInMap("Profile")
    public AppServiceProfile profile;

    /**
     * <p>The service type.</p>
     * 
     * <strong>example:</strong>
     * <p>WEBSITE_DESIGN</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The description of the service type.</p>
     */
    @NameInMap("ServiceTypeText")
    public String serviceTypeText;

    /**
     * <p>The application identifier.</p>
     */
    @NameInMap("Slug")
    public String slug;

    /**
     * <p>The start time. It is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1754447102000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The user ID.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static AppServiceAggregate build(java.util.Map<String, ?> map) throws Exception {
        AppServiceAggregate self = new AppServiceAggregate();
        return TeaModel.build(map, self);
    }

    public AppServiceAggregate setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AppServiceAggregate setDeleted(Integer deleted) {
        this.deleted = deleted;
        return this;
    }
    public Integer getDeleted() {
        return this.deleted;
    }

    public AppServiceAggregate setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public AppServiceAggregate setEspBizId(String espBizId) {
        this.espBizId = espBizId;
        return this;
    }
    public String getEspBizId() {
        return this.espBizId;
    }

    public AppServiceAggregate setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AppServiceAggregate setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AppServiceAggregate setGroup(AppServiceGroup group) {
        this.group = group;
        return this;
    }
    public AppServiceGroup getGroup() {
        return this.group;
    }

    public AppServiceAggregate setInstanceBizId(String instanceBizId) {
        this.instanceBizId = instanceBizId;
        return this;
    }
    public String getInstanceBizId() {
        return this.instanceBizId;
    }

    public AppServiceAggregate setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppServiceAggregate setNodeList(java.util.List<TreeNode> nodeList) {
        this.nodeList = nodeList;
        return this;
    }
    public java.util.List<TreeNode> getNodeList() {
        return this.nodeList;
    }

    public AppServiceAggregate setOperationAddress(AppOperationAddress operationAddress) {
        this.operationAddress = operationAddress;
        return this;
    }
    public AppOperationAddress getOperationAddress() {
        return this.operationAddress;
    }

    public AppServiceAggregate setProfile(AppServiceProfile profile) {
        this.profile = profile;
        return this;
    }
    public AppServiceProfile getProfile() {
        return this.profile;
    }

    public AppServiceAggregate setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public AppServiceAggregate setServiceTypeText(String serviceTypeText) {
        this.serviceTypeText = serviceTypeText;
        return this;
    }
    public String getServiceTypeText() {
        return this.serviceTypeText;
    }

    public AppServiceAggregate setSlug(String slug) {
        this.slug = slug;
        return this;
    }
    public String getSlug() {
        return this.slug;
    }

    public AppServiceAggregate setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public AppServiceAggregate setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AppServiceAggregate setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
