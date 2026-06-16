// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSceneEventPageListResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries per page in the response. Default value: 20. Minimum value: 1. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The request ID. Each request has a unique ID for troubleshooting purposes.</p>
     * 
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned array.</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeSceneEventPageListResponseBodyResultObject> resultObject;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("totalItem")
    public Integer totalItem;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeSceneEventPageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneEventPageListResponseBody self = new DescribeSceneEventPageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSceneEventPageListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSceneEventPageListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSceneEventPageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSceneEventPageListResponseBody setResultObject(java.util.List<DescribeSceneEventPageListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeSceneEventPageListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeSceneEventPageListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeSceneEventPageListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeSceneEventPageListResponseBodyResultObject extends TeaModel {
        /**
         * <p>The number of General Policy rules.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("commonRuleCount")
        public String commonRuleCount;

        /**
         * <p>The number of custom policies.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("customRuleCount")
        public String customRuleCount;

        /**
         * <p>The event code.</p>
         * 
         * <strong>example:</strong>
         * <p>de_aszbjb7236</p>
         */
        @NameInMap("eventCode")
        public String eventCode;

        /**
         * <p>The event name.</p>
         * 
         * <strong>example:</strong>
         * <p>注册风险</p>
         */
        @NameInMap("eventName")
        public String eventName;

        /**
         * <p>The time when the event was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1565701886000</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The user who last modified the event.</p>
         * 
         * <strong>example:</strong>
         * <p>公有云用户uid</p>
         */
        @NameInMap("modifier")
        public String modifier;

        /**
         * <p>The number of user-defined policies.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("normalRuleCount")
        public String normalRuleCount;

        /**
         * <p>The service code.</p>
         * 
         * <strong>example:</strong>
         * <p>device_risk</p>
         */
        @NameInMap("service")
        public String service;

        /**
         * <p>The usage status.</p>
         * 
         * <strong>example:</strong>
         * <p>使用/未使用</p>
         */
        @NameInMap("useStatus")
        public String useStatus;

        /**
         * <p>The number of whitebox implementation policies.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("whiteBoxRuleCount")
        public String whiteBoxRuleCount;

        public static DescribeSceneEventPageListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSceneEventPageListResponseBodyResultObject self = new DescribeSceneEventPageListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSceneEventPageListResponseBodyResultObject setCommonRuleCount(String commonRuleCount) {
            this.commonRuleCount = commonRuleCount;
            return this;
        }
        public String getCommonRuleCount() {
            return this.commonRuleCount;
        }

        public DescribeSceneEventPageListResponseBodyResultObject setCustomRuleCount(String customRuleCount) {
            this.customRuleCount = customRuleCount;
            return this;
        }
        public String getCustomRuleCount() {
            return this.customRuleCount;
        }

        public DescribeSceneEventPageListResponseBodyResultObject setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeSceneEventPageListResponseBodyResultObject setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeSceneEventPageListResponseBodyResultObject setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeSceneEventPageListResponseBodyResultObject setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public DescribeSceneEventPageListResponseBodyResultObject setNormalRuleCount(String normalRuleCount) {
            this.normalRuleCount = normalRuleCount;
            return this;
        }
        public String getNormalRuleCount() {
            return this.normalRuleCount;
        }

        public DescribeSceneEventPageListResponseBodyResultObject setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public DescribeSceneEventPageListResponseBodyResultObject setUseStatus(String useStatus) {
            this.useStatus = useStatus;
            return this;
        }
        public String getUseStatus() {
            return this.useStatus;
        }

        public DescribeSceneEventPageListResponseBodyResultObject setWhiteBoxRuleCount(String whiteBoxRuleCount) {
            this.whiteBoxRuleCount = whiteBoxRuleCount;
            return this;
        }
        public String getWhiteBoxRuleCount() {
            return this.whiteBoxRuleCount;
        }

    }

}
