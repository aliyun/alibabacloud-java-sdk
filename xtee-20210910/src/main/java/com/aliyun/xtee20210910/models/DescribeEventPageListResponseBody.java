// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventPageListResponseBody extends TeaModel {
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
     * <p>Page size, with a default value of 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeEventPageListResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of items</p>
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
     * <p>9</p>
     */
    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeEventPageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventPageListResponseBody self = new DescribeEventPageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventPageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventPageListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeEventPageListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEventPageListResponseBody setResultObject(java.util.List<DescribeEventPageListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeEventPageListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeEventPageListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeEventPageListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeEventPageListResponseBodyResultObjectChildren extends TeaModel {
        /**
         * <p>Event code.</p>
         * 
         * <strong>example:</strong>
         * <p>de_aamexg3015</p>
         */
        @NameInMap("eventCode")
        public String eventCode;

        /**
         * <p>Event name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("eventName")
        public String eventName;

        /**
         * <p>Event status.</p>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("eventStatus")
        public String eventStatus;

        /**
         * <p>Event type.</p>
         * 
         * <strong>example:</strong>
         * <p>BYPASS</p>
         */
        @NameInMap("eventType")
        public String eventType;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1621578648000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>Modification time</p>
         * 
         * <strong>example:</strong>
         * <p>1621578648000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>Primary key ID</p>
         * 
         * <strong>example:</strong>
         * <p>334</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Total number of rules.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ruleCount")
        public Long ruleCount;

        public static DescribeEventPageListResponseBodyResultObjectChildren build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventPageListResponseBodyResultObjectChildren self = new DescribeEventPageListResponseBodyResultObjectChildren();
            return TeaModel.build(map, self);
        }

        public DescribeEventPageListResponseBodyResultObjectChildren setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeEventPageListResponseBodyResultObjectChildren setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeEventPageListResponseBodyResultObjectChildren setEventStatus(String eventStatus) {
            this.eventStatus = eventStatus;
            return this;
        }
        public String getEventStatus() {
            return this.eventStatus;
        }

        public DescribeEventPageListResponseBodyResultObjectChildren setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeEventPageListResponseBodyResultObjectChildren setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeEventPageListResponseBodyResultObjectChildren setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeEventPageListResponseBodyResultObjectChildren setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventPageListResponseBodyResultObjectChildren setRuleCount(Long ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Long getRuleCount() {
            return this.ruleCount;
        }

    }

    public static class DescribeEventPageListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Object</p>
         */
        @NameInMap("children")
        public java.util.List<DescribeEventPageListResponseBodyResultObjectChildren> children;

        /**
         * <p>Event code</p>
         * 
         * <strong>example:</strong>
         * <p>de_aszbjb7236</p>
         */
        @NameInMap("eventCode")
        public String eventCode;

        /**
         * <p>Event name.</p>
         * 
         * <strong>example:</strong>
         * <p>注册风险</p>
         */
        @NameInMap("eventName")
        public String eventName;

        /**
         * <p>Event status.</p>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("eventStatus")
        public String eventStatus;

        /**
         * <p>Event type.</p>
         * 
         * <strong>example:</strong>
         * <p>MAIN</p>
         */
        @NameInMap("eventType")
        public String eventType;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1621578648000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>Modification time</p>
         * 
         * <strong>example:</strong>
         * <p>1565701886000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>Database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>497</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Total number of rules.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ruleCount")
        public Integer ruleCount;

        /**
         * <p>Template code</p>
         * 
         * <strong>example:</strong>
         * <p>register</p>
         */
        @NameInMap("templateCode")
        public String templateCode;

        /**
         * <p>Template name.</p>
         * 
         * <strong>example:</strong>
         * <p>注册模版</p>
         */
        @NameInMap("templateName")
        public String templateName;

        /**
         * <p>Template type</p>
         * 
         * <strong>example:</strong>
         * <p>UNIVERSAL</p>
         */
        @NameInMap("templateType")
        public String templateType;

        /**
         * <p>Number of customer authorizations</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("userCount")
        public Integer userCount;

        public static DescribeEventPageListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventPageListResponseBodyResultObject self = new DescribeEventPageListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeEventPageListResponseBodyResultObject setChildren(java.util.List<DescribeEventPageListResponseBodyResultObjectChildren> children) {
            this.children = children;
            return this;
        }
        public java.util.List<DescribeEventPageListResponseBodyResultObjectChildren> getChildren() {
            return this.children;
        }

        public DescribeEventPageListResponseBodyResultObject setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeEventPageListResponseBodyResultObject setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeEventPageListResponseBodyResultObject setEventStatus(String eventStatus) {
            this.eventStatus = eventStatus;
            return this;
        }
        public String getEventStatus() {
            return this.eventStatus;
        }

        public DescribeEventPageListResponseBodyResultObject setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeEventPageListResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeEventPageListResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeEventPageListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventPageListResponseBodyResultObject setRuleCount(Integer ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Integer getRuleCount() {
            return this.ruleCount;
        }

        public DescribeEventPageListResponseBodyResultObject setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public DescribeEventPageListResponseBodyResultObject setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DescribeEventPageListResponseBodyResultObject setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public DescribeEventPageListResponseBodyResultObject setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

    }

}
