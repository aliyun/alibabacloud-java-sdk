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
     * <p>The information about the services.</p>
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
         * <li>Open: public</li>
         * <li>Inner: private</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        @NameInMap("ApiType")
        public String apiType;

        /**
         * <p>The parameters of the API operation. If a parameter is a variable, use the ${Variable name} format. Only the following variable is supported: ${RegionId}.</p>
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
         * <p>The information about the API operation that is used to create the RAM role.</p>
         */
        @NameInMap("ApiForCreation")
        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRolesApiForCreation apiForCreation;

        /**
         * <p>Indicates whether the RAM role is created. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Created")
        public Boolean created;

        /**
         * <p>The purpose for which the RAM role is used. Default value: Default. A value of Default indicates that the RAM role is the default role of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The name of the role.</p>
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
         * <p>The authorization URL of the RAM role.</p>
         * <blockquote>
         * <p>This parameter is returned if Created is set to false.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ehpc.console.aliyun.com/">https://ehpc.console.aliyun.com/</a></p>
         */
        @NameInMap("AuthorizationURL")
        public String authorizationURL;

        /**
         * <p>The RAM roles of the service.</p>
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
         * <p>Indicates whether automatic activation for the service is defined in the template. Valid values:</p>
         * <ul>
         * <li>true: Automatic activation for the service is defined in the template.</li>
         * <li>false: Manual activation for the service is defined in the template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoEnableService")
        public Boolean autoEnableService;

        /**
         * <p>The names of the services on which the service that is queried depends.</p>
         */
        @NameInMap("DependentServiceNames")
        public java.util.List<String> dependentServiceNames;

        /**
         * <p>The URL that points to the activation page of the service.</p>
         * <blockquote>
         * <p>This parameter is returned if Status is set to Disabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://common-buy.aliyun.com/?commodityCode=nas">https://common-buy.aliyun.com/?commodityCode=nas</a></p>
         */
        @NameInMap("EnableURL")
        public String enableURL;

        /**
         * <p>The information about the RAM roles of the service. If this parameter is empty, no RAM role is associated with the service.</p>
         */
        @NameInMap("RoleProvision")
        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvision roleProvision;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>EHPC</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The activation status of the service. Valid values:</p>
         * <ul>
         * <li>Enabled: The service is activated.</li>
         * <li>Disabled: The service is not activated.</li>
         * <li>Unknown: The activation status of the service is unknown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The reason why the service is in the Disabled or Unknown state.</p>
         * <blockquote>
         * <p>This parameter is returned if Status is set to Disabled or Unknown.</p>
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
