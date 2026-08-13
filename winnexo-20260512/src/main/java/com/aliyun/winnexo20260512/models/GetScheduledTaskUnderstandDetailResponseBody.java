// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetScheduledTaskUnderstandDetailResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("relatedObjects")
    public java.util.List<GetScheduledTaskUnderstandDetailResponseBodyRelatedObjects> relatedObjects;

    @NameInMap("relatedSemantics")
    public java.util.List<GetScheduledTaskUnderstandDetailResponseBodyRelatedSemantics> relatedSemantics;

    @NameInMap("relatedSkills")
    public java.util.List<GetScheduledTaskUnderstandDetailResponseBodyRelatedSkills> relatedSkills;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>润色后的任务理解</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("taskUnderstand")
    public String taskUnderstand;

    public static GetScheduledTaskUnderstandDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledTaskUnderstandDetailResponseBody self = new GetScheduledTaskUnderstandDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScheduledTaskUnderstandDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetScheduledTaskUnderstandDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetScheduledTaskUnderstandDetailResponseBody setRelatedObjects(java.util.List<GetScheduledTaskUnderstandDetailResponseBodyRelatedObjects> relatedObjects) {
        this.relatedObjects = relatedObjects;
        return this;
    }
    public java.util.List<GetScheduledTaskUnderstandDetailResponseBodyRelatedObjects> getRelatedObjects() {
        return this.relatedObjects;
    }

    public GetScheduledTaskUnderstandDetailResponseBody setRelatedSemantics(java.util.List<GetScheduledTaskUnderstandDetailResponseBodyRelatedSemantics> relatedSemantics) {
        this.relatedSemantics = relatedSemantics;
        return this;
    }
    public java.util.List<GetScheduledTaskUnderstandDetailResponseBodyRelatedSemantics> getRelatedSemantics() {
        return this.relatedSemantics;
    }

    public GetScheduledTaskUnderstandDetailResponseBody setRelatedSkills(java.util.List<GetScheduledTaskUnderstandDetailResponseBodyRelatedSkills> relatedSkills) {
        this.relatedSkills = relatedSkills;
        return this;
    }
    public java.util.List<GetScheduledTaskUnderstandDetailResponseBodyRelatedSkills> getRelatedSkills() {
        return this.relatedSkills;
    }

    public GetScheduledTaskUnderstandDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScheduledTaskUnderstandDetailResponseBody setTaskUnderstand(String taskUnderstand) {
        this.taskUnderstand = taskUnderstand;
        return this;
    }
    public String getTaskUnderstand() {
        return this.taskUnderstand;
    }

    public static class GetScheduledTaskUnderstandDetailResponseBodyRelatedObjects extends TeaModel {
        /**
         * <p>提及类型</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("mentionType")
        public String mentionType;

        /**
         * <p>文件名</p>
         * 
         * <strong>example:</strong>
         * <p>示例名称.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>对象 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>对象类型</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("objectType")
        public String objectType;

        public static GetScheduledTaskUnderstandDetailResponseBodyRelatedObjects build(java.util.Map<String, ?> map) throws Exception {
            GetScheduledTaskUnderstandDetailResponseBodyRelatedObjects self = new GetScheduledTaskUnderstandDetailResponseBodyRelatedObjects();
            return TeaModel.build(map, self);
        }

        public GetScheduledTaskUnderstandDetailResponseBodyRelatedObjects setMentionType(String mentionType) {
            this.mentionType = mentionType;
            return this;
        }
        public String getMentionType() {
            return this.mentionType;
        }

        public GetScheduledTaskUnderstandDetailResponseBodyRelatedObjects setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetScheduledTaskUnderstandDetailResponseBodyRelatedObjects setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public GetScheduledTaskUnderstandDetailResponseBodyRelatedObjects setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

    public static class GetScheduledTaskUnderstandDetailResponseBodyRelatedSemantics extends TeaModel {
        /**
         * <p>语义属性（JSON 字符串），用于语义检索时过滤</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;level&quot;: &quot;VIP&quot;}</p>
         */
        @NameInMap("attributes")
        public String attributes;

        /**
         * <p>语义实体名，如客户/机会</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("entity")
        public String entity;

        public static GetScheduledTaskUnderstandDetailResponseBodyRelatedSemantics build(java.util.Map<String, ?> map) throws Exception {
            GetScheduledTaskUnderstandDetailResponseBodyRelatedSemantics self = new GetScheduledTaskUnderstandDetailResponseBodyRelatedSemantics();
            return TeaModel.build(map, self);
        }

        public GetScheduledTaskUnderstandDetailResponseBodyRelatedSemantics setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public GetScheduledTaskUnderstandDetailResponseBodyRelatedSemantics setEntity(String entity) {
            this.entity = entity;
            return this;
        }
        public String getEntity() {
            return this.entity;
        }

    }

    public static class GetScheduledTaskUnderstandDetailResponseBodyRelatedSkills extends TeaModel {
        /**
         * <p>技能展示名称</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>文件名</p>
         * 
         * <strong>example:</strong>
         * <p>示例名称.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>技能代码</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("skillCode")
        public String skillCode;

        /**
         * <p>sourceIds</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("sourceIds")
        public java.util.List<String> sourceIds;

        public static GetScheduledTaskUnderstandDetailResponseBodyRelatedSkills build(java.util.Map<String, ?> map) throws Exception {
            GetScheduledTaskUnderstandDetailResponseBodyRelatedSkills self = new GetScheduledTaskUnderstandDetailResponseBodyRelatedSkills();
            return TeaModel.build(map, self);
        }

        public GetScheduledTaskUnderstandDetailResponseBodyRelatedSkills setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetScheduledTaskUnderstandDetailResponseBodyRelatedSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetScheduledTaskUnderstandDetailResponseBodyRelatedSkills setSkillCode(String skillCode) {
            this.skillCode = skillCode;
            return this;
        }
        public String getSkillCode() {
            return this.skillCode;
        }

        public GetScheduledTaskUnderstandDetailResponseBodyRelatedSkills setSourceIds(java.util.List<String> sourceIds) {
            this.sourceIds = sourceIds;
            return this;
        }
        public java.util.List<String> getSourceIds() {
            return this.sourceIds;
        }

    }

}
