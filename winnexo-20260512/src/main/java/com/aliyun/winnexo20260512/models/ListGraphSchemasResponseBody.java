// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListGraphSchemasResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>租户下 active 图谱摘要列表</p>
     */
    @NameInMap("items")
    public java.util.List<ListGraphSchemasResponseBodyItems> items;

    /**
     * <p>错误描述，成功时为空</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListGraphSchemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGraphSchemasResponseBody self = new ListGraphSchemasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGraphSchemasResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGraphSchemasResponseBody setItems(java.util.List<ListGraphSchemasResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListGraphSchemasResponseBodyItems> getItems() {
        return this.items;
    }

    public ListGraphSchemasResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGraphSchemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGraphSchemasResponseBodyItems extends TeaModel {
        /**
         * <p>active Schema 版本</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0</p>
         */
        @NameInMap("activeVersion")
        public String activeVersion;

        /**
         * <p>业务说明，未设置时为空字符串</p>
         * 
         * <strong>example:</strong>
         * <p>客户域语义图谱</p>
         */
        @NameInMap("businessProfile")
        public String businessProfile;

        /**
         * <p>图谱展示名，空值时兜底 graphName</p>
         * 
         * <strong>example:</strong>
         * <p>CRM 图谱</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>图谱名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crm_graph</p>
         */
        @NameInMap("graphName")
        public String graphName;

        /**
         * <p>图谱状态：PUBLISHED / DEVELOPING（当前用户有活动草稿）/ PUBLISHING（当前用户发布中）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLISHED</p>
         */
        @NameInMap("graphStatus")
        public String graphStatus;

        /**
         * <p>当前调用者视角是否存在个人活动草稿；部署/系统级 Token 恒 false</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("hasDraft")
        public Boolean hasDraft;

        /**
         * <p>是否为租户默认图谱</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isDefault")
        public Boolean isDefault;

        /**
         * <p>object_type 数量，解析失败兜底 0</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("objectTypeCount")
        public Long objectTypeCount;

        /**
         * <p>relation 数量，解析失败兜底 0</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("relationCount")
        public Long relationCount;

        /**
         * <p>语义标签列表，未配置时为空数组</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("semanticTags")
        public java.util.List<String> semanticTags;

        public static ListGraphSchemasResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListGraphSchemasResponseBodyItems self = new ListGraphSchemasResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListGraphSchemasResponseBodyItems setActiveVersion(String activeVersion) {
            this.activeVersion = activeVersion;
            return this;
        }
        public String getActiveVersion() {
            return this.activeVersion;
        }

        public ListGraphSchemasResponseBodyItems setBusinessProfile(String businessProfile) {
            this.businessProfile = businessProfile;
            return this;
        }
        public String getBusinessProfile() {
            return this.businessProfile;
        }

        public ListGraphSchemasResponseBodyItems setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListGraphSchemasResponseBodyItems setGraphName(String graphName) {
            this.graphName = graphName;
            return this;
        }
        public String getGraphName() {
            return this.graphName;
        }

        public ListGraphSchemasResponseBodyItems setGraphStatus(String graphStatus) {
            this.graphStatus = graphStatus;
            return this;
        }
        public String getGraphStatus() {
            return this.graphStatus;
        }

        public ListGraphSchemasResponseBodyItems setHasDraft(Boolean hasDraft) {
            this.hasDraft = hasDraft;
            return this;
        }
        public Boolean getHasDraft() {
            return this.hasDraft;
        }

        public ListGraphSchemasResponseBodyItems setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListGraphSchemasResponseBodyItems setObjectTypeCount(Long objectTypeCount) {
            this.objectTypeCount = objectTypeCount;
            return this;
        }
        public Long getObjectTypeCount() {
            return this.objectTypeCount;
        }

        public ListGraphSchemasResponseBodyItems setRelationCount(Long relationCount) {
            this.relationCount = relationCount;
            return this;
        }
        public Long getRelationCount() {
            return this.relationCount;
        }

        public ListGraphSchemasResponseBodyItems setSemanticTags(java.util.List<String> semanticTags) {
            this.semanticTags = semanticTags;
            return this;
        }
        public java.util.List<String> getSemanticTags() {
            return this.semanticTags;
        }

    }

}
