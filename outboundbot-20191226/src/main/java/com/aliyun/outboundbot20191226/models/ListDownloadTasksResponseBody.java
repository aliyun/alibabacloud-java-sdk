// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListDownloadTasksResponseBody extends TeaModel {
    /**
     * <p>API status code</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Download task list</p>
     */
    @NameInMap("DownloadTasks")
    public ListDownloadTasksResponseBodyDownloadTasks downloadTasks;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>API message</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>904CFA7B-8AD9-50FF-9B3E-404B20B9EE31</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Success</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDownloadTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDownloadTasksResponseBody self = new ListDownloadTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDownloadTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDownloadTasksResponseBody setDownloadTasks(ListDownloadTasksResponseBodyDownloadTasks downloadTasks) {
        this.downloadTasks = downloadTasks;
        return this;
    }
    public ListDownloadTasksResponseBodyDownloadTasks getDownloadTasks() {
        return this.downloadTasks;
    }

    public ListDownloadTasksResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDownloadTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDownloadTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDownloadTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDownloadTasksResponseBodyDownloadTasksListDownloadTaskFiles extends TeaModel {
        /**
         * <p>File ID</p>
         * 
         * <strong>example:</strong>
         * <p>01f8d11abdb9406996c0c46e7*******</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>Completion progress [Deprecated]</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>File status</p>
         * <ul>
         * <li><p>Pending: Pending</p>
         * </li>
         * <li><p>InProgress: In progress</p>
         * </li>
         * <li><p>Finished: Completed</p>
         * </li>
         * <li><p>Failed: Failed</p>
         * </li>
         * <li><p>Expired: Expired</p>
         * </li>
         * <li><p>Cancelled: Canceled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Empty</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Title</p>
         * 
         * <strong>example:</strong>
         * <p>GUI-TEST-新建风险</p>
         */
        @NameInMap("Title")
        public String title;

        public static ListDownloadTasksResponseBodyDownloadTasksListDownloadTaskFiles build(java.util.Map<String, ?> map) throws Exception {
            ListDownloadTasksResponseBodyDownloadTasksListDownloadTaskFiles self = new ListDownloadTasksResponseBodyDownloadTasksListDownloadTaskFiles();
            return TeaModel.build(map, self);
        }

        public ListDownloadTasksResponseBodyDownloadTasksListDownloadTaskFiles setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListDownloadTasksResponseBodyDownloadTasksListDownloadTaskFiles setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public ListDownloadTasksResponseBodyDownloadTasksListDownloadTaskFiles setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDownloadTasksResponseBodyDownloadTasksListDownloadTaskFiles setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListDownloadTasksResponseBodyDownloadTasksList extends TeaModel {
        /**
         * <p>Download task file list</p>
         */
        @NameInMap("DownloadTaskFiles")
        public java.util.List<ListDownloadTasksResponseBodyDownloadTasksListDownloadTaskFiles> downloadTaskFiles;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>1646792941</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>Export status.</p>
         * <ul>
         * <li><p>Pending: Pending</p>
         * </li>
         * <li><p>InProgress: In progress</p>
         * </li>
         * <li><p>Finished: Completed</p>
         * </li>
         * <li><p>Failed: Failed</p>
         * </li>
         * <li><p>Expired: Expired</p>
         * </li>
         * <li><p>Cancelled: Canceled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Empty</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Task ID</p>
         * 
         * <strong>example:</strong>
         * <p>6b0e547e-501c-480a-812f-d27e28e74f9a</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>Title</p>
         * 
         * <strong>example:</strong>
         * <p>GUI-TEST-新建风险</p>
         */
        @NameInMap("Title")
        public String title;

        public static ListDownloadTasksResponseBodyDownloadTasksList build(java.util.Map<String, ?> map) throws Exception {
            ListDownloadTasksResponseBodyDownloadTasksList self = new ListDownloadTasksResponseBodyDownloadTasksList();
            return TeaModel.build(map, self);
        }

        public ListDownloadTasksResponseBodyDownloadTasksList setDownloadTaskFiles(java.util.List<ListDownloadTasksResponseBodyDownloadTasksListDownloadTaskFiles> downloadTaskFiles) {
            this.downloadTaskFiles = downloadTaskFiles;
            return this;
        }
        public java.util.List<ListDownloadTasksResponseBodyDownloadTasksListDownloadTaskFiles> getDownloadTaskFiles() {
            return this.downloadTaskFiles;
        }

        public ListDownloadTasksResponseBodyDownloadTasksList setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public ListDownloadTasksResponseBodyDownloadTasksList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDownloadTasksResponseBodyDownloadTasksList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListDownloadTasksResponseBodyDownloadTasksList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListDownloadTasksResponseBodyDownloadTasks extends TeaModel {
        /**
         * <p>Download task array</p>
         */
        @NameInMap("List")
        public java.util.List<ListDownloadTasksResponseBodyDownloadTasksList> list;

        /**
         * <p>Page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>Count</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total count</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDownloadTasksResponseBodyDownloadTasks build(java.util.Map<String, ?> map) throws Exception {
            ListDownloadTasksResponseBodyDownloadTasks self = new ListDownloadTasksResponseBodyDownloadTasks();
            return TeaModel.build(map, self);
        }

        public ListDownloadTasksResponseBodyDownloadTasks setList(java.util.List<ListDownloadTasksResponseBodyDownloadTasksList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListDownloadTasksResponseBodyDownloadTasksList> getList() {
            return this.list;
        }

        public ListDownloadTasksResponseBodyDownloadTasks setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDownloadTasksResponseBodyDownloadTasks setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDownloadTasksResponseBodyDownloadTasks setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
