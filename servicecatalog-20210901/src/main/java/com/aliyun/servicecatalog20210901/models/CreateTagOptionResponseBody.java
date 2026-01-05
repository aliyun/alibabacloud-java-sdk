// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateTagOptionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A48A5F12-6098-54A1-A389-6834AF27****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the details of the tag option.</p>
     */
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
        /**
         * <p>Indicates whether the tag option is enabled. Valid values:</p>
         * <ul>
         * <li>true (default)</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Active")
        public Boolean active;

        /**
         * <p>The key of the tag option.</p>
         * <p>The key must be 1 to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The ID of the Alibaba Cloud account to which the tag option belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>133413081827****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the tag option.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-bp1r3mxq3t****</p>
         */
        @NameInMap("TagOptionId")
        public String tagOptionId;

        /**
         * <p>The value of the tag option.</p>
         * <p>The value must be 1 to 128 characters in length. It cannot start with <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
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
