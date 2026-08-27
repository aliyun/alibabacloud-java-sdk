// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetServiceProvisionsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A9938C04-26AD-5EFA-B394-EA7866842DFF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the Alibaba Cloud services.</p>
     */
    @NameInMap("ServiceProvisions")
    public java.util.List<GetServiceProvisionsResponseBodyServiceProvisions> serviceProvisions;

    public static GetServiceProvisionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceProvisionsResponseBody self = new GetServiceProvisionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceProvisionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceProvisionsResponseBody setServiceProvisions(java.util.List<GetServiceProvisionsResponseBodyServiceProvisions> serviceProvisions) {
        this.serviceProvisions = serviceProvisions;
        return this;
    }
    public java.util.List<GetServiceProvisionsResponseBodyServiceProvisions> getServiceProvisions() {
        return this.serviceProvisions;
    }

    public static class GetServiceProvisionsResponseBodyServiceProvisionsCommodityProvisions extends TeaModel {
        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_postpaid_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The URL for activating the commodity.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://common-buy.aliyun.com/?commodityCode=acs_postpaid_public_cn">https://common-buy.aliyun.com/?commodityCode=acs_postpaid_public_cn</a></p>
         */
        @NameInMap("EnableURL")
        public String enableURL;

        /**
         * <p>The activation status of the Alibaba Cloud service. Valid values:</p>
         * <ul>
         * <li><p>Enabled: The service is activated.</p>
         * </li>
         * <li><p>Disabled: The service is not activated.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetServiceProvisionsResponseBodyServiceProvisionsCommodityProvisions build(java.util.Map<String, ?> map) throws Exception {
            GetServiceProvisionsResponseBodyServiceProvisionsCommodityProvisions self = new GetServiceProvisionsResponseBodyServiceProvisionsCommodityProvisions();
            return TeaModel.build(map, self);
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsCommodityProvisions setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsCommodityProvisions setEnableURL(String enableURL) {
            this.enableURL = enableURL;
            return this;
        }
        public String getEnableURL() {
            return this.enableURL;
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsCommodityProvisions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRolesApiForCreation extends TeaModel {
        /**
         * <p>The name of the API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateServiceLinkedRole</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The ID of the Alibaba Cloud service to which the API operation belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("ApiProductId")
        public String apiProductId;

        /**
         * <p>The type of the API operation. Valid values:</p>
         * <ul>
         * <li><p>Open: an Alibaba Cloud API operation.</p>
         * </li>
         * <li><p>Inner: an internal API operation.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        @NameInMap("ApiType")
        public String apiType;

        /**
         * <p>The parameters of the API operation. The value of a parameter is a dynamic value. The following dynamic value is supported: ${RegionId}, which indicates the region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>{   &quot;ServiceLinkedRole&quot;: &quot;AliyunServiceRoleForRdsPgsqlOnEcs&quot;,   &quot;RegionId&quot;: &quot;${RegionId}&quot; }</p>
         */
        @NameInMap("Parameters")
        public java.util.Map<String, ?> parameters;

        public static GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRolesApiForCreation build(java.util.Map<String, ?> map) throws Exception {
            GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRolesApiForCreation self = new GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRolesApiForCreation();
            return TeaModel.build(map, self);
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRolesApiForCreation setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRolesApiForCreation setApiProductId(String apiProductId) {
            this.apiProductId = apiProductId;
            return this;
        }
        public String getApiProductId() {
            return this.apiProductId;
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRolesApiForCreation setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRolesApiForCreation setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

    }

    public static class GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles extends TeaModel {
        /**
         * <p>The information about the API operation that is used to create the role.</p>
         */
        @NameInMap("ApiForCreation")
        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRolesApiForCreation apiForCreation;

        /**
         * <p>Indicates whether the service-linked role is created. Valid values:</p>
         * <ul>
         * <li><p>true: The service-linked role is created.</p>
         * </li>
         * <li><p>false: The service-linked role is not created.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Created")
        public Boolean created;

        /**
         * <p>The purpose of the role. Default value: Default. This value indicates that the role is the default role of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The name of the service-linked role.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunServiceRoleForEHPC</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        public static GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles build(java.util.Map<String, ?> map) throws Exception {
            GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles self = new GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles();
            return TeaModel.build(map, self);
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles setApiForCreation(GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRolesApiForCreation apiForCreation) {
            this.apiForCreation = apiForCreation;
            return this;
        }
        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRolesApiForCreation getApiForCreation() {
            return this.apiForCreation;
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles setCreated(Boolean created) {
            this.created = created;
            return this;
        }
        public Boolean getCreated() {
            return this.created;
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class GetServiceProvisionsResponseBodyServiceProvisionsRoleProvision extends TeaModel {
        /**
         * <p>The URL that you can use to grant permissions to the service-linked role.</p>
         * <blockquote>
         * <p>This parameter is returned only when the value of Created is false.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ehpc.console.aliyun.com/">https://ehpc.console.aliyun.com/</a></p>
         */
        @NameInMap("AuthorizationURL")
        public String authorizationURL;

        /**
         * <p>The service-linked roles.</p>
         */
        @NameInMap("Roles")
        public java.util.List<GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles> roles;

        public static GetServiceProvisionsResponseBodyServiceProvisionsRoleProvision build(java.util.Map<String, ?> map) throws Exception {
            GetServiceProvisionsResponseBodyServiceProvisionsRoleProvision self = new GetServiceProvisionsResponseBodyServiceProvisionsRoleProvision();
            return TeaModel.build(map, self);
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvision setAuthorizationURL(String authorizationURL) {
            this.authorizationURL = authorizationURL;
            return this;
        }
        public String getAuthorizationURL() {
            return this.authorizationURL;
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvision setRoles(java.util.List<GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles> getRoles() {
            return this.roles;
        }

    }

    public static class GetServiceProvisionsResponseBodyServiceProvisions extends TeaModel {
        /**
         * <p>Indicates whether the service is automatically activated when the template is used to create a stack. Valid values:</p>
         * <ul>
         * <li><p>true: The service is automatically activated.</p>
         * </li>
         * <li><p>false: The service is not automatically activated.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoEnableService")
        public Boolean autoEnableService;

        /**
         * <p>The details of the commodity. Some services, such as Container Compute Service (ACS), require you to activate multiple commodities.</p>
         */
        @NameInMap("CommodityProvisions")
        public java.util.List<GetServiceProvisionsResponseBodyServiceProvisionsCommodityProvisions> commodityProvisions;

        /**
         * <p>The services on which the service that you want to query depends.</p>
         */
        @NameInMap("DependentServiceNames")
        public java.util.List<String> dependentServiceNames;

        /**
         * <p>The URL that you can use to activate the Alibaba Cloud service.</p>
         * <blockquote>
         * <p>This parameter is returned only when the value of Status is Disabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://common-buy.aliyun.com/?commodityCode=nas">https://common-buy.aliyun.com/?commodityCode=nas</a></p>
         */
        @NameInMap("EnableURL")
        public String enableURL;

        /**
         * <p>The information about the service-linked roles of the Alibaba Cloud service. If this parameter is empty, no service-linked role is associated with the service.</p>
         */
        @NameInMap("RoleProvision")
        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvision roleProvision;

        /**
         * <p>The name of the Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>EHPC</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The activation status of the Alibaba Cloud service. Valid values:</p>
         * <ul>
         * <li><p>Enabled: The service is activated.</p>
         * </li>
         * <li><p>Disabled: The service is not activated.</p>
         * </li>
         * <li><p>Unknown: The activation status is unknown.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The reason why the Alibaba Cloud service is not activated or the activation status is unknown.</p>
         * <blockquote>
         * <p>This parameter is returned only when the value of Status is Disabled or Unknown.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>No permission.</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        public static GetServiceProvisionsResponseBodyServiceProvisions build(java.util.Map<String, ?> map) throws Exception {
            GetServiceProvisionsResponseBodyServiceProvisions self = new GetServiceProvisionsResponseBodyServiceProvisions();
            return TeaModel.build(map, self);
        }

        public GetServiceProvisionsResponseBodyServiceProvisions setAutoEnableService(Boolean autoEnableService) {
            this.autoEnableService = autoEnableService;
            return this;
        }
        public Boolean getAutoEnableService() {
            return this.autoEnableService;
        }

        public GetServiceProvisionsResponseBodyServiceProvisions setCommodityProvisions(java.util.List<GetServiceProvisionsResponseBodyServiceProvisionsCommodityProvisions> commodityProvisions) {
            this.commodityProvisions = commodityProvisions;
            return this;
        }
        public java.util.List<GetServiceProvisionsResponseBodyServiceProvisionsCommodityProvisions> getCommodityProvisions() {
            return this.commodityProvisions;
        }

        public GetServiceProvisionsResponseBodyServiceProvisions setDependentServiceNames(java.util.List<String> dependentServiceNames) {
            this.dependentServiceNames = dependentServiceNames;
            return this;
        }
        public java.util.List<String> getDependentServiceNames() {
            return this.dependentServiceNames;
        }

        public GetServiceProvisionsResponseBodyServiceProvisions setEnableURL(String enableURL) {
            this.enableURL = enableURL;
            return this;
        }
        public String getEnableURL() {
            return this.enableURL;
        }

        public GetServiceProvisionsResponseBodyServiceProvisions setRoleProvision(GetServiceProvisionsResponseBodyServiceProvisionsRoleProvision roleProvision) {
            this.roleProvision = roleProvision;
            return this;
        }
        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvision getRoleProvision() {
            return this.roleProvision;
        }

        public GetServiceProvisionsResponseBodyServiceProvisions setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetServiceProvisionsResponseBodyServiceProvisions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetServiceProvisionsResponseBodyServiceProvisions setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

    }

}
