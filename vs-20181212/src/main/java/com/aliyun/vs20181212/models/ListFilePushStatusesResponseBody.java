// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListFilePushStatusesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PushStatuses")
    public java.util.List<ListFilePushStatusesResponseBodyPushStatuses> pushStatuses;

    /**
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
         * <strong>example:</strong>
         * <p>f-1671accd4dafdag3er256cvgewt13f7141db2f7</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <strong>example:</strong>
         * <p>myfile</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>2024-03-26T16:32:20+08:00</p>
         */
        @NameInMap("PushTime")
        public String pushTime;

        /**
         * <strong>example:</strong>
         * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>push success</p>
         */
        @NameInMap("StatusDescription")
        public String statusDescription;

        /**
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
