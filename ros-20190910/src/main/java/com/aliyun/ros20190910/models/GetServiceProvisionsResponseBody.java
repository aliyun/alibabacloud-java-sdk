// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetServiceProvisionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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

    public static class GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles extends TeaModel {
        @NameInMap("Created")
        public Boolean created;

        @NameInMap("Function")
        public String function;

        @NameInMap("RoleName")
        public String roleName;

        public static GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles build(java.util.Map<String, ?> map) throws Exception {
            GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles self = new GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles();
            return TeaModel.build(map, self);
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
        @NameInMap("AuthorizationURL")
        public String authorizationURL;

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
        @NameInMap("AutoEnableService")
        public Boolean autoEnableService;

        @NameInMap("DependentServiceNames")
        public java.util.List<String> dependentServiceNames;

        @NameInMap("EnableURL")
        public String enableURL;

        @NameInMap("RoleProvision")
        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvision roleProvision;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Status")
        public String status;

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
