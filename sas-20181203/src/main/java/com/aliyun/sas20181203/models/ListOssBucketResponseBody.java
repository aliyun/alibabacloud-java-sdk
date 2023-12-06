// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOssBucketResponseBody extends TeaModel {
    /**
     * <p>The data that is returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListOssBucketResponseBodyData> data;

    /**
     * <p>The request ID.</p>
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
         * <p>The name of the bucket.</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The reason why the bucket cannot be checked.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The storage class of the bucket. Valid values:</p>
         * <br>
         * <p>*   Standard (default)</p>
         * <p>*   IA</p>
         * <p>*   Archive</p>
         * <p>*   ColdArchive</p>
         */
        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <p>Indicates whether the bucket can be checked. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
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
