// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventPageListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resultObject")
    public java.util.List<DescribeEventPageListResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public Integer totalItem;

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
        @NameInMap("eventCode")
        public String eventCode;

        @NameInMap("eventName")
        public String eventName;

        @NameInMap("eventStatus")
        public String eventStatus;

        @NameInMap("eventType")
        public String eventType;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("id")
        public Long id;

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
        @NameInMap("children")
        public java.util.List<DescribeEventPageListResponseBodyResultObjectChildren> children;

        @NameInMap("eventCode")
        public String eventCode;

        @NameInMap("eventName")
        public String eventName;

        @NameInMap("eventStatus")
        public String eventStatus;

        @NameInMap("eventType")
        public String eventType;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("ruleCount")
        public Integer ruleCount;

        @NameInMap("templateCode")
        public String templateCode;

        @NameInMap("templateName")
        public String templateName;

        @NameInMap("templateType")
        public String templateType;

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
