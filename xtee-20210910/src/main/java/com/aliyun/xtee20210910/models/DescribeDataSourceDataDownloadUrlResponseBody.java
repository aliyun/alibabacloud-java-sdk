// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeDataSourceDataDownloadUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeDataSourceDataDownloadUrlResponseBodyResultObject resultObject;

    public static DescribeDataSourceDataDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSourceDataDownloadUrlResponseBody self = new DescribeDataSourceDataDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataSourceDataDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataSourceDataDownloadUrlResponseBody setResultObject(DescribeDataSourceDataDownloadUrlResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeDataSourceDataDownloadUrlResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeDataSourceDataDownloadUrlResponseBodyResultObject extends TeaModel {
        @NameInMap("downloadFileUrl")
        public String downloadFileUrl;

        public static DescribeDataSourceDataDownloadUrlResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataSourceDataDownloadUrlResponseBodyResultObject self = new DescribeDataSourceDataDownloadUrlResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeDataSourceDataDownloadUrlResponseBodyResultObject setDownloadFileUrl(String downloadFileUrl) {
            this.downloadFileUrl = downloadFileUrl;
            return this;
        }
        public String getDownloadFileUrl() {
            return this.downloadFileUrl;
        }

    }

}
