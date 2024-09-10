// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDynamicDictResponseBody extends TeaModel {
    /**
     * <p>The number of weak password rules that are added.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The name of the OSS object that contains custom weak passwords.</p>
     * 
     * <strong>example:</strong>
     * <p>test_dict.plain</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The size of the OSS object. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("FileSize")
    public Long fileSize;

    /**
     * <p>The maximum number of weak password rules that can be added.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The IP address of the Object Storage Service (OSS) object.</p>
     * 
     * <strong>example:</strong>
     * <p>cloudtest01/661767e1-5ae3-4ec5-865f-03039436893a/sacc2*****</p>
     */
    @NameInMap("OssUrl")
    public String ossUrl;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A3D7C47D-3F11-57BB-90E8-E5C20C61****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The timestamp when the OSS object was uploaded. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1719919421</p>
     */
    @NameInMap("UploadTime")
    public Long uploadTime;

    public static DescribeDynamicDictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDynamicDictResponseBody self = new DescribeDynamicDictResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDynamicDictResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeDynamicDictResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DescribeDynamicDictResponseBody setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public DescribeDynamicDictResponseBody setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public DescribeDynamicDictResponseBody setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

    public DescribeDynamicDictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDynamicDictResponseBody setUploadTime(Long uploadTime) {
        this.uploadTime = uploadTime;
        return this;
    }
    public Long getUploadTime() {
        return this.uploadTime;
    }

}
