// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetScheduledTaskUnderstandDetailRequest extends TeaModel {
    /**
     * <p>所属协作群组 ID（如 cg_101）；群任务理解时传入（调用者需为有效群成员），候选技能额外并入群绑定技能</p>
     * 
     * <strong>example:</strong>
     * <p>exampleCollaborationGroupId</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>数字员工名称列表，用于过滤可用技能；必传（传空列表表示仅用租户 global 技能）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("digitalEmployeeName")
    public java.util.List<String> digitalEmployeeName;

    @NameInMap("segments")
    public java.util.List<GetScheduledTaskUnderstandDetailRequestSegments> segments;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>自然语言任务描述</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("userInput")
    public String userInput;

    public static GetScheduledTaskUnderstandDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledTaskUnderstandDetailRequest self = new GetScheduledTaskUnderstandDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetScheduledTaskUnderstandDetailRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public GetScheduledTaskUnderstandDetailRequest setDigitalEmployeeName(java.util.List<String> digitalEmployeeName) {
        this.digitalEmployeeName = digitalEmployeeName;
        return this;
    }
    public java.util.List<String> getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    public GetScheduledTaskUnderstandDetailRequest setSegments(java.util.List<GetScheduledTaskUnderstandDetailRequestSegments> segments) {
        this.segments = segments;
        return this;
    }
    public java.util.List<GetScheduledTaskUnderstandDetailRequestSegments> getSegments() {
        return this.segments;
    }

    public GetScheduledTaskUnderstandDetailRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetScheduledTaskUnderstandDetailRequest setUserInput(String userInput) {
        this.userInput = userInput;
        return this;
    }
    public String getUserInput() {
        return this.userInput;
    }

    public static class GetScheduledTaskUnderstandDetailRequestSegments extends TeaModel {
        /**
         * <p>文本内容，type=text 时必填</p>
         * 
         * <strong>example:</strong>
         * <p>示例内容</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>功能开关，type=web_search 时可选</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public String enabled;

        /**
         * <p>文件名</p>
         * 
         * <strong>example:</strong>
         * <p>示例名称.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>对象 ID，type=mention 时有值</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>对象类型如 customer，type=mention 时有值</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("objectType")
        public String objectType;

        /**
         * <p>技能编码，type=skill 时有值</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("skillCode")
        public String skillCode;

        /**
         * <p>元素类型：text|web_search|mention|skill</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static GetScheduledTaskUnderstandDetailRequestSegments build(java.util.Map<String, ?> map) throws Exception {
            GetScheduledTaskUnderstandDetailRequestSegments self = new GetScheduledTaskUnderstandDetailRequestSegments();
            return TeaModel.build(map, self);
        }

        public GetScheduledTaskUnderstandDetailRequestSegments setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetScheduledTaskUnderstandDetailRequestSegments setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public GetScheduledTaskUnderstandDetailRequestSegments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetScheduledTaskUnderstandDetailRequestSegments setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public GetScheduledTaskUnderstandDetailRequestSegments setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public GetScheduledTaskUnderstandDetailRequestSegments setSkillCode(String skillCode) {
            this.skillCode = skillCode;
            return this;
        }
        public String getSkillCode() {
            return this.skillCode;
        }

        public GetScheduledTaskUnderstandDetailRequestSegments setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
