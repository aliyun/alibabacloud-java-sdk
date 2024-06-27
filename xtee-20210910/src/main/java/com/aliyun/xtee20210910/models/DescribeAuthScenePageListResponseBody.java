// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAuthScenePageListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("currentPage")
    public Long currentPage;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("resultObject")
    public java.util.List<DescribeAuthScenePageListResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public Long totalItem;

    @NameInMap("totalPage")
    public Long totalPage;

    public static DescribeAuthScenePageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthScenePageListResponseBody self = new DescribeAuthScenePageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuthScenePageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuthScenePageListResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAuthScenePageListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAuthScenePageListResponseBody setResultObject(java.util.List<DescribeAuthScenePageListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeAuthScenePageListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeAuthScenePageListResponseBody setTotalItem(Long totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Long getTotalItem() {
        return this.totalItem;
    }

    public DescribeAuthScenePageListResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeAuthScenePageListResponseBodyResultObject extends TeaModel {
        @NameInMap("commonRuleCount")
        public Long commonRuleCount;

        @NameInMap("customRuleCount")
        public Long customRuleCount;

        @NameInMap("eventCode")
        public String eventCode;

        @NameInMap("sceneName")
        public String sceneName;

        @NameInMap("serverName")
        public String serverName;

        public static DescribeAuthScenePageListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuthScenePageListResponseBodyResultObject self = new DescribeAuthScenePageListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeAuthScenePageListResponseBodyResultObject setCommonRuleCount(Long commonRuleCount) {
            this.commonRuleCount = commonRuleCount;
            return this;
        }
        public Long getCommonRuleCount() {
            return this.commonRuleCount;
        }

        public DescribeAuthScenePageListResponseBodyResultObject setCustomRuleCount(Long customRuleCount) {
            this.customRuleCount = customRuleCount;
            return this;
        }
        public Long getCustomRuleCount() {
            return this.customRuleCount;
        }

        public DescribeAuthScenePageListResponseBodyResultObject setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeAuthScenePageListResponseBodyResultObject setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public DescribeAuthScenePageListResponseBodyResultObject setServerName(String serverName) {
            this.serverName = serverName;
            return this;
        }
        public String getServerName() {
            return this.serverName;
        }

    }

}
