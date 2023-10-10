// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListResourceTypeRegistrationsResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The registration records.</p>
     */
    @NameInMap("Registrations")
    public java.util.List<ListResourceTypeRegistrationsResponseBodyRegistrations> registrations;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of registration records.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListResourceTypeRegistrationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypeRegistrationsResponseBody self = new ListResourceTypeRegistrationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceTypeRegistrationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceTypeRegistrationsResponseBody setRegistrations(java.util.List<ListResourceTypeRegistrationsResponseBodyRegistrations> registrations) {
        this.registrations = registrations;
        return this;
    }
    public java.util.List<ListResourceTypeRegistrationsResponseBodyRegistrations> getRegistrations() {
        return this.registrations;
    }

    public ListResourceTypeRegistrationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceTypeRegistrationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListResourceTypeRegistrationsResponseBodyRegistrations extends TeaModel {
        /**
         * <p>The time when the version was created. The time is displayed in UTC. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The entity type. Only Module may be returned.</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>The ID of the registration record.</p>
         */
        @NameInMap("RegistrationId")
        public String registrationId;

        /**
         * <p>The resource type.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The registration state. Valid values:</p>
         * <br>
         * <p>*   IN_PROGRESS</p>
         * <p>*   COMPLETE</p>
         * <p>*   FAILED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The reason for the state.</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        /**
         * <p>The version ID.</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static ListResourceTypeRegistrationsResponseBodyRegistrations build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTypeRegistrationsResponseBodyRegistrations self = new ListResourceTypeRegistrationsResponseBodyRegistrations();
            return TeaModel.build(map, self);
        }

        public ListResourceTypeRegistrationsResponseBodyRegistrations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListResourceTypeRegistrationsResponseBodyRegistrations setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public ListResourceTypeRegistrationsResponseBodyRegistrations setRegistrationId(String registrationId) {
            this.registrationId = registrationId;
            return this;
        }
        public String getRegistrationId() {
            return this.registrationId;
        }

        public ListResourceTypeRegistrationsResponseBodyRegistrations setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListResourceTypeRegistrationsResponseBodyRegistrations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListResourceTypeRegistrationsResponseBodyRegistrations setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListResourceTypeRegistrationsResponseBodyRegistrations setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

}
