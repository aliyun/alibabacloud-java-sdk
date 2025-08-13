// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeNameListDownloadUrlResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public DescribeNameListDownloadUrlResponseBodyResultObject resultObject;

    public static DescribeNameListDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNameListDownloadUrlResponseBody self = new DescribeNameListDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNameListDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNameListDownloadUrlResponseBody setResultObject(DescribeNameListDownloadUrlResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeNameListDownloadUrlResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeNameListDownloadUrlResponseBodyResultObject extends TeaModel {
        /**
         * <p>Download URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxxx-oss-xxxxx.xxxxxx.aliyuncs.com/xx/xx/xxx/xxxxxx.csv?Expires=1753433384&OSSAccessKeyId=xxxxxxxxx&Signature=%2F%xxxxxxxxxxxx%3D">https://xxxxx-oss-xxxxx.xxxxxx.aliyuncs.com/xx/xx/xxx/xxxxxx.csv?Expires=1753433384&amp;OSSAccessKeyId=xxxxxxxxx&amp;Signature=%2F%xxxxxxxxxxxx%3D</a></p>
         */
        @NameInMap("downloadFileUrl")
        public String downloadFileUrl;

        public static DescribeNameListDownloadUrlResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeNameListDownloadUrlResponseBodyResultObject self = new DescribeNameListDownloadUrlResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeNameListDownloadUrlResponseBodyResultObject setDownloadFileUrl(String downloadFileUrl) {
            this.downloadFileUrl = downloadFileUrl;
            return this;
        }
        public String getDownloadFileUrl() {
            return this.downloadFileUrl;
        }

    }

}
