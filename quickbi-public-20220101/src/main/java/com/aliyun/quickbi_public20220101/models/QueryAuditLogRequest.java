// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryAuditLogRequest extends TeaModel {
    /**
     * <p>End date of the query, format (&quot;yyyyMMdd&quot;).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20240604</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>Log type:</p>
     * <ul>
     * <li>dataView - Access</li>
     * <li>function - Operation</li>
     * <li>permission - Permission</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>function</p>
     */
    @NameInMap("LogType")
    public String logType;

    /**
     * <p>Operator\&quot;s user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>95296e95-ca89-4c7d-8af9-dedf0ad0***</p>
     */
    @NameInMap("OperatorId")
    public String operatorId;

    /**
     * <p>Permission/Access/Operation type, empty - default all;</p>
     * <p>Refer to the audit log code values, send multiple values separated by English commas.</p>
     * 
     * <strong>example:</strong>
     * <p>MODIFY</p>
     */
    @NameInMap("OperatorTypes")
    public String operatorTypes;

    /**
     * <p>Resource type, refer to the work type.</p>
     * 
     * <strong>example:</strong>
     * <p>cube</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>Start date of the query, format (&quot;yyyyMMdd&quot;), cannot be earlier than 90 days from the current time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20240504</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>Workspace ID, the ID of the workspace to which the logs to be queried belong.</p>
     * 
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
