// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateTagOptionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0FEEF92D-4052-5202-87D0-3D8EC16F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the tag option.</p>
     */
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
         * <p>The key must be 1 to 128 characters in length. It cannot contain <code>http://</code> or <code>https://</code> and cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
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
         * <p>tag-bp1u6mdf3d****</p>
         */
        @NameInMap("TagOptionId")
        public String tagOptionId;

        /**
         * <p>The value of the tag option.</p>
         * <p>The value must be 1 to 128 characters in length. It cannot contain <code>http://</code> or <code>https://</code> and cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
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
