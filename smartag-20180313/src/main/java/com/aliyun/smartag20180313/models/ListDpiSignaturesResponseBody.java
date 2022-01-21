// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListDpiSignaturesResponseBody extends TeaModel {
    @NameInMap("DpiSignature")
    public java.util.List<ListDpiSignaturesResponseBodyDpiSignature> dpiSignature;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDpiSignaturesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDpiSignaturesResponseBody self = new ListDpiSignaturesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDpiSignaturesResponseBody setDpiSignature(java.util.List<ListDpiSignaturesResponseBodyDpiSignature> dpiSignature) {
        this.dpiSignature = dpiSignature;
        return this;
    }
    public java.util.List<ListDpiSignaturesResponseBodyDpiSignature> getDpiSignature() {
        return this.dpiSignature;
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

    public ListDpiSignaturesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDpiSignaturesResponseBodyDpiSignature extends TeaModel {
        @NameInMap("DpiGroupId")
        public String dpiGroupId;

        @NameInMap("DpiSignatureId")
        public String dpiSignatureId;

        @NameInMap("DpiSignatureName")
        public String dpiSignatureName;

        @NameInMap("MinEngineVersion")
        public String minEngineVersion;

        @NameInMap("MinSignatureDbVersion")
        public String minSignatureDbVersion;

        public static ListDpiSignaturesResponseBodyDpiSignature build(java.util.Map<String, ?> map) throws Exception {
            ListDpiSignaturesResponseBodyDpiSignature self = new ListDpiSignaturesResponseBodyDpiSignature();
            return TeaModel.build(map, self);
        }

        public ListDpiSignaturesResponseBodyDpiSignature setDpiGroupId(String dpiGroupId) {
            this.dpiGroupId = dpiGroupId;
            return this;
        }
        public String getDpiGroupId() {
            return this.dpiGroupId;
        }

        public ListDpiSignaturesResponseBodyDpiSignature setDpiSignatureId(String dpiSignatureId) {
            this.dpiSignatureId = dpiSignatureId;
            return this;
        }
        public String getDpiSignatureId() {
            return this.dpiSignatureId;
        }

        public ListDpiSignaturesResponseBodyDpiSignature setDpiSignatureName(String dpiSignatureName) {
            this.dpiSignatureName = dpiSignatureName;
            return this;
        }
        public String getDpiSignatureName() {
            return this.dpiSignatureName;
        }

        public ListDpiSignaturesResponseBodyDpiSignature setMinEngineVersion(String minEngineVersion) {
            this.minEngineVersion = minEngineVersion;
            return this;
        }
        public String getMinEngineVersion() {
            return this.minEngineVersion;
        }

        public ListDpiSignaturesResponseBodyDpiSignature setMinSignatureDbVersion(String minSignatureDbVersion) {
            this.minSignatureDbVersion = minSignatureDbVersion;
            return this;
        }
        public String getMinSignatureDbVersion() {
            return this.minSignatureDbVersion;
        }

    }

}
