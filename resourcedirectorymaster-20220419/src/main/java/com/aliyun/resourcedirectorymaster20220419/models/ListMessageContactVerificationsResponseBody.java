// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListMessageContactVerificationsResponseBody extends TeaModel {
    /**
     * <p>The record for the contact to be verified.</p>
     */
    @NameInMap("ContactVerifications")
    public java.util.List<ListMessageContactVerificationsResponseBodyContactVerifications> contactVerifications;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CD76D376-2517-4924-92C5-DBC52262F93A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>48</p>
     */
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
        /**
         * <p>The ID of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>c-qL4HqKONzOM7****</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        /**
         * <p>The object that is used for verification. Valid values:</p>
         * <ul>
         * <li>Mobile phone number</li>
         * <li>Email address</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>someone***@example.com</p>
         */
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
