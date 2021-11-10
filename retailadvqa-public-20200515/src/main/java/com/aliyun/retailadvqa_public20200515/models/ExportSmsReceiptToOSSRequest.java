// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ExportSmsReceiptToOSSRequest extends TeaModel {
    // 租户Id
    @NameInMap("AccessId")
    public String accessId;

    // 短信任务Id
    @NameInMap("MarketTaskId")
    public String marketTaskId;

    // 空间id
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ExportSmsReceiptToOSSRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportSmsReceiptToOSSRequest self = new ExportSmsReceiptToOSSRequest();
        return TeaModel.build(map, self);
    }

    public ExportSmsReceiptToOSSRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public ExportSmsReceiptToOSSRequest setMarketTaskId(String marketTaskId) {
        this.marketTaskId = marketTaskId;
        return this;
    }
    public String getMarketTaskId() {
        return this.marketTaskId;
    }

    public ExportSmsReceiptToOSSRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
