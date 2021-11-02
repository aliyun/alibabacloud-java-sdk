// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDetectionResultRequest extends TeaModel {
    @NameInMap("CountByPage")
    public Long countByPage;

    @NameInMap("Desensitization")
    public Boolean desensitization;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Page")
    public Long page;

    @NameInMap("Status")
    public String status;

    public static GetDetectionResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDetectionResultRequest self = new GetDetectionResultRequest();
        return TeaModel.build(map, self);
    }

    public GetDetectionResultRequest setCountByPage(Long countByPage) {
        this.countByPage = countByPage;
        return this;
    }
    public Long getCountByPage() {
        return this.countByPage;
    }

    public GetDetectionResultRequest setDesensitization(Boolean desensitization) {
        this.desensitization = desensitization;
        return this;
    }
    public Boolean getDesensitization() {
        return this.desensitization;
    }

    public GetDetectionResultRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetDetectionResultRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public GetDetectionResultRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
