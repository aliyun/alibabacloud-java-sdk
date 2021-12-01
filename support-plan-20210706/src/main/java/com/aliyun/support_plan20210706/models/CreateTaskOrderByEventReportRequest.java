// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class CreateTaskOrderByEventReportRequest extends TeaModel {
    // 告警所属业务
    @NameInMap("Business")
    public String business;

    // 提交人姓名
    @NameInMap("CreateRealName")
    public String createRealName;

    // 提交人userId
    @NameInMap("CreateUserId")
    public String createUserId;

    // 告警描述
    @NameInMap("EventBody")
    public CreateTaskOrderByEventReportRequestEventBody eventBody;

    // 扩展信息
    @NameInMap("Extinfo")
    public java.util.List<CreateTaskOrderByEventReportRequestExtinfo> extinfo;

    // 当eventLevel为warn时，必传
    @NameInMap("ImportantDesc")
    public String importantDesc;

    // 建单入群人员
    @NameInMap("JoinChildGroupUserIds")
    public String joinChildGroupUserIds;

    // 监控集如：视频业务的质量监控
    @NameInMap("MonitorCongregation")
    public String monitorCongregation;

    // 告警关联主群id
    @NameInMap("OpenGroupId")
    public String openGroupId;

    // 问题分类
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
        // domian域名
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
        // 当前告警描述信息
        @NameInMap("EventDesc")
        public String eventDesc;

        // 事件id
        @NameInMap("EventId")
        public String eventId;

        // 事件级别
        @NameInMap("EventLevel")
        public String eventLevel;

        // 事件源标识，自定义和TAM在云企配置的Location指标一致
        @NameInMap("EventLocation")
        public CreateTaskOrderByEventReportRequestEventBodyEventLocation eventLocation;

        // 事件上报时间
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
        // 扩展信息名称
        @NameInMap("Name")
        public String name;

        // 扩展信息value值
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
