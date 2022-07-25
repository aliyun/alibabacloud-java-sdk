// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class CreateComputeTaskByMultiDataSetIdRequest extends TeaModel {
    @NameInMap("appId")
    public Long appId;

    @NameInMap("dataSetIds")
    public String dataSetIds;

    @NameInMap("name")
    public String name;

    @NameInMap("remarks")
    public String remarks;

    public static CreateComputeTaskByMultiDataSetIdRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeTaskByMultiDataSetIdRequest self = new CreateComputeTaskByMultiDataSetIdRequest();
        return TeaModel.build(map, self);
    }

    public CreateComputeTaskByMultiDataSetIdRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public CreateComputeTaskByMultiDataSetIdRequest setDataSetIds(String dataSetIds) {
        this.dataSetIds = dataSetIds;
        return this;
    }
    public String getDataSetIds() {
        return this.dataSetIds;
    }

    public CreateComputeTaskByMultiDataSetIdRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateComputeTaskByMultiDataSetIdRequest setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

}
