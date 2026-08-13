// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListGraphsResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>租户下可用于语义查询的已发布图谱列表</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("items")
    public java.util.List<ListGraphsResponseBodyItems> items;

    /**
     * <p>错误描述，成功时为空</p>
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

    public static ListGraphsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGraphsResponseBody self = new ListGraphsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGraphsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGraphsResponseBody setItems(java.util.List<ListGraphsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListGraphsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListGraphsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGraphsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGraphsResponseBodyItems extends TeaModel {
        /**
         * <p>图谱业务说明，未配置时为空字符串</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("businessProfile")
        public String businessProfile;

        /**
         * <p>图谱显示名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>图谱名称，传给 querySemanticKnowledge.graphName</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("graphName")
        public String graphName;

        /**
         * <p>是否为租户默认图谱</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isDefault")
        public Boolean isDefault;

        public static ListGraphsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListGraphsResponseBodyItems self = new ListGraphsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListGraphsResponseBodyItems setBusinessProfile(String businessProfile) {
            this.businessProfile = businessProfile;
            return this;
        }
        public String getBusinessProfile() {
            return this.businessProfile;
        }

        public ListGraphsResponseBodyItems setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListGraphsResponseBodyItems setGraphName(String graphName) {
            this.graphName = graphName;
            return this;
        }
        public String getGraphName() {
            return this.graphName;
        }

        public ListGraphsResponseBodyItems setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

    }

}
