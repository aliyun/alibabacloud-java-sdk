// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetScheduledTaskUnderstandDetailResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The related objects.</p>
     */
    @NameInMap("relatedObjects")
    public java.util.List<GetScheduledTaskUnderstandDetailResponseBodyRelatedObjects> relatedObjects;

    /**
     * <p>The related semantics.</p>
     */
    @NameInMap("relatedSemantics")
    public java.util.List<GetScheduledTaskUnderstandDetailResponseBodyRelatedSemantics> relatedSemantics;

    /**
     * <p>The related skills.</p>
     */
    @NameInMap("relatedSkills")
    public java.util.List<GetScheduledTaskUnderstandDetailResponseBodyRelatedSkills> relatedSkills;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The task understanding description polished by the LLM.</p>
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
         * <p>The mention type, such as objects.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("mentionType")
        public String mentionType;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleName.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The object ID. Pass the project task ID.</p>
         * <ul>
         * <li><p>For internal enterprise applications, this is the taskId obtained by calling the <a href="https://open.dingtalk.com/document/orgapp-server/create-a-project-task">Create a project task</a> operation.</p>
         * </li>
         * <li><p>For third-party enterprise applications, this is the taskId obtained by calling the <a href="https://open.dingtalk.com/document/isvapp-server/create-a-project-task">Create a project task</a> operation.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>The object type, such as customer. This parameter has a value when type is set to mention.</p>
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
         * <p>The information type.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;level&quot;: &quot;VIP&quot;}</p>
         */
        @NameInMap("attributes")
        public String attributes;

        /**
         * <p>The semantic entity name, such as customer or opportunity.</p>
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
         * <p>The display name of the MCP service.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleName.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The skill code.</p>
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
