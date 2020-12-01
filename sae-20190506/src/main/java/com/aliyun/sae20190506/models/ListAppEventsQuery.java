// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppEventsQuery extends TeaModel {
    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("ObjectKind")
    public String objectKind;

    @NameInMap("ObjectName")
    public String objectName;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("Namespace")
    @Validation(required = true)
    public String namespace;

    public static ListAppEventsQuery build(java.util.Map<String, ?> map) throws Exception {
        ListAppEventsQuery self = new ListAppEventsQuery();
        return TeaModel.build(map, self);
    }

    public ListAppEventsQuery setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListAppEventsQuery setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppEventsQuery setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListAppEventsQuery setObjectKind(String objectKind) {
        this.objectKind = objectKind;
        return this;
    }
    public String getObjectKind() {
        return this.objectKind;
    }

    public ListAppEventsQuery setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }
    public String getObjectName() {
        return this.objectName;
    }

    public ListAppEventsQuery setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public ListAppEventsQuery setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ListAppEventsQuery setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
