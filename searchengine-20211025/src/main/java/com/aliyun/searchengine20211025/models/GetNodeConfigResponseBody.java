// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetNodeConfigResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<GetNodeConfigResponseBodyResult> result;

    public static GetNodeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeConfigResponseBody self = new GetNodeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodeConfigResponseBody setResult(java.util.List<GetNodeConfigResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetNodeConfigResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetNodeConfigResponseBodyResult extends TeaModel {
        @NameInMap("dataDuplicateNumber")
        public Long dataDuplicateNumber;

        @NameInMap("dataFragmentNumber")
        public Long dataFragmentNumber;

        @NameInMap("minServicePercent")
        public Long minServicePercent;

        @NameInMap("published")
        public Boolean published;

        public static GetNodeConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetNodeConfigResponseBodyResult self = new GetNodeConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetNodeConfigResponseBodyResult setDataDuplicateNumber(Long dataDuplicateNumber) {
            this.dataDuplicateNumber = dataDuplicateNumber;
            return this;
        }
        public Long getDataDuplicateNumber() {
            return this.dataDuplicateNumber;
        }

        public GetNodeConfigResponseBodyResult setDataFragmentNumber(Long dataFragmentNumber) {
            this.dataFragmentNumber = dataFragmentNumber;
            return this;
        }
        public Long getDataFragmentNumber() {
            return this.dataFragmentNumber;
        }

        public GetNodeConfigResponseBodyResult setMinServicePercent(Long minServicePercent) {
            this.minServicePercent = minServicePercent;
            return this;
        }
        public Long getMinServicePercent() {
            return this.minServicePercent;
        }

        public GetNodeConfigResponseBodyResult setPublished(Boolean published) {
            this.published = published;
            return this;
        }
        public Boolean getPublished() {
            return this.published;
        }

    }

}
