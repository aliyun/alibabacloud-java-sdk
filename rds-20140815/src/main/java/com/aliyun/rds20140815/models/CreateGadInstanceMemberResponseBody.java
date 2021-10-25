// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateGadInstanceMemberResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateGadInstanceMemberResponseBodyResult result;

    public static CreateGadInstanceMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGadInstanceMemberResponseBody self = new CreateGadInstanceMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGadInstanceMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGadInstanceMemberResponseBody setResult(CreateGadInstanceMemberResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateGadInstanceMemberResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateGadInstanceMemberResponseBodyResult extends TeaModel {
        @NameInMap("GadInstanceName")
        public String gadInstanceName;

        @NameInMap("CreateCount")
        public String createCount;

        public static CreateGadInstanceMemberResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateGadInstanceMemberResponseBodyResult self = new CreateGadInstanceMemberResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateGadInstanceMemberResponseBodyResult setGadInstanceName(String gadInstanceName) {
            this.gadInstanceName = gadInstanceName;
            return this;
        }
        public String getGadInstanceName() {
            return this.gadInstanceName;
        }

        public CreateGadInstanceMemberResponseBodyResult setCreateCount(String createCount) {
            this.createCount = createCount;
            return this;
        }
        public String getCreateCount() {
            return this.createCount;
        }

    }

}
