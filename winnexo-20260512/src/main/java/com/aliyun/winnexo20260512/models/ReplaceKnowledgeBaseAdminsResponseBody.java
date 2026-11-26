// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceKnowledgeBaseAdminsResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>知识库创建者</p>
     */
    @NameInMap("creator")
    public ReplaceKnowledgeBaseAdminsResponseBodyCreator creator;

    /**
     * <p>已配置的知识库根目录业务 ID</p>
     * 
     * <strong>example:</strong>
     * <p>kb_001</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>用户组展开和去重后的有效审批人</p>
     */
    @NameInMap("effectiveApprovers")
    public java.util.List<ReplaceKnowledgeBaseAdminsResponseBodyEffectiveApprovers> effectiveApprovers;

    /**
     * <p>错误描述，成功时为空</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>配置完成后的管理员主体列表，包含创建者</p>
     */
    @NameInMap("principals")
    public java.util.List<ReplaceKnowledgeBaseAdminsResponseBodyPrincipals> principals;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ReplaceKnowledgeBaseAdminsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReplaceKnowledgeBaseAdminsResponseBody self = new ReplaceKnowledgeBaseAdminsResponseBody();
        return TeaModel.build(map, self);
    }

    public ReplaceKnowledgeBaseAdminsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReplaceKnowledgeBaseAdminsResponseBody setCreator(ReplaceKnowledgeBaseAdminsResponseBodyCreator creator) {
        this.creator = creator;
        return this;
    }
    public ReplaceKnowledgeBaseAdminsResponseBodyCreator getCreator() {
        return this.creator;
    }

    public ReplaceKnowledgeBaseAdminsResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ReplaceKnowledgeBaseAdminsResponseBody setEffectiveApprovers(java.util.List<ReplaceKnowledgeBaseAdminsResponseBodyEffectiveApprovers> effectiveApprovers) {
        this.effectiveApprovers = effectiveApprovers;
        return this;
    }
    public java.util.List<ReplaceKnowledgeBaseAdminsResponseBodyEffectiveApprovers> getEffectiveApprovers() {
        return this.effectiveApprovers;
    }

    public ReplaceKnowledgeBaseAdminsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReplaceKnowledgeBaseAdminsResponseBody setPrincipals(java.util.List<ReplaceKnowledgeBaseAdminsResponseBodyPrincipals> principals) {
        this.principals = principals;
        return this;
    }
    public java.util.List<ReplaceKnowledgeBaseAdminsResponseBodyPrincipals> getPrincipals() {
        return this.principals;
    }

    public ReplaceKnowledgeBaseAdminsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ReplaceKnowledgeBaseAdminsResponseBodyCreator extends TeaModel {
        /**
         * <p>是否为不可移除的创建者</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("immutable")
        public Boolean immutable;

        /**
         * <p>用户 ID 或用户组 ID</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("principalId")
        public String principalId;

        /**
         * <p>主体显示名称，无法解析时为空</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("principalName")
        public String principalName;

        /**
         * <p>主体类型：USER 或 USER_GROUP</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("principalType")
        public String principalType;

        /**
         * <p>权限来源：CREATOR 或 DIRECT</p>
         * 
         * <strong>example:</strong>
         * <p>CREATOR</p>
         */
        @NameInMap("source")
        public String source;

        public static ReplaceKnowledgeBaseAdminsResponseBodyCreator build(java.util.Map<String, ?> map) throws Exception {
            ReplaceKnowledgeBaseAdminsResponseBodyCreator self = new ReplaceKnowledgeBaseAdminsResponseBodyCreator();
            return TeaModel.build(map, self);
        }

        public ReplaceKnowledgeBaseAdminsResponseBodyCreator setImmutable(Boolean immutable) {
            this.immutable = immutable;
            return this;
        }
        public Boolean getImmutable() {
            return this.immutable;
        }

        public ReplaceKnowledgeBaseAdminsResponseBodyCreator setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public ReplaceKnowledgeBaseAdminsResponseBodyCreator setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public ReplaceKnowledgeBaseAdminsResponseBodyCreator setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public ReplaceKnowledgeBaseAdminsResponseBodyCreator setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class ReplaceKnowledgeBaseAdminsResponseBodyEffectiveApprovers extends TeaModel {
        /**
         * <p>产生该审批权限的主体 ID 列表</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;10001&quot;,&quot;group-1&quot;]</p>
         */
        @NameInMap("sourcePrincipalIds")
        public java.util.List<String> sourcePrincipalIds;

        /**
         * <p>有效审批用户 ID</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("userId")
        public Long userId;

        /**
         * <p>租户内显示名称，无法解析时为空</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("userName")
        public String userName;

        public static ReplaceKnowledgeBaseAdminsResponseBodyEffectiveApprovers build(java.util.Map<String, ?> map) throws Exception {
            ReplaceKnowledgeBaseAdminsResponseBodyEffectiveApprovers self = new ReplaceKnowledgeBaseAdminsResponseBodyEffectiveApprovers();
            return TeaModel.build(map, self);
        }

        public ReplaceKnowledgeBaseAdminsResponseBodyEffectiveApprovers setSourcePrincipalIds(java.util.List<String> sourcePrincipalIds) {
            this.sourcePrincipalIds = sourcePrincipalIds;
            return this;
        }
        public java.util.List<String> getSourcePrincipalIds() {
            return this.sourcePrincipalIds;
        }

        public ReplaceKnowledgeBaseAdminsResponseBodyEffectiveApprovers setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ReplaceKnowledgeBaseAdminsResponseBodyEffectiveApprovers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ReplaceKnowledgeBaseAdminsResponseBodyPrincipals extends TeaModel {
        /**
         * <p>是否为不可移除的创建者</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("immutable")
        public Boolean immutable;

        /**
         * <p>用户 ID 或用户组 ID</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("principalId")
        public String principalId;

        /**
         * <p>主体显示名称，无法解析时为空</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("principalName")
        public String principalName;

        /**
         * <p>主体类型：USER 或 USER_GROUP</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("principalType")
        public String principalType;

        /**
         * <p>权限来源：CREATOR 或 DIRECT</p>
         * 
         * <strong>example:</strong>
         * <p>CREATOR</p>
         */
        @NameInMap("source")
        public String source;

        public static ReplaceKnowledgeBaseAdminsResponseBodyPrincipals build(java.util.Map<String, ?> map) throws Exception {
            ReplaceKnowledgeBaseAdminsResponseBodyPrincipals self = new ReplaceKnowledgeBaseAdminsResponseBodyPrincipals();
            return TeaModel.build(map, self);
        }

        public ReplaceKnowledgeBaseAdminsResponseBodyPrincipals setImmutable(Boolean immutable) {
            this.immutable = immutable;
            return this;
        }
        public Boolean getImmutable() {
            return this.immutable;
        }

        public ReplaceKnowledgeBaseAdminsResponseBodyPrincipals setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public ReplaceKnowledgeBaseAdminsResponseBodyPrincipals setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public ReplaceKnowledgeBaseAdminsResponseBodyPrincipals setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public ReplaceKnowledgeBaseAdminsResponseBodyPrincipals setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

}
