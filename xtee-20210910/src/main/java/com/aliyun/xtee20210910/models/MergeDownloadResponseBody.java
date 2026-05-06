// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class MergeDownloadResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public MergeDownloadResponseBodyResultObject resultObject;

    public static MergeDownloadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MergeDownloadResponseBody self = new MergeDownloadResponseBody();
        return TeaModel.build(map, self);
    }

    public MergeDownloadResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MergeDownloadResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public MergeDownloadResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MergeDownloadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MergeDownloadResponseBody setResultObject(MergeDownloadResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public MergeDownloadResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class MergeDownloadResponseBodyResultObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>rtmp://push-live.gaotime.com/jiaenguang789/21645251932448?auth_key=1768357031-0-0-6e2a4815fe4e2287a86be1105d42bf53</p>
         */
        @NameInMap("Url")
        public String url;

        public static MergeDownloadResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            MergeDownloadResponseBodyResultObject self = new MergeDownloadResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public MergeDownloadResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public MergeDownloadResponseBodyResultObject setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
