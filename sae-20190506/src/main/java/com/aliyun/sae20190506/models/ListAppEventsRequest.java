// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppEventsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ObjectKind")
    public String objectKind;

    @NameInMap("ObjectName")
    public String objectName;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Reason")
    public String reason;

    public static ListAppEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppEventsRequest self = new ListAppEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppEventsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListAppEventsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListAppEventsRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public ListAppEventsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListAppEventsRequest setObjectKind(String objectKind) {
        this.objectKind = objectKind;
        return this;
    }
    public String getObjectKind() {
        return this.objectKind;
    }

    public ListAppEventsRequest setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }
    public String getObjectName() {
        return this.objectName;
    }

    public ListAppEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppEventsRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
