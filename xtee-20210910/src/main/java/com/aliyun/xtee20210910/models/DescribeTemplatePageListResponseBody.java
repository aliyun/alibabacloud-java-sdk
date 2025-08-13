// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTemplatePageListResponseBody extends TeaModel {
    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <p>Number of items per page, default value is 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeTemplatePageListResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of items</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("totalItem")
    public Integer totalItem;

    /**
     * <p>Total number of pages</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeTemplatePageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplatePageListResponseBody self = new DescribeTemplatePageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTemplatePageListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeTemplatePageListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTemplatePageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTemplatePageListResponseBody setResultObject(java.util.List<DescribeTemplatePageListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeTemplatePageListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeTemplatePageListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeTemplatePageListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeTemplatePageListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Description information.</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("description")
        public String description;

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
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1621578648000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1565701886000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>Template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>497</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Number of policies</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ruleCount")
        public Integer ruleCount;

        /**
         * <p>Template code.</p>
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
         * <p>注册事件</p>
         */
        @NameInMap("templateName")
        public String templateName;

        /**
         * <p>Event status</p>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("templateStatus")
        public String templateStatus;

        /**
         * <p>Template type</p>
         * 
         * <strong>example:</strong>
         * <p>PUB_SERVICE</p>
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

        /**
         * <p>Version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public Integer version;

        public static DescribeTemplatePageListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplatePageListResponseBodyResultObject self = new DescribeTemplatePageListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeTemplatePageListResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeTemplatePageListResponseBodyResultObject setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeTemplatePageListResponseBodyResultObject setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeTemplatePageListResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeTemplatePageListResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeTemplatePageListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeTemplatePageListResponseBodyResultObject setRuleCount(Integer ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Integer getRuleCount() {
            return this.ruleCount;
        }

        public DescribeTemplatePageListResponseBodyResultObject setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public DescribeTemplatePageListResponseBodyResultObject setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DescribeTemplatePageListResponseBodyResultObject setTemplateStatus(String templateStatus) {
            this.templateStatus = templateStatus;
            return this;
        }
        public String getTemplateStatus() {
            return this.templateStatus;
        }

        public DescribeTemplatePageListResponseBodyResultObject setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public DescribeTemplatePageListResponseBodyResultObject setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

        public DescribeTemplatePageListResponseBodyResultObject setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
