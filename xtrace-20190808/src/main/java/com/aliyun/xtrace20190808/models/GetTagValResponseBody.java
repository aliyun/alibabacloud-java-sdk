// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class GetTagValResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1E2B6A4C-6B83-4062-8B6F-AEEC1F******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tag values.</p>
     */
    @NameInMap("TagValues")
    public GetTagValResponseBodyTagValues tagValues;

    public static GetTagValResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTagValResponseBody self = new GetTagValResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTagValResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTagValResponseBody setTagValues(GetTagValResponseBodyTagValues tagValues) {
        this.tagValues = tagValues;
        return this;
    }
    public GetTagValResponseBodyTagValues getTagValues() {
        return this.tagValues;
    }

    public static class GetTagValResponseBodyTagValues extends TeaModel {
        @NameInMap("TagValue")
        public java.util.List<String> tagValue;

        public static GetTagValResponseBodyTagValues build(java.util.Map<String, ?> map) throws Exception {
            GetTagValResponseBodyTagValues self = new GetTagValResponseBodyTagValues();
            return TeaModel.build(map, self);
        }

        public GetTagValResponseBodyTagValues setTagValue(java.util.List<String> tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public java.util.List<String> getTagValue() {
            return this.tagValue;
        }

    }

}
