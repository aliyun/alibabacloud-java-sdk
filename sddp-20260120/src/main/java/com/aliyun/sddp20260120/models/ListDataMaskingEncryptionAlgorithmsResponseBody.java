// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListDataMaskingEncryptionAlgorithmsResponseBody extends TeaModel {
    @NameInMap("Algorithms")
    public java.util.List<ListDataMaskingEncryptionAlgorithmsResponseBodyAlgorithms> algorithms;

    /**
     * <strong>example:</strong>
     * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataMaskingEncryptionAlgorithmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataMaskingEncryptionAlgorithmsResponseBody self = new ListDataMaskingEncryptionAlgorithmsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataMaskingEncryptionAlgorithmsResponseBody setAlgorithms(java.util.List<ListDataMaskingEncryptionAlgorithmsResponseBodyAlgorithms> algorithms) {
        this.algorithms = algorithms;
        return this;
    }
    public java.util.List<ListDataMaskingEncryptionAlgorithmsResponseBodyAlgorithms> getAlgorithms() {
        return this.algorithms;
    }

    public ListDataMaskingEncryptionAlgorithmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataMaskingEncryptionAlgorithmsResponseBodyAlgorithms extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>data_masking_not_running</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>实例未处于运行状态</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>AES_256_GCM</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListDataMaskingEncryptionAlgorithmsResponseBodyAlgorithms build(java.util.Map<String, ?> map) throws Exception {
            ListDataMaskingEncryptionAlgorithmsResponseBodyAlgorithms self = new ListDataMaskingEncryptionAlgorithmsResponseBodyAlgorithms();
            return TeaModel.build(map, self);
        }

        public ListDataMaskingEncryptionAlgorithmsResponseBodyAlgorithms setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListDataMaskingEncryptionAlgorithmsResponseBodyAlgorithms setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListDataMaskingEncryptionAlgorithmsResponseBodyAlgorithms setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
