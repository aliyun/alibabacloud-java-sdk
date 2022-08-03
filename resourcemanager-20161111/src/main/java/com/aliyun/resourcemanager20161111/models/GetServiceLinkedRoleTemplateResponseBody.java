// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class GetServiceLinkedRoleTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceLinkedRoleTemplate")
    public GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplate serviceLinkedRoleTemplate;

    public static GetServiceLinkedRoleTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceLinkedRoleTemplateResponseBody self = new GetServiceLinkedRoleTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceLinkedRoleTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceLinkedRoleTemplateResponseBody setServiceLinkedRoleTemplate(GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplate serviceLinkedRoleTemplate) {
        this.serviceLinkedRoleTemplate = serviceLinkedRoleTemplate;
        return this;
    }
    public GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplate getServiceLinkedRoleTemplate() {
        return this.serviceLinkedRoleTemplate;
    }

    public static class GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplateRoleDescriptionsRoleDescription extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Language")
        public String language;

        public static GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplateRoleDescriptionsRoleDescription build(java.util.Map<String, ?> map) throws Exception {
            GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplateRoleDescriptionsRoleDescription self = new GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplateRoleDescriptionsRoleDescription();
            return TeaModel.build(map, self);
        }

        public GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplateRoleDescriptionsRoleDescription setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplateRoleDescriptionsRoleDescription setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

    }

    public static class GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplateRoleDescriptions extends TeaModel {
        @NameInMap("RoleDescription")
        public java.util.List<GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplateRoleDescriptionsRoleDescription> roleDescription;

        public static GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplateRoleDescriptions build(java.util.Map<String, ?> map) throws Exception {
            GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplateRoleDescriptions self = new GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplateRoleDescriptions();
            return TeaModel.build(map, self);
        }

        public GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplateRoleDescriptions setRoleDescription(java.util.List<GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplateRoleDescriptionsRoleDescription> roleDescription) {
            this.roleDescription = roleDescription;
            return this;
        }
        public java.util.List<GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplateRoleDescriptionsRoleDescription> getRoleDescription() {
            return this.roleDescription;
        }

    }

    public static class GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplate extends TeaModel {
        @NameInMap("MultipleRolesAllowed")
        public Boolean multipleRolesAllowed;

        @NameInMap("RoleDescriptions")
        public GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplateRoleDescriptions roleDescriptions;

        @NameInMap("RoleNamePrefix")
        public String roleNamePrefix;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("SystemPolicyName")
        public String systemPolicyName;

        public static GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplate self = new GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplate();
            return TeaModel.build(map, self);
        }

        public GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplate setMultipleRolesAllowed(Boolean multipleRolesAllowed) {
            this.multipleRolesAllowed = multipleRolesAllowed;
            return this;
        }
        public Boolean getMultipleRolesAllowed() {
            return this.multipleRolesAllowed;
        }

        public GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplate setRoleDescriptions(GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplateRoleDescriptions roleDescriptions) {
            this.roleDescriptions = roleDescriptions;
            return this;
        }
        public GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplateRoleDescriptions getRoleDescriptions() {
            return this.roleDescriptions;
        }

        public GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplate setRoleNamePrefix(String roleNamePrefix) {
            this.roleNamePrefix = roleNamePrefix;
            return this;
        }
        public String getRoleNamePrefix() {
            return this.roleNamePrefix;
        }

        public GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplate setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetServiceLinkedRoleTemplateResponseBodyServiceLinkedRoleTemplate setSystemPolicyName(String systemPolicyName) {
            this.systemPolicyName = systemPolicyName;
            return this;
        }
        public String getSystemPolicyName() {
            return this.systemPolicyName;
        }

    }

}
