// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CheckSmsReceiptExportStatusRequest extends TeaModel {
    // 短信任务Id
    @NameInMap("MarketTaskId")
    public String marketTaskId;

    // 租户Id
    @NameInMap("AccessId")
    public String accessId;

    // 空间Id
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CheckSmsReceiptExportStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSmsReceiptExportStatusRequest self = new CheckSmsReceiptExportStatusRequest();
        return TeaModel.build(map, self);
    }

    public CheckSmsReceiptExportStatusRequest setMarketTaskId(String marketTaskId) {
        this.marketTaskId = marketTaskId;
        return this;
    }
    public String getMarketTaskId() {
        return this.marketTaskId;
    }

    public CheckSmsReceiptExportStatusRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public CheckSmsReceiptExportStatusRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
