// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeGroupPageResponseBody extends TeaModel {
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
    public java.util.List<DescribeGroupPageResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of items.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
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

    public static DescribeGroupPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupPageResponseBody self = new DescribeGroupPageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGroupPageResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeGroupPageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGroupPageResponseBody setResultObject(java.util.List<DescribeGroupPageResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeGroupPageResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeGroupPageResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeGroupPageResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeGroupPageResponseBodyResultObject extends TeaModel {
        /**
         * <p>Community number.</p>
         * 
         * <strong>example:</strong>
         * <p>129838420210118141502RaMMIgVG</p>
         */
        @NameInMap("communityNo")
        public String communityNo;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1699450018265</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>Group risk concentration.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("groupRisk")
        public String groupRisk;

        /**
         * <p>Group scale.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("groupScale")
        public String groupScale;

        /**
         * <p>Primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>497</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Scene name.</p>
         * 
         * <strong>example:</strong>
         * <p>通用图计算</p>
         */
        @NameInMap("sceneName")
        public String sceneName;

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6770764</p>
         */
        @NameInMap("taskId")
        public Long taskId;

        /**
         * <p>User UID.</p>
         * 
         * <strong>example:</strong>
         * <p>1519714049632764</p>
         */
        @NameInMap("userId")
        public String userId;

        public static DescribeGroupPageResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupPageResponseBodyResultObject self = new DescribeGroupPageResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeGroupPageResponseBodyResultObject setCommunityNo(String communityNo) {
            this.communityNo = communityNo;
            return this;
        }
        public String getCommunityNo() {
            return this.communityNo;
        }

        public DescribeGroupPageResponseBodyResultObject setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeGroupPageResponseBodyResultObject setGroupRisk(String groupRisk) {
            this.groupRisk = groupRisk;
            return this;
        }
        public String getGroupRisk() {
            return this.groupRisk;
        }

        public DescribeGroupPageResponseBodyResultObject setGroupScale(String groupScale) {
            this.groupScale = groupScale;
            return this;
        }
        public String getGroupScale() {
            return this.groupScale;
        }

        public DescribeGroupPageResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeGroupPageResponseBodyResultObject setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public DescribeGroupPageResponseBodyResultObject setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public DescribeGroupPageResponseBodyResultObject setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
