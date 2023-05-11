// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CancelReportShareRequest extends TeaModel {
    /**
     * <p>The ID of the work. The works here include BI portal, dashboards, spreadsheets, and self-service access.</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    /**
     * <p>The ID of the person to be shared, which may be the user ID of the Quick BI or the user group ID.</p>
     * <br>
     * <p>*   If ShareToType is 0 (user), ShareTo is the user ID.</p>
     * <p>*   When ShareToType is set to 1 (user group), ShareTo is the user group ID.</p>
     * <p>*   When ShareToType=2 (organization), ShareTo is the ID of the organization.</p>
     */
    @NameInMap("ShareToIds")
    public String shareToIds;

    /**
     * <p>The deletion method. Valid values:</p>
     * <br>
     * <p>*   0: Delete by user</p>
     * <p>*   1: Delete by user group</p>
     * <p>*   2: Delete by organization</p>
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
