// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CreateTensorboardResponseBody extends TeaModel {
    // 任务Id
    @NameInMap("JobId")
    public String jobId;

    // DataSourceId
    @NameInMap("DataSourceId")
    public String dataSourceId;

    // Tensorboard id
    @NameInMap("TensorboardId")
    public String tensorboardId;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static CreateTensorboardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTensorboardResponseBody self = new CreateTensorboardResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTensorboardResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateTensorboardResponseBody setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public CreateTensorboardResponseBody setTensorboardId(String tensorboardId) {
        this.tensorboardId = tensorboardId;
        return this;
    }
    public String getTensorboardId() {
        return this.tensorboardId;
    }

    public CreateTensorboardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
