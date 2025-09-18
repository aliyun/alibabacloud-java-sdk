// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class DescribeCommandResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>mm_xxxx</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>232423</p>
     */
    @NameInMap("CreateUserId")
    public String createUserId;

    /**
     * <strong>example:</strong>
     * <p>sdsd</p>
     */
    @NameInMap("CreateUserName")
    public String createUserName;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>56632343</p>
     */
    @NameInMap("DomainCode")
    public String domainCode;

    /**
     * <strong>example:</strong>
     * <p>xccvsd</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>57967</p>
     */
    @NameInMap("ModifyUserId")
    public String modifyUserId;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ModifyUserName")
    public String modifyUserName;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ToolExamples")
    public java.util.List<DescribeCommandResponseBodyToolExamples> toolExamples;

    /**
     * <strong>example:</strong>
     * <p>65655</p>
     */
    @NameInMap("ToolId")
    public String toolId;

    /**
     * <strong>example:</strong>
     * <p>dsf34</p>
     */
    @NameInMap("ToolName")
    public String toolName;

    @NameInMap("ToolParams")
    public java.util.List<DescribeCommandResponseBodyToolParams> toolParams;

    public static DescribeCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommandResponseBody self = new DescribeCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCommandResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeCommandResponseBody setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public String getCreateUserId() {
        return this.createUserId;
    }

    public DescribeCommandResponseBody setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }
    public String getCreateUserName() {
        return this.createUserName;
    }

    public DescribeCommandResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeCommandResponseBody setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public DescribeCommandResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeCommandResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DescribeCommandResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DescribeCommandResponseBody setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId;
        return this;
    }
    public String getModifyUserId() {
        return this.modifyUserId;
    }

    public DescribeCommandResponseBody setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
        return this;
    }
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    public DescribeCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCommandResponseBody setToolExamples(java.util.List<DescribeCommandResponseBodyToolExamples> toolExamples) {
        this.toolExamples = toolExamples;
        return this;
    }
    public java.util.List<DescribeCommandResponseBodyToolExamples> getToolExamples() {
        return this.toolExamples;
    }

    public DescribeCommandResponseBody setToolId(String toolId) {
        this.toolId = toolId;
        return this;
    }
    public String getToolId() {
        return this.toolId;
    }

    public DescribeCommandResponseBody setToolName(String toolName) {
        this.toolName = toolName;
        return this;
    }
    public String getToolName() {
        return this.toolName;
    }

    public DescribeCommandResponseBody setToolParams(java.util.List<DescribeCommandResponseBodyToolParams> toolParams) {
        this.toolParams = toolParams;
        return this;
    }
    public java.util.List<DescribeCommandResponseBodyToolParams> getToolParams() {
        return this.toolParams;
    }

    public static class DescribeCommandResponseBodyToolExamples extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Query")
        public String query;

        public static DescribeCommandResponseBodyToolExamples build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandResponseBodyToolExamples self = new DescribeCommandResponseBodyToolExamples();
            return TeaModel.build(map, self);
        }

        public DescribeCommandResponseBodyToolExamples setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class DescribeCommandResponseBodyToolParams extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ParamDesc")
        public String paramDesc;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ParamExample")
        public String paramExample;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        public static DescribeCommandResponseBodyToolParams build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandResponseBodyToolParams self = new DescribeCommandResponseBodyToolParams();
            return TeaModel.build(map, self);
        }

        public DescribeCommandResponseBodyToolParams setParamDesc(String paramDesc) {
            this.paramDesc = paramDesc;
            return this;
        }
        public String getParamDesc() {
            return this.paramDesc;
        }

        public DescribeCommandResponseBodyToolParams setParamExample(String paramExample) {
            this.paramExample = paramExample;
            return this;
        }
        public String getParamExample() {
            return this.paramExample;
        }

        public DescribeCommandResponseBodyToolParams setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

    }

}
