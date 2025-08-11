// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryReadableResourcesListByUserIdV2Request extends TeaModel {
    /**
     * <p>User ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asdas*********sdsddf</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>Work type. Possible values:</p>
     * <ul>
     * <li>DATAPRODUCT: Data Portal</li>
     * <li>PAGE: Dashboard</li>
     * <li>REPORT: Spreadsheet</li>
     * <li>dashboardOfflineQuery: Self-service Data Extraction</li>
     * <li>SCREEN: Data Wall</li>
     * <li>DATAFORM: Data Entry</li>
     * <li>ANALYSIS: Ad-hoc Analysis</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DATAFORM</p>
     */
    @NameInMap("WorkType")
    public String workType;

    /**
     * <p>Workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryReadableResourcesListByUserIdV2Request build(java.util.Map<String, ?> map) throws Exception {
        QueryReadableResourcesListByUserIdV2Request self = new QueryReadableResourcesListByUserIdV2Request();
        return TeaModel.build(map, self);
    }

    public QueryReadableResourcesListByUserIdV2Request setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryReadableResourcesListByUserIdV2Request setWorkType(String workType) {
        this.workType = workType;
        return this;
    }
    public String getWorkType() {
        return this.workType;
    }

    public QueryReadableResourcesListByUserIdV2Request setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
