// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class PrecheckVideoCharacterReplaceJobResponseBody extends TeaModel {
    /**
     * <p>The request ID, which is used to locate and troubleshoot the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of items that failed the validation. This is an empty array if the validation passes.</p>
     */
    @NameInMap("Result")
    public java.util.List<PrecheckVideoCharacterReplaceJobResponseBodyResult> result;

    /**
     * <p>The pre-validation status. A value of Success indicates that the validation passed. A value of Failed indicates that one or more items failed the validation.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    public static PrecheckVideoCharacterReplaceJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PrecheckVideoCharacterReplaceJobResponseBody self = new PrecheckVideoCharacterReplaceJobResponseBody();
        return TeaModel.build(map, self);
    }

    public PrecheckVideoCharacterReplaceJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PrecheckVideoCharacterReplaceJobResponseBody setResult(java.util.List<PrecheckVideoCharacterReplaceJobResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<PrecheckVideoCharacterReplaceJobResponseBodyResult> getResult() {
        return this.result;
    }

    public PrecheckVideoCharacterReplaceJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class PrecheckVideoCharacterReplaceJobResponseBodyResult extends TeaModel {
        /**
         * <p>The validation error code for the input item. For example, ImageCheckFailed indicates that the image validation failed, and AudioCheckFailed indicates that the audio validation failed.</p>
         * 
         * <strong>example:</strong>
         * <p>ImageCheckFailed</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The name of the input parameter that failed the validation, which matches the corresponding field name in AppParams.</p>
         * 
         * <strong>example:</strong>
         * <p>LoadImage.1.TargetImage</p>
         */
        @NameInMap("Key")
        public String key;

        public static PrecheckVideoCharacterReplaceJobResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            PrecheckVideoCharacterReplaceJobResponseBodyResult self = new PrecheckVideoCharacterReplaceJobResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public PrecheckVideoCharacterReplaceJobResponseBodyResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public PrecheckVideoCharacterReplaceJobResponseBodyResult setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

}
