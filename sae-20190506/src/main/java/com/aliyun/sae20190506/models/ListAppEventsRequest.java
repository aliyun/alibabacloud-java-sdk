// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppEventsRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>f7730764-d88f-4b9a-8d8e-cd8efbfe****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The event type. Valid values:</p>
     * <ul>
     * <li><p><strong>Warning</strong>: An event that indicates a potential problem.</p>
     * </li>
     * <li><p><strong>Normal</strong>: An event that indicates a routine operation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Warning</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The ID of the region where the namespace is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The object kind. Valid values:</p>
     * <ul>
     * <li><p><strong>Deployment</strong>: The application.</p>
     * </li>
     * <li><p><strong>Pod</strong>: The application instance.</p>
     * </li>
     * <li><p><strong>Service</strong>: The Server Load Balancer (SLB) instance.</p>
     * </li>
     * <li><p><strong>HorizontalPodAutoscaler</strong>: The auto scaling policy.</p>
     * </li>
     * <li><p><strong>CloneSet</strong>: The application.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Pod</p>
     */
    @NameInMap("ObjectKind")
    public String objectKind;

    /**
     * <p>The name of the object. Prefix matching is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>errew-b86bf540-b4dc-47d8-a42f-b4997c14bd8f-5595cbddd6-x****</p>
     */
    @NameInMap("ObjectName")
    public String objectName;

    /**
     * <p>The number of entries to return per page. The value must be an integer from 0 to 10,000.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The reason for the event. Prefix matching is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Started</p>
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
