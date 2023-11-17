// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class CreatePlaybookResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreatePlaybookResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreatePlaybookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePlaybookResponseBody self = new CreatePlaybookResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePlaybookResponseBody setData(CreatePlaybookResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePlaybookResponseBodyData getData() {
        return this.data;
    }

    public CreatePlaybookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePlaybookResponseBodyData extends TeaModel {
        @NameInMap("PlaybookUuid")
        public String playbookUuid;

        public static CreatePlaybookResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePlaybookResponseBodyData self = new CreatePlaybookResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePlaybookResponseBodyData setPlaybookUuid(String playbookUuid) {
            this.playbookUuid = playbookUuid;
            return this;
        }
        public String getPlaybookUuid() {
            return this.playbookUuid;
        }

    }

}
