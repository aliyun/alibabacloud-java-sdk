// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListDpiSignaturesResponseBody extends TeaModel {
    /**
     * <p>The information about the application.</p>
     */
    @NameInMap("DpiSignature")
    public java.util.List<ListDpiSignaturesResponseBodyDpiSignature> dpiSignature;

    /**
     * <p>The token returned for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>FFrMV38kR4****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>63081123-B7C0-4BC9-B9E5-59E77A616EC9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The ID of the application group to which the application belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DpiGroupId")
        public String dpiGroupId;

        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>235</p>
         */
        @NameInMap("DpiSignatureId")
        public String dpiSignatureId;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>EdgeCast</p>
         */
        @NameInMap("DpiSignatureName")
        public String dpiSignatureName;

        /**
         * <p>The earliest version of engine that supports the application.</p>
         * 
         * <strong>example:</strong>
         * <p>0-0.0.1</p>
         */
        @NameInMap("MinEngineVersion")
        public String minEngineVersion;

        /**
         * <p>The earliest version of signature database that supports the application.</p>
         * 
         * <strong>example:</strong>
         * <p>20201117_1_0-0.0.1</p>
         */
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
