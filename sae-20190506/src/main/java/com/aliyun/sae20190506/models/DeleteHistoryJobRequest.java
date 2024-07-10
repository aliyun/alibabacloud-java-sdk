// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteHistoryJobRequest extends TeaModel {
    /**
     * <p>The ID of the job template to which the job that you want to delete belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>017f39b8-dfa4-4e16-a84b-1dcee4b1****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>manual-3db7a8fa-5d40-4edc-92e4-49d50eab****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static DeleteHistoryJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHistoryJobRequest self = new DeleteHistoryJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHistoryJobRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteHistoryJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
