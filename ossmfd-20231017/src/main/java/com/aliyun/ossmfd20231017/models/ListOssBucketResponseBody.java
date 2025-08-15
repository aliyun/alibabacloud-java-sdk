// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossmfd20231017.models;

import com.aliyun.tea.*;

public class ListOssBucketResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListOssBucketResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>E14CECBF-8CAC-520C-ACC3-9503D5******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListOssBucketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOssBucketResponseBody self = new ListOssBucketResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOssBucketResponseBody setData(java.util.List<ListOssBucketResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOssBucketResponseBodyData> getData() {
        return this.data;
    }

    public ListOssBucketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListOssBucketResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>testBucket******</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <strong>example:</strong>
         * <p>Unsupported Region。</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>IA</p>
         */
        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Support")
        public Boolean support;

        public static ListOssBucketResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOssBucketResponseBodyData self = new ListOssBucketResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOssBucketResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public ListOssBucketResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListOssBucketResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListOssBucketResponseBodyData setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public ListOssBucketResponseBodyData setSupport(Boolean support) {
            this.support = support;
            return this;
        }
        public Boolean getSupport() {
            return this.support;
        }

    }

}
