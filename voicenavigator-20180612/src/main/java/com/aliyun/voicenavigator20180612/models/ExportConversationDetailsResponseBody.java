// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ExportConversationDetailsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6203fc87271a420c98eab6c2bbc2d856</p>
     */
    @NameInMap("ExportTaskId")
    public String exportTaskId;

    /**
     * <strong>example:</strong>
     * <p>75BAAB9B-40B2-5FF5-A59A-7BCF8154C6EE</p>
     */
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
