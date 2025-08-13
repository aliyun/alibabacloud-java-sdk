// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DownloadSmapleBatchResponseBody extends TeaModel {
    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public DownloadSmapleBatchResponseBodyResultObject resultObject;

    public static DownloadSmapleBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadSmapleBatchResponseBody self = new DownloadSmapleBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadSmapleBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadSmapleBatchResponseBody setResultObject(DownloadSmapleBatchResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DownloadSmapleBatchResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DownloadSmapleBatchResponseBodyResultObject extends TeaModel {
        /**
         * <p>Download URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxxx-oss-xxxxx.xxxxxx.aliyuncs.com/xx/xx/xxx/xxxxxx.csv?Expires=1753433384&OSSAccessKeyId=xxxxxxxxx&Signature=%2F%xxxxxxxxxxxx%3D">https://xxxxx-oss-xxxxx.xxxxxx.aliyuncs.com/xx/xx/xxx/xxxxxx.csv?Expires=1753433384&amp;OSSAccessKeyId=xxxxxxxxx&amp;Signature=%2F%xxxxxxxxxxxx%3D</a></p>
         */
        @NameInMap("fileDownloadURL")
        public String fileDownloadURL;

        public static DownloadSmapleBatchResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DownloadSmapleBatchResponseBodyResultObject self = new DownloadSmapleBatchResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DownloadSmapleBatchResponseBodyResultObject setFileDownloadURL(String fileDownloadURL) {
            this.fileDownloadURL = fileDownloadURL;
            return this;
        }
        public String getFileDownloadURL() {
            return this.fileDownloadURL;
        }

    }

}
