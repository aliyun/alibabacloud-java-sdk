// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksByWorkspaceRequest extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * <ul>
     * <li>Default value: 1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries returned per page.</p>
     * <ul>
     * <li>Default value: 10.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the work. Valid values:</p>
     * <ul>
     * <li>0: unpublished</li>
     * <li>1: published</li>
     * <li>2: modified but not published</li>
     * <li>3: unpublished</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>Third-party embedding status. Valid values:</p>
     * <ul>
     * <li>0: The embed service is not enabled.</li>
     * <li>1: Embed is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ThirdPartAuthFlag")
    public Integer thirdPartAuthFlag;

    /**
     * <p>The type of the work. Valid values:</p>
     * <ul>
     * <li>DATAPRODUCT: BI portal</li>
     * <li>PAGE: Dashboard</li>
     * <li>FULLPAGE: full-screen dashboards</li>
     * <li>REPORT: workbook</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PAGE</p>
     */
    @NameInMap("WorksType")
    public String worksType;

    /**
     * <p>The ID of the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>89713491-cb4f-4579-b889-e82c35f1****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryWorksByWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWorksByWorkspaceRequest self = new QueryWorksByWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public QueryWorksByWorkspaceRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryWorksByWorkspaceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryWorksByWorkspaceRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryWorksByWorkspaceRequest setThirdPartAuthFlag(Integer thirdPartAuthFlag) {
        this.thirdPartAuthFlag = thirdPartAuthFlag;
        return this;
    }
    public Integer getThirdPartAuthFlag() {
        return this.thirdPartAuthFlag;
    }

    public QueryWorksByWorkspaceRequest setWorksType(String worksType) {
        this.worksType = worksType;
        return this;
    }
    public String getWorksType() {
        return this.worksType;
    }

    public QueryWorksByWorkspaceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
