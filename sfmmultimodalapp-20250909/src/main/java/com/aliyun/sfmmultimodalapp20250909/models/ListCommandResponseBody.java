// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class ListCommandResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ToolInfoList")
    public java.util.List<ListCommandResponseBodyToolInfoList> toolInfoList;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCommandResponseBody self = new ListCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCommandResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCommandResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCommandResponseBody setToolInfoList(java.util.List<ListCommandResponseBodyToolInfoList> toolInfoList) {
        this.toolInfoList = toolInfoList;
        return this;
    }
    public java.util.List<ListCommandResponseBodyToolInfoList> getToolInfoList() {
        return this.toolInfoList;
    }

    public ListCommandResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCommandResponseBodyToolInfoListToolExamples extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Query")
        public String query;

        public static ListCommandResponseBodyToolInfoListToolExamples build(java.util.Map<String, ?> map) throws Exception {
            ListCommandResponseBodyToolInfoListToolExamples self = new ListCommandResponseBodyToolInfoListToolExamples();
            return TeaModel.build(map, self);
        }

        public ListCommandResponseBodyToolInfoListToolExamples setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class ListCommandResponseBodyToolInfoListToolParams extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ParamDesc")
        public String paramDesc;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("ParamExample")
        public String paramExample;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        public static ListCommandResponseBodyToolInfoListToolParams build(java.util.Map<String, ?> map) throws Exception {
            ListCommandResponseBodyToolInfoListToolParams self = new ListCommandResponseBodyToolInfoListToolParams();
            return TeaModel.build(map, self);
        }

        public ListCommandResponseBodyToolInfoListToolParams setParamDesc(String paramDesc) {
            this.paramDesc = paramDesc;
            return this;
        }
        public String getParamDesc() {
            return this.paramDesc;
        }

        public ListCommandResponseBodyToolInfoListToolParams setParamExample(String paramExample) {
            this.paramExample = paramExample;
            return this;
        }
        public String getParamExample() {
            return this.paramExample;
        }

        public ListCommandResponseBodyToolInfoListToolParams setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

    }

    public static class ListCommandResponseBodyToolInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>mm-xxx</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>676776778678</p>
         */
        @NameInMap("CreateUserId")
        public String createUserId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CreateUserName")
        public String createUserName;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>44574578797</p>
         */
        @NameInMap("DomainCode")
        public String domainCode;

        /**
         * <strong>example:</strong>
         * <p>xxh_xx</p>
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
         * <p>xxxx</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>2334346345</p>
         */
        @NameInMap("ModifyUserId")
        public String modifyUserId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ModifyUserName")
        public String modifyUserName;

        @NameInMap("ToolExamples")
        public java.util.List<ListCommandResponseBodyToolInfoListToolExamples> toolExamples;

        /**
         * <strong>example:</strong>
         * <p>6734396796</p>
         */
        @NameInMap("ToolId")
        public String toolId;

        /**
         * <strong>example:</strong>
         * <p>sxxxx</p>
         */
        @NameInMap("ToolName")
        public String toolName;

        @NameInMap("ToolParams")
        public java.util.List<ListCommandResponseBodyToolInfoListToolParams> toolParams;

        public static ListCommandResponseBodyToolInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListCommandResponseBodyToolInfoList self = new ListCommandResponseBodyToolInfoList();
            return TeaModel.build(map, self);
        }

        public ListCommandResponseBodyToolInfoList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListCommandResponseBodyToolInfoList setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListCommandResponseBodyToolInfoList setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public ListCommandResponseBodyToolInfoList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCommandResponseBodyToolInfoList setDomainCode(String domainCode) {
            this.domainCode = domainCode;
            return this;
        }
        public String getDomainCode() {
            return this.domainCode;
        }

        public ListCommandResponseBodyToolInfoList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListCommandResponseBodyToolInfoList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListCommandResponseBodyToolInfoList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListCommandResponseBodyToolInfoList setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        public ListCommandResponseBodyToolInfoList setModifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        public ListCommandResponseBodyToolInfoList setToolExamples(java.util.List<ListCommandResponseBodyToolInfoListToolExamples> toolExamples) {
            this.toolExamples = toolExamples;
            return this;
        }
        public java.util.List<ListCommandResponseBodyToolInfoListToolExamples> getToolExamples() {
            return this.toolExamples;
        }

        public ListCommandResponseBodyToolInfoList setToolId(String toolId) {
            this.toolId = toolId;
            return this;
        }
        public String getToolId() {
            return this.toolId;
        }

        public ListCommandResponseBodyToolInfoList setToolName(String toolName) {
            this.toolName = toolName;
            return this;
        }
        public String getToolName() {
            return this.toolName;
        }

        public ListCommandResponseBodyToolInfoList setToolParams(java.util.List<ListCommandResponseBodyToolInfoListToolParams> toolParams) {
            this.toolParams = toolParams;
            return this;
        }
        public java.util.List<ListCommandResponseBodyToolInfoListToolParams> getToolParams() {
            return this.toolParams;
        }

    }

}
