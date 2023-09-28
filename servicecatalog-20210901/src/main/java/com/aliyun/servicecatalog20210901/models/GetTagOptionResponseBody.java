// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetTagOptionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the tag option.</p>
     */
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
        /**
         * <p>Indicates whether the tag option is enabled. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("Active")
        public Boolean active;

        /**
         * <p>The key of the tag option.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The ID of the Alibaba Cloud account to which the tag option belongs.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the tag option.</p>
         */
        @NameInMap("TagOptionId")
        public String tagOptionId;

        /**
         * <p>The value of the tag option.</p>
         */
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
