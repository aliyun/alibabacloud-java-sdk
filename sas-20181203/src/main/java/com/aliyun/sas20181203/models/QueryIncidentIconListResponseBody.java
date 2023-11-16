// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentIconListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("InfoList")
    public QueryIncidentIconListResponseBodyInfoList infoList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("DisplayColor")
        public String displayColor;

        @NameInMap("DisplayIcon")
        public String displayIcon;

        @NameInMap("DisplayOrder")
        public String displayOrder;

        @NameInMap("DisplayTemplate")
        public String displayTemplate;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsVirtualNode")
        public String isVirtualNode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

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
        @NameInMap("Directed")
        public String directed;

        @NameInMap("DisplayColor")
        public String displayColor;

        @NameInMap("DisplayIcon")
        public String displayIcon;

        @NameInMap("DisplayTemplate")
        public String displayTemplate;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

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
        @NameInMap("EntityTypeList")
        public java.util.List<QueryIncidentIconListResponseBodyInfoListEntityTypeList> entityTypeList;

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
