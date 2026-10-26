// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryOrganizationWorkspaceListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The paginated result of the workspace list. The detailed information of the workspaces is stored in the Data response parameter.</p>
     */
    @NameInMap("Result")
    public QueryOrganizationWorkspaceListResponseBodyResult result;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request is successful.</li>
     * <li>false: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryOrganizationWorkspaceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrganizationWorkspaceListResponseBody self = new QueryOrganizationWorkspaceListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrganizationWorkspaceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrganizationWorkspaceListResponseBody setResult(QueryOrganizationWorkspaceListResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryOrganizationWorkspaceListResponseBodyResult getResult() {
        return this.result;
    }

    public QueryOrganizationWorkspaceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryOrganizationWorkspaceListResponseBodyResultDataWorkspaceExportConfig extends TeaModel {
        /**
         * <p>The image processing method when exporting to Excel with formatting. This parameter takes effect only when configured at the organization level. Valid values:</p>
         * <ul>
         * <li>false: Image fields are not converted to images.</li>
         * <li>true: Image fields are converted to images. The option is displayed on the report export page, and users must manually select it to convert to images.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowExcelImageFile")
        public Boolean allowExcelImageFile;

        /**
         * <p>Specifies whether to export data to Excel.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DataExport")
        public Boolean dataExport;

        /**
         * <p>The default export type. Valid values: true (with formatting) and false (without formatting).</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DefaultExportType")
        public Boolean defaultExportType;

        /**
         * <p>The master switch for export. If this parameter is set to false, the following configurations do not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExportMainSwitch")
        public Boolean exportMainSwitch;

        /**
         * <p>Specifies whether to export to the local device.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExportToLocal")
        public Boolean exportToLocal;

        /**
         * <p>Specifies whether to support exporting public links of the content.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExportToPublicWork")
        public Boolean exportToPublicWork;

        /**
         * <p>Specifies whether to export to the server.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExportToServer")
        public Boolean exportToServer;

        /**
         * <p>Specifies whether to export images.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ImageExport")
        public Boolean imageExport;

        /**
         * <p>Specifies whether to export to PDF.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PdfExport")
        public Boolean pdfExport;

        public static QueryOrganizationWorkspaceListResponseBodyResultDataWorkspaceExportConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryOrganizationWorkspaceListResponseBodyResultDataWorkspaceExportConfig self = new QueryOrganizationWorkspaceListResponseBodyResultDataWorkspaceExportConfig();
            return TeaModel.build(map, self);
        }

        public QueryOrganizationWorkspaceListResponseBodyResultDataWorkspaceExportConfig setAllowExcelImageFile(Boolean allowExcelImageFile) {
            this.allowExcelImageFile = allowExcelImageFile;
            return this;
        }
        public Boolean getAllowExcelImageFile() {
            return this.allowExcelImageFile;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultDataWorkspaceExportConfig setDataExport(Boolean dataExport) {
            this.dataExport = dataExport;
            return this;
        }
        public Boolean getDataExport() {
            return this.dataExport;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultDataWorkspaceExportConfig setDefaultExportType(Boolean defaultExportType) {
            this.defaultExportType = defaultExportType;
            return this;
        }
        public Boolean getDefaultExportType() {
            return this.defaultExportType;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultDataWorkspaceExportConfig setExportMainSwitch(Boolean exportMainSwitch) {
            this.exportMainSwitch = exportMainSwitch;
            return this;
        }
        public Boolean getExportMainSwitch() {
            return this.exportMainSwitch;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultDataWorkspaceExportConfig setExportToLocal(Boolean exportToLocal) {
            this.exportToLocal = exportToLocal;
            return this;
        }
        public Boolean getExportToLocal() {
            return this.exportToLocal;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultDataWorkspaceExportConfig setExportToPublicWork(Boolean exportToPublicWork) {
            this.exportToPublicWork = exportToPublicWork;
            return this;
        }
        public Boolean getExportToPublicWork() {
            return this.exportToPublicWork;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultDataWorkspaceExportConfig setExportToServer(Boolean exportToServer) {
            this.exportToServer = exportToServer;
            return this;
        }
        public Boolean getExportToServer() {
            return this.exportToServer;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultDataWorkspaceExportConfig setImageExport(Boolean imageExport) {
            this.imageExport = imageExport;
            return this;
        }
        public Boolean getImageExport() {
            return this.imageExport;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultDataWorkspaceExportConfig setPdfExport(Boolean pdfExport) {
            this.pdfExport = pdfExport;
            return this;
        }
        public Boolean getPdfExport() {
            return this.pdfExport;
        }

    }

    public static class QueryOrganizationWorkspaceListResponseBodyResultData extends TeaModel {
        /**
         * <p>Indicates whether the content can be made public. Valid values:</p>
         * <ul>
         * <li>true: Public.</li>
         * <li>false: Not public.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowPublishOperation")
        public Boolean allowPublishOperation;

        /**
         * <p>Indicates whether the content can be shared with authorization. Valid values:</p>
         * <ul>
         * <li>true: Authorized.</li>
         * <li>false: Not authorized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowShareOperation")
        public Boolean allowShareOperation;

        /**
         * <p>The time when the workspace was created. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-10 17:51:07</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The Quick BI user ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>de4bc5f9429141cc8091cdd1c15b****</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The Alibaba Cloud account name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>pop****@aliyun.com</p>
         */
        @NameInMap("CreateUserAccountName")
        public String createUserAccountName;

        /**
         * <p>The time when the workspace was last modified. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-10 17:51:07</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The Quick BI user ID of the modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>de4bc5f9429141cc8091cdd1c15b****</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The Alibaba Cloud account name of the modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>pop****@aliyun.com</p>
         */
        @NameInMap("ModifyUserAccountName")
        public String modifyUserAccountName;

        /**
         * <p>The ID of the organization to which the workspace belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>2fe4fbd8-588f-489a-b3e1-e92c7af0****</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <p>The Quick BI user ID of the workspace owner.</p>
         * 
         * <strong>example:</strong>
         * <p>de4bc5f9429141cc8091cdd1c15b****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The Alibaba Cloud account name of the workspace owner.</p>
         * 
         * <strong>example:</strong>
         * <p>pop****@aliyun.com</p>
         */
        @NameInMap("OwnerAccountName")
        public String ownerAccountName;

        /**
         * <p>The Quick BI account name of the workspace owner.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RealOwnerAccountName")
        public String realOwnerAccountName;

        /**
         * <p>The description of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>This workspace is a test workspace</p>
         */
        @NameInMap("WorkspaceDescription")
        public String workspaceDescription;

        /**
         * <p>The workspace export configuration.</p>
         */
        @NameInMap("WorkspaceExportConfig")
        public QueryOrganizationWorkspaceListResponseBodyResultDataWorkspaceExportConfig workspaceExportConfig;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7350a155-0e94-4c6c-8620-57bbec38****</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>The workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test workspace</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static QueryOrganizationWorkspaceListResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            QueryOrganizationWorkspaceListResponseBodyResultData self = new QueryOrganizationWorkspaceListResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setAllowPublishOperation(Boolean allowPublishOperation) {
            this.allowPublishOperation = allowPublishOperation;
            return this;
        }
        public Boolean getAllowPublishOperation() {
            return this.allowPublishOperation;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setAllowShareOperation(Boolean allowShareOperation) {
            this.allowShareOperation = allowShareOperation;
            return this;
        }
        public Boolean getAllowShareOperation() {
            return this.allowShareOperation;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setCreateUserAccountName(String createUserAccountName) {
            this.createUserAccountName = createUserAccountName;
            return this;
        }
        public String getCreateUserAccountName() {
            return this.createUserAccountName;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setModifyUserAccountName(String modifyUserAccountName) {
            this.modifyUserAccountName = modifyUserAccountName;
            return this;
        }
        public String getModifyUserAccountName() {
            return this.modifyUserAccountName;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setOwnerAccountName(String ownerAccountName) {
            this.ownerAccountName = ownerAccountName;
            return this;
        }
        public String getOwnerAccountName() {
            return this.ownerAccountName;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setRealOwnerAccountName(String realOwnerAccountName) {
            this.realOwnerAccountName = realOwnerAccountName;
            return this;
        }
        public String getRealOwnerAccountName() {
            return this.realOwnerAccountName;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setWorkspaceDescription(String workspaceDescription) {
            this.workspaceDescription = workspaceDescription;
            return this;
        }
        public String getWorkspaceDescription() {
            return this.workspaceDescription;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setWorkspaceExportConfig(QueryOrganizationWorkspaceListResponseBodyResultDataWorkspaceExportConfig workspaceExportConfig) {
            this.workspaceExportConfig = workspaceExportConfig;
            return this;
        }
        public QueryOrganizationWorkspaceListResponseBodyResultDataWorkspaceExportConfig getWorkspaceExportConfig() {
            return this.workspaceExportConfig;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

    public static class QueryOrganizationWorkspaceListResponseBodyResult extends TeaModel {
        /**
         * <p>The list of workspaces.</p>
         */
        @NameInMap("Data")
        public java.util.List<QueryOrganizationWorkspaceListResponseBodyResultData> data;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPages")
        public Integer totalPages;

        public static QueryOrganizationWorkspaceListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryOrganizationWorkspaceListResponseBodyResult self = new QueryOrganizationWorkspaceListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryOrganizationWorkspaceListResponseBodyResult setData(java.util.List<QueryOrganizationWorkspaceListResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryOrganizationWorkspaceListResponseBodyResultData> getData() {
            return this.data;
        }

        public QueryOrganizationWorkspaceListResponseBodyResult setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryOrganizationWorkspaceListResponseBodyResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryOrganizationWorkspaceListResponseBodyResult setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public QueryOrganizationWorkspaceListResponseBodyResult setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
