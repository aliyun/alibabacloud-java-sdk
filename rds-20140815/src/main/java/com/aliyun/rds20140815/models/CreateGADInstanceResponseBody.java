// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateGADInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateGADInstanceResponseBodyResult result;

    public static CreateGADInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGADInstanceResponseBody self = new CreateGADInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGADInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGADInstanceResponseBody setResult(CreateGADInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateGADInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateGADInstanceResponseBodyResult extends TeaModel {
        @NameInMap("CreateMemberCount")
        public String createMemberCount;

        @NameInMap("GadInstanceName")
        public String gadInstanceName;

        @NameInMap("TaskID")
        public String taskID;

        public static CreateGADInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateGADInstanceResponseBodyResult self = new CreateGADInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateGADInstanceResponseBodyResult setCreateMemberCount(String createMemberCount) {
            this.createMemberCount = createMemberCount;
            return this;
        }
        public String getCreateMemberCount() {
            return this.createMemberCount;
        }

        public CreateGADInstanceResponseBodyResult setGadInstanceName(String gadInstanceName) {
            this.gadInstanceName = gadInstanceName;
            return this;
        }
        public String getGadInstanceName() {
            return this.gadInstanceName;
        }

        public CreateGADInstanceResponseBodyResult setTaskID(String taskID) {
            this.taskID = taskID;
            return this;
        }
        public String getTaskID() {
            return this.taskID;
        }

    }

}
