// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCustomizedDictResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <strong>example:</strong>
     * <p>test_dict.plain</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("FileSize")
    public Long fileSize;

    /**
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <strong>example:</strong>
     * <p>cloudtest01/661767e1-5ae3-4ec5-865f-03039436893a/sacc2*****</p>
     */
    @NameInMap("OssUrl")
    public String ossUrl;

    /**
     * <strong>example:</strong>
     * <p>A4EB8B1C-1DEC-5E18-BCD0-XXXXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1719919421</p>
     */
    @NameInMap("UploadTime")
    public Long uploadTime;

    public static DescribeCustomizedDictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizedDictResponseBody self = new DescribeCustomizedDictResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizedDictResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeCustomizedDictResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DescribeCustomizedDictResponseBody setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public DescribeCustomizedDictResponseBody setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public DescribeCustomizedDictResponseBody setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

    public DescribeCustomizedDictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomizedDictResponseBody setUploadTime(Long uploadTime) {
        this.uploadTime = uploadTime;
        return this;
    }
    public Long getUploadTime() {
        return this.uploadTime;
    }

}
