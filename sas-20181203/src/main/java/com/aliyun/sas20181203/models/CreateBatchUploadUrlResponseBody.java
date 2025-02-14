// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateBatchUploadUrlResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>DA62490B-7883-5EB4-8601-F2D1D9******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array consisting of the parameters that are required to upload a file.</p>
     */
    @NameInMap("UploadUrlList")
    public java.util.List<CreateBatchUploadUrlResponseBodyUploadUrlList> uploadUrlList;

    public static CreateBatchUploadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchUploadUrlResponseBody self = new CreateBatchUploadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBatchUploadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBatchUploadUrlResponseBody setUploadUrlList(java.util.List<CreateBatchUploadUrlResponseBodyUploadUrlList> uploadUrlList) {
        this.uploadUrlList = uploadUrlList;
        return this;
    }
    public java.util.List<CreateBatchUploadUrlResponseBodyUploadUrlList> getUploadUrlList() {
        return this.uploadUrlList;
    }

    public static class CreateBatchUploadUrlResponseBodyUploadUrlListContext extends TeaModel {
        /**
         * <p>The AccessKey ID that is used to access the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI4G1mgPbjvGQuiV1X****</p>
         */
        @NameInMap("AccessId")
        public String accessId;

        /**
         * <p>The key of the file that is used after the file is uploaded to the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>1/2022/06/23/15/41/16559701077444693a0c6-33b2-4cc2-a99f-9f38b8b8****</p>
         */
        @NameInMap("OssKey")
        public String ossKey;

        /**
         * <p>The policy that poses limits on file upload. For example, the policy can limit the size of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAyMi0wNy0yM1QxMDo1ODoxMC****</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The signature that is used to upload the file.</p>
         * 
         * <strong>example:</strong>
         * <p>wDhPgVdnY/bkKFYcYFl+4crl****</p>
         */
        @NameInMap("Signature")
        public String signature;

        public static CreateBatchUploadUrlResponseBodyUploadUrlListContext build(java.util.Map<String, ?> map) throws Exception {
            CreateBatchUploadUrlResponseBodyUploadUrlListContext self = new CreateBatchUploadUrlResponseBodyUploadUrlListContext();
            return TeaModel.build(map, self);
        }

        public CreateBatchUploadUrlResponseBodyUploadUrlListContext setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public CreateBatchUploadUrlResponseBodyUploadUrlListContext setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public CreateBatchUploadUrlResponseBodyUploadUrlListContext setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public CreateBatchUploadUrlResponseBodyUploadUrlListContext setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class CreateBatchUploadUrlResponseBodyUploadUrlList extends TeaModel {
        /**
         * <p>The signature information.</p>
         */
        @NameInMap("Context")
        public CreateBatchUploadUrlResponseBodyUploadUrlListContext context;

        /**
         * <p>The timestamp when the values of the parameters expire. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1658562101370</p>
         */
        @NameInMap("Expire")
        public String expire;

        /**
         * <p>Indicates whether the file exists in the cloud. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The file exists in the cloud. You do not need to upload the file.</li>
         * <li><strong>false</strong>: The file does not exist in the cloud. You must upload the file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FileExist")
        public Boolean fileExist;

        /**
         * <p>The internal endpoint of the URL to which the file is uploaded.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com">http://example.com</a></p>
         */
        @NameInMap("InternalUrl")
        public String internalUrl;

        /**
         * <p>The identifier of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>2f8dc248a0fbb96c69e45acad2******</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The public endpoint of the URL to which the file is uploaded.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com">http://example.com</a></p>
         */
        @NameInMap("PublicUrl")
        public String publicUrl;

        public static CreateBatchUploadUrlResponseBodyUploadUrlList build(java.util.Map<String, ?> map) throws Exception {
            CreateBatchUploadUrlResponseBodyUploadUrlList self = new CreateBatchUploadUrlResponseBodyUploadUrlList();
            return TeaModel.build(map, self);
        }

        public CreateBatchUploadUrlResponseBodyUploadUrlList setContext(CreateBatchUploadUrlResponseBodyUploadUrlListContext context) {
            this.context = context;
            return this;
        }
        public CreateBatchUploadUrlResponseBodyUploadUrlListContext getContext() {
            return this.context;
        }

        public CreateBatchUploadUrlResponseBodyUploadUrlList setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public CreateBatchUploadUrlResponseBodyUploadUrlList setFileExist(Boolean fileExist) {
            this.fileExist = fileExist;
            return this;
        }
        public Boolean getFileExist() {
            return this.fileExist;
        }

        public CreateBatchUploadUrlResponseBodyUploadUrlList setInternalUrl(String internalUrl) {
            this.internalUrl = internalUrl;
            return this;
        }
        public String getInternalUrl() {
            return this.internalUrl;
        }

        public CreateBatchUploadUrlResponseBodyUploadUrlList setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public CreateBatchUploadUrlResponseBodyUploadUrlList setPublicUrl(String publicUrl) {
            this.publicUrl = publicUrl;
            return this;
        }
        public String getPublicUrl() {
            return this.publicUrl;
        }

    }

}
