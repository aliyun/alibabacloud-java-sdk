// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribePocTaskListResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <p>Page size, with a default value of 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Returned object.</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribePocTaskListResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of items.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("totalItem")
    public Integer totalItem;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribePocTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePocTaskListResponseBody self = new DescribePocTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePocTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePocTaskListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePocTaskListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePocTaskListResponseBody setResultObject(java.util.List<DescribePocTaskListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribePocTaskListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribePocTaskListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribePocTaskListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribePocTaskListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1753804800000</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>Download URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxxx-oss-xxxxx.xxxxxx.aliyuncs.com/xx/xx/xxx/xxxxxx.csv?Expires=1753433384&OSSAccessKeyId=xxxxxxxxx&Signature=%2F%xxxxxxxxxxxx%3D">https://xxxxx-oss-xxxxx.xxxxxx.aliyuncs.com/xx/xx/xxx/xxxxxx.csv?Expires=1753433384&amp;OSSAccessKeyId=xxxxxxxxx&amp;Signature=%2F%xxxxxxxxxxxx%3D</a></p>
         */
        @NameInMap("downloadUrl")
        public String downloadUrl;

        /**
         * <p>File type.</p>
         * 
         * <strong>example:</strong>
         * <p>EXCEL</p>
         */
        @NameInMap("fileType")
        public String fileType;

        /**
         * <p>Service name.</p>
         * 
         * <strong>example:</strong>
         * <p>注册风险识别</p>
         */
        @NameInMap("serviceName")
        public String serviceName;

        /**
         * <p>Status.</p>
         * 
         * <strong>example:</strong>
         * <p>WAIT_CHECK</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <p>Task name.</p>
         * 
         * <strong>example:</strong>
         * <p>任务</p>
         */
        @NameInMap("taskName")
        public String taskName;

        /**
         * <p>Last modified time.</p>
         * 
         * <strong>example:</strong>
         * <p>1753804800000</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static DescribePocTaskListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribePocTaskListResponseBodyResultObject self = new DescribePocTaskListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribePocTaskListResponseBodyResultObject setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribePocTaskListResponseBodyResultObject setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public DescribePocTaskListResponseBodyResultObject setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public DescribePocTaskListResponseBodyResultObject setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DescribePocTaskListResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePocTaskListResponseBodyResultObject setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribePocTaskListResponseBodyResultObject setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribePocTaskListResponseBodyResultObject setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
