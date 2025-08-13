// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeListModelResponseBody extends TeaModel {
    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>Number of items per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned data.</p>
     */
    @NameInMap("ResultObject")
    public java.util.List<DescribeListModelResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalItem")
    public String totalItem;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public String totalPage;

    public static DescribeListModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeListModelResponseBody self = new DescribeListModelResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeListModelResponseBody setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeListModelResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeListModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeListModelResponseBody setResultObject(java.util.List<DescribeListModelResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeListModelResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeListModelResponseBody setTotalItem(String totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public String getTotalItem() {
        return this.totalItem;
    }

    public DescribeListModelResponseBody setTotalPage(String totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public String getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeListModelResponseBodyResultObject extends TeaModel {
        /**
         * <p>Uploader ID.</p>
         * 
         * <strong>example:</strong>
         * <p>011786</p>
         */
        @NameInMap("bucId")
        public String bucId;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-07T02:26:01Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>Model code.</p>
         * 
         * <strong>example:</strong>
         * <p>code</p>
         */
        @NameInMap("modelCode")
        public String modelCode;

        /**
         * <p>Unique identifier of the model in use.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("modelId")
        public String modelId;

        /**
         * <p>Model name.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_model</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>Model scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_scene</p>
         */
        @NameInMap("modelScene")
        public String modelScene;

        /**
         * <p>Model status, values: -<strong>ENABLED</strong>: Enabled-<strong>DISABLED</strong>: Disabled</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLED</p>
         */
        @NameInMap("modelStatus")
        public String modelStatus;

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0c8a3799-5ac8-434b-b255-e06edb35c05f</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <p>Last update time of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-18T02:07:00Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1806507582222226</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <p>File name.</p>
         * 
         * <strong>example:</strong>
         * <p>saf-ai-1662519103706.csv</p>
         */
        @NameInMap("userLocalFileName")
        public String userLocalFileName;

        public static DescribeListModelResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeListModelResponseBodyResultObject self = new DescribeListModelResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeListModelResponseBodyResultObject setBucId(String bucId) {
            this.bucId = bucId;
            return this;
        }
        public String getBucId() {
            return this.bucId;
        }

        public DescribeListModelResponseBodyResultObject setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeListModelResponseBodyResultObject setModelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }
        public String getModelCode() {
            return this.modelCode;
        }

        public DescribeListModelResponseBodyResultObject setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public DescribeListModelResponseBodyResultObject setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public DescribeListModelResponseBodyResultObject setModelScene(String modelScene) {
            this.modelScene = modelScene;
            return this;
        }
        public String getModelScene() {
            return this.modelScene;
        }

        public DescribeListModelResponseBodyResultObject setModelStatus(String modelStatus) {
            this.modelStatus = modelStatus;
            return this;
        }
        public String getModelStatus() {
            return this.modelStatus;
        }

        public DescribeListModelResponseBodyResultObject setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeListModelResponseBodyResultObject setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeListModelResponseBodyResultObject setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeListModelResponseBodyResultObject setUserLocalFileName(String userLocalFileName) {
            this.userLocalFileName = userLocalFileName;
            return this;
        }
        public String getUserLocalFileName() {
            return this.userLocalFileName;
        }

    }

}
