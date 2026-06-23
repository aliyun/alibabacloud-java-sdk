// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetExportConfigJobResponseBody extends TeaModel {
    /**
     * <p>The download link of the configuration backup file.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://bastionhost-cn-hangzhou-164***.oss-cn-hangzhou.aliyuncs.com/bastionhost-cn-2">https://bastionhost-cn-hangzhou-164***.oss-cn-hangzhou.aliyuncs.com/bastionhost-cn-2</a>******</p>
     */
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    /**
     * <p>The expiration time of the configuration backup download link. (In seconds, UNIX timestamp format)</p>
     * 
     * <strong>example:</strong>
     * <p>1679393152</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <p>The ID of the configuration backup export job.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier that Alibaba Cloud generates for this request.</p>
     * 
     * <strong>example:</strong>
     * <p>98DBE5C2-7D7A-5393-9E5A-71074336D33B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the configuration backup export job.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetExportConfigJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExportConfigJobResponseBody self = new GetExportConfigJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExportConfigJobResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public GetExportConfigJobResponseBody setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public GetExportConfigJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetExportConfigJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetExportConfigJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExportConfigJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
