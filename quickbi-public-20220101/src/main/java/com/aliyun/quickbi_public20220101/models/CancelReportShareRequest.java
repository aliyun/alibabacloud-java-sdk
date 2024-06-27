// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CancelReportShareRequest extends TeaModel {
    /**
     * <p>The ID of the work. The works here include BI portal, dashboards, spreadsheets, and self-service access.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6b407e50-e774-406b-9956-da2425c2****</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    /**
     * <p>The ID of the person to be shared, which may be the user ID of the Quick BI or the user group ID.</p>
     * <ul>
     * <li>If ShareToType is 0 (user), ShareTo is the user ID.</li>
     * <li>When ShareToType is set to 1 (user group), ShareTo is the user group ID.</li>
     * <li>When ShareToType=2 (organization), ShareTo is the ID of the organization.</li>
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
     * <li>0: Delete by user</li>
     * <li>1: Delete by user group</li>
     * <li>2: Delete by organization</li>
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
