// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CancelReportShareRequest extends TeaModel {
    /**
     * <p>The ID of the data work. Data works include data portals, dashboards, workbooks, and ad hoc queries.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6b407e50-e774-406b-9956-da2425c2****</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    /**
     * <p>The ID of the sharee. It can be a Quick BI user ID or a user group ID.</p>
     * <ul>
     * <li>If ShareToType is set to 0 (user), the value is the user ID.</li>
     * <li>If ShareToType is set to 1 (user group), the value is the user group ID.</li>
     * <li>If ShareToType is set to 2 (organization), the value is the organization ID.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de4bc5f9429141cc8091cdd1c15b****</p>
     */
    @NameInMap("ShareToIds")
    public String shareToIds;

    /**
     * <p>The deletion method. Valid values:</p>
     * <ul>
     * <li>0: Delete by user.</li>
     * <li>1: Delete by user group.</li>
     * <li>2: Delete by organization.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ShareToType")
    public Integer shareToType;

    public static CancelReportShareRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelReportShareRequest self = new CancelReportShareRequest();
        return TeaModel.build(map, self);
    }

    public CancelReportShareRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public CancelReportShareRequest setShareToIds(String shareToIds) {
        this.shareToIds = shareToIds;
        return this;
    }
    public String getShareToIds() {
        return this.shareToIds;
    }

    public CancelReportShareRequest setShareToType(Integer shareToType) {
        this.shareToType = shareToType;
        return this;
    }
    public Integer getShareToType() {
        return this.shareToType;
    }

}
