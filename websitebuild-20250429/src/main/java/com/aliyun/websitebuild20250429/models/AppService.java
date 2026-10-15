// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AppService extends TeaModel {
    /**
     * <p>The business ID of the application instance.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20251211153330000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The creation time in ISO 8601 format in the UTC time zone (Z).</p>
     * 
     * <strong>example:</strong>
     * <p>2025-07-30T02:08:40Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The deletion flag.</p>
     */
    @NameInMap("Deleted")
    public Integer deleted;

    /**
     * <p>The end time in ISO 8601 format in the UTC time zone (Z).</p>
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
     * <p>The modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>Tue Sep 09 10:27:49 CST 2025</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

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
     * <p>The application service configuration information.</p>
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
     * <p>The service type description.</p>
     */
    @NameInMap("ServiceTypeText")
    public String serviceTypeText;

    /**
     * <p>The application identifier.</p>
     */
    @NameInMap("Slug")
    public String slug;

    /**
     * <p>The start time as a UNIX timestamp in milliseconds.</p>
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

    public static AppService build(java.util.Map<String, ?> map) throws Exception {
        AppService self = new AppService();
        return TeaModel.build(map, self);
    }

    public AppService setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AppService setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public AppService setDeleted(Integer deleted) {
        this.deleted = deleted;
        return this;
    }
    public Integer getDeleted() {
        return this.deleted;
    }

    public AppService setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public AppService setEspBizId(String espBizId) {
        this.espBizId = espBizId;
        return this;
    }
    public String getEspBizId() {
        return this.espBizId;
    }

    public AppService setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AppService setInstanceBizId(String instanceBizId) {
        this.instanceBizId = instanceBizId;
        return this;
    }
    public String getInstanceBizId() {
        return this.instanceBizId;
    }

    public AppService setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppService setNodeList(java.util.List<TreeNode> nodeList) {
        this.nodeList = nodeList;
        return this;
    }
    public java.util.List<TreeNode> getNodeList() {
        return this.nodeList;
    }

    public AppService setProfile(AppServiceProfile profile) {
        this.profile = profile;
        return this;
    }
    public AppServiceProfile getProfile() {
        return this.profile;
    }

    public AppService setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public AppService setServiceTypeText(String serviceTypeText) {
        this.serviceTypeText = serviceTypeText;
        return this;
    }
    public String getServiceTypeText() {
        return this.serviceTypeText;
    }

    public AppService setSlug(String slug) {
        this.slug = slug;
        return this;
    }
    public String getSlug() {
        return this.slug;
    }

    public AppService setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public AppService setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AppService setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
