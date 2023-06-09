// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListQuotaReviewTasksResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the ticket for application quota approval.</p>
     * <br>
     * <p>For more information, see [QuotaReviewTask](~~173609~~).</p>
     */
    @NameInMap("result")
    public java.util.List<ListQuotaReviewTasksResponseBodyResult> result;

    /**
     * <p>The total number of the returned tickets.</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListQuotaReviewTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaReviewTasksResponseBody self = new ListQuotaReviewTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQuotaReviewTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQuotaReviewTasksResponseBody setResult(java.util.List<ListQuotaReviewTasksResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListQuotaReviewTasksResponseBodyResult> getResult() {
        return this.result;
    }

    public ListQuotaReviewTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListQuotaReviewTasksResponseBodyResult extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("appGroupId")
        public Integer appGroupId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("appGroupName")
        public String appGroupName;

        /**
         * <p>The type of the application.</p>
         */
        @NameInMap("appGroupType")
        public String appGroupType;

        /**
         * <p>Indicates whether the ticket is approved.</p>
         */
        @NameInMap("approved")
        public Boolean approved;

        /**
         * <p>Indicates whether the model is available.</p>
         */
        @NameInMap("available")
        public Boolean available;

        /**
         * <p>The time when the ticket was created.</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the ticket was last updated.</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the ticket.</p>
         */
        @NameInMap("id")
        public Integer id;

        /**
         * <p>The remarks of the ticket.</p>
         */
        @NameInMap("memo")
        public String memo;

        /**
         * <p>The computing resource quota that is applied for.</p>
         */
        @NameInMap("newComputeResource")
        public Integer newComputeResource;

        /**
         * <p>The storage capacity quota that is applied for.</p>
         */
        @NameInMap("newSocSize")
        public Integer newSocSize;

        /**
         * <p>The application specifications that are applied for.</p>
         */
        @NameInMap("newSpec")
        public String newSpec;

        /**
         * <p>The original quota of computing resources.</p>
         */
        @NameInMap("oldComputeResource")
        public Integer oldComputeResource;

        /**
         * <p>The original quota of storage capacity.</p>
         */
        @NameInMap("oldDocSize")
        public Integer oldDocSize;

        /**
         * <p>The original application specifications.</p>
         */
        @NameInMap("oldSpec")
        public String oldSpec;

        /**
         * <p>Indicates whether the ticket is pending.</p>
         */
        @NameInMap("pending")
        public Boolean pending;

        public static ListQuotaReviewTasksResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListQuotaReviewTasksResponseBodyResult self = new ListQuotaReviewTasksResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListQuotaReviewTasksResponseBodyResult setAppGroupId(Integer appGroupId) {
            this.appGroupId = appGroupId;
            return this;
        }
        public Integer getAppGroupId() {
            return this.appGroupId;
        }

        public ListQuotaReviewTasksResponseBodyResult setAppGroupName(String appGroupName) {
            this.appGroupName = appGroupName;
            return this;
        }
        public String getAppGroupName() {
            return this.appGroupName;
        }

        public ListQuotaReviewTasksResponseBodyResult setAppGroupType(String appGroupType) {
            this.appGroupType = appGroupType;
            return this;
        }
        public String getAppGroupType() {
            return this.appGroupType;
        }

        public ListQuotaReviewTasksResponseBodyResult setApproved(Boolean approved) {
            this.approved = approved;
            return this;
        }
        public Boolean getApproved() {
            return this.approved;
        }

        public ListQuotaReviewTasksResponseBodyResult setAvailable(Boolean available) {
            this.available = available;
            return this;
        }
        public Boolean getAvailable() {
            return this.available;
        }

        public ListQuotaReviewTasksResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListQuotaReviewTasksResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListQuotaReviewTasksResponseBodyResult setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListQuotaReviewTasksResponseBodyResult setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public ListQuotaReviewTasksResponseBodyResult setNewComputeResource(Integer newComputeResource) {
            this.newComputeResource = newComputeResource;
            return this;
        }
        public Integer getNewComputeResource() {
            return this.newComputeResource;
        }

        public ListQuotaReviewTasksResponseBodyResult setNewSocSize(Integer newSocSize) {
            this.newSocSize = newSocSize;
            return this;
        }
        public Integer getNewSocSize() {
            return this.newSocSize;
        }

        public ListQuotaReviewTasksResponseBodyResult setNewSpec(String newSpec) {
            this.newSpec = newSpec;
            return this;
        }
        public String getNewSpec() {
            return this.newSpec;
        }

        public ListQuotaReviewTasksResponseBodyResult setOldComputeResource(Integer oldComputeResource) {
            this.oldComputeResource = oldComputeResource;
            return this;
        }
        public Integer getOldComputeResource() {
            return this.oldComputeResource;
        }

        public ListQuotaReviewTasksResponseBodyResult setOldDocSize(Integer oldDocSize) {
            this.oldDocSize = oldDocSize;
            return this;
        }
        public Integer getOldDocSize() {
            return this.oldDocSize;
        }

        public ListQuotaReviewTasksResponseBodyResult setOldSpec(String oldSpec) {
            this.oldSpec = oldSpec;
            return this;
        }
        public String getOldSpec() {
            return this.oldSpec;
        }

        public ListQuotaReviewTasksResponseBodyResult setPending(Boolean pending) {
            this.pending = pending;
            return this;
        }
        public Boolean getPending() {
            return this.pending;
        }

    }

}
