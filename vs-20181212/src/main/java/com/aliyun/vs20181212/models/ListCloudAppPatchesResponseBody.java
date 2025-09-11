// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListCloudAppPatchesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Patches")
    public java.util.List<ListCloudAppPatchesResponseBodyPatches> patches;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCloudAppPatchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAppPatchesResponseBody self = new ListCloudAppPatchesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudAppPatchesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListCloudAppPatchesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCloudAppPatchesResponseBody setPatches(java.util.List<ListCloudAppPatchesResponseBodyPatches> patches) {
        this.patches = patches;
        return this;
    }
    public java.util.List<ListCloudAppPatchesResponseBodyPatches> getPatches() {
        return this.patches;
    }

    public ListCloudAppPatchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudAppPatchesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCloudAppPatchesResponseBodyPatches extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>patch-03fa76e8e13a49b6a966b063d9d309b4</p>
         */
        @NameInMap("PatchId")
        public String patchId;

        /**
         * <strong>example:</strong>
         * <p>patch-1</p>
         */
        @NameInMap("PatchName")
        public String patchName;

        /**
         * <strong>example:</strong>
         * <p>Doing</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Uploading</p>
         */
        @NameInMap("StatusDescription")
        public String statusDescription;

        /**
         * <strong>example:</strong>
         * <p>2024-09-23T02:12:28</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>2025-07-24T14:45:36+08:00</p>
         */
        @NameInMap("UploadTime")
        public String uploadTime;

        public static ListCloudAppPatchesResponseBodyPatches build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAppPatchesResponseBodyPatches self = new ListCloudAppPatchesResponseBodyPatches();
            return TeaModel.build(map, self);
        }

        public ListCloudAppPatchesResponseBodyPatches setPatchId(String patchId) {
            this.patchId = patchId;
            return this;
        }
        public String getPatchId() {
            return this.patchId;
        }

        public ListCloudAppPatchesResponseBodyPatches setPatchName(String patchName) {
            this.patchName = patchName;
            return this;
        }
        public String getPatchName() {
            return this.patchName;
        }

        public ListCloudAppPatchesResponseBodyPatches setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCloudAppPatchesResponseBodyPatches setStatusDescription(String statusDescription) {
            this.statusDescription = statusDescription;
            return this;
        }
        public String getStatusDescription() {
            return this.statusDescription;
        }

        public ListCloudAppPatchesResponseBodyPatches setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListCloudAppPatchesResponseBodyPatches setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public String getUploadTime() {
            return this.uploadTime;
        }

    }

}
