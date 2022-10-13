// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ExportConversationDetailsResponseBody extends TeaModel {
    @NameInMap("ExportTaskId")
    public String exportTaskId;

    @NameInMap("RequestId")
    public String requestId;

    public static ExportConversationDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportConversationDetailsResponseBody self = new ExportConversationDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportConversationDetailsResponseBody setExportTaskId(String exportTaskId) {
        this.exportTaskId = exportTaskId;
        return this;
    }
    public String getExportTaskId() {
        return this.exportTaskId;
    }

    public ExportConversationDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
