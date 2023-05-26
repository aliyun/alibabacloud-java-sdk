// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CreateTensorboardResponseBody extends TeaModel {
    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TensorboardId")
    public String tensorboardId;

    public static CreateTensorboardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTensorboardResponseBody self = new CreateTensorboardResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTensorboardResponseBody setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public CreateTensorboardResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateTensorboardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTensorboardResponseBody setTensorboardId(String tensorboardId) {
        this.tensorboardId = tensorboardId;
        return this;
    }
    public String getTensorboardId() {
        return this.tensorboardId;
    }

}
