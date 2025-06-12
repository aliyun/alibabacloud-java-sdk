// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreateAccessKeyResponseBody extends TeaModel {
    /**
     * <p>The information about the AccessKey pair.</p>
     */
    @NameInMap("AccessKey")
    public CreateAccessKeyResponseBodyAccessKey accessKey;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAccessKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessKeyResponseBody self = new CreateAccessKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccessKeyResponseBody setAccessKey(CreateAccessKeyResponseBodyAccessKey accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public CreateAccessKeyResponseBodyAccessKey getAccessKey() {
        return this.accessKey;
    }

    public CreateAccessKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAccessKeyResponseBodyAccessKey extends TeaModel {
        /**
         * <p>The AccessKey ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0wNEpMMlzy7s****</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>The AccessKey secret.</p>
         * 
         * <strong>example:</strong>
         * <p>PupkTg8jdmau1cXxYacgE736PJ****</p>
         */
        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        /**
         * <p>The time when the AccessKey pair was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-01-23T12:33:18Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The status of the AccessKey pair. Valid values: Active and Inactive.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateAccessKeyResponseBodyAccessKey build(java.util.Map<String, ?> map) throws Exception {
            CreateAccessKeyResponseBodyAccessKey self = new CreateAccessKeyResponseBodyAccessKey();
            return TeaModel.build(map, self);
        }

        public CreateAccessKeyResponseBodyAccessKey setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public CreateAccessKeyResponseBodyAccessKey setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public CreateAccessKeyResponseBodyAccessKey setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateAccessKeyResponseBodyAccessKey setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
