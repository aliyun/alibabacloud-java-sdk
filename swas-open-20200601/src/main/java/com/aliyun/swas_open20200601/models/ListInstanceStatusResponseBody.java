// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListInstanceStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the simple application server.</p>
     */
    @NameInMap("InstanceStatuses")
    public java.util.List<ListInstanceStatusResponseBodyInstanceStatuses> instanceStatuses;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceStatusResponseBody self = new ListInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceStatusResponseBody setInstanceStatuses(java.util.List<ListInstanceStatusResponseBodyInstanceStatuses> instanceStatuses) {
        this.instanceStatuses = instanceStatuses;
        return this;
    }
    public java.util.List<ListInstanceStatusResponseBodyInstanceStatuses> getInstanceStatuses() {
        return this.instanceStatuses;
    }

    public ListInstanceStatusResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInstanceStatusResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstanceStatusResponseBodyInstanceStatuses extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Status")
        public String status;

        public static ListInstanceStatusResponseBodyInstanceStatuses build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceStatusResponseBodyInstanceStatuses self = new ListInstanceStatusResponseBodyInstanceStatuses();
            return TeaModel.build(map, self);
        }

        public ListInstanceStatusResponseBodyInstanceStatuses setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceStatusResponseBodyInstanceStatuses setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
