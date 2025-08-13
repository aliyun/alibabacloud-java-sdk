// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAuthScenePageListResponseBody extends TeaModel {
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
    public Long currentPage;

    /**
     * <p>Page size, default value is 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeAuthScenePageListResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of items</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("totalItem")
    public Long totalItem;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
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
        /**
         * <p>Number of common rules</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("commonRuleCount")
        public Long commonRuleCount;

        /**
         * <p>Number of custom rules</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("customRuleCount")
        public Long customRuleCount;

        /**
         * <p>Event code</p>
         * 
         * <strong>example:</strong>
         * <p>de_avypfd8253</p>
         */
        @NameInMap("eventCode")
        public String eventCode;

        /**
         * <p>Scene name.</p>
         * 
         * <strong>example:</strong>
         * <p>注册风险识别服务</p>
         */
        @NameInMap("sceneName")
        public String sceneName;

        /**
         * <p>Service name.</p>
         * 
         * <strong>example:</strong>
         * <p>account_abuse</p>
         */
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
