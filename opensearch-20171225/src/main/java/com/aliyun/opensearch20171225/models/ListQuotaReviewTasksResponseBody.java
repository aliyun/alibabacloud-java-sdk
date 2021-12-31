// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListQuotaReviewTasksResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListQuotaReviewTasksResponseBodyResult> result;

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
        @NameInMap("appGroupId")
        public Integer appGroupId;

        @NameInMap("appGroupName")
        public String appGroupName;

        @NameInMap("appGroupType")
        public String appGroupType;

        @NameInMap("approved")
        public Boolean approved;

        @NameInMap("available")
        public Boolean available;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Integer id;

        @NameInMap("memo")
        public String memo;

        @NameInMap("newComputeResource")
        public Integer newComputeResource;

        @NameInMap("newSocSize")
        public Integer newSocSize;

        @NameInMap("newSpec")
        public String newSpec;

        @NameInMap("oldComputeResource")
        public Integer oldComputeResource;

        @NameInMap("oldDocSize")
        public Integer oldDocSize;

        @NameInMap("oldSpec")
        public String oldSpec;

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
