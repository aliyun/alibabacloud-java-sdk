// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryAuditLogRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1715856218001</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>function</p>
     */
    @NameInMap("LogType")
    public String logType;

    /**
     * <strong>example:</strong>
     * <p>95296e95-ca89-4c7d-8af9-dedf0ad0***</p>
     */
    @NameInMap("OperatorId")
    public String operatorId;

    /**
     * <strong>example:</strong>
     * <p>MODIFY</p>
     */
    @NameInMap("OperatorTypes")
    public String operatorTypes;

    /**
     * <strong>example:</strong>
     * <p>cube</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1715856218001</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <strong>example:</strong>
     * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryAuditLogRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuditLogRequest self = new QueryAuditLogRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuditLogRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryAuditLogRequest setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public QueryAuditLogRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public QueryAuditLogRequest setOperatorTypes(String operatorTypes) {
        this.operatorTypes = operatorTypes;
        return this;
    }
    public String getOperatorTypes() {
        return this.operatorTypes;
    }

    public QueryAuditLogRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public QueryAuditLogRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryAuditLogRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
