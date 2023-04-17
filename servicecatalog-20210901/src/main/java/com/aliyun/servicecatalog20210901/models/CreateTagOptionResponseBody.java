// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateTagOptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagOptionDetail")
    public CreateTagOptionResponseBodyTagOptionDetail tagOptionDetail;

    public static CreateTagOptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTagOptionResponseBody self = new CreateTagOptionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTagOptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTagOptionResponseBody setTagOptionDetail(CreateTagOptionResponseBodyTagOptionDetail tagOptionDetail) {
        this.tagOptionDetail = tagOptionDetail;
        return this;
    }
    public CreateTagOptionResponseBodyTagOptionDetail getTagOptionDetail() {
        return this.tagOptionDetail;
    }

    public static class CreateTagOptionResponseBodyTagOptionDetail extends TeaModel {
        @NameInMap("Active")
        public Boolean active;

        @NameInMap("Key")
        public String key;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("TagOptionId")
        public String tagOptionId;

        @NameInMap("Value")
        public String value;

        public static CreateTagOptionResponseBodyTagOptionDetail build(java.util.Map<String, ?> map) throws Exception {
            CreateTagOptionResponseBodyTagOptionDetail self = new CreateTagOptionResponseBodyTagOptionDetail();
            return TeaModel.build(map, self);
        }

        public CreateTagOptionResponseBodyTagOptionDetail setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public CreateTagOptionResponseBodyTagOptionDetail setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTagOptionResponseBodyTagOptionDetail setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public CreateTagOptionResponseBodyTagOptionDetail setTagOptionId(String tagOptionId) {
            this.tagOptionId = tagOptionId;
            return this;
        }
        public String getTagOptionId() {
            return this.tagOptionId;
        }

        public CreateTagOptionResponseBodyTagOptionDetail setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
