// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class SubmitDataSetTaskRequest extends TeaModel {
    @NameInMap("dataSetType")
    public Integer dataSetType;

    @NameInMap("idType")
    public Integer idType;

    @NameInMap("name")
    public String name;

    @NameInMap("ossFileName")
    public String ossFileName;

    public static SubmitDataSetTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDataSetTaskRequest self = new SubmitDataSetTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDataSetTaskRequest setDataSetType(Integer dataSetType) {
        this.dataSetType = dataSetType;
        return this;
    }
    public Integer getDataSetType() {
        return this.dataSetType;
    }

    public SubmitDataSetTaskRequest setIdType(Integer idType) {
        this.idType = idType;
        return this;
    }
    public Integer getIdType() {
        return this.idType;
    }

    public SubmitDataSetTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitDataSetTaskRequest setOssFileName(String ossFileName) {
        this.ossFileName = ossFileName;
        return this;
    }
    public String getOssFileName() {
        return this.ossFileName;
    }

}
