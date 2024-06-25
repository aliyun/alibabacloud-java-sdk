// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class GetTagKeyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1E2B6A4C-6B83-4062-8B6F-AEEC1F******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tag keys.</p>
     */
    @NameInMap("TagKeys")
    public GetTagKeyResponseBodyTagKeys tagKeys;

    public static GetTagKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTagKeyResponseBody self = new GetTagKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTagKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTagKeyResponseBody setTagKeys(GetTagKeyResponseBodyTagKeys tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public GetTagKeyResponseBodyTagKeys getTagKeys() {
        return this.tagKeys;
    }

    public static class GetTagKeyResponseBodyTagKeys extends TeaModel {
        @NameInMap("TagKey")
        public java.util.List<String> tagKey;

        public static GetTagKeyResponseBodyTagKeys build(java.util.Map<String, ?> map) throws Exception {
            GetTagKeyResponseBodyTagKeys self = new GetTagKeyResponseBodyTagKeys();
            return TeaModel.build(map, self);
        }

        public GetTagKeyResponseBodyTagKeys setTagKey(java.util.List<String> tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public java.util.List<String> getTagKey() {
            return this.tagKey;
        }

    }

}
