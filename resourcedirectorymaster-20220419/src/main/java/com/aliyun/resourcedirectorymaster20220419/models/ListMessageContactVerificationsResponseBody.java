// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListMessageContactVerificationsResponseBody extends TeaModel {
    @NameInMap("ContactVerifications")
    public java.util.List<ListMessageContactVerificationsResponseBodyContactVerifications> contactVerifications;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListMessageContactVerificationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMessageContactVerificationsResponseBody self = new ListMessageContactVerificationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMessageContactVerificationsResponseBody setContactVerifications(java.util.List<ListMessageContactVerificationsResponseBodyContactVerifications> contactVerifications) {
        this.contactVerifications = contactVerifications;
        return this;
    }
    public java.util.List<ListMessageContactVerificationsResponseBodyContactVerifications> getContactVerifications() {
        return this.contactVerifications;
    }

    public ListMessageContactVerificationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMessageContactVerificationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMessageContactVerificationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMessageContactVerificationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListMessageContactVerificationsResponseBodyContactVerifications extends TeaModel {
        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("Target")
        public String target;

        public static ListMessageContactVerificationsResponseBodyContactVerifications build(java.util.Map<String, ?> map) throws Exception {
            ListMessageContactVerificationsResponseBodyContactVerifications self = new ListMessageContactVerificationsResponseBodyContactVerifications();
            return TeaModel.build(map, self);
        }

        public ListMessageContactVerificationsResponseBodyContactVerifications setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListMessageContactVerificationsResponseBodyContactVerifications setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

}
