// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class BatchGetVideoCharacterReplaceJobsRequest extends TeaModel {
    /**
     * <p>The list of job IDs. Separate multiple IDs with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>ag_83baeea38b534ee1937b8a4acd08****,ag_f7eeed5d5e294dfba4bb347177e1****</p>
     */
    @NameInMap("JobIds")
    public String jobIds;

    public static BatchGetVideoCharacterReplaceJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetVideoCharacterReplaceJobsRequest self = new BatchGetVideoCharacterReplaceJobsRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetVideoCharacterReplaceJobsRequest setJobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public String getJobIds() {
        return this.jobIds;
    }

}
