// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentIconListResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li><strong>200</strong>: The request was successful.</li>
     * <li><strong>400</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>09969D2C-4FAD-429E-BFBF-9A60DEF8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The consumed time of the request. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>#fff</p>
         */
        @NameInMap("DisplayColor")
        public String displayColor;

        /**
         * <p>The icon that corresponds to the entity.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/imgextra/i4/O1CN011BZBvK1oifgsWIXoO_!!60000*****-55-tps-32-32.svg">https://img.alicdn.com/imgextra/i4/O1CN011BZBvK1oifgsWIXoO_!!60000*****-55-tps-32-32.svg</a></p>
         */
        @NameInMap("DisplayIcon")
        public String displayIcon;

        /**
         * <p>The display sequence of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DisplayOrder")
        public String displayOrder;

        /**
         * <p>The display template of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;${sas.trace2.name.logtime}&quot;,&quot;value&quot;:&quot;$!{time}&quot;},{&quot;name&quot;:&quot;${sas.trace2.name.node_type}&quot;,&quot;value&quot;:&quot;${sas.trace2.name.ip}&quot;},{&quot;name&quot;:&quot;${sas.trace2.property.name}&quot;,&quot;value&quot;:&quot;$!{name}&quot;}#if($p_log_time),{&quot;name&quot;:&quot;${sas.trace2.property.log_time}&quot;,&quot;value&quot;:&quot;$!{p_log_time}&quot;}#end#if($p_pid),{&quot;name&quot;:&quot;${sas.trace2.property.pid}&quot;,&quot;value&quot;:&quot;$!{p_pid}&quot;}#end#if($p_procname),{&quot;name&quot;:&quot;${sas.trace2.property.procname}&quot;,&quot;value&quot;:&quot;$!{p_procname}&quot;}#end#if($p_proc_path),{&quot;name&quot;:&quot;${sas.trace2.property.proc_path}&quot;,&quot;value&quot;:&quot;$!{p_proc_path}&quot;}#end#if($p_cmdline),{&quot;name&quot;:&quot;${sas.trace2.property.cmdline}&quot;,&quot;value&quot;:&quot;$!{p_cmdline}&quot;}#end#if($p_username),{&quot;name&quot;:&quot;${sas.trace2.property.username}&quot;,&quot;value&quot;:&quot;$!{p_username}&quot;}#end#if($p_cwd),{&quot;name&quot;:&quot;${sas.trace2.property.cwd}&quot;,&quot;value&quot;:&quot;$!{p_cwd}&quot;}#end#if($p_filepath),{&quot;name&quot;:&quot;${sas.trace2.property.filepath}&quot;,&quot;value&quot;:&quot;$!{p_filepath}&quot;}#end#if($p_md5),{&quot;name&quot;:&quot;${sas.trace2.property.md5}&quot;,&quot;value&quot;:&quot;$!{p_md5}&quot;}#end#if($p_ctime),{&quot;name&quot;:&quot;${sas.trace2.property.ctime}&quot;,&quot;value&quot;:&quot;$!{p_ctime}&quot;}#end#if($p_mtime),{&quot;name&quot;:&quot;${sas.trace2.property.mtime}&quot;,&quot;value&quot;:&quot;$!{p_mtime}&quot;}#end#if($p_size),{&quot;name&quot;:&quot;${sas.trace2.property.size}&quot;,&quot;value&quot;:&quot;$!{p_size}&quot;}#end#if($p_port),{&quot;name&quot;:&quot;${sas.trace2.property.port}&quot;,&quot;value&quot;:&quot;$!{p_port}&quot;}#end#if($p_ip),{&quot;name&quot;:&quot;${sas.trace2.property.ip}&quot;,&quot;value&quot;:&quot;$!{p_ip}&quot;}#end#if($p_src_ip),{&quot;name&quot;:&quot;${sas.trace2.property.src_ip}&quot;,&quot;value&quot;:&quot;$!{p_src_ip}&quot;}#end#if($p_dst_ip),{&quot;name&quot;:&quot;${sas.trace2.property.dst_ip}&quot;,&quot;value&quot;:&quot;$!{p_dst_ip}&quot;}#end#if($p_host),{&quot;name&quot;:&quot;${sas.trace2.property.host}&quot;,&quot;value&quot;:&quot;$!{p_host}&quot;}#end#if($p_uri),{&quot;name&quot;:&quot;${sas.trace2.property.uri}&quot;,&quot;value&quot;:&quot;$!{p_uri}&quot;}#end#if($p_post_data),{&quot;name&quot;:&quot;${sas.trace2.property.post_data}&quot;,&quot;value&quot;:&quot;$!{p_post_data}&quot;}#end#if($p_content),{&quot;name&quot;:&quot;${sas.trace2.property.content}&quot;,&quot;value&quot;:&quot;$!{p_content}&quot;}#end#if($p_type),{&quot;name&quot;:&quot;${sas.trace2.property.type}&quot;,&quot;value&quot;:&quot;$!{p_type}&quot;}#end]&quot;,</p>
         */
        @NameInMap("DisplayTemplate")
        public String displayTemplate;

        /**
         * <p>The time when the entity was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-08T15:27Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the entity was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-11T10:16Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>8038****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether the entity is a virtual node. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsVirtualNode")
        public String isVirtualNode;

        /**
         * <p>The name of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>shujuku</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>kube-system</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The tag that indicates whether tracing was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <ul>
         * <li><strong>1</strong>: forward</li>
         * <li><strong>0</strong>: reverse</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Directed")
        public String directed;

        /**
         * <p>The display color of the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>#FFF</p>
         */
        @NameInMap("DisplayColor")
        public String displayColor;

        /**
         * <p>The icon that corresponds to the edge.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/imgextra/i4/O1CN01ft6rvQ22uUX2JsTmv_!!600000******-55-tps-12-12.svg">https://img.alicdn.com/imgextra/i4/O1CN01ft6rvQ22uUX2JsTmv_!!600000******-55-tps-12-12.svg</a></p>
         */
        @NameInMap("DisplayIcon")
        public String displayIcon;

        /**
         * <p>The display template of the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>test_template</p>
         */
        @NameInMap("DisplayTemplate")
        public String displayTemplate;

        /**
         * <p>The time when the edge was created.</p>
         * 
         * <strong>example:</strong>
         * <p>167660031*****</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the edge was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-04T17:35Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>4556****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-auto-effs3b</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace of the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>lkl-zf-bs-lams</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The display type of the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
