// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class FilterUnavailableCodesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public FilterUnavailableCodesResponseBodyData data;

    public static FilterUnavailableCodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FilterUnavailableCodesResponseBody self = new FilterUnavailableCodesResponseBody();
        return TeaModel.build(map, self);
    }

    public FilterUnavailableCodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FilterUnavailableCodesResponseBody setData(FilterUnavailableCodesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FilterUnavailableCodesResponseBodyData getData() {
        return this.data;
    }

    public static class FilterUnavailableCodesResponseBodyData extends TeaModel {
        @NameInMap("Codes")
        public java.util.List<String> codes;

        public static FilterUnavailableCodesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FilterUnavailableCodesResponseBodyData self = new FilterUnavailableCodesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FilterUnavailableCodesResponseBodyData setCodes(java.util.List<String> codes) {
            this.codes = codes;
            return this;
        }
        public java.util.List<String> getCodes() {
            return this.codes;
        }

    }

}
