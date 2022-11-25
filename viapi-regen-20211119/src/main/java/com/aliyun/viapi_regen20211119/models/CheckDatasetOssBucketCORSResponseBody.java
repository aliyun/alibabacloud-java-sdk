// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CheckDatasetOssBucketCORSResponseBody extends TeaModel {
    @NameInMap("Data")
    public CheckDatasetOssBucketCORSResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckDatasetOssBucketCORSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDatasetOssBucketCORSResponseBody self = new CheckDatasetOssBucketCORSResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDatasetOssBucketCORSResponseBody setData(CheckDatasetOssBucketCORSResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckDatasetOssBucketCORSResponseBodyData getData() {
        return this.data;
    }

    public CheckDatasetOssBucketCORSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckDatasetOssBucketCORSResponseBodyData extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("OssBucketCORSConfigUrl")
        public String ossBucketCORSConfigUrl;

        @NameInMap("SetOssBucketCORSFlag")
        public Boolean setOssBucketCORSFlag;

        public static CheckDatasetOssBucketCORSResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckDatasetOssBucketCORSResponseBodyData self = new CheckDatasetOssBucketCORSResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckDatasetOssBucketCORSResponseBodyData setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public CheckDatasetOssBucketCORSResponseBodyData setOssBucketCORSConfigUrl(String ossBucketCORSConfigUrl) {
            this.ossBucketCORSConfigUrl = ossBucketCORSConfigUrl;
            return this;
        }
        public String getOssBucketCORSConfigUrl() {
            return this.ossBucketCORSConfigUrl;
        }

        public CheckDatasetOssBucketCORSResponseBodyData setSetOssBucketCORSFlag(Boolean setOssBucketCORSFlag) {
            this.setOssBucketCORSFlag = setOssBucketCORSFlag;
            return this;
        }
        public Boolean getSetOssBucketCORSFlag() {
            return this.setOssBucketCORSFlag;
        }

    }

}
