// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class GetOriginalFileUrlResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public GetOriginalFileUrlResponseBodyData data;

    /**
     * <p>The return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9F80A58B-DFBA-55A1-B9D2-819B32904127</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetOriginalFileUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOriginalFileUrlResponseBody self = new GetOriginalFileUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOriginalFileUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOriginalFileUrlResponseBody setData(GetOriginalFileUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOriginalFileUrlResponseBodyData getData() {
        return this.data;
    }

    public GetOriginalFileUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOriginalFileUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOriginalFileUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOriginalFileUrlResponseBodyData extends TeaModel {
        /**
         * <p>The file download URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://gtm-translate-service-prod.oss-cn-zhangjiakou.aliyuncs.com/translations/replaced/a_file_992736840.pptx?Expires=1782738716&OSSAccessKeyId=STS.NZm6TgFWU2sgpBxs2UD154B9w&Signature=uPORIIsYjiwRFzoyNUN8Htnwdfc%3D&security-token=CAIS3gJ1q6Ft5B2yfSjIr5nYfe7Tq4h0hbGMcmTJlzIASL4Z24eSlTz2IHhMf3FtAuwft%2FU0mWFW7foSlrp6SJtIXleCZtF94oxN9h2gb4fb4woBanWd08%2FLI3OaLjKm9u2wCryLYbGwU%2FOpbE%2B%2B5U0X6LDmdDKkckW4OJmS8%2FBOZcgWWQ%2FKBlgvRq0hRG1YpdQdKGHaONu0LxfumRCwNkdzvRdmgm4NgsbWgO%2Fks0OC1ACnmrdM%2FdupesL0MPMBZskvD42Hu8VtbbfE3SJq7BxHybx7lqQs%2B02c5onGWwQKv0zfYrGJo4M0cF9jLqcmHutYtvH6jvlxpuGWjInt1RdGMKRHXj7YAZy63dDYCHRtm2ect12R0R3spTPvXvGd22tMCfkrqw7Ahz2PACvRGM5dh0AbW042tZHwaHNHYcJrPu9YH1QLobvGc7TkCSYBIdG7lRJ8EPtayyu0U3F2gASJGhqAATkIHCzHZWyr%2F8WJFcinsIxuI8iYoH3pOTZ2HJgDW38Zbu0NqMZmH%2BbRahVPiN7s4ckYmF50hCbgXt%2BdD9R6jB%2BkNufrVtN%2FAVgRMLOeEn2FZF0CCLlyjaIqq8QIxaPpDSLxpV6wZSh5enenoKm%2B1wunWRdd0gwG03k%2F4RCcDbb%2FIAA%3D">https://gtm-translate-service-prod.oss-cn-zhangjiakou.aliyuncs.com/translations/replaced/a_file_992736840.pptx?Expires=1782738716&amp;OSSAccessKeyId=STS.NZm6TgFWU2sgpBxs2UD154B9w&amp;Signature=uPORIIsYjiwRFzoyNUN8Htnwdfc%3D&amp;security-token=CAIS3gJ1q6Ft5B2yfSjIr5nYfe7Tq4h0hbGMcmTJlzIASL4Z24eSlTz2IHhMf3FtAuwft%2FU0mWFW7foSlrp6SJtIXleCZtF94oxN9h2gb4fb4woBanWd08%2FLI3OaLjKm9u2wCryLYbGwU%2FOpbE%2B%2B5U0X6LDmdDKkckW4OJmS8%2FBOZcgWWQ%2FKBlgvRq0hRG1YpdQdKGHaONu0LxfumRCwNkdzvRdmgm4NgsbWgO%2Fks0OC1ACnmrdM%2FdupesL0MPMBZskvD42Hu8VtbbfE3SJq7BxHybx7lqQs%2B02c5onGWwQKv0zfYrGJo4M0cF9jLqcmHutYtvH6jvlxpuGWjInt1RdGMKRHXj7YAZy63dDYCHRtm2ect12R0R3spTPvXvGd22tMCfkrqw7Ahz2PACvRGM5dh0AbW042tZHwaHNHYcJrPu9YH1QLobvGc7TkCSYBIdG7lRJ8EPtayyu0U3F2gASJGhqAATkIHCzHZWyr%2F8WJFcinsIxuI8iYoH3pOTZ2HJgDW38Zbu0NqMZmH%2BbRahVPiN7s4ckYmF50hCbgXt%2BdD9R6jB%2BkNufrVtN%2FAVgRMLOeEn2FZF0CCLlyjaIqq8QIxaPpDSLxpV6wZSh5enenoKm%2B1wunWRdd0gwG03k%2F4RCcDbb%2FIAA%3D</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The expiration time. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1774147442</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>translated_a_file.pptx</p>
         */
        @NameInMap("FileName")
        public String fileName;

        public static GetOriginalFileUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOriginalFileUrlResponseBodyData self = new GetOriginalFileUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOriginalFileUrlResponseBodyData setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetOriginalFileUrlResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GetOriginalFileUrlResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

}
