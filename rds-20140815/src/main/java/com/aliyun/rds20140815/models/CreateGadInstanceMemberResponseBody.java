// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateGadInstanceMemberResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the information returned.</p>
     */
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
        /**
         * <p>The number of unit nodes that are created by calling this operation.</p>
         */
        @NameInMap("CreateCount")
        public String createCount;

        /**
         * <p>The ID of the global active database cluster.</p>
         */
        @NameInMap("GadInstanceName")
        public String gadInstanceName;

        public static CreateGadInstanceMemberResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateGadInstanceMemberResponseBodyResult self = new CreateGadInstanceMemberResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateGadInstanceMemberResponseBodyResult setCreateCount(String createCount) {
            this.createCount = createCount;
            return this;
        }
        public String getCreateCount() {
            return this.createCount;
        }

        public CreateGadInstanceMemberResponseBodyResult setGadInstanceName(String gadInstanceName) {
            this.gadInstanceName = gadInstanceName;
            return this;
        }
        public String getGadInstanceName() {
            return this.gadInstanceName;
        }

    }

}
