// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetServiceLastAccessedDetailsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <strong>example:</strong>
     * <p>2024-06-08T02:24:48Z</p>
     */
    @NameInMap("JobCompletionTime")
    public String jobCompletionTime;

    /**
     * <strong>example:</strong>
     * <p>2024-06-08T02:20:47Z</p>
     */
    @NameInMap("JobCreationTime")
    public String jobCreationTime;

    @NameInMap("JobError")
    public GetServiceLastAccessedDetailsResponseBodyJobError jobError;

    /**
     * <strong>example:</strong>
     * <p>COMPLETED</p>
     */
    @NameInMap("JobStatus")
    public String jobStatus;

    /**
     * <strong>example:</strong>
     * <p>SERVICE_LEVEL</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CgxMaXN0UmFtVXNlcnMSEDE5OTQ5NTMxMDYwOTAzNzkaAjQ0IGQ=</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <strong>example:</strong>
     * <p>697852FB-50D7-44D9-9774-530C31EAC572</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServicesLastAccessed")
    public java.util.List<GetServiceLastAccessedDetailsResponseBodyServicesLastAccessed> servicesLastAccessed;

    public static GetServiceLastAccessedDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceLastAccessedDetailsResponseBody self = new GetServiceLastAccessedDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceLastAccessedDetailsResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public GetServiceLastAccessedDetailsResponseBody setJobCompletionTime(String jobCompletionTime) {
        this.jobCompletionTime = jobCompletionTime;
        return this;
    }
    public String getJobCompletionTime() {
        return this.jobCompletionTime;
    }

    public GetServiceLastAccessedDetailsResponseBody setJobCreationTime(String jobCreationTime) {
        this.jobCreationTime = jobCreationTime;
        return this;
    }
    public String getJobCreationTime() {
        return this.jobCreationTime;
    }

    public GetServiceLastAccessedDetailsResponseBody setJobError(GetServiceLastAccessedDetailsResponseBodyJobError jobError) {
        this.jobError = jobError;
        return this;
    }
    public GetServiceLastAccessedDetailsResponseBodyJobError getJobError() {
        return this.jobError;
    }

    public GetServiceLastAccessedDetailsResponseBody setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public String getJobStatus() {
        return this.jobStatus;
    }

    public GetServiceLastAccessedDetailsResponseBody setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public GetServiceLastAccessedDetailsResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public GetServiceLastAccessedDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceLastAccessedDetailsResponseBody setServicesLastAccessed(java.util.List<GetServiceLastAccessedDetailsResponseBodyServicesLastAccessed> servicesLastAccessed) {
        this.servicesLastAccessed = servicesLastAccessed;
        return this;
    }
    public java.util.List<GetServiceLastAccessedDetailsResponseBodyServicesLastAccessed> getServicesLastAccessed() {
        return this.servicesLastAccessed;
    }

    public static class GetServiceLastAccessedDetailsResponseBodyJobError extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        @NameInMap("Message")
        public String message;

        public static GetServiceLastAccessedDetailsResponseBodyJobError build(java.util.Map<String, ?> map) throws Exception {
            GetServiceLastAccessedDetailsResponseBodyJobError self = new GetServiceLastAccessedDetailsResponseBodyJobError();
            return TeaModel.build(map, self);
        }

        public GetServiceLastAccessedDetailsResponseBodyJobError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetServiceLastAccessedDetailsResponseBodyJobError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class GetServiceLastAccessedDetailsResponseBodyServicesLastAccessedGrantPolicies extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>acs:ram::123459***:role/TestRole</p>
         */
        @NameInMap("AttachedEntity")
        public String attachedEntity;

        /**
         * <strong>example:</strong>
         * <p>123459***</p>
         */
        @NameInMap("AttachedScope")
        public String attachedScope;

        /**
         * <strong>example:</strong>
         * <p>AdministratorAccess</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static GetServiceLastAccessedDetailsResponseBodyServicesLastAccessedGrantPolicies build(java.util.Map<String, ?> map) throws Exception {
            GetServiceLastAccessedDetailsResponseBodyServicesLastAccessedGrantPolicies self = new GetServiceLastAccessedDetailsResponseBodyServicesLastAccessedGrantPolicies();
            return TeaModel.build(map, self);
        }

        public GetServiceLastAccessedDetailsResponseBodyServicesLastAccessedGrantPolicies setAttachedEntity(String attachedEntity) {
            this.attachedEntity = attachedEntity;
            return this;
        }
        public String getAttachedEntity() {
            return this.attachedEntity;
        }

        public GetServiceLastAccessedDetailsResponseBodyServicesLastAccessedGrantPolicies setAttachedScope(String attachedScope) {
            this.attachedScope = attachedScope;
            return this;
        }
        public String getAttachedScope() {
            return this.attachedScope;
        }

        public GetServiceLastAccessedDetailsResponseBodyServicesLastAccessedGrantPolicies setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public GetServiceLastAccessedDetailsResponseBodyServicesLastAccessedGrantPolicies setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class GetServiceLastAccessedDetailsResponseBodyServicesLastAccessedTrackedActionsLastAccessed extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ram:CreateAccessKey</p>
         */
        @NameInMap("ActionName")
        public String actionName;

        /**
         * <strong>example:</strong>
         * <p>acs:ram::123459***:role/TestRole</p>
         */
        @NameInMap("LastAccessedEntity")
        public String lastAccessedEntity;

        /**
         * <strong>example:</strong>
         * <p>2024-01-29T07:48:35Z</p>
         */
        @NameInMap("LastAccessedTime")
        public String lastAccessedTime;

        @NameInMap("ServiceCodes")
        public java.util.List<String> serviceCodes;

        public static GetServiceLastAccessedDetailsResponseBodyServicesLastAccessedTrackedActionsLastAccessed build(java.util.Map<String, ?> map) throws Exception {
            GetServiceLastAccessedDetailsResponseBodyServicesLastAccessedTrackedActionsLastAccessed self = new GetServiceLastAccessedDetailsResponseBodyServicesLastAccessedTrackedActionsLastAccessed();
            return TeaModel.build(map, self);
        }

        public GetServiceLastAccessedDetailsResponseBodyServicesLastAccessedTrackedActionsLastAccessed setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public GetServiceLastAccessedDetailsResponseBodyServicesLastAccessedTrackedActionsLastAccessed setLastAccessedEntity(String lastAccessedEntity) {
            this.lastAccessedEntity = lastAccessedEntity;
            return this;
        }
        public String getLastAccessedEntity() {
            return this.lastAccessedEntity;
        }

        public GetServiceLastAccessedDetailsResponseBodyServicesLastAccessedTrackedActionsLastAccessed setLastAccessedTime(String lastAccessedTime) {
            this.lastAccessedTime = lastAccessedTime;
            return this;
        }
        public String getLastAccessedTime() {
            return this.lastAccessedTime;
        }

        public GetServiceLastAccessedDetailsResponseBodyServicesLastAccessedTrackedActionsLastAccessed setServiceCodes(java.util.List<String> serviceCodes) {
            this.serviceCodes = serviceCodes;
            return this;
        }
        public java.util.List<String> getServiceCodes() {
            return this.serviceCodes;
        }

    }

    public static class GetServiceLastAccessedDetailsResponseBodyServicesLastAccessed extends TeaModel {
        @NameInMap("GrantPolicies")
        public java.util.List<GetServiceLastAccessedDetailsResponseBodyServicesLastAccessedGrantPolicies> grantPolicies;

        /**
         * <strong>example:</strong>
         * <p>2024-01-29T07:48:35Z</p>
         */
        @NameInMap("LastAuthenticated")
        public String lastAuthenticated;

        /**
         * <strong>example:</strong>
         * <p>acs:ram::123459***:role/TestRole</p>
         */
        @NameInMap("LastAuthenticatedEntity")
        public String lastAuthenticatedEntity;

        /**
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("RAMCode")
        public String RAMCode;

        @NameInMap("ServiceCodes")
        public java.util.List<String> serviceCodes;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalAuthenticatedEntities")
        public Integer totalAuthenticatedEntities;

        @NameInMap("TrackedActionsLastAccessed")
        public java.util.List<GetServiceLastAccessedDetailsResponseBodyServicesLastAccessedTrackedActionsLastAccessed> trackedActionsLastAccessed;

        public static GetServiceLastAccessedDetailsResponseBodyServicesLastAccessed build(java.util.Map<String, ?> map) throws Exception {
            GetServiceLastAccessedDetailsResponseBodyServicesLastAccessed self = new GetServiceLastAccessedDetailsResponseBodyServicesLastAccessed();
            return TeaModel.build(map, self);
        }

        public GetServiceLastAccessedDetailsResponseBodyServicesLastAccessed setGrantPolicies(java.util.List<GetServiceLastAccessedDetailsResponseBodyServicesLastAccessedGrantPolicies> grantPolicies) {
            this.grantPolicies = grantPolicies;
            return this;
        }
        public java.util.List<GetServiceLastAccessedDetailsResponseBodyServicesLastAccessedGrantPolicies> getGrantPolicies() {
            return this.grantPolicies;
        }

        public GetServiceLastAccessedDetailsResponseBodyServicesLastAccessed setLastAuthenticated(String lastAuthenticated) {
            this.lastAuthenticated = lastAuthenticated;
            return this;
        }
        public String getLastAuthenticated() {
            return this.lastAuthenticated;
        }

        public GetServiceLastAccessedDetailsResponseBodyServicesLastAccessed setLastAuthenticatedEntity(String lastAuthenticatedEntity) {
            this.lastAuthenticatedEntity = lastAuthenticatedEntity;
            return this;
        }
        public String getLastAuthenticatedEntity() {
            return this.lastAuthenticatedEntity;
        }

        public GetServiceLastAccessedDetailsResponseBodyServicesLastAccessed setRAMCode(String RAMCode) {
            this.RAMCode = RAMCode;
            return this;
        }
        public String getRAMCode() {
            return this.RAMCode;
        }

        public GetServiceLastAccessedDetailsResponseBodyServicesLastAccessed setServiceCodes(java.util.List<String> serviceCodes) {
            this.serviceCodes = serviceCodes;
            return this;
        }
        public java.util.List<String> getServiceCodes() {
            return this.serviceCodes;
        }

        public GetServiceLastAccessedDetailsResponseBodyServicesLastAccessed setTotalAuthenticatedEntities(Integer totalAuthenticatedEntities) {
            this.totalAuthenticatedEntities = totalAuthenticatedEntities;
            return this;
        }
        public Integer getTotalAuthenticatedEntities() {
            return this.totalAuthenticatedEntities;
        }

        public GetServiceLastAccessedDetailsResponseBodyServicesLastAccessed setTrackedActionsLastAccessed(java.util.List<GetServiceLastAccessedDetailsResponseBodyServicesLastAccessedTrackedActionsLastAccessed> trackedActionsLastAccessed) {
            this.trackedActionsLastAccessed = trackedActionsLastAccessed;
            return this;
        }
        public java.util.List<GetServiceLastAccessedDetailsResponseBodyServicesLastAccessedTrackedActionsLastAccessed> getTrackedActionsLastAccessed() {
            return this.trackedActionsLastAccessed;
        }

    }

}
