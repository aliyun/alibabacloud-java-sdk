// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentIconListResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <br>
     * <p>*   **200**: The request was successful.</p>
     * <p>*   **400**: The request failed.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The information about the entities and edges.</p>
     */
    @NameInMap("InfoList")
    public QueryIncidentIconListResponseBodyInfoList infoList;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The consumed time of the request. Unit: seconds.</p>
     */
    @NameInMap("TimeCost")
    public Long timeCost;

    public static QueryIncidentIconListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIncidentIconListResponseBody self = new QueryIncidentIconListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIncidentIconListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryIncidentIconListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryIncidentIconListResponseBody setInfoList(QueryIncidentIconListResponseBodyInfoList infoList) {
        this.infoList = infoList;
        return this;
    }
    public QueryIncidentIconListResponseBodyInfoList getInfoList() {
        return this.infoList;
    }

    public QueryIncidentIconListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryIncidentIconListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIncidentIconListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryIncidentIconListResponseBody setTimeCost(Long timeCost) {
        this.timeCost = timeCost;
        return this;
    }
    public Long getTimeCost() {
        return this.timeCost;
    }

    public static class QueryIncidentIconListResponseBodyInfoListEntityTypeList extends TeaModel {
        /**
         * <p>The display color of the entity.</p>
         */
        @NameInMap("DisplayColor")
        public String displayColor;

        /**
         * <p>The icon that corresponds to the entity.</p>
         */
        @NameInMap("DisplayIcon")
        public String displayIcon;

        /**
         * <p>The display sequence of the entity.</p>
         */
        @NameInMap("DisplayOrder")
        public String displayOrder;

        /**
         * <p>The display template of the entity.</p>
         */
        @NameInMap("DisplayTemplate")
        public String displayTemplate;

        /**
         * <p>The time when the entity was created.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the entity was updated.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the entity.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether the entity is a virtual node. Valid values:</p>
         * <br>
         * <p>*   **1**: yes</p>
         * <p>*   **0**: no</p>
         */
        @NameInMap("IsVirtualNode")
        public String isVirtualNode;

        /**
         * <p>The name of the entity.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace of the entity.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The tag that indicates whether tracing was successful.</p>
         */
        @NameInMap("TraceSuccessFlag")
        public String traceSuccessFlag;

        public static QueryIncidentIconListResponseBodyInfoListEntityTypeList build(java.util.Map<String, ?> map) throws Exception {
            QueryIncidentIconListResponseBodyInfoListEntityTypeList self = new QueryIncidentIconListResponseBodyInfoListEntityTypeList();
            return TeaModel.build(map, self);
        }

        public QueryIncidentIconListResponseBodyInfoListEntityTypeList setDisplayColor(String displayColor) {
            this.displayColor = displayColor;
            return this;
        }
        public String getDisplayColor() {
            return this.displayColor;
        }

        public QueryIncidentIconListResponseBodyInfoListEntityTypeList setDisplayIcon(String displayIcon) {
            this.displayIcon = displayIcon;
            return this;
        }
        public String getDisplayIcon() {
            return this.displayIcon;
        }

        public QueryIncidentIconListResponseBodyInfoListEntityTypeList setDisplayOrder(String displayOrder) {
            this.displayOrder = displayOrder;
            return this;
        }
        public String getDisplayOrder() {
            return this.displayOrder;
        }

        public QueryIncidentIconListResponseBodyInfoListEntityTypeList setDisplayTemplate(String displayTemplate) {
            this.displayTemplate = displayTemplate;
            return this;
        }
        public String getDisplayTemplate() {
            return this.displayTemplate;
        }

        public QueryIncidentIconListResponseBodyInfoListEntityTypeList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryIncidentIconListResponseBodyInfoListEntityTypeList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryIncidentIconListResponseBodyInfoListEntityTypeList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryIncidentIconListResponseBodyInfoListEntityTypeList setIsVirtualNode(String isVirtualNode) {
            this.isVirtualNode = isVirtualNode;
            return this;
        }
        public String getIsVirtualNode() {
            return this.isVirtualNode;
        }

        public QueryIncidentIconListResponseBodyInfoListEntityTypeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryIncidentIconListResponseBodyInfoListEntityTypeList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryIncidentIconListResponseBodyInfoListEntityTypeList setTraceSuccessFlag(String traceSuccessFlag) {
            this.traceSuccessFlag = traceSuccessFlag;
            return this;
        }
        public String getTraceSuccessFlag() {
            return this.traceSuccessFlag;
        }

    }

    public static class QueryIncidentIconListResponseBodyInfoListRelationTypeList extends TeaModel {
        /**
         * <p>The direction of the edge. Valid values:</p>
         * <br>
         * <p>*   **1**: forward</p>
         * <p>*   **0**: reverse</p>
         */
        @NameInMap("Directed")
        public String directed;

        /**
         * <p>The display color of the edge.</p>
         */
        @NameInMap("DisplayColor")
        public String displayColor;

        /**
         * <p>The icon that corresponds to the edge.</p>
         */
        @NameInMap("DisplayIcon")
        public String displayIcon;

        /**
         * <p>The display template of the edge.</p>
         */
        @NameInMap("DisplayTemplate")
        public String displayTemplate;

        /**
         * <p>The time when the edge was created.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the edge was modified.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the edge.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the edge.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace of the edge.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The display type of the edge.</p>
         */
        @NameInMap("ShowType")
        public String showType;

        public static QueryIncidentIconListResponseBodyInfoListRelationTypeList build(java.util.Map<String, ?> map) throws Exception {
            QueryIncidentIconListResponseBodyInfoListRelationTypeList self = new QueryIncidentIconListResponseBodyInfoListRelationTypeList();
            return TeaModel.build(map, self);
        }

        public QueryIncidentIconListResponseBodyInfoListRelationTypeList setDirected(String directed) {
            this.directed = directed;
            return this;
        }
        public String getDirected() {
            return this.directed;
        }

        public QueryIncidentIconListResponseBodyInfoListRelationTypeList setDisplayColor(String displayColor) {
            this.displayColor = displayColor;
            return this;
        }
        public String getDisplayColor() {
            return this.displayColor;
        }

        public QueryIncidentIconListResponseBodyInfoListRelationTypeList setDisplayIcon(String displayIcon) {
            this.displayIcon = displayIcon;
            return this;
        }
        public String getDisplayIcon() {
            return this.displayIcon;
        }

        public QueryIncidentIconListResponseBodyInfoListRelationTypeList setDisplayTemplate(String displayTemplate) {
            this.displayTemplate = displayTemplate;
            return this;
        }
        public String getDisplayTemplate() {
            return this.displayTemplate;
        }

        public QueryIncidentIconListResponseBodyInfoListRelationTypeList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryIncidentIconListResponseBodyInfoListRelationTypeList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryIncidentIconListResponseBodyInfoListRelationTypeList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryIncidentIconListResponseBodyInfoListRelationTypeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryIncidentIconListResponseBodyInfoListRelationTypeList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryIncidentIconListResponseBodyInfoListRelationTypeList setShowType(String showType) {
            this.showType = showType;
            return this;
        }
        public String getShowType() {
            return this.showType;
        }

    }

    public static class QueryIncidentIconListResponseBodyInfoList extends TeaModel {
        /**
         * <p>The information about the entities.</p>
         */
        @NameInMap("EntityTypeList")
        public java.util.List<QueryIncidentIconListResponseBodyInfoListEntityTypeList> entityTypeList;

        /**
         * <p>The information about the edges.</p>
         */
        @NameInMap("RelationTypeList")
        public java.util.List<QueryIncidentIconListResponseBodyInfoListRelationTypeList> relationTypeList;

        public static QueryIncidentIconListResponseBodyInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryIncidentIconListResponseBodyInfoList self = new QueryIncidentIconListResponseBodyInfoList();
            return TeaModel.build(map, self);
        }

        public QueryIncidentIconListResponseBodyInfoList setEntityTypeList(java.util.List<QueryIncidentIconListResponseBodyInfoListEntityTypeList> entityTypeList) {
            this.entityTypeList = entityTypeList;
            return this;
        }
        public java.util.List<QueryIncidentIconListResponseBodyInfoListEntityTypeList> getEntityTypeList() {
            return this.entityTypeList;
        }

        public QueryIncidentIconListResponseBodyInfoList setRelationTypeList(java.util.List<QueryIncidentIconListResponseBodyInfoListRelationTypeList> relationTypeList) {
            this.relationTypeList = relationTypeList;
            return this;
        }
        public java.util.List<QueryIncidentIconListResponseBodyInfoListRelationTypeList> getRelationTypeList() {
            return this.relationTypeList;
        }

    }

}
