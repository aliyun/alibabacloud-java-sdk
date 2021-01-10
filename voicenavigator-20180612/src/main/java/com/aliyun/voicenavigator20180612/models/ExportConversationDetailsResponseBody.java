// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ExportConversationDetailsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ExportTaskId")
    public String exportTaskId;

    public static ExportConversationDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportConversationDetailsResponseBody self = new ExportConversationDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportConversationDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportConversationDetailsResponseBody setExportTaskId(String exportTaskId) {
        this.exportTaskId = exportTaskId;
        return this;
    }
    public String getExportTaskId() {
        return this.exportTaskId;
    }

}
