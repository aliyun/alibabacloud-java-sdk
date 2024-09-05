// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class CreateTaskOrderByEventReportRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Business")
    public String business;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>小二</p>
     */
    @NameInMap("CreateRealName")
    public String createRealName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1830426056957812</p>
     */
    @NameInMap("CreateUserId")
    public String createUserId;

    @NameInMap("EventBody")
    public CreateTaskOrderByEventReportRequestEventBody eventBody;

    @NameInMap("Extinfo")
    public java.util.List<CreateTaskOrderByEventReportRequestExtinfo> extinfo;

    /**
     * <strong>example:</strong>
     * <p>紧急性原因描述</p>
     */
    @NameInMap("ImportantDesc")
    public String importantDesc;

    /**
     * <strong>example:</strong>
     * <p>123,456</p>
     */
    @NameInMap("JoinChildGroupUserIds")
    public String joinChildGroupUserIds;

    /**
     * <strong>example:</strong>
     * <p>监控集如：视频业务的质量监控 123</p>
     */
    @NameInMap("MonitorCongregation")
    public String monitorCongregation;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cid+lUpHxTIXt7DYqJDcpVxlA==</p>
     */
    @NameInMap("OpenGroupId")
    public String openGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3270</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static CreateTaskOrderByEventReportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskOrderByEventReportRequest self = new CreateTaskOrderByEventReportRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskOrderByEventReportRequest setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public CreateTaskOrderByEventReportRequest setCreateRealName(String createRealName) {
        this.createRealName = createRealName;
        return this;
    }
    public String getCreateRealName() {
        return this.createRealName;
    }

    public CreateTaskOrderByEventReportRequest setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public String getCreateUserId() {
        return this.createUserId;
    }

    public CreateTaskOrderByEventReportRequest setEventBody(CreateTaskOrderByEventReportRequestEventBody eventBody) {
        this.eventBody = eventBody;
        return this;
    }
    public CreateTaskOrderByEventReportRequestEventBody getEventBody() {
        return this.eventBody;
    }

    public CreateTaskOrderByEventReportRequest setExtinfo(java.util.List<CreateTaskOrderByEventReportRequestExtinfo> extinfo) {
        this.extinfo = extinfo;
        return this;
    }
    public java.util.List<CreateTaskOrderByEventReportRequestExtinfo> getExtinfo() {
        return this.extinfo;
    }

    public CreateTaskOrderByEventReportRequest setImportantDesc(String importantDesc) {
        this.importantDesc = importantDesc;
        return this;
    }
    public String getImportantDesc() {
        return this.importantDesc;
    }

    public CreateTaskOrderByEventReportRequest setJoinChildGroupUserIds(String joinChildGroupUserIds) {
        this.joinChildGroupUserIds = joinChildGroupUserIds;
        return this;
    }
    public String getJoinChildGroupUserIds() {
        return this.joinChildGroupUserIds;
    }

    public CreateTaskOrderByEventReportRequest setMonitorCongregation(String monitorCongregation) {
        this.monitorCongregation = monitorCongregation;
        return this;
    }
    public String getMonitorCongregation() {
        return this.monitorCongregation;
    }

    public CreateTaskOrderByEventReportRequest setOpenGroupId(String openGroupId) {
        this.openGroupId = openGroupId;
        return this;
    }
    public String getOpenGroupId() {
        return this.openGroupId;
    }

    public CreateTaskOrderByEventReportRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public static class CreateTaskOrderByEventReportRequestEventBodyEventLocation extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>flv13.bn.netease.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        public static CreateTaskOrderByEventReportRequestEventBodyEventLocation build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskOrderByEventReportRequestEventBodyEventLocation self = new CreateTaskOrderByEventReportRequestEventBodyEventLocation();
            return TeaModel.build(map, self);
        }

        public CreateTaskOrderByEventReportRequestEventBodyEventLocation setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

    }

    public static class CreateTaskOrderByEventReportRequestEventBody extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>告警内容</p>
         */
        @NameInMap("EventDesc")
        public String eventDesc;

        /**
         * <strong>example:</strong>
         * <p>j9uwe-34328987</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <strong>example:</strong>
         * <p>info,warn,alarm,critical</p>
         */
        @NameInMap("EventLevel")
        public String eventLevel;

        @NameInMap("EventLocation")
        public CreateTaskOrderByEventReportRequestEventBodyEventLocation eventLocation;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("EventTime")
        public String eventTime;

        public static CreateTaskOrderByEventReportRequestEventBody build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskOrderByEventReportRequestEventBody self = new CreateTaskOrderByEventReportRequestEventBody();
            return TeaModel.build(map, self);
        }

        public CreateTaskOrderByEventReportRequestEventBody setEventDesc(String eventDesc) {
            this.eventDesc = eventDesc;
            return this;
        }
        public String getEventDesc() {
            return this.eventDesc;
        }

        public CreateTaskOrderByEventReportRequestEventBody setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public CreateTaskOrderByEventReportRequestEventBody setEventLevel(String eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }
        public String getEventLevel() {
            return this.eventLevel;
        }

        public CreateTaskOrderByEventReportRequestEventBody setEventLocation(CreateTaskOrderByEventReportRequestEventBodyEventLocation eventLocation) {
            this.eventLocation = eventLocation;
            return this;
        }
        public CreateTaskOrderByEventReportRequestEventBodyEventLocation getEventLocation() {
            return this.eventLocation;
        }

        public CreateTaskOrderByEventReportRequestEventBody setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

    }

    public static class CreateTaskOrderByEventReportRequestExtinfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>扩展信息名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>扩展信息value值</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateTaskOrderByEventReportRequestExtinfo build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskOrderByEventReportRequestExtinfo self = new CreateTaskOrderByEventReportRequestExtinfo();
            return TeaModel.build(map, self);
        }

        public CreateTaskOrderByEventReportRequestExtinfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTaskOrderByEventReportRequestExtinfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
