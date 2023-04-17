// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetTagOptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagOptionDetail")
    public GetTagOptionResponseBodyTagOptionDetail tagOptionDetail;

    public static GetTagOptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTagOptionResponseBody self = new GetTagOptionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTagOptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTagOptionResponseBody setTagOptionDetail(GetTagOptionResponseBodyTagOptionDetail tagOptionDetail) {
        this.tagOptionDetail = tagOptionDetail;
        return this;
    }
    public GetTagOptionResponseBodyTagOptionDetail getTagOptionDetail() {
        return this.tagOptionDetail;
    }

    public static class GetTagOptionResponseBodyTagOptionDetail extends TeaModel {
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

        public static GetTagOptionResponseBodyTagOptionDetail build(java.util.Map<String, ?> map) throws Exception {
            GetTagOptionResponseBodyTagOptionDetail self = new GetTagOptionResponseBodyTagOptionDetail();
            return TeaModel.build(map, self);
        }

        public GetTagOptionResponseBodyTagOptionDetail setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public GetTagOptionResponseBodyTagOptionDetail setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetTagOptionResponseBodyTagOptionDetail setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetTagOptionResponseBodyTagOptionDetail setTagOptionId(String tagOptionId) {
            this.tagOptionId = tagOptionId;
            return this;
        }
        public String getTagOptionId() {
            return this.tagOptionId;
        }

        public GetTagOptionResponseBodyTagOptionDetail setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
