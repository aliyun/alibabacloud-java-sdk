// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSceneEventPageListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeSceneEventPageListResponseBodyResultObject> resultObject;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("totalItem")
    public Integer totalItem;

    /**
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
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("commonRuleCount")
        public String commonRuleCount;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("customRuleCount")
        public String customRuleCount;

        /**
         * <strong>example:</strong>
         * <p>de_aszbjb7236</p>
         */
        @NameInMap("eventCode")
        public String eventCode;

        @NameInMap("eventName")
        public String eventName;

        /**
         * <strong>example:</strong>
         * <p>1565701886000</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("modifier")
        public String modifier;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("normalRuleCount")
        public String normalRuleCount;

        /**
         * <strong>example:</strong>
         * <p>device_risk</p>
         */
        @NameInMap("service")
        public String service;

        @NameInMap("useStatus")
        public String useStatus;

        /**
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
