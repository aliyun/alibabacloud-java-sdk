// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryAuditLogRequest extends TeaModel {
    /**
     * <p>The access source. Valid values:</p>
     * <ul>
     * <li>COMMON: Regular access.</li>
     * <li>IMBEDDED: Embedded report.</li>
     * <li>PUBLIC: Public report.</li>
     * <li>IMBEDDED_COMPONENT: Embedded card.</li>
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
     * <p>The end date of the query. Format: yyyyMMdd.</p>
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
     * <li>dataView: Access.</li>
     * <li>function: Operation.</li>
     * <li>permission: Permission.</li>
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
     * <p>The permission, access, or operation type. If this parameter is left empty, all types are queried by default. For more information, see the audit log code values. Separate multiple values with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>MODIFY</p>
     */
    @NameInMap("OperatorTypes")
    public String operatorTypes;

    /**
     * <p>The resource type. For more information, see the asset type.</p>
     * 
     * <strong>example:</strong>
     * <p>cube</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The start date of the query. Format: yyyyMMdd. The date cannot be more than 90 days before the current date.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20240504</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The access device. Valid values:</p>
     * <ul>
     * <li>MOBILE: Mobile client.</li>
     * <li>PC: PC client.</li>
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
     * <p>The ID of the workspace to which the logs to be queried belong.</p>
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
