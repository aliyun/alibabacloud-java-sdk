// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyConferenceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConferenceId")
    public String conferenceId;

    public static ModifyConferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyConferenceResponseBody self = new ModifyConferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyConferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyConferenceResponseBody setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

}
