// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListFilePushStatusesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned list.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The Settings for the number of entries per page during paging in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The list of file push statuses.</p>
     */
    @NameInMap("PushStatuses")
    public java.util.List<ListFilePushStatusesResponseBodyPushStatuses> pushStatuses;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of matched file push records.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListFilePushStatusesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFilePushStatusesResponseBody self = new ListFilePushStatusesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFilePushStatusesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListFilePushStatusesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListFilePushStatusesResponseBody setPushStatuses(java.util.List<ListFilePushStatusesResponseBodyPushStatuses> pushStatuses) {
        this.pushStatuses = pushStatuses;
        return this;
    }
    public java.util.List<ListFilePushStatusesResponseBodyPushStatuses> getPushStatuses() {
        return this.pushStatuses;
    }

    public ListFilePushStatusesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFilePushStatusesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListFilePushStatusesResponseBodyPushStatuses extends TeaModel {
        /**
         * <p>The ID of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>f-1671accd4dafdag3er256cvgewt13f7141db2f7</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>myfile</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The start time of the push. The time is displayed in the ISO 8601 standard with time zone offset in the YYYY-MM-DDTHH:mm:ss+HH:mm format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-26T16:32:20+08:00</p>
         */
        @NameInMap("PushTime")
        public String pushTime;

        /**
         * <p>The instance ID of the cloud application service.</p>
         * 
         * <strong>example:</strong>
         * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        /**
         * <p>The push status of the file. Valid values:</p>
         * <ul>
         * <li>Created</li>
         * <li>Doing</li>
         * <li>Success: final state.</li>
         * <li>Failed: final state.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The description of the status.</p>
         * 
         * <strong>example:</strong>
         * <p>push success</p>
         */
        @NameInMap("StatusDescription")
        public String statusDescription;

        /**
         * <p>The latest update time of the status. The time is displayed in the ISO 8601 standard with time zone offset in the YYYY-MM-DDTHH:mm:ss+HH:mm format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-26T17:02:10+08:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListFilePushStatusesResponseBodyPushStatuses build(java.util.Map<String, ?> map) throws Exception {
            ListFilePushStatusesResponseBodyPushStatuses self = new ListFilePushStatusesResponseBodyPushStatuses();
            return TeaModel.build(map, self);
        }

        public ListFilePushStatusesResponseBodyPushStatuses setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListFilePushStatusesResponseBodyPushStatuses setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListFilePushStatusesResponseBodyPushStatuses setPushTime(String pushTime) {
            this.pushTime = pushTime;
            return this;
        }
        public String getPushTime() {
            return this.pushTime;
        }

        public ListFilePushStatusesResponseBodyPushStatuses setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

        public ListFilePushStatusesResponseBodyPushStatuses setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFilePushStatusesResponseBodyPushStatuses setStatusDescription(String statusDescription) {
            this.statusDescription = statusDescription;
            return this;
        }
        public String getStatusDescription() {
            return this.statusDescription;
        }

        public ListFilePushStatusesResponseBodyPushStatuses setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
