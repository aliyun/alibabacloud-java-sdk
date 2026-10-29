// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListFilesResponseBody extends TeaModel {
    /**
     * <p>The list of file information.</p>
     */
    @NameInMap("Files")
    public java.util.List<ListFilesResponseBodyFiles> files;

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
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of matched file records.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFilesResponseBody self = new ListFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFilesResponseBody setFiles(java.util.List<ListFilesResponseBodyFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<ListFilesResponseBodyFiles> getFiles() {
        return this.files;
    }

    public ListFilesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListFilesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFilesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListFilesResponseBodyFiles extends TeaModel {
        /**
         * <p>The description of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>My file</p>
         */
        @NameInMap("Description")
        public String description;

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
         * <p>The upload status of the file. Valid values:</p>
         * <ul>
         * <li>Created</li>
         * <li>Doing</li>
         * <li>Success: final state</li>
         * <li>Failed: final state</li>
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
         * <p>upload success</p>
         */
        @NameInMap("StatusDescription")
        public String statusDescription;

        /**
         * <p>The target path for pushing the file to the cloud application service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>/data/tmp/test/xxx.tar</p>
         */
        @NameInMap("TargetPath")
        public String targetPath;

        /**
         * <p>The time when the status was last updated. The time follows the ISO 8601 standard and includes the time zone offset in the YYYY-MM-DDTHH:mm:ss+HH:mm format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-28T14:15:08+08:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The time when the upload started. The time follows the ISO 8601 standard and includes the time zone offset in the YYYY-MM-DDTHH:mm:ss+HH:mm format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-28T14:10:12+08:00</p>
         */
        @NameInMap("UploadTime")
        public String uploadTime;

        public static ListFilesResponseBodyFiles build(java.util.Map<String, ?> map) throws Exception {
            ListFilesResponseBodyFiles self = new ListFilesResponseBodyFiles();
            return TeaModel.build(map, self);
        }

        public ListFilesResponseBodyFiles setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFilesResponseBodyFiles setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListFilesResponseBodyFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListFilesResponseBodyFiles setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFilesResponseBodyFiles setStatusDescription(String statusDescription) {
            this.statusDescription = statusDescription;
            return this;
        }
        public String getStatusDescription() {
            return this.statusDescription;
        }

        public ListFilesResponseBodyFiles setTargetPath(String targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        public String getTargetPath() {
            return this.targetPath;
        }

        public ListFilesResponseBodyFiles setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListFilesResponseBodyFiles setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public String getUploadTime() {
            return this.uploadTime;
        }

    }

}
