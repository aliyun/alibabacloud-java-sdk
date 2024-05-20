// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppEventsRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The page number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The type of the event. Valid values:</p>
     * <br>
     * <p>*   **Warning**: an alert.</p>
     * <p>*   **Normal**: a normal event.</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The namespace ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The type of the object. Valid values:</p>
     * <br>
     * <p>*   **Deployment**: an application.</p>
     * <p>*   **Pod**: an application instance.</p>
     * <p>*   **Service**: a Server Load Balancer (SLB) instance.</p>
     * <p>*   **HorizontalPodAutoscaler**: an auto scaling policy.</p>
     * <p>*   **CloneSet**: an application.</p>
     */
    @NameInMap("ObjectKind")
    public String objectKind;

    /**
     * <p>The name of the object. Fuzzy search by prefix is supported.</p>
     */
    @NameInMap("ObjectName")
    public String objectName;

    /**
     * <p>The number of entries to return on each page. Valid values: 0 to 10000.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The cause of the event. Fuzzy search by prefix is supported.</p>
     */
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
