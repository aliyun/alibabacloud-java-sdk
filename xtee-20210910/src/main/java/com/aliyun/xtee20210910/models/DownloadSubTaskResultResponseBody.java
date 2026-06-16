// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DownloadSubTaskResultResponseBody extends TeaModel {
    /**
     * <p>status code.</p>
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
     * <p>request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E01E1B4A-6747-5329-9046-B6D6B2D91349</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return Result.</p>
     */
    @NameInMap("ResultObject")
    public DownloadSubTaskResultResponseBodyResultObject resultObject;

    public static DownloadSubTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadSubTaskResultResponseBody self = new DownloadSubTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadSubTaskResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DownloadSubTaskResultResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DownloadSubTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DownloadSubTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadSubTaskResultResponseBody setResultObject(DownloadSubTaskResultResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DownloadSubTaskResultResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DownloadSubTaskResultResponseBodyResultObject extends TeaModel {
        /**
         * <p>Status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>OSS download URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://mass.alipay.com/enhance/afts/file/n5XnQounknwAAAAAZfAAAAgAhvocAAFr?t=2hrPX0at3hhaRjlScory9JzLGiLchaonac5suH-Z1BgDAAAAZAABHPpobI2j">https://mass.alipay.com/enhance/afts/file/n5XnQounknwAAAAAZfAAAAgAhvocAAFr?t=2hrPX0at3hhaRjlScory9JzLGiLchaonac5suH-Z1BgDAAAAZAABHPpobI2j</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static DownloadSubTaskResultResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DownloadSubTaskResultResponseBodyResultObject self = new DownloadSubTaskResultResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DownloadSubTaskResultResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DownloadSubTaskResultResponseBodyResultObject setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
