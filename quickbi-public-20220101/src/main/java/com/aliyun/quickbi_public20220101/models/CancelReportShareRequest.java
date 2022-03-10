// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CancelReportShareRequest extends TeaModel {
    @NameInMap("ReportId")
    public String reportId;

    @NameInMap("ShareToIds")
    public String shareToIds;

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
