// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDetectionResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DetectionResultList")
    public java.util.List<GetDetectionResultResponseBodyDetectionResultList> detectionResultList;

    public static GetDetectionResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDetectionResultResponseBody self = new GetDetectionResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDetectionResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDetectionResultResponseBody setDetectionResultList(java.util.List<GetDetectionResultResponseBodyDetectionResultList> detectionResultList) {
        this.detectionResultList = detectionResultList;
        return this;
    }
    public java.util.List<GetDetectionResultResponseBodyDetectionResultList> getDetectionResultList() {
        return this.detectionResultList;
    }

    public static class GetDetectionResultResponseBodyDetectionResultList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("CollectionTitle")
        public String collectionTitle;

        @NameInMap("CollectionUrl")
        public String collectionUrl;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Uploader")
        public String uploader;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static GetDetectionResultResponseBodyDetectionResultList build(java.util.Map<String, ?> map) throws Exception {
            GetDetectionResultResponseBodyDetectionResultList self = new GetDetectionResultResponseBodyDetectionResultList();
            return TeaModel.build(map, self);
        }

        public GetDetectionResultResponseBodyDetectionResultList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDetectionResultResponseBodyDetectionResultList setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public GetDetectionResultResponseBodyDetectionResultList setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public GetDetectionResultResponseBodyDetectionResultList setCollectionTitle(String collectionTitle) {
            this.collectionTitle = collectionTitle;
            return this;
        }
        public String getCollectionTitle() {
            return this.collectionTitle;
        }

        public GetDetectionResultResponseBodyDetectionResultList setCollectionUrl(String collectionUrl) {
            this.collectionUrl = collectionUrl;
            return this;
        }
        public String getCollectionUrl() {
            return this.collectionUrl;
        }

        public GetDetectionResultResponseBodyDetectionResultList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetDetectionResultResponseBodyDetectionResultList setUploader(String uploader) {
            this.uploader = uploader;
            return this;
        }
        public String getUploader() {
            return this.uploader;
        }

        public GetDetectionResultResponseBodyDetectionResultList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
