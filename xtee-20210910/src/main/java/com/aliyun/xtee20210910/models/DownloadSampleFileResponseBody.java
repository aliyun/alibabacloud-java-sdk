// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DownloadSampleFileResponseBody extends TeaModel {
    /**
     * <p>Status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>Return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return Result.</p>
     */
    @NameInMap("ResultObject")
    public DownloadSampleFileResponseBodyResultObject resultObject;

    public static DownloadSampleFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadSampleFileResponseBody self = new DownloadSampleFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadSampleFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DownloadSampleFileResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DownloadSampleFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DownloadSampleFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadSampleFileResponseBody setResultObject(DownloadSampleFileResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DownloadSampleFileResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DownloadSampleFileResponseBodyResultObject extends TeaModel {
        /**
         * <p>Model status.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>OSS download URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://pic.zfp.cn/image/2026/02/06/45b5fee18baf4b99b13025987486319c.jpg">https://pic.zfp.cn/image/2026/02/06/45b5fee18baf4b99b13025987486319c.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static DownloadSampleFileResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DownloadSampleFileResponseBodyResultObject self = new DownloadSampleFileResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DownloadSampleFileResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DownloadSampleFileResponseBodyResultObject setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
