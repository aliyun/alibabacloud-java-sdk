// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class AddApplicationParam extends TeaModel {
    // 应用组件部署列表。
    @NameInMap("applicationComponentDeploymentList")
    public java.util.List<ApplicationComponentDeploymentParam> applicationComponentDeploymentList;

    // 应用配置列表。
    @NameInMap("applicationConfigList")
    public java.util.List<ApplicationConfigParam> applicationConfigList;

    // 应用列表。
    @NameInMap("applicationList")
    public java.util.List<ApplicationParam> applicationList;

    // 是否自动推荐配置。
    @NameInMap("autoRecommendConfig")
    public Boolean autoRecommendConfig;

    // 请求幂等参数
    @NameInMap("clientToken")
    public String clientToken;

    // 集群ID。
    @NameInMap("clusterId")
    public String clusterId;

    // 描述。
    @NameInMap("description")
    public String description;

    // 操作人员ID。
    @NameInMap("operateUserId")
    public String operateUserId;

    // 产品角色。
    @NameInMap("productRoleName")
    public String productRoleName;

    // 资源所有者ID。
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static AddApplicationParam build(java.util.Map<String, ?> map) throws Exception {
        AddApplicationParam self = new AddApplicationParam();
        return TeaModel.build(map, self);
    }

    public AddApplicationParam setApplicationComponentDeploymentList(java.util.List<ApplicationComponentDeploymentParam> applicationComponentDeploymentList) {
        this.applicationComponentDeploymentList = applicationComponentDeploymentList;
        return this;
    }
    public java.util.List<ApplicationComponentDeploymentParam> getApplicationComponentDeploymentList() {
        return this.applicationComponentDeploymentList;
    }

    public AddApplicationParam setApplicationConfigList(java.util.List<ApplicationConfigParam> applicationConfigList) {
        this.applicationConfigList = applicationConfigList;
        return this;
    }
    public java.util.List<ApplicationConfigParam> getApplicationConfigList() {
        return this.applicationConfigList;
    }

    public AddApplicationParam setApplicationList(java.util.List<ApplicationParam> applicationList) {
        this.applicationList = applicationList;
        return this;
    }
    public java.util.List<ApplicationParam> getApplicationList() {
        return this.applicationList;
    }

    public AddApplicationParam setAutoRecommendConfig(Boolean autoRecommendConfig) {
        this.autoRecommendConfig = autoRecommendConfig;
        return this;
    }
    public Boolean getAutoRecommendConfig() {
        return this.autoRecommendConfig;
    }

    public AddApplicationParam setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddApplicationParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddApplicationParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddApplicationParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public AddApplicationParam setProductRoleName(String productRoleName) {
        this.productRoleName = productRoleName;
        return this;
    }
    public String getProductRoleName() {
        return this.productRoleName;
    }

    public AddApplicationParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
