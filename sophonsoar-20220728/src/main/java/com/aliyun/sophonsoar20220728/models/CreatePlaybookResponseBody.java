// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class CreatePlaybookResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public CreatePlaybookResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B09B40B2-F11E-512C-B755-423F2056C17B</p>
     */
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
        /**
         * <p>The UUID of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>9e38111e-9794-4784-9ca8-xxxxxxx</p>
         */
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
