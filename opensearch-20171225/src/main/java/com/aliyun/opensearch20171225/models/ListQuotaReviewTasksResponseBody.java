// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListQuotaReviewTasksResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;3351A21F-705B-508C-9450-DA65A681547F&quot;</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the tickets. For more information, see <a href="https://help.aliyun.com/document_detail/173609.html">QuotaReviewTask</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("result")
    public java.util.List<ListQuotaReviewTasksResponseBodyResult> result;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
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
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>120123456</p>
         */
        @NameInMap("appGroupId")
        public Integer appGroupId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;td_test_os&quot;</p>
         */
        @NameInMap("appGroupName")
        public String appGroupName;

        /**
         * <p>The application type.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;standard&quot;</p>
         */
        @NameInMap("appGroupType")
        public String appGroupType;

        /**
         * <p>Indicates whether the ticket is approved.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("approved")
        public Boolean approved;

        /**
         * <p>Indicates whether the application is available.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("available")
        public Boolean available;

        /**
         * <p>The time when the ticket was created.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;2020-04-08T08:29:45+0000&quot;</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the ticket was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;2020-04-08T08:36:36+0000&quot;</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The ticket ID.</p>
         * 
         * <strong>example:</strong>
         * <p>142</p>
         */
        @NameInMap("id")
        public Integer id;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("memo")
        public String memo;

        /**
         * <p>The computing resource quota that is applied for.</p>
         * 
         * <strong>example:</strong>
         * <p>6000</p>
         */
        @NameInMap("newComputeResource")
        public Integer newComputeResource;

        /**
         * <p>The storage capacity quota that is applied for.</p>
         * 
         * <strong>example:</strong>
         * <p>1100</p>
         */
        @NameInMap("newSocSize")
        public Integer newSocSize;

        /**
         * <p>The application specifications that are applied for.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;opensearch.private.common&quot;</p>
         */
        @NameInMap("newSpec")
        public String newSpec;

        /**
         * <p>The original quota of computing resources.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("oldComputeResource")
        public Integer oldComputeResource;

        /**
         * <p>The original quota of storage capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("oldDocSize")
        public Integer oldDocSize;

        /**
         * <p>The original specifications of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;opensearch.private.common&quot;</p>
         */
        @NameInMap("oldSpec")
        public String oldSpec;

        /**
         * <p>Indicates whether the ticket is pending.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
