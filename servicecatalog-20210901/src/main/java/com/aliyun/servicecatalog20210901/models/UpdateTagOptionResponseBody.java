// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateTagOptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagOptionDetail")
    public UpdateTagOptionResponseBodyTagOptionDetail tagOptionDetail;

    public static UpdateTagOptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTagOptionResponseBody self = new UpdateTagOptionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTagOptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTagOptionResponseBody setTagOptionDetail(UpdateTagOptionResponseBodyTagOptionDetail tagOptionDetail) {
        this.tagOptionDetail = tagOptionDetail;
        return this;
    }
    public UpdateTagOptionResponseBodyTagOptionDetail getTagOptionDetail() {
        return this.tagOptionDetail;
    }

    public static class UpdateTagOptionResponseBodyTagOptionDetail extends TeaModel {
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

        public static UpdateTagOptionResponseBodyTagOptionDetail build(java.util.Map<String, ?> map) throws Exception {
            UpdateTagOptionResponseBodyTagOptionDetail self = new UpdateTagOptionResponseBodyTagOptionDetail();
            return TeaModel.build(map, self);
        }

        public UpdateTagOptionResponseBodyTagOptionDetail setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public UpdateTagOptionResponseBodyTagOptionDetail setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateTagOptionResponseBodyTagOptionDetail setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public UpdateTagOptionResponseBodyTagOptionDetail setTagOptionId(String tagOptionId) {
            this.tagOptionId = tagOptionId;
            return this;
        }
        public String getTagOptionId() {
            return this.tagOptionId;
        }

        public UpdateTagOptionResponseBodyTagOptionDetail setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
