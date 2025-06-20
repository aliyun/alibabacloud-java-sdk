// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class CreateMaYiBlockResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public CreateMaYiBlockResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateMaYiBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMaYiBlockResponseBody self = new CreateMaYiBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMaYiBlockResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateMaYiBlockResponseBody setData(CreateMaYiBlockResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateMaYiBlockResponseBodyData getData() {
        return this.data;
    }

    public CreateMaYiBlockResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMaYiBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMaYiBlockResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateMaYiBlockResponseBodyData extends TeaModel {
        @NameInMap("BlockId")
        public Long blockId;

        @NameInMap("BlockUrl")
        public String blockUrl;

        public static CreateMaYiBlockResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateMaYiBlockResponseBodyData self = new CreateMaYiBlockResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateMaYiBlockResponseBodyData setBlockId(Long blockId) {
            this.blockId = blockId;
            return this;
        }
        public Long getBlockId() {
            return this.blockId;
        }

        public CreateMaYiBlockResponseBodyData setBlockUrl(String blockUrl) {
            this.blockUrl = blockUrl;
            return this;
        }
        public String getBlockUrl() {
            return this.blockUrl;
        }

    }

}
