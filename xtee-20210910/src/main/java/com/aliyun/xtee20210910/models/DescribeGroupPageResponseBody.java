// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeGroupPageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resultObject")
    public java.util.List<DescribeGroupPageResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public Integer totalItem;

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
        @NameInMap("communityNo")
        public String communityNo;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("groupRisk")
        public String groupRisk;

        @NameInMap("groupScale")
        public String groupScale;

        @NameInMap("id")
        public Long id;

        @NameInMap("sceneName")
        public String sceneName;

        @NameInMap("taskId")
        public Long taskId;

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
