// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class CreateComputeTaskRequest extends TeaModel {
    @NameInMap("appId")
    public Long appId;

    @NameInMap("dataSetIds")
    public String dataSetIds;

    @NameInMap("name")
    public String name;

    @NameInMap("remarks")
    public String remarks;

    @NameInMap("type")
    public String type;

    public static CreateComputeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeTaskRequest self = new CreateComputeTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateComputeTaskRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public CreateComputeTaskRequest setDataSetIds(String dataSetIds) {
        this.dataSetIds = dataSetIds;
        return this;
    }
    public String getDataSetIds() {
        return this.dataSetIds;
    }

    public CreateComputeTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateComputeTaskRequest setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public CreateComputeTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
