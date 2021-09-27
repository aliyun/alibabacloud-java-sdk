// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20210325.models;

import com.aliyun.tea.*;

public class UploadMediaByURLRequest extends TeaModel {
    @NameInMap("UploadMetadatas")
    public java.util.List<UploadMediaByURLRequestUploadMetadatas> uploadMetadatas;

    @NameInMap("UploadURLs")
    public String uploadURLs;

    @NameInMap("UserData")
    public UploadMediaByURLRequestUserData userData;

    public static UploadMediaByURLRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadMediaByURLRequest self = new UploadMediaByURLRequest();
        return TeaModel.build(map, self);
    }

    public UploadMediaByURLRequest setUploadMetadatas(java.util.List<UploadMediaByURLRequestUploadMetadatas> uploadMetadatas) {
        this.uploadMetadatas = uploadMetadatas;
        return this;
    }
    public java.util.List<UploadMediaByURLRequestUploadMetadatas> getUploadMetadatas() {
        return this.uploadMetadatas;
    }

    public UploadMediaByURLRequest setUploadURLs(String uploadURLs) {
        this.uploadURLs = uploadURLs;
        return this;
    }
    public String getUploadURLs() {
        return this.uploadURLs;
    }

    public UploadMediaByURLRequest setUserData(UploadMediaByURLRequestUserData userData) {
        this.userData = userData;
        return this;
    }
    public UploadMediaByURLRequestUserData getUserData() {
        return this.userData;
    }

    public static class UploadMediaByURLRequestUploadMetadatasS3UploadInfo extends TeaModel {
        // 上传的临时AK
        @NameInMap("S3AccessKey")
        public String s3AccessKey;

        // Bucket
        @NameInMap("S3Bucket")
        public String s3Bucket;

        // Endpoint
        @NameInMap("S3Endpoint")
        public String s3Endpoint;

        // 上传的FileKey
        @NameInMap("S3FileKey")
        public String s3FileKey;

        // 供应商名称
        @NameInMap("S3Provider")
        public String s3Provider;

        // 上传的临时SK
        @NameInMap("S3SecretKey")
        public String s3SecretKey;

        // 上传的临时Token
        @NameInMap("S3Token")
        public String s3Token;

        @NameInMap("id")
        public Integer id;

        // Job Id
        @NameInMap("jobId")
        public String jobId;

        public static UploadMediaByURLRequestUploadMetadatasS3UploadInfo build(java.util.Map<String, ?> map) throws Exception {
            UploadMediaByURLRequestUploadMetadatasS3UploadInfo self = new UploadMediaByURLRequestUploadMetadatasS3UploadInfo();
            return TeaModel.build(map, self);
        }

        public UploadMediaByURLRequestUploadMetadatasS3UploadInfo setS3AccessKey(String s3AccessKey) {
            this.s3AccessKey = s3AccessKey;
            return this;
        }
        public String getS3AccessKey() {
            return this.s3AccessKey;
        }

        public UploadMediaByURLRequestUploadMetadatasS3UploadInfo setS3Bucket(String s3Bucket) {
            this.s3Bucket = s3Bucket;
            return this;
        }
        public String getS3Bucket() {
            return this.s3Bucket;
        }

        public UploadMediaByURLRequestUploadMetadatasS3UploadInfo setS3Endpoint(String s3Endpoint) {
            this.s3Endpoint = s3Endpoint;
            return this;
        }
        public String getS3Endpoint() {
            return this.s3Endpoint;
        }

        public UploadMediaByURLRequestUploadMetadatasS3UploadInfo setS3FileKey(String s3FileKey) {
            this.s3FileKey = s3FileKey;
            return this;
        }
        public String getS3FileKey() {
            return this.s3FileKey;
        }

        public UploadMediaByURLRequestUploadMetadatasS3UploadInfo setS3Provider(String s3Provider) {
            this.s3Provider = s3Provider;
            return this;
        }
        public String getS3Provider() {
            return this.s3Provider;
        }

        public UploadMediaByURLRequestUploadMetadatasS3UploadInfo setS3SecretKey(String s3SecretKey) {
            this.s3SecretKey = s3SecretKey;
            return this;
        }
        public String getS3SecretKey() {
            return this.s3SecretKey;
        }

        public UploadMediaByURLRequestUploadMetadatasS3UploadInfo setS3Token(String s3Token) {
            this.s3Token = s3Token;
            return this;
        }
        public String getS3Token() {
            return this.s3Token;
        }

        public UploadMediaByURLRequestUploadMetadatasS3UploadInfo setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public UploadMediaByURLRequestUploadMetadatasS3UploadInfo setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class UploadMediaByURLRequestUploadMetadatas extends TeaModel {
        @NameInMap("FileExtension")
        public String fileExtension;

        @NameInMap("S3UploadInfo")
        public UploadMediaByURLRequestUploadMetadatasS3UploadInfo s3UploadInfo;

        @NameInMap("SourceURL")
        public String sourceURL;

        @NameInMap("Title")
        public String title;

        public static UploadMediaByURLRequestUploadMetadatas build(java.util.Map<String, ?> map) throws Exception {
            UploadMediaByURLRequestUploadMetadatas self = new UploadMediaByURLRequestUploadMetadatas();
            return TeaModel.build(map, self);
        }

        public UploadMediaByURLRequestUploadMetadatas setFileExtension(String fileExtension) {
            this.fileExtension = fileExtension;
            return this;
        }
        public String getFileExtension() {
            return this.fileExtension;
        }

        public UploadMediaByURLRequestUploadMetadatas setS3UploadInfo(UploadMediaByURLRequestUploadMetadatasS3UploadInfo s3UploadInfo) {
            this.s3UploadInfo = s3UploadInfo;
            return this;
        }
        public UploadMediaByURLRequestUploadMetadatasS3UploadInfo getS3UploadInfo() {
            return this.s3UploadInfo;
        }

        public UploadMediaByURLRequestUploadMetadatas setSourceURL(String sourceURL) {
            this.sourceURL = sourceURL;
            return this;
        }
        public String getSourceURL() {
            return this.sourceURL;
        }

        public UploadMediaByURLRequestUploadMetadatas setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class UploadMediaByURLRequestUserData extends TeaModel {
        @NameInMap("Extend")
        public java.util.Map<String, ?> extend;

        @NameInMap("MessageCallback")
        public String messageCallback;

        public static UploadMediaByURLRequestUserData build(java.util.Map<String, ?> map) throws Exception {
            UploadMediaByURLRequestUserData self = new UploadMediaByURLRequestUserData();
            return TeaModel.build(map, self);
        }

        public UploadMediaByURLRequestUserData setExtend(java.util.Map<String, ?> extend) {
            this.extend = extend;
            return this;
        }
        public java.util.Map<String, ?> getExtend() {
            return this.extend;
        }

        public UploadMediaByURLRequestUserData setMessageCallback(String messageCallback) {
            this.messageCallback = messageCallback;
            return this;
        }
        public String getMessageCallback() {
            return this.messageCallback;
        }

    }

}
