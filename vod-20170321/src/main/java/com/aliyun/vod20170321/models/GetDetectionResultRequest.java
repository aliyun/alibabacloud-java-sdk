// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDetectionResultRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Desensitization")
    public Boolean desensitization;

    @NameInMap("Page")
    public Long page;

    @NameInMap("CountByPage")
    public Long countByPage;

    public static GetDetectionResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDetectionResultRequest self = new GetDetectionResultRequest();
        return TeaModel.build(map, self);
    }

    public GetDetectionResultRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetDetectionResultRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetDetectionResultRequest setDesensitization(Boolean desensitization) {
        this.desensitization = desensitization;
        return this;
    }
    public Boolean getDesensitization() {
        return this.desensitization;
    }

    public GetDetectionResultRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public GetDetectionResultRequest setCountByPage(Long countByPage) {
        this.countByPage = countByPage;
        return this;
    }
    public Long getCountByPage() {
        return this.countByPage;
    }

}
