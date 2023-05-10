// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListResourceTypeRegistrationsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Registrations")
    public java.util.List<ListResourceTypeRegistrationsResponseBodyRegistrations> registrations;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("RegistrationId")
        public String registrationId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusReason")
        public String statusReason;

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
