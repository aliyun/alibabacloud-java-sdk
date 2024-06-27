// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeNameListDownloadUrlResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

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
