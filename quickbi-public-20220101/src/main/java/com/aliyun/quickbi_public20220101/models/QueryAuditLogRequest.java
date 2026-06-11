// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryAuditLogRequest extends TeaModel {
    /**
     * <p>The access source. Valid values:</p>
     * <ul>
     * <li><p>COMMON: standard access</p>
     * </li>
     * <li><p>IMBEDDED: embedded report</p>
     * </li>
     * <li><p>PUBLIC: public report</p>
     * </li>
     * <li><p>IMBEDDED_COMPONENT: embedded card</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("AccessSourceFlag")
    public String accessSourceFlag;

    /**
     * <p>The end date for the query. Use the yyyyMMdd format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20240604</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The log type. Valid values:</p>
     * <ul>
     * <li><p>dataView: access logs</p>
     * </li>
     * <li><p>function: operation logs</p>
     * </li>
     * <li><p>permission: permission logs</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>function</p>
     */
    @NameInMap("LogType")
    public String logType;

    /**
     * <p>The user ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>95296e95-ca89-4c7d-8af9-dedf0ad0***</p>
     */
    @NameInMap("OperatorId")
    public String operatorId;

    /**
     * <p>The permission, access, or operation type. If left empty, all types are queried by default.</p>
     * <p>For valid values, see audit log codes. To specify multiple types, separate them with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>MODIFY</p>
     */
    @NameInMap("OperatorTypes")
    public String operatorTypes;

    /**
     * <p>The resource type. For more information, see work types.</p>
     * 
     * <strong>example:</strong>
     * <p>cube</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The start date for the query. Use the yyyyMMdd format. The date cannot be more than 90 days before the current date.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20240504</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The device used for access. Valid values:</p>
     * <ul>
     * <li><p>MOBILE: mobile device</p>
     * </li>
     * <li><p>PC: PC</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PC</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("UserAccessDevice")
    public String userAccessDevice;

    /**
     * <p>The ID of the workspace that contains the logs to query.</p>
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

    public QueryAuditLogRequest setAccessSourceFlag(String accessSourceFlag) {
        this.accessSourceFlag = accessSourceFlag;
        return this;
    }
    public String getAccessSourceFlag() {
        return this.accessSourceFlag;
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

    public QueryAuditLogRequest setUserAccessDevice(String userAccessDevice) {
        this.userAccessDevice = userAccessDevice;
        return this;
    }
    public String getUserAccessDevice() {
        return this.userAccessDevice;
    }

    public QueryAuditLogRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
