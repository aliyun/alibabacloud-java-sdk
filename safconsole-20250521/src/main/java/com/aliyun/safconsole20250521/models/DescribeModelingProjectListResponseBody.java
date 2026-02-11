// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeModelingProjectListResponseBody extends TeaModel {
    /**
     * <p>Status code. A return value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>Current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>Pagination parameter: number of items per page, with a default value of 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4A91D2D1-AEC9-1658-ABCE-5A39DE66A5C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result.</p>
     */
    @NameInMap("ResultObject")
    public java.util.List<DescribeModelingProjectListResponseBodyResultObject> resultObject;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: Call succeeded.</li>
     * <li><strong>false</strong>: Call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalItem")
    public Long totalItem;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Long totalPage;

    public static DescribeModelingProjectListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelingProjectListResponseBody self = new DescribeModelingProjectListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModelingProjectListResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeModelingProjectListResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeModelingProjectListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeModelingProjectListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeModelingProjectListResponseBody setResultObject(java.util.List<DescribeModelingProjectListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeModelingProjectListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeModelingProjectListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeModelingProjectListResponseBody setTotalItem(Long totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Long getTotalItem() {
        return this.totalItem;
    }

    public DescribeModelingProjectListResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeModelingProjectListResponseBodyResultObject extends TeaModel {
        /**
         * <p>End time of the secure modeling project.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-29T02:15:10Z</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>Secure environment status.</p>
         * 
         * <strong>example:</strong>
         * <p>PREPARING</p>
         */
        @NameInMap("EnvStatus")
        public String envStatus;

        /**
         * <p>Login account.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("LoginAccount")
        public String loginAccount;

        /**
         * <p>Modeling project status.</p>
         * 
         * <strong>example:</strong>
         * <p>PREPARING</p>
         */
        @NameInMap("ModelingStatus")
        public String modelingStatus;

        /**
         * <p>Project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>Project name.</p>
         * 
         * <strong>example:</strong>
         * <p>project</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>Start time of the secure modeling project.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-23T01:20:00Z</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static DescribeModelingProjectListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelingProjectListResponseBodyResultObject self = new DescribeModelingProjectListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeModelingProjectListResponseBodyResultObject setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeModelingProjectListResponseBodyResultObject setEnvStatus(String envStatus) {
            this.envStatus = envStatus;
            return this;
        }
        public String getEnvStatus() {
            return this.envStatus;
        }

        public DescribeModelingProjectListResponseBodyResultObject setLoginAccount(String loginAccount) {
            this.loginAccount = loginAccount;
            return this;
        }
        public String getLoginAccount() {
            return this.loginAccount;
        }

        public DescribeModelingProjectListResponseBodyResultObject setModelingStatus(String modelingStatus) {
            this.modelingStatus = modelingStatus;
            return this;
        }
        public String getModelingStatus() {
            return this.modelingStatus;
        }

        public DescribeModelingProjectListResponseBodyResultObject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeModelingProjectListResponseBodyResultObject setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeModelingProjectListResponseBodyResultObject setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
