// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GenerateOssUrlResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GenerateOssUrlResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static GenerateOssUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateOssUrlResponseBody self = new GenerateOssUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateOssUrlResponseBody setData(java.util.List<GenerateOssUrlResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GenerateOssUrlResponseBodyData> getData() {
        return this.data;
    }

    public GenerateOssUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateOssUrlResponseBodyData extends TeaModel {
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("ObjectName")
        public String objectName;

        public static GenerateOssUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateOssUrlResponseBodyData self = new GenerateOssUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateOssUrlResponseBodyData setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GenerateOssUrlResponseBodyData setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

    }

}
