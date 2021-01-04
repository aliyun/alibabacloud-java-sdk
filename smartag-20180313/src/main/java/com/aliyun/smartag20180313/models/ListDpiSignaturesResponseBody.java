// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListDpiSignaturesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DpiSignature")
    public java.util.List<ListDpiSignaturesResponseBodyDpiSignature> dpiSignature;

    public static ListDpiSignaturesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDpiSignaturesResponseBody self = new ListDpiSignaturesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDpiSignaturesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListDpiSignaturesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDpiSignaturesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDpiSignaturesResponseBody setDpiSignature(java.util.List<ListDpiSignaturesResponseBodyDpiSignature> dpiSignature) {
        this.dpiSignature = dpiSignature;
        return this;
    }
    public java.util.List<ListDpiSignaturesResponseBodyDpiSignature> getDpiSignature() {
        return this.dpiSignature;
    }

    public static class ListDpiSignaturesResponseBodyDpiSignature extends TeaModel {
        @NameInMap("DpiSignatureId")
        public String dpiSignatureId;

        @NameInMap("MinSignatureDbVersion")
        public String minSignatureDbVersion;

        @NameInMap("DpiGroupId")
        public String dpiGroupId;

        @NameInMap("MinEngineVersion")
        public String minEngineVersion;

        @NameInMap("DpiSignatureName")
        public String dpiSignatureName;

        public static ListDpiSignaturesResponseBodyDpiSignature build(java.util.Map<String, ?> map) throws Exception {
            ListDpiSignaturesResponseBodyDpiSignature self = new ListDpiSignaturesResponseBodyDpiSignature();
            return TeaModel.build(map, self);
        }

        public ListDpiSignaturesResponseBodyDpiSignature setDpiSignatureId(String dpiSignatureId) {
            this.dpiSignatureId = dpiSignatureId;
            return this;
        }
        public String getDpiSignatureId() {
            return this.dpiSignatureId;
        }

        public ListDpiSignaturesResponseBodyDpiSignature setMinSignatureDbVersion(String minSignatureDbVersion) {
            this.minSignatureDbVersion = minSignatureDbVersion;
            return this;
        }
        public String getMinSignatureDbVersion() {
            return this.minSignatureDbVersion;
        }

        public ListDpiSignaturesResponseBodyDpiSignature setDpiGroupId(String dpiGroupId) {
            this.dpiGroupId = dpiGroupId;
            return this;
        }
        public String getDpiGroupId() {
            return this.dpiGroupId;
        }

        public ListDpiSignaturesResponseBodyDpiSignature setMinEngineVersion(String minEngineVersion) {
            this.minEngineVersion = minEngineVersion;
            return this;
        }
        public String getMinEngineVersion() {
            return this.minEngineVersion;
        }

        public ListDpiSignaturesResponseBodyDpiSignature setDpiSignatureName(String dpiSignatureName) {
            this.dpiSignatureName = dpiSignatureName;
            return this;
        }
        public String getDpiSignatureName() {
            return this.dpiSignatureName;
        }

    }

}
